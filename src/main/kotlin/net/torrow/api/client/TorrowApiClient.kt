package net.torrow.api.client

import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.MapperFeature
import com.fasterxml.jackson.databind.SerializationFeature
import com.fasterxml.jackson.databind.util.StdDateFormat
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.fasterxml.jackson.module.kotlin.kotlinModule
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.engine.cio.*
import io.ktor.client.plugins.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.plugins.logging.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.serialization.jackson.*
import net.torrow.api.models.*

class TorrowApiClient internal constructor(private val refreshToken: String) {
    var basePath = "https://torrow.net/api/v1"
    var defaultAuthHeader = "Basic d2ViLm1vYmlsZWFwcC50b3Jyb3cubmV0OmY1RmBkaXk2d2AndEg4YTojXw=="

    var client: HttpClient = HttpClient(CIO){
        install(ContentNegotiation){
            jackson(){
                registerModule(JavaTimeModule())
                registerModule(kotlinModule())
                dateFormat = StdDateFormat() // все даты должны быть в формате в UTC
                enable(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS)
                configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
                configure(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL, true)
                configure(SerializationFeature.WRITE_ENUMS_USING_TO_STRING, true)
                configure(SerializationFeature.WRITE_NULL_MAP_VALUES, true)
            }
        }
        install(Logging) {
            logger = Logger.SIMPLE
            level = LogLevel.BODY
        }
    }

    var accessToken: String? = null

    init {
        // Процесс авторизаци
        client.plugin(HttpSend).intercept { request ->
            // для сегмента /api/v1/auth используется Basic авторизация (поле defaultAuthHeader), для всех остальных Bearer
            if(request.url.pathSegments.contains("auth")){
                return@intercept execute(request)
            }

            // первичное получение accessToken по refreshToken
            if(accessToken == null) {
                accessToken = getAccessToken()
            }

            if(!request.headers.contains(HttpHeaders.Authorization)){
                request.headers[HttpHeaders.Authorization] = "Bearer ${accessToken!!}"
            }

            val originalCall = execute(request)

            // обновляем accessToken токен, если текущий истек
            if (originalCall.response.status.value == 401) {
                accessToken = getAccessToken()
                request.headers[HttpHeaders.Authorization] = "Bearer ${accessToken!!}"
                execute(request)
            } else {
                originalCall
            }
        }
    }

    /**
     * Получить услугу
     *
     * @param caseId Идентификатор услуги
     * @param includeDeleted признак чтения удаленного объекта (если false, то будет ошибка 404)
     * @param securityToken токен безопасности (используется для выдачи прав, которые будут добавлены к текущемо пользователю)
     */
    suspend fun getService(
        serviceId: String,
        includeDeleted: Boolean? = null,
        securityToken: String? = null): ServiceItem {

        var resp : ServiceItem = client.get("${basePath}/services/${serviceId}"){
            accept(ContentType.Application.Json)
            contentType(ContentType.Application.Json)
            parameter("includeDeleted", includeDeleted)
            parameter("securityToken", securityToken)
        }.body()

        return resp;
    }

    /**
     * Получить список заказов услуги
     *
     * @param serviceId идентификатор услуги.
     * @param timetableFilter фильтр событий
     * @param visibility детализация заказов
     * @param take количество запрашиваемых элементов (используется для paging)
     * @param skip количество пропускаемых заказов с начала списка (используется для paging)
     * @param lmfrom lastModifiedFrom - время, после которого последний раз изменялся заказ (используется для получения изменений)
     * @param lmto lastModifiedFrom - время, до которого последний раз изменялся заказ (используется для получения изменений)
     * @param includeDeleted выдавать удаленные заказы (не путать с отмененными)
     * @param sort порядок сортировки
     */
    suspend fun getServiceTimetable(
        serviceId: String,
        timetableFilter: TimetableFilter? = null,
        visibility: TimetableDetailsVisibility? = null,
        take: Int? = null,
        skip: Int? = null,
        lmfrom: java.time.LocalDateTime? = null,
        lmto: java.time.LocalDateTime? = null,
        includeDeleted: Boolean? = null,
        sort: ItemViewSortCondition? = null): Array<TimetableCase> {

        var resp : Array<TimetableCase> =  client.put("${basePath}/services/${serviceId}/timetable"){
            accept(ContentType.Application.Json)
            contentType(ContentType.Application.Json)
            parameter("visibility", visibility)
            parameter("take", take)
            parameter("skip", skip)
            parameter("lmfrom", lmfrom)
            parameter("lmto", lmto)
            parameter("includeDeleted", includeDeleted)
            parameter("sort", sort)
            setBody(timetableFilter)
        }.body()

        return resp;
    }

    /**
     * Получить событие
     *
     * @param caseId Идентификатор события
     * @param includeDeleted признак чтения удаленного объекта (если false, то будет ошибка 404)
     * @param securityToken токен безопасности (используется для выдачи прав, которые будут добавлены к текущемо пользователю)
     */
    suspend fun getCase(
        caseId: String,
        includeDeleted: Boolean? = null,
        securityToken: String? = null): CaseItem {

        var resp : CaseItem = client.get("${basePath}/cases/${caseId}"){
            accept(ContentType.Application.Json)
            contentType(ContentType.Application.Json)
            parameter("includeDeleted", includeDeleted)
            parameter("securityToken", securityToken)
        }.body()

        return resp;
    }

    /**
     * Обновить событие
     *
     * @param caseItem событие
     * @param profileId идентификатор профиля пользователя, от лица которого совершается обновление (полезно для Истории действий)
     * @param checkVersion признак проверки версии объекта (для избежания конфликтов при обновлении)
     */
    suspend fun updateCase(
        caseItem: CaseItem,
        profileId: String? = null,
        checkVersion: Boolean? = null): CaseItem {

        var resp : CaseItem = client.put("${basePath}/cases/${caseItem.id}"){
            accept(ContentType.Application.Json)
            contentType(ContentType.Application.Json)
            parameter("profileId", profileId)
            parameter("checkVersion", checkVersion)
            setBody(caseItem)
        }.body()

        return resp;
    }

    private suspend fun getAccessToken(): String {
        val tokenResp: TokenResp =  client.post("${basePath}/auth/refresh"){
            contentType(ContentType.Application.Json)
            headers {
                append(HttpHeaders.Authorization, defaultAuthHeader)
            }
            setBody(RefreshReq(refreshToken = refreshToken))
        }.body()

        return tokenResp.accessToken.toString()
    }
}