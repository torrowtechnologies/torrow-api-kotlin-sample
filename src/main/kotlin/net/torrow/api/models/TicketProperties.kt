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

import net.torrow.api.models.TicketNumber
import net.torrow.api.models.TicketState

/**
 * 
 * @param state 
 * @param ticketNumber 
 * @param paymentUrl 
 * @param paymentExpirationDate 
 */
data class TicketProperties (

    val state: TicketState? = null,
    val ticketNumber: TicketNumber? = null,
    val paymentUrl: kotlin.String? = null,
    val paymentExpirationDate: java.time.LocalDateTime? = null
) {
}