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
 * @param rid 
 * @param addressName 
 * @param block 
 * @param cityId 
 * @param countryId 
 * @param door 
 * @param index 
 * @param room 
 * @param street 
 * @param addressString 
 * @param location 
 * @param order 
 */
data class Address (

    val rid: kotlin.String? = null,
    val addressName: kotlin.String? = null,
    val block: kotlin.String? = null,
    val cityId: kotlin.Int? = null,
    val countryId: kotlin.Int? = null,
    val door: kotlin.String? = null,
    val index: kotlin.String? = null,
    val room: kotlin.String? = null,
    val street: kotlin.String? = null,
    val addressString: kotlin.String? = null,
    val location: kotlin.Array<kotlin.Double>? = null,
    val order: kotlin.Int? = null
) {
}