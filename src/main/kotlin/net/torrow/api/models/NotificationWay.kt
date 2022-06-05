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

import net.torrow.api.models.DeliveryStrategy
import net.torrow.api.models.DeliveryWay

/**
 * 
 * @param deliveryStrategy 
 * @param deliveryWayList 
 * @param notificationTypeList 
 */
data class NotificationWay (

    val deliveryStrategy: DeliveryStrategy? = null,
    val deliveryWayList: kotlin.Array<DeliveryWay>? = null,
    val notificationTypeList: kotlin.Array<kotlin.Int>? = null
) {
}