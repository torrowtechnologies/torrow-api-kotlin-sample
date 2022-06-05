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

import net.torrow.api.models.CaseChangeProperties
import net.torrow.api.models.CaseParticipantFilter
import net.torrow.api.models.NotificationProperties
import net.torrow.api.models.RequestConfirmationProperties
import net.torrow.api.models.Trigger
import net.torrow.api.models.Type

/**
 * 
 * @param rid 
 * @param type 
 * @param trigger 
 * @param notificationProperties 
 * @param caseParticipantFilter 
 * @param caseChangeProperties 
 * @param requestConfirmationProperties 
 */
data class CaseAction (

    val rid: kotlin.String? = null,
    val type: Type? = null,
    val trigger: Trigger? = null,
    val notificationProperties: NotificationProperties? = null,
    val caseParticipantFilter: CaseParticipantFilter? = null,
    val caseChangeProperties: CaseChangeProperties? = null,
    val requestConfirmationProperties: RequestConfirmationProperties? = null
) {
}