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

import net.torrow.api.models.BlockReason
import net.torrow.api.models.DictionarySortCondition

import io.swagger.client.infrastructure.*

class BlockReasonApi(basePath: kotlin.String = "/") : ApiClient(basePath) {

    /**
     * 
     * 
     * @param lng  (optional)
     * @param take  (optional)
     * @param skip  (optional)
     * @param limit  (optional)
     * @param includeDeleted  (optional)
     * @param sort  (optional)
     * @return kotlin.Array<BlockReason>
     */
    @Suppress("UNCHECKED_CAST")
    fun apiV1BlockreasonAllGet(lng: kotlin.String? = null, take: kotlin.Int? = null, skip: kotlin.Int? = null, limit: kotlin.Int? = null, includeDeleted: kotlin.Boolean? = null, sort: DictionarySortCondition? = null): kotlin.Array<BlockReason> {
        val localVariableQuery: MultiValueMap = mapOf("lng" to listOf("$lng"), "take" to listOf("$take"), "skip" to listOf("$skip"), "limit" to listOf("$limit"), "includeDeleted" to listOf("$includeDeleted"), "sort" to listOf("$sort"))
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/api/v1/blockreason/all", query = localVariableQuery
        )
        val response = request<kotlin.Array<BlockReason>>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<BlockReason>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * 
     * 
     * @param id  
     * @return kotlin.Int
     */
    @Suppress("UNCHECKED_CAST")
    fun apiV1BlockreasonIdDelete(id: kotlin.Int): kotlin.Int {
        
        val localVariableConfig = RequestConfig(
                RequestMethod.DELETE,
                "/api/v1/blockreason/{id}".replace("{" + "id" + "}", "$id")
        )
        val response = request<kotlin.Int>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Int
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * 
     * 
     * @param id  
     * @param lng  (optional)
     * @return BlockReason
     */
    @Suppress("UNCHECKED_CAST")
    fun apiV1BlockreasonIdGet(id: kotlin.Int, lng: kotlin.String? = null): BlockReason {
        val localVariableQuery: MultiValueMap = mapOf("lng" to listOf("$lng"))
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/api/v1/blockreason/{id}".replace("{" + "id" + "}", "$id"), query = localVariableQuery
        )
        val response = request<BlockReason>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as BlockReason
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * 
     * 
     * @param body  (optional)
     * @return kotlin.Int
     */
    @Suppress("UNCHECKED_CAST")
    fun apiV1BlockreasonPost(body: BlockReason? = null): kotlin.Int {
        val localVariableBody: kotlin.Any? = body
        
        val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/api/v1/blockreason"
        )
        val response = request<kotlin.Int>(
                localVariableConfig, localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Int
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
}
