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

import net.torrow.api.models.AccountType

/**
 * 
 * @param sessionId 
 * @param codeLifetimeSeconds 
 * @param accountType 
 * @param accountName 
 */
data class UserDeletingInitResp (

    val sessionId: kotlin.String? = null,
    val codeLifetimeSeconds: kotlin.Int? = null,
    val accountType: AccountType? = null,
    val accountName: kotlin.String? = null
) {
}