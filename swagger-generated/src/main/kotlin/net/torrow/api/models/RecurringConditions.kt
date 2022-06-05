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
 * @param cron 
 * @param remainingCount 
 * @param endDate 
 * @param beginDate 
 * @param firstWeekDate 
 * @param weeklyCron 
 * @param repeatInterval 
 */
data class RecurringConditions (

    val cron: kotlin.String? = null,
    val remainingCount: kotlin.Int? = null,
    val endDate: java.time.LocalDateTime? = null,
    val beginDate: java.time.LocalDateTime? = null,
    val firstWeekDate: java.time.LocalDateTime? = null,
    val weeklyCron: kotlin.String? = null,
    val repeatInterval: kotlin.Int? = null
) {
}