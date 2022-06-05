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
 * @param tagsByItemId 
 * @param tags 
 * @param aliasByItemId 
 * @param alias 
 * @param itemId 
 * @param order 
 */
data class ItemProperties (

    val tagsByItemId: kotlin.collections.Map<kotlin.String, kotlin.Array<kotlin.String>>? = null,
    val tags: kotlin.Array<kotlin.String>? = null,
    val aliasByItemId: kotlin.collections.Map<kotlin.String, kotlin.String>? = null,
    val alias: kotlin.String? = null,
    val itemId: kotlin.String,
    val order: kotlin.Int? = null
) {
}