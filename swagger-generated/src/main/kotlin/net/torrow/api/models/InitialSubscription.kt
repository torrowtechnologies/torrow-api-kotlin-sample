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

import net.torrow.api.models.TransactionValue

/**
 * 
 * @param name 
 * @param usagePeriod 
 * @param transactionValues 
 */
data class InitialSubscription (

    val name: kotlin.String? = null,
    val usagePeriod: kotlin.Int? = null,
    val transactionValues: kotlin.Array<TransactionValue>? = null
) {
}