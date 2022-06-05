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

import net.torrow.api.models.FileInfo

/**
 * 
 * @param subscriptionId 
 * @param name 
 * @param state 
 * @param createDate 
 * @param beginDate 
 * @param endDate 
 * @param caseParticipantId 
 * @param image 
 */
data class LoyaltyCardSubscription (

    val subscriptionId: kotlin.String? = null,
    val name: kotlin.String? = null,
    val state: kotlin.Int? = null,
    val createDate: java.time.LocalDateTime? = null,
    val beginDate: java.time.LocalDateTime? = null,
    val endDate: java.time.LocalDateTime? = null,
    val caseParticipantId: kotlin.String? = null,
    val image: FileInfo? = null
) {
}