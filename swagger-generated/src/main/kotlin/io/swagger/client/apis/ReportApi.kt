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

import net.torrow.api.models.GenerateReportReq
import net.torrow.api.models.GenerateReportResp

import io.swagger.client.infrastructure.*

class ReportApi(basePath: kotlin.String = "/") : ApiClient(basePath) {

    /**
     * 
     * 
     * @param body  (optional)
     * @param profileId  (optional)
     * @return GenerateReportResp
     */
    @Suppress("UNCHECKED_CAST")
    fun apiV1ReportsPost(body: GenerateReportReq? = null, profileId: kotlin.String? = null): GenerateReportResp {
        val localVariableBody: kotlin.Any? = body
        val localVariableQuery: MultiValueMap = mapOf("profileId" to listOf("$profileId"))
        val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/api/v1/reports", query = localVariableQuery
        )
        val response = request<GenerateReportResp>(
                localVariableConfig, localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as GenerateReportResp
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * 
     * 
     * @param profileId  
     * @param body  (optional)
     * @return GenerateReportResp
     */
    @Suppress("UNCHECKED_CAST")
    fun apiV1ReportsProfileIdPost(profileId: kotlin.String, body: GenerateReportReq? = null): GenerateReportResp {
        val localVariableBody: kotlin.Any? = body
        
        val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/api/v1/reports/{profileId}".replace("{" + "profileId" + "}", "$profileId")
        )
        val response = request<GenerateReportResp>(
                localVariableConfig, localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as GenerateReportResp
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
}