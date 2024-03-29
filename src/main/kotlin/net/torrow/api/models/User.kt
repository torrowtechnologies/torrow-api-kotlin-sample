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

import net.torrow.api.models.AccessLevel
import net.torrow.api.models.ObjectInfo
import net.torrow.api.models.UserProfile

/**
 * 
 * @param timeZone 
 * @param language 
 * @param name 
 * @param accessLevel 
 * @param profileInfoList 
 * @param id 
 * @param meta 
 */
data class User (

    val timeZone: kotlin.String? = null,
    val language: kotlin.String? = null,
    val name: kotlin.String? = null,
    val accessLevel: AccessLevel? = null,
    val profileInfoList: kotlin.Array<UserProfile>? = null,
    val id: kotlin.String? = null,
    val meta: ObjectInfo? = null
) {
}