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

import net.torrow.api.models.DeliveryChannel

/**
 * 
 * @param deliveryChannel 
 * @param order 
 * @param deliveryParameters 
 * @param findValue 
 */
data class DeliveryWay (

    val deliveryChannel: DeliveryChannel? = null,
    val order: kotlin.Int? = null,
    val deliveryParameters: kotlin.String? = null,
    val findValue: kotlin.String? = null
) {
}