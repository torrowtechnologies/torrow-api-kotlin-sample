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
 * Values: UNKNOWNPARTICIPANTTYPE,OWNER,EDITOR,READER,PUBLISHER,MANAGER,PUBLICREADER
 */
enum class ParticipantType(val value: kotlin.String){
    UNKNOWNPARTICIPANTTYPE("UnknownParticipantType"),// :/
    OWNER("Owner"),// :/
    EDITOR("Editor"),// :/
    READER("Reader"),// :/
    PUBLISHER("Publisher"),// :/
    MANAGER("Manager"),// :/
    PUBLICREADER("PublicReader");// :/
}