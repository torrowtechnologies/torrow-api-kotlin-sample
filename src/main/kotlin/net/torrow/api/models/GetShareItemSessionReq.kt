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


/**
 * 
 * @param userProfileId 
 * @param expiredDate 
 * @param activateCount 
 * @param code 
 * @param userMessage 
 */
data class GetShareItemSessionReq (

    val userProfileId: kotlin.String? = null,
    val expiredDate: java.time.LocalDateTime? = null,
    val activateCount: kotlin.Int? = null,
    val code: kotlin.String? = null,
    val userMessage: kotlin.String? = null
) {
}