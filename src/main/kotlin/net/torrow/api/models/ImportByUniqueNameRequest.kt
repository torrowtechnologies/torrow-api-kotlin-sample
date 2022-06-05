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
 * @param uniqueName 
 * @param depth 
 * @param parentId 
 * @param profileId 
 * @param withoutRoot 
 * @param notDuplicateRoot 
 */
data class ImportByUniqueNameRequest (

    val uniqueName: kotlin.String? = null,
    val depth: kotlin.Int? = null,
    val parentId: kotlin.String? = null,
    val profileId: kotlin.String? = null,
    val withoutRoot: kotlin.Boolean? = null,
    val notDuplicateRoot: kotlin.Boolean? = null
) {
}