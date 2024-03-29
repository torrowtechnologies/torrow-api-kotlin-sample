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
 * Values: UNKNOWNPARTICIPATIONFIELD,FULLNAME,LASTNAME,FIRSTNAME,MIDDLENAME,COMPANY,POSITION,MAINPHONE,VERIFIEDMAINPHONE,ADDITIONALPHONE,MAINEMAIL,VERIFIEDMAINEMAIL,ADDITIONALEMAIL,ADDRESS,ADDRESSLOCATION,PAYMENTACCOUNT,CUSTOMSTRING,CUSTOMBOOLEAN,CUSTOMINT32,CUSTOMDOUBLE,CUSTOMMONEY,CUSTOMDATE,CUSTOMTIME,CUSTOMDATETIME
 */
enum class ParticipationFieldType(val value: kotlin.String){
    UNKNOWNPARTICIPATIONFIELD("UnknownParticipationField"),// :/
    FULLNAME("FullName"),// :/
    LASTNAME("LastName"),// :/
    FIRSTNAME("FirstName"),// :/
    MIDDLENAME("MiddleName"),// :/
    COMPANY("Company"),// :/
    POSITION("Position"),// :/
    MAINPHONE("MainPhone"),// :/
    VERIFIEDMAINPHONE("VerifiedMainPhone"),// :/
    ADDITIONALPHONE("AdditionalPhone"),// :/
    MAINEMAIL("MainEmail"),// :/
    VERIFIEDMAINEMAIL("VerifiedMainEmail"),// :/
    ADDITIONALEMAIL("AdditionalEmail"),// :/
    ADDRESS("Address"),// :/
    ADDRESSLOCATION("AddressLocation"),// :/
    PAYMENTACCOUNT("PaymentAccount"),// :/
    CUSTOMSTRING("CustomString"),// :/
    CUSTOMBOOLEAN("CustomBoolean"),// :/
    CUSTOMINT32("CustomInt32"),// :/
    CUSTOMDOUBLE("CustomDouble"),// :/
    CUSTOMMONEY("CustomMoney"),// :/
    CUSTOMDATE("CustomDate"),// :/
    CUSTOMTIME("CustomTime"),// :/
    CUSTOMDATETIME("CustomDateTime");// :/
}