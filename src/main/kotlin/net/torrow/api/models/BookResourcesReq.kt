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

import net.torrow.api.models.CaseConsumer

/**
 * 
 * @param registrarProfileId 
 * @param caseConsumerList 
 * @param message 
 * @param versionToCheck 
 * @param isNeedAnnouncement 
 */
data class BookResourcesReq (

    val registrarProfileId: kotlin.String? = null,
    val caseConsumerList: kotlin.Array<CaseConsumer>? = null,
    val message: kotlin.String? = null,
    val versionToCheck: kotlin.Int? = null,
    val isNeedAnnouncement: kotlin.Boolean? = null
) {
}