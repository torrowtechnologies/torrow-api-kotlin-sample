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


/**
 * 
 * Values: UNKNOWNCONFIRMATIONWAITINGSTATE,CONFIRMED,WAITING,EXPIRED
 */
enum class ConfirmationWaitingState(val value: kotlin.String){
    UNKNOWNCONFIRMATIONWAITINGSTATE("UnknownConfirmationWaitingState"),// :/
    CONFIRMED("Confirmed"),// :/
    WAITING("Waiting"),// :/
    EXPIRED("Expired");// :/
}