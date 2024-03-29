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

import net.torrow.api.models.Conditions
import net.torrow.api.models.OperationProperties
import net.torrow.api.models.TriggerType

/**
 * 
 * @param type 
 * @param relativeTime 
 * @param operationProperties 
 * @param conditions 
 */
data class Trigger (

    val type: TriggerType? = null,
    val relativeTime: kotlin.Int? = null,
    val operationProperties: OperationProperties? = null,
    val conditions: Conditions? = null
) {
}