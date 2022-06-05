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

import net.torrow.api.models.ActivityState

/**
 * 
 * @param lastActivityTime 
 * @param meetingTime 
 * @param nextChangeStatusTime 
 * @param state 
 * @param comment 
 * @param profileId 
 */
data class ActivityStatus (

    val lastActivityTime: java.time.LocalDateTime? = null,
    val meetingTime: java.time.LocalDateTime? = null,
    val nextChangeStatusTime: java.time.LocalDateTime? = null,
    val state: ActivityState? = null,
    val comment: kotlin.String? = null,
    val profileId: kotlin.String? = null
) {
}