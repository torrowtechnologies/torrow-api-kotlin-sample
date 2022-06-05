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

import net.torrow.api.models.GetTorrowIdResp
import net.torrow.api.models.TorrowObjectType

import io.swagger.client.infrastructure.*

class IdGeneratorApi(basePath: kotlin.String = "/") : ApiClient(basePath) {

    /**
     * 
     * 
     * @param objectType  
     * @return GetTorrowIdResp
     */
    @Suppress("UNCHECKED_CAST")
    fun apiV1IdgeneratorObjectTypeGet(objectType: TorrowObjectType): GetTorrowIdResp {
        
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/api/v1/idgenerator/{objectType}".replace("{" + "objectType" + "}", "$objectType")
        )
        val response = request<GetTorrowIdResp>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as GetTorrowIdResp
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
}
