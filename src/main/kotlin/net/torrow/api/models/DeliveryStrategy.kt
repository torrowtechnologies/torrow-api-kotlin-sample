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
 * Values: UNKNOWNDELIVERYSTRATEGY,ALL,FIRSTDELIVERED
 */
enum class DeliveryStrategy(val value: kotlin.String){
    UNKNOWNDELIVERYSTRATEGY("UnknownDeliveryStrategy"),// :/
    ALL("All"),// :/
    FIRSTDELIVERED("FirstDelivered");// :/
}