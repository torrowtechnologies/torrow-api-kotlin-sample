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

import net.torrow.api.models.ItemView
import net.torrow.api.models.TorrowItem

/**
 * 
 * @param rootId 
 * @param items 
 * @param views 
 */
data class ExportGraph (

    val rootId: kotlin.String? = null,
    val items: kotlin.Array<TorrowItem>? = null,
    val views: kotlin.Array<ItemView>? = null
) {
}