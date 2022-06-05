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

import net.torrow.api.models.LocationActivation
import net.torrow.api.models.NotificationWay
import net.torrow.api.models.RecurringConditions

/**
 * 
 * @param rid 
 * @param name 
 * @param date 
 * @param recurringConditions 
 * @param notificationWay 
 * @param sound 
 * @param vibrate 
 * @param needConfirmation 
 * @param locationActivation 
 */
data class PersonalReminder (

    val rid: kotlin.String? = null,
    val name: kotlin.String? = null,
    val date: java.time.LocalDateTime? = null,
    val recurringConditions: RecurringConditions? = null,
    val notificationWay: NotificationWay? = null,
    val sound: kotlin.String? = null,
    val vibrate: kotlin.Boolean? = null,
    val needConfirmation: kotlin.Boolean? = null,
    val locationActivation: LocationActivation? = null
) {
}