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

import net.torrow.api.models.BookedResource

/**
 * 
 * @param profileId 
 * @param caseParticipantId 
 * @param resources 
 */
data class CaseConsumer (

    val profileId: kotlin.String? = null,
    val caseParticipantId: kotlin.String? = null,
    val resources: kotlin.Array<BookedResource>? = null
) {
}