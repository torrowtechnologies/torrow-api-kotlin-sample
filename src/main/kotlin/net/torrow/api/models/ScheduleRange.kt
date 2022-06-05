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

import net.torrow.api.models.RecurringConditions

/**
 * 
 * @param rid 
 * @param beginning 
 * @param ending 
 * @param recurringConditions 
 * @param name 
 */
data class ScheduleRange (

    val rid: kotlin.String? = null,
    val beginning: java.time.LocalDateTime? = null,
    val ending: java.time.LocalDateTime? = null,
    val recurringConditions: RecurringConditions? = null,
    val name: kotlin.String? = null
) {
}