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
 * Values: UNKNOWNOPERATION,VERIFICATION,CONFIRMCOMMUNICATION,ACCEPTINVITE,SENDPERSONALREMINDER,GRANTACCESSTOITEM,DECLINEACCESSTOITEM,SHAREITEM,SENDLINKOFITEM,REVOKEOFFERTOITEM,UPDATEITEM,DELETEITEM,CREATEITEM,READITEM,SEARCHITEM,READCHILDITEMS,EDITCHILDITEMS,SORTCHILDITEMS,EDITMINDMAP,CHANGEPUBLICITY,EDITPARTICIPANTTYPE,READPARTICIPANTS,CANUSEASPROFILE,COPYLINK,SOCIALSHARING,INVITETOPARTICIPATE,READCASEPARTICIPANTS,UPDATEUNIQUENAME,READITEMOWNERS,HAVENOTNOTIFICATIONWAYS,INCLUDETOPARENT,EXCLUDEFROMPARENT,INCLUDETOGROUP,EXCLUDEFROMGROUP,SETGROUPITEM,UNSETGROUPITEM,REGISTERDEVICE,SETITEMTAGS,GETACTIONHISTORY,UPDATEFEEDBACKOPTIONS,SENDANNOUNCEMENTSTOPARTICIPANTS,SETITEMMETRICS,GETFEEDBACKMESSAGE,SAVEFEEDBACKMESSAGE,DELETEFEEDBACKMESSAGE,FULLVIEWOFACTIONHISTORY,GENERATESECURITYTOKEN,UPDATEINTEGRATIONCONFIGLIST,CREATEINTEGRATIONCONFIG,UPDATEINTEGRATIONCONFIG,DELETEINTEGRATIONCONFIG,REQUESTACCESSTOITEM,REVOKEREQUESTTOITEM,PARTICIPATE,REJECTOFFERTOITEM,INVITE,SAVEITEMTOMINDMAP,UPDATEPARTICIPANTPROFILE,REQUESTPARTICIPANTPROFILE,REJECTITEM,BLOCKITEM,UNBLOCKITEM,READERTESTFUNCTION,EDITORTESTFUNCTION,OWNERTESTFUNCTION,POTENTIALREADERTESTFUNCTION,ADMINISTRATORTESTFUNCTION,PUBLICREADERTESTFUNCTION,MANAGERTESTFUNCTION,DELETEDTESTFUNCTION,CHECKIN,BOOKRESOURCES,CONFIRMOTHERCASEPARTICIPATION,CANCELCASEPARTICIPATION,DISCLAIMOTHERCASEPARTICIPATION,SENDCLAIMABOUTOTHERCASEPARTICIPATION,CREATEREMINDERFORCONSUMER,DELETEREMINDERFORCONSUMER,EDITREMINDERFORCONSUMER,CREATEREMINDER,DELETEREMINDER,EDITREMINDER,CHANGETASKSTATUS,CONFIRMREMINDER,SENDBUSINESSCARD,DISCLAIMMYCASEPARTICIPATION,SENDCLAIMABOUTMYCASEPARTICIPATION,CREATESINGLECASEFORGROUPCASE,GENERATECASEREPORT,CONFIRMOTHERCASEPARTICIPATIONREMINDERNOTIF,SENDCLAIMABOUTOTHERCASEPARTICIPATIONNOTIF,GETTIMETABLE,GETTIMETABLEVIEW,CHECKINFOREXECUTOR,CHECKINFORCONSUMER,CASEREJECT,CASEDECLINEWORK,CASEPLAN,CASECANCEL,CASETAKEINWORK,CASECOMPLETE,CASEACCEPT,REQUESTAPPROVETOCASEPARTICIPATION,UPDATECASE,UPDATECASETIME,UPDATECASEPLACE,APPROVECASEPARTICIPATION,CONFIRMCASEPARTICIPATION,FREECASESPOTOPENEDUP,APPROVEMONEYRECEIVE,REJECTMONEYRECEIVE,REQUESTAPPROVEMONEYRECEIVE,UPDATECASEPARTICIPANTFIELDS,CASERETURNTOVERIFICATION,INCLUDECASETOUSERCALENDAR,INCLUDECASETOCUSTOMCALENDAR,EXCLUDECASETOUSERCALENDAR,EXCLUDECASETOCUSTOMCALENDAR,GETCALENDARCASE,GETCALENDARTASK,INCLUDESPECIFICATIONS,EXCLUDESPECIFICATIONS,CREATESERVICESESSION,GETCHECKINSCHEDULE,CREATEORDER,CREATESPECIFICATION,SERVICEDASHBOARD,GENERATESERVICEREPORT,GENERATESERVICESRESOURCESREPORT,GENERATERESOURCESRENTREPORT,UPDATEORDER,UPDATEORDERINFO,GETRECHECKINSCHEDULE,CHANGEORDERSERVICE,GETSERVICEWORKLOADINFO,UPDATECONTACTPROPERTIES,PICKORDER,RETURNORDER,CONSUMERTESTFUNCTION,EXECUTORTESTFUNCTION,POTENTIALCONSUMERTESTFUNCTION,CASEACTIONREMINDER
 */
enum class OperationType(val value: kotlin.String){
    UNKNOWNOPERATION("UnknownOperation"),// :/
    VERIFICATION("Verification"),// :/
    CONFIRMCOMMUNICATION("ConfirmCommunication"),// :/
    ACCEPTINVITE("AcceptInvite"),// :/
    SENDPERSONALREMINDER("SendPersonalReminder"),// :/
    GRANTACCESSTOITEM("GrantAccessToItem"),// :/
    DECLINEACCESSTOITEM("DeclineAccessToItem"),// :/
    SHAREITEM("ShareItem"),// :/
    SENDLINKOFITEM("SendLinkOfItem"),// :/
    REVOKEOFFERTOITEM("RevokeOfferToItem"),// :/
    UPDATEITEM("UpdateItem"),// :/
    DELETEITEM("DeleteItem"),// :/
    CREATEITEM("CreateItem"),// :/
    READITEM("ReadItem"),// :/
    SEARCHITEM("SearchItem"),// :/
    READCHILDITEMS("ReadChildItems"),// :/
    EDITCHILDITEMS("EditChildItems"),// :/
    SORTCHILDITEMS("SortChildItems"),// :/
    EDITMINDMAP("EditMindMap"),// :/
    CHANGEPUBLICITY("ChangePublicity"),// :/
    EDITPARTICIPANTTYPE("EditParticipantType"),// :/
    READPARTICIPANTS("ReadParticipants"),// :/
    CANUSEASPROFILE("CanUseAsProfile"),// :/
    COPYLINK("CopyLink"),// :/
    SOCIALSHARING("SocialSharing"),// :/
    INVITETOPARTICIPATE("InviteToParticipate"),// :/
    READCASEPARTICIPANTS("ReadCaseParticipants"),// :/
    UPDATEUNIQUENAME("UpdateUniqueName"),// :/
    READITEMOWNERS("ReadItemOwners"),// :/
    HAVENOTNOTIFICATIONWAYS("HaveNotNotificationWays"),// :/
    INCLUDETOPARENT("IncludeToParent"),// :/
    EXCLUDEFROMPARENT("ExcludeFromParent"),// :/
    INCLUDETOGROUP("IncludeToGroup"),// :/
    EXCLUDEFROMGROUP("ExcludeFromGroup"),// :/
    SETGROUPITEM("SetGroupItem"),// :/
    UNSETGROUPITEM("UnsetGroupItem"),// :/
    REGISTERDEVICE("RegisterDevice"),// :/
    SETITEMTAGS("SetItemTags"),// :/
    GETACTIONHISTORY("GetActionHistory"),// :/
    UPDATEFEEDBACKOPTIONS("UpdateFeedbackOptions"),// :/
    SENDANNOUNCEMENTSTOPARTICIPANTS("SendAnnouncementsToParticipants"),// :/
    SETITEMMETRICS("SetItemMetrics"),// :/
    GETFEEDBACKMESSAGE("GetFeedbackMessage"),// :/
    SAVEFEEDBACKMESSAGE("SaveFeedbackMessage"),// :/
    DELETEFEEDBACKMESSAGE("DeleteFeedbackMessage"),// :/
    FULLVIEWOFACTIONHISTORY("FullViewOfActionHistory"),// :/
    GENERATESECURITYTOKEN("GenerateSecurityToken"),// :/
    UPDATEINTEGRATIONCONFIGLIST("UpdateIntegrationConfigList"),// :/
    CREATEINTEGRATIONCONFIG("CreateIntegrationConfig"),// :/
    UPDATEINTEGRATIONCONFIG("UpdateIntegrationConfig"),// :/
    DELETEINTEGRATIONCONFIG("DeleteIntegrationConfig"),// :/
    REQUESTACCESSTOITEM("RequestAccessToItem"),// :/
    REVOKEREQUESTTOITEM("RevokeRequestToItem"),// :/
    PARTICIPATE("Participate"),// :/
    REJECTOFFERTOITEM("RejectOfferToItem"),// :/
    INVITE("Invite"),// :/
    SAVEITEMTOMINDMAP("SaveItemToMindMap"),// :/
    UPDATEPARTICIPANTPROFILE("UpdateParticipantProfile"),// :/
    REQUESTPARTICIPANTPROFILE("RequestParticipantProfile"),// :/
    REJECTITEM("RejectItem"),// :/
    BLOCKITEM("BlockItem"),// :/
    UNBLOCKITEM("UnblockItem"),// :/
    READERTESTFUNCTION("ReaderTestFunction"),// :/
    EDITORTESTFUNCTION("EditorTestFunction"),// :/
    OWNERTESTFUNCTION("OwnerTestFunction"),// :/
    POTENTIALREADERTESTFUNCTION("PotentialReaderTestFunction"),// :/
    ADMINISTRATORTESTFUNCTION("AdministratorTestFunction"),// :/
    PUBLICREADERTESTFUNCTION("PublicReaderTestFunction"),// :/
    MANAGERTESTFUNCTION("ManagerTestFunction"),// :/
    DELETEDTESTFUNCTION("DeletedTestFunction"),// :/
    CHECKIN("CheckIn"),// :/
    BOOKRESOURCES("BookResources"),// :/
    CONFIRMOTHERCASEPARTICIPATION("ConfirmOtherCaseParticipation"),// :/
    CANCELCASEPARTICIPATION("CancelCaseParticipation"),// :/
    DISCLAIMOTHERCASEPARTICIPATION("DisclaimOtherCaseParticipation"),// :/
    SENDCLAIMABOUTOTHERCASEPARTICIPATION("SendClaimAboutOtherCaseParticipation"),// :/
    CREATEREMINDERFORCONSUMER("CreateReminderForConsumer"),// :/
    DELETEREMINDERFORCONSUMER("DeleteReminderForConsumer"),// :/
    EDITREMINDERFORCONSUMER("EditReminderForConsumer"),// :/
    CREATEREMINDER("CreateReminder"),// :/
    DELETEREMINDER("DeleteReminder"),// :/
    EDITREMINDER("EditReminder"),// :/
    CHANGETASKSTATUS("ChangeTaskStatus"),// :/
    CONFIRMREMINDER("ConfirmReminder"),// :/
    SENDBUSINESSCARD("SendBusinessCard"),// :/
    DISCLAIMMYCASEPARTICIPATION("DisclaimMyCaseParticipation"),// :/
    SENDCLAIMABOUTMYCASEPARTICIPATION("SendClaimAboutMyCaseParticipation"),// :/
    CREATESINGLECASEFORGROUPCASE("CreateSingleCaseForGroupCase"),// :/
    GENERATECASEREPORT("GenerateCaseReport"),// :/
    CONFIRMOTHERCASEPARTICIPATIONREMINDERNOTIF("ConfirmOtherCaseParticipationReminderNotif"),// :/
    SENDCLAIMABOUTOTHERCASEPARTICIPATIONNOTIF("SendClaimAboutOtherCaseParticipationNotif"),// :/
    GETTIMETABLE("GetTimetable"),// :/
    GETTIMETABLEVIEW("GetTimetableView"),// :/
    CHECKINFOREXECUTOR("CheckInForExecutor"),// :/
    CHECKINFORCONSUMER("CheckInForConsumer"),// :/
    CASEREJECT("CaseReject"),// :/
    CASEDECLINEWORK("CaseDeclineWork"),// :/
    CASEPLAN("CasePlan"),// :/
    CASECANCEL("CaseCancel"),// :/
    CASETAKEINWORK("CaseTakeInWork"),// :/
    CASECOMPLETE("CaseComplete"),// :/
    CASEACCEPT("CaseAccept"),// :/
    REQUESTAPPROVETOCASEPARTICIPATION("RequestApproveToCaseParticipation"),// :/
    UPDATECASE("UpdateCase"),// :/
    UPDATECASETIME("UpdateCaseTime"),// :/
    UPDATECASEPLACE("UpdateCasePlace"),// :/
    APPROVECASEPARTICIPATION("ApproveCaseParticipation"),// :/
    CONFIRMCASEPARTICIPATION("ConfirmCaseParticipation"),// :/
    FREECASESPOTOPENEDUP("FreeCaseSpotOpenedUp"),// :/
    APPROVEMONEYRECEIVE("ApproveMoneyReceive"),// :/
    REJECTMONEYRECEIVE("RejectMoneyReceive"),// :/
    REQUESTAPPROVEMONEYRECEIVE("RequestApproveMoneyReceive"),// :/
    UPDATECASEPARTICIPANTFIELDS("UpdateCaseParticipantFields"),// :/
    CASERETURNTOVERIFICATION("CaseReturnToVerification"),// :/
    INCLUDECASETOUSERCALENDAR("IncludeCaseToUserCalendar"),// :/
    INCLUDECASETOCUSTOMCALENDAR("IncludeCaseToCustomCalendar"),// :/
    EXCLUDECASETOUSERCALENDAR("ExcludeCaseToUserCalendar"),// :/
    EXCLUDECASETOCUSTOMCALENDAR("ExcludeCaseToCustomCalendar"),// :/
    GETCALENDARCASE("GetCalendarCase"),// :/
    GETCALENDARTASK("GetCalendarTask"),// :/
    INCLUDESPECIFICATIONS("IncludeSpecifications"),// :/
    EXCLUDESPECIFICATIONS("ExcludeSpecifications"),// :/
    CREATESERVICESESSION("CreateServiceSession"),// :/
    GETCHECKINSCHEDULE("GetCheckInSchedule"),// :/
    CREATEORDER("CreateOrder"),// :/
    CREATESPECIFICATION("CreateSpecification"),// :/
    SERVICEDASHBOARD("ServiceDashboard"),// :/
    GENERATESERVICEREPORT("GenerateServiceReport"),// :/
    GENERATESERVICESRESOURCESREPORT("GenerateServicesResourcesReport"),// :/
    GENERATERESOURCESRENTREPORT("GenerateResourcesRentReport"),// :/
    UPDATEORDER("UpdateOrder"),// :/
    UPDATEORDERINFO("UpdateOrderInfo"),// :/
    GETRECHECKINSCHEDULE("GetReCheckInSchedule"),// :/
    CHANGEORDERSERVICE("ChangeOrderService"),// :/
    GETSERVICEWORKLOADINFO("GetServiceWorkloadInfo"),// :/
    UPDATECONTACTPROPERTIES("UpdateContactProperties"),// :/
    PICKORDER("PickOrder"),// :/
    RETURNORDER("ReturnOrder"),// :/
    CONSUMERTESTFUNCTION("ConsumerTestFunction"),// :/
    EXECUTORTESTFUNCTION("ExecutorTestFunction"),// :/
    POTENTIALCONSUMERTESTFUNCTION("PotentialConsumerTestFunction"),// :/
    CASEACTIONREMINDER("CaseActionReminder");// :/
}