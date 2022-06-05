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

import net.torrow.api.models.AuthorizationType
import net.torrow.api.models.ExternalAuthorizationSolutionData
import net.torrow.api.models.ExternalServiceType
import net.torrow.api.models.ObjectInfo

/**
 * 
 * @param authorizationType 
 * @param externalServiceType 
 * @param expirationDate 
 * @param solutionData 
 * @param name 
 * @param id 
 * @param meta 
 */
data class ExternalAuth (

    val authorizationType: AuthorizationType? = null,
    val externalServiceType: ExternalServiceType? = null,
    val expirationDate: java.time.LocalDateTime? = null,
    val solutionData: ExternalAuthorizationSolutionData? = null,
    val name: kotlin.String,
    val id: kotlin.String? = null,
    val meta: ObjectInfo? = null
) {
}