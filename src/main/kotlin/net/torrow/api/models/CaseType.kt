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
 * Values: UNKNOWNTIMETYPE,TIME,REPEATEDTIME,TODAY,WEEK,LATER,DATE,STATE
 */
enum class CaseType(val value: kotlin.String){
    UNKNOWNTIMETYPE("UnknownTimeType"),// :/
    TIME("Time"),// :/
    REPEATEDTIME("RepeatedTime"),// :/
    TODAY("Today"),// :/
    WEEK("Week"),// :/
    LATER("Later"),// :/
    DATE("Date"),// :/
    STATE("State");// :/
}