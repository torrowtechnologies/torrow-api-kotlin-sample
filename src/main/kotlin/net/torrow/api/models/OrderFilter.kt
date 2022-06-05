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

import net.torrow.api.models.CaseState
import net.torrow.api.models.CaseType

/**
 * 
 * @param searchText 
 * @param fuzzyDistance 
 * @param from 
 * @param to 
 * @param strictlyInTimeRange 
 * @param orderStateList 
 * @param orderTypeList 
 */
data class OrderFilter (

    val searchText: kotlin.String? = null,
    val fuzzyDistance: kotlin.Int? = null,
    val from: java.time.LocalDateTime? = null,
    val to: java.time.LocalDateTime? = null,
    val strictlyInTimeRange: kotlin.Boolean? = null,
    val orderStateList: kotlin.Array<CaseState>? = null,
    val orderTypeList: kotlin.Array<CaseType>? = null
) {
}