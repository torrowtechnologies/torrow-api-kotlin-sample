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
 * @param resourceGroupId 
 * @param resourceId 
 * @param amount 
 */
data class RequestedResource (

    val resourceGroupId: kotlin.String,
    val resourceId: kotlin.String? = null,
    val amount: kotlin.Double? = null
) {
}