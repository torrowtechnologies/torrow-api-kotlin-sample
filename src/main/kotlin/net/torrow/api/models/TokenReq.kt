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

import net.torrow.api.models.DeviceInfo

/**
 * 
 * @param sessionId 
 * @param code 
 * @param scopes 
 * @param deviceInfo 
 */
data class TokenReq (

    val sessionId: kotlin.String? = null,
    val code: kotlin.String? = null,
    val scopes: kotlin.Array<kotlin.String>? = null,
    val deviceInfo: DeviceInfo? = null
) {
}