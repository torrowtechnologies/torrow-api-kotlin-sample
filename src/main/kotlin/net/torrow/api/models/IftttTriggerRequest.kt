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
 * @param triggerIdentity 
 * @param triggerFields 
 * @param iftttSource 
 * @param user 
 * @param limit 
 */
data class IftttTriggerRequest (

    val triggerIdentity: kotlin.String? = null,
    val triggerFields: kotlin.collections.Map<kotlin.String, kotlin.String>? = null,
    val iftttSource: kotlin.collections.Map<kotlin.String, kotlin.String>? = null,
    val user: kotlin.collections.Map<kotlin.String, kotlin.String>? = null,
    val limit: kotlin.Int? = null
) {
}