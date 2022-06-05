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

import net.torrow.api.models.BookingProperties
import net.torrow.api.models.UsageType

/**
 * 
 * @param groupId 
 * @param order 
 * @param groupName 
 * @param minResources 
 * @param maxResources 
 * @param maxTotalAmount 
 * @param quickFilterTags 
 * @param usageType 
 * @param resourceIdList 
 * @param bookingProperties 
 */
data class ResourceGroup (

    val groupId: kotlin.String? = null,
    val order: kotlin.Int? = null,
    val groupName: kotlin.String? = null,
    val minResources: kotlin.Int? = null,
    val maxResources: kotlin.Int? = null,
    val maxTotalAmount: kotlin.Int? = null,
    val quickFilterTags: kotlin.Array<kotlin.String>? = null,
    val usageType: UsageType? = null,
    val resourceIdList: kotlin.Array<kotlin.String>? = null,
    val bookingProperties: BookingProperties? = null
) {
}