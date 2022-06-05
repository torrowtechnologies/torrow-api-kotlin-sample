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

import net.torrow.api.models.TorrowErrorClient

/**
 * 
 * @param code 
 * @param name 
 * @param message 
 * @param systemMessage 
 * @param innerError 
 * @param traceUrl 
 * @param traceIdentifier 
 */
data class TorrowErrorClient (

    val code: kotlin.Int? = null,
    val name: kotlin.String? = null,
    val message: kotlin.String? = null,
    val systemMessage: kotlin.String? = null,
    val innerError: TorrowErrorClient? = null,
    val traceUrl: kotlin.String? = null,
    val traceIdentifier: kotlin.String? = null
) {
}