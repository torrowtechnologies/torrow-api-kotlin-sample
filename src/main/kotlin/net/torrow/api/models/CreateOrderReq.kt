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

import net.torrow.api.models.BookingResourceReq
import net.torrow.api.models.CheckInProps
import net.torrow.api.models.OrderInfo

/**
 * 
 * @param checkInProperties 
 * @param resourceList 
 * @param profileId 
 * @param orderInfo 
 * @param fakeForTsGeneratorDoNotRemove 
 */
data class CreateOrderReq (

    val checkInProperties: kotlin.Array<CheckInProps>,
    val resourceList: kotlin.Array<BookingResourceReq>? = null,
    val profileId: kotlin.String? = null,
    val orderInfo: OrderInfo? = null,
    val fakeForTsGeneratorDoNotRemove: kotlin.Int? = null
) {
}