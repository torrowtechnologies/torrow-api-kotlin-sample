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

import net.torrow.api.models.ReportOptions
import net.torrow.api.models.ReportProperties

/**
 * 
 * @param options 
 * @param properties 
 */
data class GenerateReportReq (

    val options: ReportOptions,
    val properties: ReportProperties
) {
}