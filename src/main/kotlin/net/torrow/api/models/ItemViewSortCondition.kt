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
 * Values: ORDERASC,ORDERDESC,LASTMODIFIEDASC,LASTMODIFIEDDESC,ORDERASCLASTMODIFIEDASC,ORDERDESCLASTMODIFIEDASC,ORDERASCLASTMODIFIEDDESC,ORDERDESCLASTMODIFIEDDESC,LASTMODIFIEDASCORDERASC,LASTMODIFIEDASCORDERDESC,LASTMODIFIEDDESCORDERASC,LASTMODIFIEDDESCORDERDESC
 */
enum class ItemViewSortCondition(val value: kotlin.String){
    ORDERASC("OrderAsc"),// :/
    ORDERDESC("OrderDesc"),// :/
    LASTMODIFIEDASC("LastModifiedAsc"),// :/
    LASTMODIFIEDDESC("LastModifiedDesc"),// :/
    ORDERASCLASTMODIFIEDASC("OrderAscLastModifiedAsc"),// :/
    ORDERDESCLASTMODIFIEDASC("OrderDescLastModifiedAsc"),// :/
    ORDERASCLASTMODIFIEDDESC("OrderAscLastModifiedDesc"),// :/
    ORDERDESCLASTMODIFIEDDESC("OrderDescLastModifiedDesc"),// :/
    LASTMODIFIEDASCORDERASC("LastModifiedAscOrderAsc"),// :/
    LASTMODIFIEDASCORDERDESC("LastModifiedAscOrderDesc"),// :/
    LASTMODIFIEDDESCORDERASC("LastModifiedDescOrderAsc"),// :/
    LASTMODIFIEDDESCORDERDESC("LastModifiedDescOrderDesc");// :/
}