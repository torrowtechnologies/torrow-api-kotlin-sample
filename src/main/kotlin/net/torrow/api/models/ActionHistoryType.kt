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
 * Values: UNKNOWN,GRANTACCESSTOITEM,DECLINEACCESSTOITEM,SHAREITEM,SENDLINKOFITEM,REVOKEOFFERTOITEM,UPDATEITEM,DELETEITEM,CREATEITEM,EDITCHILDITEMS,SORTCHILDITEMS,EDITMINDMAP,CHANGEPUBLICITY,EDITPARTICIPANTTYPE,SAVEFEEDBACKMESSAGE,DELETEFEEDBACKMESSAGE,UPDATEINTEGRATIONCONFIGLIST,CREATEINTEGRATIONCONFIG,UPDATEINTEGRATIONCONFIG,DELETEINTEGRATIONCONFIG,REQUESTACCESSTOITEM,REVOKEREQUESTACCESSTOITEM,ACCEPTOFFERTOITEM,REJECTOFFERTOITEM,SAVEITEMTOMINDMAP,CANCELCASEPARTICIPATION,CASEREJECT,CASEDECLINEWORK,CASEPLAN,CASECANCEL,CASETAKEINWORK,CASECOMPLETE,CASEACCEPT,UPDATECASE,UPDATECASETIME,UPDATECASEPLACE,APPROVECASEPARTICIPATION,UPDATECASEPARTICIPANTFIELDS,CREATEORDER,UPDATEORDER,UPDATEORDERINFO,CHANGEORDERSERVICE,CASEACTIONREMINDER
 */
enum class ActionHistoryType(val value: kotlin.String){
    UNKNOWN("Unknown"),// :/
    GRANTACCESSTOITEM("GrantAccessToItem"),// :/
    DECLINEACCESSTOITEM("DeclineAccessToItem"),// :/
    SHAREITEM("ShareItem"),// :/
    SENDLINKOFITEM("SendLinkOfItem"),// :/
    REVOKEOFFERTOITEM("RevokeOfferToItem"),// :/
    UPDATEITEM("UpdateItem"),// :/
    DELETEITEM("DeleteItem"),// :/
    CREATEITEM("CreateItem"),// :/
    EDITCHILDITEMS("EditChildItems"),// :/
    SORTCHILDITEMS("SortChildItems"),// :/
    EDITMINDMAP("EditMindMap"),// :/
    CHANGEPUBLICITY("ChangePublicity"),// :/
    EDITPARTICIPANTTYPE("EditParticipantType"),// :/
    SAVEFEEDBACKMESSAGE("SaveFeedbackMessage"),// :/
    DELETEFEEDBACKMESSAGE("DeleteFeedbackMessage"),// :/
    UPDATEINTEGRATIONCONFIGLIST("UpdateIntegrationConfigList"),// :/
    CREATEINTEGRATIONCONFIG("CreateIntegrationConfig"),// :/
    UPDATEINTEGRATIONCONFIG("UpdateIntegrationConfig"),// :/
    DELETEINTEGRATIONCONFIG("DeleteIntegrationConfig"),// :/
    REQUESTACCESSTOITEM("RequestAccessToItem"),// :/
    REVOKEREQUESTACCESSTOITEM("RevokeRequestAccessToItem"),// :/
    ACCEPTOFFERTOITEM("AcceptOfferToItem"),// :/
    REJECTOFFERTOITEM("RejectOfferToItem"),// :/
    SAVEITEMTOMINDMAP("SaveItemToMindMap"),// :/
    CANCELCASEPARTICIPATION("CancelCaseParticipation"),// :/
    CASEREJECT("CaseReject"),// :/
    CASEDECLINEWORK("CaseDeclineWork"),// :/
    CASEPLAN("CasePlan"),// :/
    CASECANCEL("CaseCancel"),// :/
    CASETAKEINWORK("CaseTakeInWork"),// :/
    CASECOMPLETE("CaseComplete"),// :/
    CASEACCEPT("CaseAccept"),// :/
    UPDATECASE("UpdateCase"),// :/
    UPDATECASETIME("UpdateCaseTime"),// :/
    UPDATECASEPLACE("UpdateCasePlace"),// :/
    APPROVECASEPARTICIPATION("ApproveCaseParticipation"),// :/
    UPDATECASEPARTICIPANTFIELDS("UpdateCaseParticipantFields"),// :/
    CREATEORDER("CreateOrder"),// :/
    UPDATEORDER("UpdateOrder"),// :/
    UPDATEORDERINFO("UpdateOrderInfo"),// :/
    CHANGEORDERSERVICE("ChangeOrderService"),// :/
    CASEACTIONREMINDER("CaseActionReminder");// :/
}