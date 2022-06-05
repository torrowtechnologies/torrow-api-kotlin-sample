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

import net.torrow.api.models.AmountProperties
import net.torrow.api.models.Appendix
import net.torrow.api.models.FileInfo
import net.torrow.api.models.HighlightedField
import net.torrow.api.models.ItemLink
import net.torrow.api.models.PersonalViewInfo
import net.torrow.api.models.PriceProperties
import net.torrow.api.models.PublicityType
import net.torrow.api.models.ServiceDescription
import net.torrow.api.models.TorrowObject
import net.torrow.api.models.UsageCondition
import net.torrow.api.models.UsageType

/**
 * 
 * @param description 
 * @param contactId 
 * @param parentResourceId 
 * @param calendarId 
 * @param usageType 
 * @param serviceDescriptions 
 * @param code 
 * @param duration 
 * @param priceProperties 
 * @param amountProperties 
 * @param usageCondition 
 * @param appendixList 
 * @param tags 
 * @param itemObject 
 * @param itemLink 
 * @param personalViewInfo 
 * @param image 
 * @param name 
 * @param isBlocked 
 * @param isCopy 
 * @param publicityType 
 * @param masterItemId 
 * @param highlightedFields 
 */
data class ResourceView (

    val description: kotlin.String? = null,
    val contactId: kotlin.String? = null,
    val parentResourceId: kotlin.String? = null,
    val calendarId: kotlin.String? = null,
    val usageType: UsageType? = null,
    val serviceDescriptions: kotlin.Array<ServiceDescription>? = null,
    val code: kotlin.String? = null,
    val duration: kotlin.Int? = null,
    val priceProperties: PriceProperties? = null,
    val amountProperties: AmountProperties? = null,
    val usageCondition: UsageCondition? = null,
    val appendixList: kotlin.Array<Appendix>? = null,
    val tags: kotlin.Array<kotlin.String>? = null,
    val itemObject: TorrowObject? = null,
    val itemLink: ItemLink? = null,
    val personalViewInfo: PersonalViewInfo? = null,
    val image: FileInfo? = null,
    val name: kotlin.String? = null,
    val isBlocked: kotlin.Boolean? = null,
    val isCopy: kotlin.Boolean? = null,
    val publicityType: PublicityType? = null,
    val masterItemId: kotlin.String? = null,
    val highlightedFields: kotlin.Array<HighlightedField>? = null
) {
}