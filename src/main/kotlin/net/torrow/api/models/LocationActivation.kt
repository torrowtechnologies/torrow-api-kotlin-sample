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

import net.torrow.api.models.ReminderLocationDirection

/**
 * 
 * @param point 
 * @param radius 
 * @param direction 
 */
data class LocationActivation (

    val point: kotlin.Array<kotlin.Double>? = null,
    val radius: kotlin.Int? = null,
    val direction: ReminderLocationDirection? = null
) {
}