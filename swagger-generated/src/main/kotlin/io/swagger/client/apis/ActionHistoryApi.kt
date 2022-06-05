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
package io.swagger.client.apis

import net.torrow.api.models.ActionHistoryInfo
import net.torrow.api.models.ActionHistoryState
import net.torrow.api.models.ActionHistoryType
import net.torrow.api.models.ItemViewSortCondition

import io.swagger.client.infrastructure.*

class ActionHistoryApi(basePath: kotlin.String = "/") : ApiClient(basePath) {

    /**
     * 
     * 
     * @param language  (optional)
     * @param take  (optional, default to 2147483647)
     * @param skip  (optional, default to 0)
     * @param lmfrom  (optional)
     * @param lmto  (optional)
     * @param includeDeleted  (optional, default to false)
     * @param sort  (optional)
     * @param types  (optional)
     * @param states  (optional)
     * @param itemIds  (optional)
     * @return kotlin.Array<ActionHistoryInfo>
     */
    @Suppress("UNCHECKED_CAST")
    fun apiV1ActionhistoryGet(language: kotlin.String? = null, take: kotlin.Int? = null, skip: kotlin.Int? = null, lmfrom: java.time.LocalDateTime? = null, lmto: java.time.LocalDateTime? = null, includeDeleted: kotlin.Boolean? = null, sort: ItemViewSortCondition? = null, types: kotlin.Array<ActionHistoryType>? = null, states: kotlin.Array<ActionHistoryState>? = null, itemIds: kotlin.Array<kotlin.String>? = null): kotlin.Array<ActionHistoryInfo> {
        val localVariableQuery: MultiValueMap = mapOf("language" to listOf("$language"), "take" to listOf("$take"), "skip" to listOf("$skip"), "lmfrom" to listOf("$lmfrom"), "lmto" to listOf("$lmto"), "includeDeleted" to listOf("$includeDeleted"), "sort" to listOf("$sort"), "types" to toMultiValue(types!!.toList(), "multi"), "states" to toMultiValue(states!!.toList(), "multi"), "itemIds" to toMultiValue(itemIds!!.toList(), "multi"))
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/api/v1/actionhistory", query = localVariableQuery
        )
        val response = request<kotlin.Array<ActionHistoryInfo>>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<ActionHistoryInfo>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
}
