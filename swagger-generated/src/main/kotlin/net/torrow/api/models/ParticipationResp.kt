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

import net.torrow.api.models.Participation
import net.torrow.api.models.ProfileWithError

/**
 * 
 * @param participationList 
 * @param failedToParticipate 
 */
data class ParticipationResp (

    val participationList: kotlin.Array<Participation>? = null,
    val failedToParticipate: kotlin.Array<ProfileWithError>? = null
) {
}