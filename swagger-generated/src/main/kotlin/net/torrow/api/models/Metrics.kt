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
 * @param googleAnalytics 
 * @param yandexMetrics 
 * @param facebookPixel 
 */
data class Metrics (

    val googleAnalytics: kotlin.String? = null,
    val yandexMetrics: kotlin.String? = null,
    val facebookPixel: kotlin.String? = null
) {
}