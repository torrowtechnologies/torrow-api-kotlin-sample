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
 * @param id 
 * @param serviceName 
 * @param resourceGroupId 
 * @param resourceGroupName 
 * @param sortIndex 
 * @param usageAmount 
 * @param laterBinding 
 */
data class ServiceDescription (

    val id: kotlin.String? = null,
    val serviceName: kotlin.String? = null,
    val resourceGroupId: kotlin.String? = null,
    val resourceGroupName: kotlin.String? = null,
    val sortIndex: kotlin.Int? = null,
    val usageAmount: kotlin.Double? = null,
    val laterBinding: kotlin.Boolean? = null
) {
}