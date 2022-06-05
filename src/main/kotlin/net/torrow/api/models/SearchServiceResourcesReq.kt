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

import net.torrow.api.models.TimePeriod

/**
 * 
 * @param resourceGroupId 
 * @param text 
 * @param resourceIds 
 * @param timePeriod 
 * @param caseIdsToExclude 
 * @param distance 
 * @param take 
 * @param skip 
 * @param includeDeleted 
 */
data class SearchServiceResourcesReq (

    val resourceGroupId: kotlin.String? = null,
    val text: kotlin.String? = null,
    val resourceIds: kotlin.Array<kotlin.String>? = null,
    val timePeriod: TimePeriod? = null,
    val caseIdsToExclude: kotlin.Array<kotlin.String>? = null,
    val distance: kotlin.Int? = null,
    val take: kotlin.Int? = null,
    val skip: kotlin.Int? = null,
    val includeDeleted: kotlin.Boolean? = null
) {
}