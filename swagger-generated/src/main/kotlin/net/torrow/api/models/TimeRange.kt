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
 * @param rid 
 * @param begin 
 * @param end 
 * @param name 
 */
data class TimeRange (

    val rid: kotlin.String? = null,
    val begin: java.time.LocalDateTime? = null,
    val end: java.time.LocalDateTime? = null,
    val name: kotlin.String? = null
) {
}