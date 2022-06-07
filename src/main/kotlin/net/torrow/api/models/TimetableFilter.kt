/**
 * Torrow API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package net.torrow.api.models

import net.torrow.api.models.AvailabilityTime
import net.torrow.api.models.BookingResourceFilter
import net.torrow.api.models.CaseParticipantState
import net.torrow.api.models.CaseParticipantType
import net.torrow.api.models.CaseState
import net.torrow.api.models.CaseType

/**
 * 
 * @param from начальное время (ISO-8601) событий
 * @param to конечное время (ISO-8601) событий
 * @param caseStateList состояния событий (например Canceled, InWork)
 * @param caseTypeList типы событий
 * @param caseParticipantTypeList типы участия в событии (используется для фильтрации расписаний участников)
 * @param caseParticipantStateList состояния участия в событии (используется для фильтрации расписаний участников)
 * @param availabilityTimeList тип доступности участника в событии (используется для фильтрации расписаний участников)
 * @param profileIdList профили участников (используется для фильтрации расписаний участников)
 * @param serviceIdList услуги участников (используется для фильтрации расписаний участников)
 * @param caseIdListToExclude список событий, которые нужно исключить из расписания
 * @param hasService оставить только события по услугам
 * @param strictlyInTimeRange строгий поск в промежутке (если установлен, то будут выдаваться события которые начинаются после from и заканчиваются до to)
 * @param bookingResourceFilter фильтр по ресурсам события
 */
data class TimetableFilter (

    val from: java.time.LocalDateTime? = null,
    val to: java.time.LocalDateTime? = null,
    val caseStateList: kotlin.Array<CaseState>? = null,
    val caseTypeList: kotlin.Array<CaseType>? = null,
    val caseParticipantTypeList: kotlin.Array<CaseParticipantType>? = null,
    val caseParticipantStateList: kotlin.Array<CaseParticipantState>? = null,
    val availabilityTimeList: kotlin.Array<AvailabilityTime>? = null,
    val profileIdList: kotlin.Array<kotlin.String>? = null,
    val serviceIdList: kotlin.Array<kotlin.String>? = null,
    val caseIdListToExclude: kotlin.Array<kotlin.String>? = null,
    val hasService: kotlin.Boolean? = null,
    val strictlyInTimeRange: kotlin.Boolean? = null,
    val bookingResourceFilter: BookingResourceFilter? = null
) {
}