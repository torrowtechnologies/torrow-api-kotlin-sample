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
 * @param amount 
 * @param resourceId 
 * @param resourceGroupId 
 * @param consumerComment 
 * @param fakeForTsGeneratorDoNotRemove 
 */
data class BookingResourceReq (

    val amount: kotlin.Double? = null,
    val resourceId: kotlin.String? = null,
    val resourceGroupId: kotlin.String? = null,
    val consumerComment: kotlin.String? = null,
    val fakeForTsGeneratorDoNotRemove: kotlin.Int? = null
) {
}