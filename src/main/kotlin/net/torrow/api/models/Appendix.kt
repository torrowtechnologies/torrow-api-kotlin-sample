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

import net.torrow.api.models.ParticipantType

/**
 * 
 * @param id 
 * @param order 
 * @param openDate 
 * @param closeDate 
 * @param openPostponing 
 * @param closePostponing 
 * @param usageDuration 
 * @param participantType 
 */
data class Appendix (

    val id: kotlin.String? = null,
    val order: kotlin.Int? = null,
    val openDate: java.time.LocalDateTime? = null,
    val closeDate: java.time.LocalDateTime? = null,
    val openPostponing: kotlin.Int? = null,
    val closePostponing: kotlin.Int? = null,
    val usageDuration: kotlin.Int? = null,
    val participantType: ParticipantType? = null
) {
}