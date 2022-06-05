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
 * Values: LASTMODIFIEDASC,LASTMODIFIEDDESC,CREATEDATEASC,CREATEDATEDESC,CREATEDATEASCLASTMODIFIEDASC,CREATEDATEDESCLASTMODIFIEDASC,CREATEDATEASCLASTMODIFIEDDESC,CREATEDATEDESCLASTMODIFIEDDESC,LASTMODIFIEDASCCREATEDATEASC,LASTMODIFIEDASCCREATEDATEDESC,LASTMODIFIEDDESCCREATEDATEASC,LASTMODIFIEDDESCCREATEDATEDESC
 */
enum class OrderViewSortCondition(val value: kotlin.String){
    LASTMODIFIEDASC("LastModifiedAsc"),// :/
    LASTMODIFIEDDESC("LastModifiedDesc"),// :/
    CREATEDATEASC("CreateDateAsc"),// :/
    CREATEDATEDESC("CreateDateDesc"),// :/
    CREATEDATEASCLASTMODIFIEDASC("CreateDateAscLastModifiedAsc"),// :/
    CREATEDATEDESCLASTMODIFIEDASC("CreateDateDescLastModifiedAsc"),// :/
    CREATEDATEASCLASTMODIFIEDDESC("CreateDateAscLastModifiedDesc"),// :/
    CREATEDATEDESCLASTMODIFIEDDESC("CreateDateDescLastModifiedDesc"),// :/
    LASTMODIFIEDASCCREATEDATEASC("LastModifiedAscCreateDateAsc"),// :/
    LASTMODIFIEDASCCREATEDATEDESC("LastModifiedAscCreateDateDesc"),// :/
    LASTMODIFIEDDESCCREATEDATEASC("LastModifiedDescCreateDateAsc"),// :/
    LASTMODIFIEDDESCCREATEDATEDESC("LastModifiedDescCreateDateDesc");// :/
}