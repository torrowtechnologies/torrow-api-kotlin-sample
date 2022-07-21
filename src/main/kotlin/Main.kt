import com.fasterxml.jackson.annotation.ObjectIdGenerators
import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import kotlinx.coroutines.delay
import net.torrow.api.client.TorrowApiClient
import net.torrow.api.models.*
import java.time.Duration
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.ZoneOffset

suspend fun main() {

    // этот токен (refreshToken) можно получить при авторизации в системе
    val token = ""

    val client = TorrowApiClient(token)

    var profileId = "aae6903ea629f185702210d000190ac27"

    // идентификатор услуги
    val serviceId = "aae6903ed3530491b92f2c97a6df479a8"

    // адрес виджета для записи
    val consumerWidgetUrl = "https://embed.torrow.net/service/${serviceId}/booking"

    // чтение полного списка заказов с начала года
    val allTimetable: ArrayList<TimetableCase> = ArrayList()
    val take = 100
    var skip = 0
    while (true){
        val page = client.getServiceTimetable(
            serviceId,
            TimetableFilter(from = LocalDateTime.of(2022,1,1,1,1)),
            visibility = TimetableDetailsVisibility.VIEW,
            skip = skip,
            take = take)
        if(page.isEmpty()){
            break
        }
        allTimetable.addAll(page)
        skip += page.count()
    }
    println("Всего найдено ${allTimetable.count()} в расписании")

    // Получаем услугу, чтобы из неё взять список caseActions
    // Это нужно для того, чтобы перенести их в событие, т.к. если и в событии и в услуге есть caseActions,
    // то приоритет имеет действия из события, поэтому мы полностью перенесем основные действия из услуги и добавим еще действия для события
    val serviceItem = client.getService(serviceId)

    // "подписка" на изменения
    var maxLastModified = allTimetable.maxOf { t -> t.meta?.lastModified!! } //максимально время изменения в расписании, нужно для фильтрации только измененных элементов
    var executorSendCaseActionId = "629f2efd8623710d8c100000"; // идентификатор действия отправки для исполнителя (формат Bson.ObjectId)
    while (true){
        val modifiedTimetableCases = client.getServiceTimetable(
            serviceId,
            TimetableFilter(from = LocalDateTime.now(ZoneOffset.UTC)), // берем события, которые будут идти после текущего времени (т.е. будущие и в процессе)
            lmfrom = maxLastModified.plusSeconds(1), // получаем только изменения после этой даты (плюсуем секунду, чтобы не захватывать то же)
            visibility = TimetableDetailsVisibility.VIEW, // чтобы вернулась все возможная информация по событию, а не только время
            sort = ItemViewSortCondition.LASTMODIFIEDASC) // сортируем по времени изменения, чтобы наш способ получения изменений был консистентен

        if(modifiedTimetableCases.isEmpty()){
            delay(5000) // пытаемся получить изменения с интервалом 5сек TODO: увеличить до приемлемой цифры
            continue
        }

        for (timetableCase in modifiedTimetableCases) {
            val caseItem = client.getCase(timetableCase.itemObject?.id!!) // читаем событие, т.к. нам нужен полный объект при обновлении
            println("Событие ${timetableCase.name} ${timetableCase.caseSummary?.title} ${timetableCase.beginDate} изменено")

            // пропускаем событие, которому уже добавляли письмо для исполнителя
            if(caseItem.caseActionList?.any { a -> a.rid == executorSendCaseActionId } == true){
                continue;
            }

            var consumer = client.getCaseParticipants(caseItem.id!!, caseParticipantTypeList = arrayOf(CaseParticipantType.CONSUMER), take = 1)[0]
            println("Участник события:  ${consumer.caseParticipation?.contactInformation?.fields?.first { it.name == "ФИО" }?.value}")

            val consumerSecurityToken = client.getSecurityTokenForCase(caseItem.id!!, GenerateSecurityTokenReq(
                roleIdList = arrayOf(0, 4, 6, 1001),
                participantState = ParticipantState.ACCEPTED,
                participantType = ParticipantType.READER
            ));
            val consumerCaseUrl = "https://torrow.net/app/tabs/tab-search/case;id=${caseItem.id!!}?caseParticipantProfileId=${consumer.caseParticipation?.profileId!!}&caseParticipantId=${consumer.caseParticipation?.id!!}&securityToken=${consumerSecurityToken}"
            println("Ссылка участника:  ${consumerCaseUrl}")

            val actionList = serviceItem.caseActionList?.toCollection(ArrayList()) ?: ArrayList()

            var sendTime = LocalDateTime.now(ZoneOffset.UTC); // нужное время отправки письма исполнителю
            var caseStartRelativeTime = (Duration.between(caseItem.beginDate!!, sendTime).seconds).toInt() + 30; // считаем относительное время отправки (+30сек от текущего, т.к. время на сервере может спешить от текущего и оно может посчитаться просроченным)
            actionList.add(generateCaseActionForExecutor(executorSendCaseActionId, caseStartRelativeTime))

            var updatedCaseItem = caseItem.copy(caseActionList = actionList.toTypedArray(), personalInfo = null);
            updatedCaseItem = client.updateCase(updatedCaseItem, profileId);

            println("Установлено напоминание для исполнителя ${updatedCaseItem.name}")
        }

        maxLastModified = modifiedTimetableCases.maxOf { t -> t.meta?.lastModified!! }
    }
}

fun generateCaseActionForExecutor(id: String, caseStartRelativeTimeSec: Int): CaseAction {
    return CaseAction(
        rid = id,
        trigger = Trigger(
            type = TriggerType.TIME,
            relativeTime = caseStartRelativeTimeSec
        ),
        type = Type.REMINDER,
        caseParticipantFilter = CaseParticipantFilter(
            caseParticipantTypeList = arrayOf(CaseParticipantType.EXECUTOR),
            confirmationWaitingState = ConfirmationWaitingState.UNKNOWNCONFIRMATIONWAITINGSTATE,
            userType = UserType.REGISTERED),
        notificationProperties = NotificationProperties(
            deliveryStrategy = DeliveryStrategy.ALL,
            deliveryChannelMessageList = arrayOf(DeliveryChannelMessage(
                deliveryChannelList = arrayOf(DeliveryChannel.EMAIL), // TODO: сюда вставить нужный канал (прим. SMS)
                multiLanguageMessage = MultiLanguageMessage(arrayOf(
                    LanguageMessage(
                        default = true,
                        languageList = arrayOf("ru"),
                        text = "Тестовое уведомление исполнителю по событию {{Case.ItemInfo.Name}}" // тут можно написать любой текст, шаблонизатор https://github.com/sebastienros/fluid
                    )
                ))
            ))
        )
    )
}