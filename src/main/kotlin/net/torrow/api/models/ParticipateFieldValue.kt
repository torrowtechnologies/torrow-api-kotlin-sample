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

import net.torrow.api.models.ParticipationFieldType

/**
 * 
 * @param participationFieldType 
 * @param value 
 * @param name 
 */
data class ParticipateFieldValue (

    val participationFieldType: ParticipationFieldType? = null,
    val value: kotlin.String? = null,
    val name: kotlin.String? = null
) {
}