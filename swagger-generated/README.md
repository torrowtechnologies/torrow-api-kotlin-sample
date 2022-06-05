# io.swagger.client - Kotlin client library for Torrow API

## Requires

* Kotlin 1.4.30
* Gradle 5.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in Swagger definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to */*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ActionHistoryApi* | [**apiV1ActionhistoryGet**](docs/ActionHistoryApi.md#apiv1actionhistoryget) | **GET** /api/v1/actionhistory | 
*AnnouncementApi* | [**apiV1AnnouncementsGet**](docs/AnnouncementApi.md#apiv1announcementsget) | **GET** /api/v1/announcements | 
*AnnouncementApi* | [**apiV1AnnouncementsUpdatestatePost**](docs/AnnouncementApi.md#apiv1announcementsupdatestatepost) | **POST** /api/v1/announcements/updatestate | 
*AuthIdentityApi* | [**apiV1AuthRefreshPost**](docs/AuthIdentityApi.md#apiv1authrefreshpost) | **POST** /api/v1/auth/refresh | 
*AuthIdentityApi* | [**apiV1AuthRevokePost**](docs/AuthIdentityApi.md#apiv1authrevokepost) | **POST** /api/v1/auth/revoke | 
*AuthIdentityApi* | [**apiV1AuthSendcodePost**](docs/AuthIdentityApi.md#apiv1authsendcodepost) | **POST** /api/v1/auth/sendcode | 
*AuthIdentityApi* | [**apiV1AuthTokenPost**](docs/AuthIdentityApi.md#apiv1authtokenpost) | **POST** /api/v1/auth/token | 
*BlockReasonApi* | [**apiV1BlockreasonAllGet**](docs/BlockReasonApi.md#apiv1blockreasonallget) | **GET** /api/v1/blockreason/all | 
*BlockReasonApi* | [**apiV1BlockreasonIdDelete**](docs/BlockReasonApi.md#apiv1blockreasoniddelete) | **DELETE** /api/v1/blockreason/{id} | 
*BlockReasonApi* | [**apiV1BlockreasonIdGet**](docs/BlockReasonApi.md#apiv1blockreasonidget) | **GET** /api/v1/blockreason/{id} | 
*BlockReasonApi* | [**apiV1BlockreasonPost**](docs/BlockReasonApi.md#apiv1blockreasonpost) | **POST** /api/v1/blockreason | 
*CalendarApi* | [**apiV1CalendarsCalendarIdExcludecasePut**](docs/CalendarApi.md#apiv1calendarscalendaridexcludecaseput) | **PUT** /api/v1/calendars/{calendarId}/excludecase | 
*CalendarApi* | [**apiV1CalendarsCalendarIdExcludecasefromcustomcalendarPut**](docs/CalendarApi.md#apiv1calendarscalendaridexcludecasefromcustomcalendarput) | **PUT** /api/v1/calendars/{calendarId}/excludecasefromcustomcalendar | 
*CalendarApi* | [**apiV1CalendarsCalendarIdIncludecasePut**](docs/CalendarApi.md#apiv1calendarscalendaridincludecaseput) | **PUT** /api/v1/calendars/{calendarId}/includecase | 
*CalendarApi* | [**apiV1CalendarsCalendarIdIncludecasetocustomcalendarPut**](docs/CalendarApi.md#apiv1calendarscalendaridincludecasetocustomcalendarput) | **PUT** /api/v1/calendars/{calendarId}/includecasetocustomcalendar | 
*CalendarApi* | [**apiV1CalendarsExcludeFromgroupsPut**](docs/CalendarApi.md#apiv1calendarsexcludefromgroupsput) | **PUT** /api/v1/calendars/exclude/fromgroups | 
*CalendarApi* | [**apiV1CalendarsIncludeTogroupsPut**](docs/CalendarApi.md#apiv1calendarsincludetogroupsput) | **PUT** /api/v1/calendars/include/togroups | 
*CalendarApi* | [**apiV1CalendarsItemIdAliasPut**](docs/CalendarApi.md#apiv1calendarsitemidaliasput) | **PUT** /api/v1/calendars/{itemId}/alias | 
*CalendarApi* | [**apiV1CalendarsItemIdBlockPost**](docs/CalendarApi.md#apiv1calendarsitemidblockpost) | **POST** /api/v1/calendars/{itemId}/block | 
*CalendarApi* | [**apiV1CalendarsItemIdLastusagetimePut**](docs/CalendarApi.md#apiv1calendarsitemidlastusagetimeput) | **PUT** /api/v1/calendars/{itemId}/lastusagetime | 
*CalendarApi* | [**apiV1CalendarsItemIdNotificationwaylistPut**](docs/CalendarApi.md#apiv1calendarsitemidnotificationwaylistput) | **PUT** /api/v1/calendars/{itemId}/notificationwaylist | 
*CalendarApi* | [**apiV1CalendarsItemIdOfflinablePut**](docs/CalendarApi.md#apiv1calendarsitemidofflinableput) | **PUT** /api/v1/calendars/{itemId}/offlinable | 
*CalendarApi* | [**apiV1CalendarsItemIdParticipationProfilePut**](docs/CalendarApi.md#apiv1calendarsitemidparticipationprofileput) | **PUT** /api/v1/calendars/{itemId}/participation/profile | 
*CalendarApi* | [**apiV1CalendarsItemIdPersonalsolutiondataPut**](docs/CalendarApi.md#apiv1calendarsitemidpersonalsolutiondataput) | **PUT** /api/v1/calendars/{itemId}/personalsolutiondata | 
*CalendarApi* | [**apiV1CalendarsItemIdRemindersPut**](docs/CalendarApi.md#apiv1calendarsitemidremindersput) | **PUT** /api/v1/calendars/{itemId}/reminders | 
*CalendarApi* | [**apiV1CalendarsItemIdSendlinkPut**](docs/CalendarApi.md#apiv1calendarsitemidsendlinkput) | **PUT** /api/v1/calendars/{itemId}/sendlink | 
*CalendarApi* | [**apiV1CalendarsItemIdUnblockPost**](docs/CalendarApi.md#apiv1calendarsitemidunblockpost) | **POST** /api/v1/calendars/{itemId}/unblock | 
*CalendarApi* | [**apiV1CalendarsItemIdUniquenamePut**](docs/CalendarApi.md#apiv1calendarsitemiduniquenameput) | **PUT** /api/v1/calendars/{itemId}/uniquename | 
*CalendarApi* | [**apiV1CalendarsParentIdExcludeFromuserPut**](docs/CalendarApi.md#apiv1calendarsparentidexcludefromuserput) | **PUT** /api/v1/calendars/{parentId}/exclude/fromuser | 
*CalendarApi* | [**apiV1CalendarsParentIdExcludeItemsPut**](docs/CalendarApi.md#apiv1calendarsparentidexcludeitemsput) | **PUT** /api/v1/calendars/{parentId}/exclude/items | 
*CalendarApi* | [**apiV1CalendarsParentIdIncludeForuserPut**](docs/CalendarApi.md#apiv1calendarsparentidincludeforuserput) | **PUT** /api/v1/calendars/{parentId}/include/foruser | 
*CalendarApi* | [**apiV1CalendarsParentIdIncludeItemsPut**](docs/CalendarApi.md#apiv1calendarsparentidincludeitemsput) | **PUT** /api/v1/calendars/{parentId}/include/items | 
*CalendarApi* | [**apiV1CalendarsPersonallistGet**](docs/CalendarApi.md#apiv1calendarspersonallistget) | **GET** /api/v1/calendars/personallist | 
*CalendarApi* | [**apiV1CalendarsPersonallistItemIdDelete**](docs/CalendarApi.md#apiv1calendarspersonallistitemiddelete) | **DELETE** /api/v1/calendars/personallist/{itemId} | 
*CalendarApi* | [**apiV1CalendarsPersonallistUpdateorderPost**](docs/CalendarApi.md#apiv1calendarspersonallistupdateorderpost) | **POST** /api/v1/calendars/personallist/updateorder | 
*CalendarApi* | [**apiV1CalendarsPost**](docs/CalendarApi.md#apiv1calendarspost) | **POST** /api/v1/calendars | 
*CalendarApi* | [**apiV1CalendarsTorrowIdDelete**](docs/CalendarApi.md#apiv1calendarstorrowiddelete) | **DELETE** /api/v1/calendars/{torrowId} | 
*CalendarApi* | [**apiV1CalendarsTorrowIdFeedbacksOptionsPut**](docs/CalendarApi.md#apiv1calendarstorrowidfeedbacksoptionsput) | **PUT** /api/v1/calendars/{torrowId}/feedbacks/options | 
*CalendarApi* | [**apiV1CalendarsTorrowIdGet**](docs/CalendarApi.md#apiv1calendarstorrowidget) | **GET** /api/v1/calendars/{torrowId} | 
*CalendarApi* | [**apiV1CalendarsTorrowIdGroupListGet**](docs/CalendarApi.md#apiv1calendarstorrowidgrouplistget) | **GET** /api/v1/calendars/{torrowId}/group/list | 
*CalendarApi* | [**apiV1CalendarsTorrowIdGroupSetPut**](docs/CalendarApi.md#apiv1calendarstorrowidgroupsetput) | **PUT** /api/v1/calendars/{torrowId}/group/set | 
*CalendarApi* | [**apiV1CalendarsTorrowIdGroupUnsetPut**](docs/CalendarApi.md#apiv1calendarstorrowidgroupunsetput) | **PUT** /api/v1/calendars/{torrowId}/group/unset | 
*CalendarApi* | [**apiV1CalendarsTorrowIdGroupsGet**](docs/CalendarApi.md#apiv1calendarstorrowidgroupsget) | **GET** /api/v1/calendars/{torrowId}/groups | 
*CalendarApi* | [**apiV1CalendarsTorrowIdImageIdPut**](docs/CalendarApi.md#apiv1calendarstorrowidimageidput) | **PUT** /api/v1/calendars/{torrowId}/image/id | 
*CalendarApi* | [**apiV1CalendarsTorrowIdImageInfoGet**](docs/CalendarApi.md#apiv1calendarstorrowidimageinfoget) | **GET** /api/v1/calendars/{torrowId}/image/info | 
*CalendarApi* | [**apiV1CalendarsTorrowIdImagePuturlGet**](docs/CalendarApi.md#apiv1calendarstorrowidimageputurlget) | **GET** /api/v1/calendars/{torrowId}/image/puturl | 
*CalendarApi* | [**apiV1CalendarsTorrowIdIntegrationsPut**](docs/CalendarApi.md#apiv1calendarstorrowidintegrationsput) | **PUT** /api/v1/calendars/{torrowId}/integrations | 
*CalendarApi* | [**apiV1CalendarsTorrowIdMasterinfoPut**](docs/CalendarApi.md#apiv1calendarstorrowidmasterinfoput) | **PUT** /api/v1/calendars/{torrowId}/masterinfo | 
*CalendarApi* | [**apiV1CalendarsTorrowIdParticipantsAnonymousGet**](docs/CalendarApi.md#apiv1calendarstorrowidparticipantsanonymousget) | **GET** /api/v1/calendars/{torrowId}/participants/anonymous | 
*CalendarApi* | [**apiV1CalendarsTorrowIdParticipantsGet**](docs/CalendarApi.md#apiv1calendarstorrowidparticipantsget) | **GET** /api/v1/calendars/{torrowId}/participants | 
*CalendarApi* | [**apiV1CalendarsTorrowIdParticipantsNonanonymousGet**](docs/CalendarApi.md#apiv1calendarstorrowidparticipantsnonanonymousget) | **GET** /api/v1/calendars/{torrowId}/participants/nonanonymous | 
*CalendarApi* | [**apiV1CalendarsTorrowIdParticipationDeclineaccessPut**](docs/CalendarApi.md#apiv1calendarstorrowidparticipationdeclineaccessput) | **PUT** /api/v1/calendars/{torrowId}/participation/declineaccess | 
*CalendarApi* | [**apiV1CalendarsTorrowIdParticipationGrantaccessPut**](docs/CalendarApi.md#apiv1calendarstorrowidparticipationgrantaccessput) | **PUT** /api/v1/calendars/{torrowId}/participation/grantaccess | 
*CalendarApi* | [**apiV1CalendarsTorrowIdParticipationParticipantProfileIdTypePut**](docs/CalendarApi.md#apiv1calendarstorrowidparticipationparticipantprofileidtypeput) | **PUT** /api/v1/calendars/{torrowId}/participation/{participantProfileId}/type | 
*CalendarApi* | [**apiV1CalendarsTorrowIdParticipationRejectPut**](docs/CalendarApi.md#apiv1calendarstorrowidparticipationrejectput) | **PUT** /api/v1/calendars/{torrowId}/participation/reject | 
*CalendarApi* | [**apiV1CalendarsTorrowIdParticipationRejectofferPut**](docs/CalendarApi.md#apiv1calendarstorrowidparticipationrejectofferput) | **PUT** /api/v1/calendars/{torrowId}/participation/rejectoffer | 
*CalendarApi* | [**apiV1CalendarsTorrowIdParticipationRequestaccessPut**](docs/CalendarApi.md#apiv1calendarstorrowidparticipationrequestaccessput) | **PUT** /api/v1/calendars/{torrowId}/participation/requestaccess | 
*CalendarApi* | [**apiV1CalendarsTorrowIdParticipationRevokeofferPut**](docs/CalendarApi.md#apiv1calendarstorrowidparticipationrevokeofferput) | **PUT** /api/v1/calendars/{torrowId}/participation/revokeoffer | 
*CalendarApi* | [**apiV1CalendarsTorrowIdParticipationRevokerequestPut**](docs/CalendarApi.md#apiv1calendarstorrowidparticipationrevokerequestput) | **PUT** /api/v1/calendars/{torrowId}/participation/revokerequest | 
*CalendarApi* | [**apiV1CalendarsTorrowIdParticipationSharePut**](docs/CalendarApi.md#apiv1calendarstorrowidparticipationshareput) | **PUT** /api/v1/calendars/{torrowId}/participation/share | 
*CalendarApi* | [**apiV1CalendarsTorrowIdParticipationShareitemlinkPost**](docs/CalendarApi.md#apiv1calendarstorrowidparticipationshareitemlinkpost) | **POST** /api/v1/calendars/{torrowId}/participation/shareitemlink | 
*CalendarApi* | [**apiV1CalendarsTorrowIdPublicityPut**](docs/CalendarApi.md#apiv1calendarstorrowidpublicityput) | **PUT** /api/v1/calendars/{torrowId}/publicity | 
*CalendarApi* | [**apiV1CalendarsTorrowIdPut**](docs/CalendarApi.md#apiv1calendarstorrowidput) | **PUT** /api/v1/calendars/{torrowId} | 
*CalendarApi* | [**apiV1CalendarsTorrowIdSavetomindmapPut**](docs/CalendarApi.md#apiv1calendarstorrowidsavetomindmapput) | **PUT** /api/v1/calendars/{torrowId}/savetomindmap | 
*CalendarApi* | [**apiV1CalendarsTorrowIdShorturlPost**](docs/CalendarApi.md#apiv1calendarstorrowidshorturlpost) | **POST** /api/v1/calendars/{torrowId}/shorturl | 
*CalendarApi* | [**apiV1CalendarsTorrowIdSolutiondataPut**](docs/CalendarApi.md#apiv1calendarstorrowidsolutiondataput) | **PUT** /api/v1/calendars/{torrowId}/solutiondata | 
*CalendarApi* | [**apiV1CalendarsTorrowIdTagsGet**](docs/CalendarApi.md#apiv1calendarstorrowidtagsget) | **GET** /api/v1/calendars/{torrowId}/tags | 
*CalendarApi* | [**apiV1CalendarsTorrowIdTagsPut**](docs/CalendarApi.md#apiv1calendarstorrowidtagsput) | **PUT** /api/v1/calendars/{torrowId}/tags | 
*CalendarApi* | [**apiV1CalendarsTorrowIdTimetablePut**](docs/CalendarApi.md#apiv1calendarstorrowidtimetableput) | **PUT** /api/v1/calendars/{torrowId}/timetable | 
*CalendarApi* | [**apiV1CalendarsTorrowIdTorrowaccountIdPut**](docs/CalendarApi.md#apiv1calendarstorrowidtorrowaccountidput) | **PUT** /api/v1/calendars/{torrowId}/torrowaccount/id | 
*CalendarApi* | [**apiV1CalendarsTorrowIdUpdategroupsPut**](docs/CalendarApi.md#apiv1calendarstorrowidupdategroupsput) | **PUT** /api/v1/calendars/{torrowId}/updategroups | 
*CalendarApi* | [**apiV1CalendarsUniquenameUniquenameGet**](docs/CalendarApi.md#apiv1calendarsuniquenameuniquenameget) | **GET** /api/v1/calendars/uniquename/{uniquename} | 
*CalendarViewApi* | [**apiV1CalendarsParentIdViewsPinnedChildIdDelete**](docs/CalendarViewApi.md#apiv1calendarsparentidviewspinnedchildiddelete) | **DELETE** /api/v1/calendars/{parentId}/views/pinned/{childId} | 
*CalendarViewApi* | [**apiV1CalendarsParentIdViewsPinnedChildIdGet**](docs/CalendarViewApi.md#apiv1calendarsparentidviewspinnedchildidget) | **GET** /api/v1/calendars/{parentId}/views/pinned/{childId} | 
*CalendarViewApi* | [**apiV1CalendarsParentIdViewsPinnedGet**](docs/CalendarViewApi.md#apiv1calendarsparentidviewspinnedget) | **GET** /api/v1/calendars/{parentId}/views/pinned | 
*CalendarViewApi* | [**apiV1CalendarsParentIdViewsPinnedPost**](docs/CalendarViewApi.md#apiv1calendarsparentidviewspinnedpost) | **POST** /api/v1/calendars/{parentId}/views/pinned | 
*CalendarViewApi* | [**apiV1CalendarsParentIdViewsPinnedUpdateorderPost**](docs/CalendarViewApi.md#apiv1calendarsparentidviewspinnedupdateorderpost) | **POST** /api/v1/calendars/{parentId}/views/pinned/updateorder | 
*CalendarViewApi* | [**apiV1CalendarsParentIdViewsUserChildIdDelete**](docs/CalendarViewApi.md#apiv1calendarsparentidviewsuserchildiddelete) | **DELETE** /api/v1/calendars/{parentId}/views/user/{childId} | 
*CalendarViewApi* | [**apiV1CalendarsParentIdViewsUserChildIdGet**](docs/CalendarViewApi.md#apiv1calendarsparentidviewsuserchildidget) | **GET** /api/v1/calendars/{parentId}/views/user/{childId} | 
*CalendarViewApi* | [**apiV1CalendarsParentIdViewsUserChildIdPinPost**](docs/CalendarViewApi.md#apiv1calendarsparentidviewsuserchildidpinpost) | **POST** /api/v1/calendars/{parentId}/views/user/{childId}/pin | 
*CalendarViewApi* | [**apiV1CalendarsParentIdViewsUserChildIdUnpinPost**](docs/CalendarViewApi.md#apiv1calendarsparentidviewsuserchildidunpinpost) | **POST** /api/v1/calendars/{parentId}/views/user/{childId}/unpin | 
*CalendarViewApi* | [**apiV1CalendarsParentIdViewsUserGet**](docs/CalendarViewApi.md#apiv1calendarsparentidviewsuserget) | **GET** /api/v1/calendars/{parentId}/views/user | 
*CalendarViewApi* | [**apiV1CalendarsParentIdViewsUserPost**](docs/CalendarViewApi.md#apiv1calendarsparentidviewsuserpost) | **POST** /api/v1/calendars/{parentId}/views/user | 
*CalendarViewApi* | [**apiV1CalendarsParentIdViewsUserUpdateorderPost**](docs/CalendarViewApi.md#apiv1calendarsparentidviewsuserupdateorderpost) | **POST** /api/v1/calendars/{parentId}/views/user/updateorder | 
*CalendarViewApi* | [**apiV1CalendarsViewsUserGet**](docs/CalendarViewApi.md#apiv1calendarsviewsuserget) | **GET** /api/v1/calendars/views/user | 
*CaseApi* | [**apiV1CasesExcludeFromgroupsPut**](docs/CaseApi.md#apiv1casesexcludefromgroupsput) | **PUT** /api/v1/cases/exclude/fromgroups | 
*CaseApi* | [**apiV1CasesIncludeTogroupsPut**](docs/CaseApi.md#apiv1casesincludetogroupsput) | **PUT** /api/v1/cases/include/togroups | 
*CaseApi* | [**apiV1CasesItemIdAliasPut**](docs/CaseApi.md#apiv1casesitemidaliasput) | **PUT** /api/v1/cases/{itemId}/alias | 
*CaseApi* | [**apiV1CasesItemIdBlockPost**](docs/CaseApi.md#apiv1casesitemidblockpost) | **POST** /api/v1/cases/{itemId}/block | 
*CaseApi* | [**apiV1CasesItemIdLastusagetimePut**](docs/CaseApi.md#apiv1casesitemidlastusagetimeput) | **PUT** /api/v1/cases/{itemId}/lastusagetime | 
*CaseApi* | [**apiV1CasesItemIdNotificationwaylistPut**](docs/CaseApi.md#apiv1casesitemidnotificationwaylistput) | **PUT** /api/v1/cases/{itemId}/notificationwaylist | 
*CaseApi* | [**apiV1CasesItemIdOfflinablePut**](docs/CaseApi.md#apiv1casesitemidofflinableput) | **PUT** /api/v1/cases/{itemId}/offlinable | 
*CaseApi* | [**apiV1CasesItemIdParticipationProfilePut**](docs/CaseApi.md#apiv1casesitemidparticipationprofileput) | **PUT** /api/v1/cases/{itemId}/participation/profile | 
*CaseApi* | [**apiV1CasesItemIdPersonalsolutiondataPut**](docs/CaseApi.md#apiv1casesitemidpersonalsolutiondataput) | **PUT** /api/v1/cases/{itemId}/personalsolutiondata | 
*CaseApi* | [**apiV1CasesItemIdRemindersPut**](docs/CaseApi.md#apiv1casesitemidremindersput) | **PUT** /api/v1/cases/{itemId}/reminders | 
*CaseApi* | [**apiV1CasesItemIdSendlinkPut**](docs/CaseApi.md#apiv1casesitemidsendlinkput) | **PUT** /api/v1/cases/{itemId}/sendlink | 
*CaseApi* | [**apiV1CasesItemIdUnblockPost**](docs/CaseApi.md#apiv1casesitemidunblockpost) | **POST** /api/v1/cases/{itemId}/unblock | 
*CaseApi* | [**apiV1CasesItemIdUniquenamePut**](docs/CaseApi.md#apiv1casesitemiduniquenameput) | **PUT** /api/v1/cases/{itemId}/uniquename | 
*CaseApi* | [**apiV1CasesParentIdExcludeFromuserPut**](docs/CaseApi.md#apiv1casesparentidexcludefromuserput) | **PUT** /api/v1/cases/{parentId}/exclude/fromuser | 
*CaseApi* | [**apiV1CasesParentIdExcludeItemsPut**](docs/CaseApi.md#apiv1casesparentidexcludeitemsput) | **PUT** /api/v1/cases/{parentId}/exclude/items | 
*CaseApi* | [**apiV1CasesParentIdIncludeForuserPut**](docs/CaseApi.md#apiv1casesparentidincludeforuserput) | **PUT** /api/v1/cases/{parentId}/include/foruser | 
*CaseApi* | [**apiV1CasesParentIdIncludeItemsPut**](docs/CaseApi.md#apiv1casesparentidincludeitemsput) | **PUT** /api/v1/cases/{parentId}/include/items | 
*CaseApi* | [**apiV1CasesPersonallistGet**](docs/CaseApi.md#apiv1casespersonallistget) | **GET** /api/v1/cases/personallist | 
*CaseApi* | [**apiV1CasesPersonallistItemIdDelete**](docs/CaseApi.md#apiv1casespersonallistitemiddelete) | **DELETE** /api/v1/cases/personallist/{itemId} | 
*CaseApi* | [**apiV1CasesPersonallistUpdateorderPost**](docs/CaseApi.md#apiv1casespersonallistupdateorderpost) | **POST** /api/v1/cases/personallist/updateorder | 
*CaseApi* | [**apiV1CasesPost**](docs/CaseApi.md#apiv1casespost) | **POST** /api/v1/cases | 
*CaseApi* | [**apiV1CasesPut**](docs/CaseApi.md#apiv1casesput) | **PUT** /api/v1/cases | 
*CaseApi* | [**apiV1CasesTorrowIdAcceptPost**](docs/CaseApi.md#apiv1casestorrowidacceptpost) | **POST** /api/v1/cases/{torrowId}/accept | 
*CaseApi* | [**apiV1CasesTorrowIdCancelPost**](docs/CaseApi.md#apiv1casestorrowidcancelpost) | **POST** /api/v1/cases/{torrowId}/cancel | 
*CaseApi* | [**apiV1CasesTorrowIdCaseparticipantsApprovemoneyreceivePut**](docs/CaseApi.md#apiv1casestorrowidcaseparticipantsapprovemoneyreceiveput) | **PUT** /api/v1/cases/{torrowId}/caseparticipants/approvemoneyreceive | 
*CaseApi* | [**apiV1CasesTorrowIdCaseparticipantsCaseParticipantIdFieldsPatch**](docs/CaseApi.md#apiv1casestorrowidcaseparticipantscaseparticipantidfieldspatch) | **PATCH** /api/v1/cases/{torrowId}/caseparticipants/{caseParticipantId}/fields | 
*CaseApi* | [**apiV1CasesTorrowIdCaseparticipantsCaseParticipantIdGet**](docs/CaseApi.md#apiv1casestorrowidcaseparticipantscaseparticipantidget) | **GET** /api/v1/cases/{torrowId}/caseparticipants/{caseParticipantId} | 
*CaseApi* | [**apiV1CasesTorrowIdCaseparticipantsCountGet**](docs/CaseApi.md#apiv1casestorrowidcaseparticipantscountget) | **GET** /api/v1/cases/{torrowId}/caseparticipants/count | 
*CaseApi* | [**apiV1CasesTorrowIdCaseparticipantsGet**](docs/CaseApi.md#apiv1casestorrowidcaseparticipantsget) | **GET** /api/v1/cases/{torrowId}/caseparticipants | 
*CaseApi* | [**apiV1CasesTorrowIdCaseparticipantsNonanonymousGet**](docs/CaseApi.md#apiv1casestorrowidcaseparticipantsnonanonymousget) | **GET** /api/v1/cases/{torrowId}/caseparticipants/nonanonymous | 
*CaseApi* | [**apiV1CasesTorrowIdCaseparticipantsProfileIdConfirmparticipationPatch**](docs/CaseApi.md#apiv1casestorrowidcaseparticipantsprofileidconfirmparticipationpatch) | **PATCH** /api/v1/cases/{torrowId}/caseparticipants/{profileId}/confirmparticipation | 
*CaseApi* | [**apiV1CasesTorrowIdCaseparticipantsRejectmoneyreceivePut**](docs/CaseApi.md#apiv1casestorrowidcaseparticipantsrejectmoneyreceiveput) | **PUT** /api/v1/cases/{torrowId}/caseparticipants/rejectmoneyreceive | 
*CaseApi* | [**apiV1CasesTorrowIdCaseparticipationApprovecaseparticipationPut**](docs/CaseApi.md#apiv1casestorrowidcaseparticipationapprovecaseparticipationput) | **PUT** /api/v1/cases/{torrowId}/caseparticipation/approvecaseparticipation | 
*CaseApi* | [**apiV1CasesTorrowIdCaseparticipationBookresourcesPut**](docs/CaseApi.md#apiv1casestorrowidcaseparticipationbookresourcesput) | **PUT** /api/v1/cases/{torrowId}/caseparticipation/bookresources | 
*CaseApi* | [**apiV1CasesTorrowIdCaseparticipationBookresourcesformePut**](docs/CaseApi.md#apiv1casestorrowidcaseparticipationbookresourcesformeput) | **PUT** /api/v1/cases/{torrowId}/caseparticipation/bookresourcesforme | 
*CaseApi* | [**apiV1CasesTorrowIdCaseparticipationBookresourcesforotherPut**](docs/CaseApi.md#apiv1casestorrowidcaseparticipationbookresourcesforotherput) | **PUT** /api/v1/cases/{torrowId}/caseparticipation/bookresourcesforother | 
*CaseApi* | [**apiV1CasesTorrowIdCaseparticipationCancelcaseparticipationPut**](docs/CaseApi.md#apiv1casestorrowidcaseparticipationcancelcaseparticipationput) | **PUT** /api/v1/cases/{torrowId}/caseparticipation/cancelcaseparticipation | 
*CaseApi* | [**apiV1CasesTorrowIdCaseparticipationCancelmycaseparticipationPut**](docs/CaseApi.md#apiv1casestorrowidcaseparticipationcancelmycaseparticipationput) | **PUT** /api/v1/cases/{torrowId}/caseparticipation/cancelmycaseparticipation | 
*CaseApi* | [**apiV1CasesTorrowIdCaseparticipationCancelothercaseparticipationPut**](docs/CaseApi.md#apiv1casestorrowidcaseparticipationcancelothercaseparticipationput) | **PUT** /api/v1/cases/{torrowId}/caseparticipation/cancelothercaseparticipation | 
*CaseApi* | [**apiV1CasesTorrowIdCaseparticipationCheckinPut**](docs/CaseApi.md#apiv1casestorrowidcaseparticipationcheckinput) | **PUT** /api/v1/cases/{torrowId}/caseparticipation/checkin | 
*CaseApi* | [**apiV1CasesTorrowIdCaseparticipationCheckinmyselfPut**](docs/CaseApi.md#apiv1casestorrowidcaseparticipationcheckinmyselfput) | **PUT** /api/v1/cases/{torrowId}/caseparticipation/checkinmyself | 
*CaseApi* | [**apiV1CasesTorrowIdCaseparticipationCheckinotherPut**](docs/CaseApi.md#apiv1casestorrowidcaseparticipationcheckinotherput) | **PUT** /api/v1/cases/{torrowId}/caseparticipation/checkinother | 
*CaseApi* | [**apiV1CasesTorrowIdCompletePost**](docs/CaseApi.md#apiv1casestorrowidcompletepost) | **POST** /api/v1/cases/{torrowId}/complete | 
*CaseApi* | [**apiV1CasesTorrowIdDeclineworkPost**](docs/CaseApi.md#apiv1casestorrowiddeclineworkpost) | **POST** /api/v1/cases/{torrowId}/declinework | 
*CaseApi* | [**apiV1CasesTorrowIdDelete**](docs/CaseApi.md#apiv1casestorrowiddelete) | **DELETE** /api/v1/cases/{torrowId} | 
*CaseApi* | [**apiV1CasesTorrowIdFeedbacksOptionsPut**](docs/CaseApi.md#apiv1casestorrowidfeedbacksoptionsput) | **PUT** /api/v1/cases/{torrowId}/feedbacks/options | 
*CaseApi* | [**apiV1CasesTorrowIdGeneratesecuritytokenPost**](docs/CaseApi.md#apiv1casestorrowidgeneratesecuritytokenpost) | **POST** /api/v1/cases/{torrowId}/generatesecuritytoken | 
*CaseApi* | [**apiV1CasesTorrowIdGet**](docs/CaseApi.md#apiv1casestorrowidget) | **GET** /api/v1/cases/{torrowId} | 
*CaseApi* | [**apiV1CasesTorrowIdGroupListGet**](docs/CaseApi.md#apiv1casestorrowidgrouplistget) | **GET** /api/v1/cases/{torrowId}/group/list | 
*CaseApi* | [**apiV1CasesTorrowIdGroupSetPut**](docs/CaseApi.md#apiv1casestorrowidgroupsetput) | **PUT** /api/v1/cases/{torrowId}/group/set | 
*CaseApi* | [**apiV1CasesTorrowIdGroupUnsetPut**](docs/CaseApi.md#apiv1casestorrowidgroupunsetput) | **PUT** /api/v1/cases/{torrowId}/group/unset | 
*CaseApi* | [**apiV1CasesTorrowIdGroupsGet**](docs/CaseApi.md#apiv1casestorrowidgroupsget) | **GET** /api/v1/cases/{torrowId}/groups | 
*CaseApi* | [**apiV1CasesTorrowIdImageIdPut**](docs/CaseApi.md#apiv1casestorrowidimageidput) | **PUT** /api/v1/cases/{torrowId}/image/id | 
*CaseApi* | [**apiV1CasesTorrowIdImageInfoGet**](docs/CaseApi.md#apiv1casestorrowidimageinfoget) | **GET** /api/v1/cases/{torrowId}/image/info | 
*CaseApi* | [**apiV1CasesTorrowIdImagePuturlGet**](docs/CaseApi.md#apiv1casestorrowidimageputurlget) | **GET** /api/v1/cases/{torrowId}/image/puturl | 
*CaseApi* | [**apiV1CasesTorrowIdIntegrationsPut**](docs/CaseApi.md#apiv1casestorrowidintegrationsput) | **PUT** /api/v1/cases/{torrowId}/integrations | 
*CaseApi* | [**apiV1CasesTorrowIdMasterinfoPut**](docs/CaseApi.md#apiv1casestorrowidmasterinfoput) | **PUT** /api/v1/cases/{torrowId}/masterinfo | 
*CaseApi* | [**apiV1CasesTorrowIdParticipantsAnonymousGet**](docs/CaseApi.md#apiv1casestorrowidparticipantsanonymousget) | **GET** /api/v1/cases/{torrowId}/participants/anonymous | 
*CaseApi* | [**apiV1CasesTorrowIdParticipantsGet**](docs/CaseApi.md#apiv1casestorrowidparticipantsget) | **GET** /api/v1/cases/{torrowId}/participants | 
*CaseApi* | [**apiV1CasesTorrowIdParticipantsNonanonymousGet**](docs/CaseApi.md#apiv1casestorrowidparticipantsnonanonymousget) | **GET** /api/v1/cases/{torrowId}/participants/nonanonymous | 
*CaseApi* | [**apiV1CasesTorrowIdParticipationDeclineaccessPut**](docs/CaseApi.md#apiv1casestorrowidparticipationdeclineaccessput) | **PUT** /api/v1/cases/{torrowId}/participation/declineaccess | 
*CaseApi* | [**apiV1CasesTorrowIdParticipationGrantaccessPut**](docs/CaseApi.md#apiv1casestorrowidparticipationgrantaccessput) | **PUT** /api/v1/cases/{torrowId}/participation/grantaccess | 
*CaseApi* | [**apiV1CasesTorrowIdParticipationParticipantProfileIdTypePut**](docs/CaseApi.md#apiv1casestorrowidparticipationparticipantprofileidtypeput) | **PUT** /api/v1/cases/{torrowId}/participation/{participantProfileId}/type | 
*CaseApi* | [**apiV1CasesTorrowIdParticipationRejectPut**](docs/CaseApi.md#apiv1casestorrowidparticipationrejectput) | **PUT** /api/v1/cases/{torrowId}/participation/reject | 
*CaseApi* | [**apiV1CasesTorrowIdParticipationRejectofferPut**](docs/CaseApi.md#apiv1casestorrowidparticipationrejectofferput) | **PUT** /api/v1/cases/{torrowId}/participation/rejectoffer | 
*CaseApi* | [**apiV1CasesTorrowIdParticipationRequestaccessPut**](docs/CaseApi.md#apiv1casestorrowidparticipationrequestaccessput) | **PUT** /api/v1/cases/{torrowId}/participation/requestaccess | 
*CaseApi* | [**apiV1CasesTorrowIdParticipationRevokeofferPut**](docs/CaseApi.md#apiv1casestorrowidparticipationrevokeofferput) | **PUT** /api/v1/cases/{torrowId}/participation/revokeoffer | 
*CaseApi* | [**apiV1CasesTorrowIdParticipationRevokerequestPut**](docs/CaseApi.md#apiv1casestorrowidparticipationrevokerequestput) | **PUT** /api/v1/cases/{torrowId}/participation/revokerequest | 
*CaseApi* | [**apiV1CasesTorrowIdParticipationSharePut**](docs/CaseApi.md#apiv1casestorrowidparticipationshareput) | **PUT** /api/v1/cases/{torrowId}/participation/share | 
*CaseApi* | [**apiV1CasesTorrowIdParticipationShareitemlinkPost**](docs/CaseApi.md#apiv1casestorrowidparticipationshareitemlinkpost) | **POST** /api/v1/cases/{torrowId}/participation/shareitemlink | 
*CaseApi* | [**apiV1CasesTorrowIdPatchPost**](docs/CaseApi.md#apiv1casestorrowidpatchpost) | **POST** /api/v1/cases/{torrowId}/patch | 
*CaseApi* | [**apiV1CasesTorrowIdPlanPost**](docs/CaseApi.md#apiv1casestorrowidplanpost) | **POST** /api/v1/cases/{torrowId}/plan | 
*CaseApi* | [**apiV1CasesTorrowIdPublicityPut**](docs/CaseApi.md#apiv1casestorrowidpublicityput) | **PUT** /api/v1/cases/{torrowId}/publicity | 
*CaseApi* | [**apiV1CasesTorrowIdPut**](docs/CaseApi.md#apiv1casestorrowidput) | **PUT** /api/v1/cases/{torrowId} | 
*CaseApi* | [**apiV1CasesTorrowIdRejectPost**](docs/CaseApi.md#apiv1casestorrowidrejectpost) | **POST** /api/v1/cases/{torrowId}/reject | 
*CaseApi* | [**apiV1CasesTorrowIdResourcesGet**](docs/CaseApi.md#apiv1casestorrowidresourcesget) | **GET** /api/v1/cases/{torrowId}/resources | 
*CaseApi* | [**apiV1CasesTorrowIdReturntoverificationPost**](docs/CaseApi.md#apiv1casestorrowidreturntoverificationpost) | **POST** /api/v1/cases/{torrowId}/returntoverification | 
*CaseApi* | [**apiV1CasesTorrowIdSavetomindmapPut**](docs/CaseApi.md#apiv1casestorrowidsavetomindmapput) | **PUT** /api/v1/cases/{torrowId}/savetomindmap | 
*CaseApi* | [**apiV1CasesTorrowIdShorturlPost**](docs/CaseApi.md#apiv1casestorrowidshorturlpost) | **POST** /api/v1/cases/{torrowId}/shorturl | 
*CaseApi* | [**apiV1CasesTorrowIdSolutiondataPut**](docs/CaseApi.md#apiv1casestorrowidsolutiondataput) | **PUT** /api/v1/cases/{torrowId}/solutiondata | 
*CaseApi* | [**apiV1CasesTorrowIdTagsGet**](docs/CaseApi.md#apiv1casestorrowidtagsget) | **GET** /api/v1/cases/{torrowId}/tags | 
*CaseApi* | [**apiV1CasesTorrowIdTagsPut**](docs/CaseApi.md#apiv1casestorrowidtagsput) | **PUT** /api/v1/cases/{torrowId}/tags | 
*CaseApi* | [**apiV1CasesTorrowIdTakeinworkPost**](docs/CaseApi.md#apiv1casestorrowidtakeinworkpost) | **POST** /api/v1/cases/{torrowId}/takeinwork | 
*CaseApi* | [**apiV1CasesTorrowIdTorrowaccountIdPut**](docs/CaseApi.md#apiv1casestorrowidtorrowaccountidput) | **PUT** /api/v1/cases/{torrowId}/torrowaccount/id | 
*CaseApi* | [**apiV1CasesTorrowIdUpdategroupsPut**](docs/CaseApi.md#apiv1casestorrowidupdategroupsput) | **PUT** /api/v1/cases/{torrowId}/updategroups | 
*CaseApi* | [**apiV1CasesUniquenameUniqueNameGet**](docs/CaseApi.md#apiv1casesuniquenameuniquenameget) | **GET** /api/v1/cases/uniquename/{uniqueName} | 
*CaseViewApi* | [**apiV1CasesParentIdViewsPinnedChildIdDelete**](docs/CaseViewApi.md#apiv1casesparentidviewspinnedchildiddelete) | **DELETE** /api/v1/cases/{parentId}/views/pinned/{childId} | 
*CaseViewApi* | [**apiV1CasesParentIdViewsPinnedChildIdGet**](docs/CaseViewApi.md#apiv1casesparentidviewspinnedchildidget) | **GET** /api/v1/cases/{parentId}/views/pinned/{childId} | 
*CaseViewApi* | [**apiV1CasesParentIdViewsPinnedGet**](docs/CaseViewApi.md#apiv1casesparentidviewspinnedget) | **GET** /api/v1/cases/{parentId}/views/pinned | 
*CaseViewApi* | [**apiV1CasesParentIdViewsPinnedPost**](docs/CaseViewApi.md#apiv1casesparentidviewspinnedpost) | **POST** /api/v1/cases/{parentId}/views/pinned | 
*CaseViewApi* | [**apiV1CasesParentIdViewsPinnedUpdateorderPost**](docs/CaseViewApi.md#apiv1casesparentidviewspinnedupdateorderpost) | **POST** /api/v1/cases/{parentId}/views/pinned/updateorder | 
*CaseViewApi* | [**apiV1CasesParentIdViewsUserChildIdDelete**](docs/CaseViewApi.md#apiv1casesparentidviewsuserchildiddelete) | **DELETE** /api/v1/cases/{parentId}/views/user/{childId} | 
*CaseViewApi* | [**apiV1CasesParentIdViewsUserChildIdGet**](docs/CaseViewApi.md#apiv1casesparentidviewsuserchildidget) | **GET** /api/v1/cases/{parentId}/views/user/{childId} | 
*CaseViewApi* | [**apiV1CasesParentIdViewsUserChildIdPinPost**](docs/CaseViewApi.md#apiv1casesparentidviewsuserchildidpinpost) | **POST** /api/v1/cases/{parentId}/views/user/{childId}/pin | 
*CaseViewApi* | [**apiV1CasesParentIdViewsUserChildIdUnpinPost**](docs/CaseViewApi.md#apiv1casesparentidviewsuserchildidunpinpost) | **POST** /api/v1/cases/{parentId}/views/user/{childId}/unpin | 
*CaseViewApi* | [**apiV1CasesParentIdViewsUserGet**](docs/CaseViewApi.md#apiv1casesparentidviewsuserget) | **GET** /api/v1/cases/{parentId}/views/user | 
*CaseViewApi* | [**apiV1CasesParentIdViewsUserPost**](docs/CaseViewApi.md#apiv1casesparentidviewsuserpost) | **POST** /api/v1/cases/{parentId}/views/user | 
*CaseViewApi* | [**apiV1CasesParentIdViewsUserUpdateorderPost**](docs/CaseViewApi.md#apiv1casesparentidviewsuserupdateorderpost) | **POST** /api/v1/cases/{parentId}/views/user/updateorder | 
*CaseViewApi* | [**apiV1CasesViewsUserGet**](docs/CaseViewApi.md#apiv1casesviewsuserget) | **GET** /api/v1/cases/views/user | 
*ContactApi* | [**apiV1ContactsActivitystatuslistPost**](docs/ContactApi.md#apiv1contactsactivitystatuslistpost) | **POST** /api/v1/contacts/activitystatuslist | 
*ContactApi* | [**apiV1ContactsCommunicationSendcodePost**](docs/ContactApi.md#apiv1contactscommunicationsendcodepost) | **POST** /api/v1/contacts/communication/sendcode | 
*ContactApi* | [**apiV1ContactsCommunicationVerifyPost**](docs/ContactApi.md#apiv1contactscommunicationverifypost) | **POST** /api/v1/contacts/communication/verify | 
*ContactApi* | [**apiV1ContactsContactIdContactpropertiesPut**](docs/ContactApi.md#apiv1contactscontactidcontactpropertiesput) | **PUT** /api/v1/contacts/{contactId}/contactproperties | 
*ContactApi* | [**apiV1ContactsExcludeFromgroupsPut**](docs/ContactApi.md#apiv1contactsexcludefromgroupsput) | **PUT** /api/v1/contacts/exclude/fromgroups | 
*ContactApi* | [**apiV1ContactsIncludeTogroupsPut**](docs/ContactApi.md#apiv1contactsincludetogroupsput) | **PUT** /api/v1/contacts/include/togroups | 
*ContactApi* | [**apiV1ContactsItemIdAliasPut**](docs/ContactApi.md#apiv1contactsitemidaliasput) | **PUT** /api/v1/contacts/{itemId}/alias | 
*ContactApi* | [**apiV1ContactsItemIdBlockPost**](docs/ContactApi.md#apiv1contactsitemidblockpost) | **POST** /api/v1/contacts/{itemId}/block | 
*ContactApi* | [**apiV1ContactsItemIdLastusagetimePut**](docs/ContactApi.md#apiv1contactsitemidlastusagetimeput) | **PUT** /api/v1/contacts/{itemId}/lastusagetime | 
*ContactApi* | [**apiV1ContactsItemIdNotificationwaylistPut**](docs/ContactApi.md#apiv1contactsitemidnotificationwaylistput) | **PUT** /api/v1/contacts/{itemId}/notificationwaylist | 
*ContactApi* | [**apiV1ContactsItemIdOfflinablePut**](docs/ContactApi.md#apiv1contactsitemidofflinableput) | **PUT** /api/v1/contacts/{itemId}/offlinable | 
*ContactApi* | [**apiV1ContactsItemIdParticipationProfilePut**](docs/ContactApi.md#apiv1contactsitemidparticipationprofileput) | **PUT** /api/v1/contacts/{itemId}/participation/profile | 
*ContactApi* | [**apiV1ContactsItemIdPersonalsolutiondataPut**](docs/ContactApi.md#apiv1contactsitemidpersonalsolutiondataput) | **PUT** /api/v1/contacts/{itemId}/personalsolutiondata | 
*ContactApi* | [**apiV1ContactsItemIdRemindersPut**](docs/ContactApi.md#apiv1contactsitemidremindersput) | **PUT** /api/v1/contacts/{itemId}/reminders | 
*ContactApi* | [**apiV1ContactsItemIdSendlinkPut**](docs/ContactApi.md#apiv1contactsitemidsendlinkput) | **PUT** /api/v1/contacts/{itemId}/sendlink | 
*ContactApi* | [**apiV1ContactsItemIdUnblockPost**](docs/ContactApi.md#apiv1contactsitemidunblockpost) | **POST** /api/v1/contacts/{itemId}/unblock | 
*ContactApi* | [**apiV1ContactsItemIdUniquenamePut**](docs/ContactApi.md#apiv1contactsitemiduniquenameput) | **PUT** /api/v1/contacts/{itemId}/uniquename | 
*ContactApi* | [**apiV1ContactsParentIdExcludeFromuserPut**](docs/ContactApi.md#apiv1contactsparentidexcludefromuserput) | **PUT** /api/v1/contacts/{parentId}/exclude/fromuser | 
*ContactApi* | [**apiV1ContactsParentIdExcludeItemsPut**](docs/ContactApi.md#apiv1contactsparentidexcludeitemsput) | **PUT** /api/v1/contacts/{parentId}/exclude/items | 
*ContactApi* | [**apiV1ContactsParentIdIncludeForuserPut**](docs/ContactApi.md#apiv1contactsparentidincludeforuserput) | **PUT** /api/v1/contacts/{parentId}/include/foruser | 
*ContactApi* | [**apiV1ContactsParentIdIncludeItemsPut**](docs/ContactApi.md#apiv1contactsparentidincludeitemsput) | **PUT** /api/v1/contacts/{parentId}/include/items | 
*ContactApi* | [**apiV1ContactsPersonallistGet**](docs/ContactApi.md#apiv1contactspersonallistget) | **GET** /api/v1/contacts/personallist | 
*ContactApi* | [**apiV1ContactsPersonallistItemIdDelete**](docs/ContactApi.md#apiv1contactspersonallistitemiddelete) | **DELETE** /api/v1/contacts/personallist/{itemId} | 
*ContactApi* | [**apiV1ContactsPersonallistUpdateorderPost**](docs/ContactApi.md#apiv1contactspersonallistupdateorderpost) | **POST** /api/v1/contacts/personallist/updateorder | 
*ContactApi* | [**apiV1ContactsPost**](docs/ContactApi.md#apiv1contactspost) | **POST** /api/v1/contacts | 
*ContactApi* | [**apiV1ContactsTorrowIdDelete**](docs/ContactApi.md#apiv1contactstorrowiddelete) | **DELETE** /api/v1/contacts/{torrowId} | 
*ContactApi* | [**apiV1ContactsTorrowIdFeedbacksOptionsPut**](docs/ContactApi.md#apiv1contactstorrowidfeedbacksoptionsput) | **PUT** /api/v1/contacts/{torrowId}/feedbacks/options | 
*ContactApi* | [**apiV1ContactsTorrowIdGet**](docs/ContactApi.md#apiv1contactstorrowidget) | **GET** /api/v1/contacts/{torrowId} | 
*ContactApi* | [**apiV1ContactsTorrowIdGroupListGet**](docs/ContactApi.md#apiv1contactstorrowidgrouplistget) | **GET** /api/v1/contacts/{torrowId}/group/list | 
*ContactApi* | [**apiV1ContactsTorrowIdGroupSetPut**](docs/ContactApi.md#apiv1contactstorrowidgroupsetput) | **PUT** /api/v1/contacts/{torrowId}/group/set | 
*ContactApi* | [**apiV1ContactsTorrowIdGroupUnsetPut**](docs/ContactApi.md#apiv1contactstorrowidgroupunsetput) | **PUT** /api/v1/contacts/{torrowId}/group/unset | 
*ContactApi* | [**apiV1ContactsTorrowIdGroupsGet**](docs/ContactApi.md#apiv1contactstorrowidgroupsget) | **GET** /api/v1/contacts/{torrowId}/groups | 
*ContactApi* | [**apiV1ContactsTorrowIdImageIdPut**](docs/ContactApi.md#apiv1contactstorrowidimageidput) | **PUT** /api/v1/contacts/{torrowId}/image/id | 
*ContactApi* | [**apiV1ContactsTorrowIdImageInfoGet**](docs/ContactApi.md#apiv1contactstorrowidimageinfoget) | **GET** /api/v1/contacts/{torrowId}/image/info | 
*ContactApi* | [**apiV1ContactsTorrowIdImagePuturlGet**](docs/ContactApi.md#apiv1contactstorrowidimageputurlget) | **GET** /api/v1/contacts/{torrowId}/image/puturl | 
*ContactApi* | [**apiV1ContactsTorrowIdIntegrationsPut**](docs/ContactApi.md#apiv1contactstorrowidintegrationsput) | **PUT** /api/v1/contacts/{torrowId}/integrations | 
*ContactApi* | [**apiV1ContactsTorrowIdInvitePost**](docs/ContactApi.md#apiv1contactstorrowidinvitepost) | **POST** /api/v1/contacts/{torrowId}/invite | 
*ContactApi* | [**apiV1ContactsTorrowIdMasterinfoPut**](docs/ContactApi.md#apiv1contactstorrowidmasterinfoput) | **PUT** /api/v1/contacts/{torrowId}/masterinfo | 
*ContactApi* | [**apiV1ContactsTorrowIdParticipantsAnonymousGet**](docs/ContactApi.md#apiv1contactstorrowidparticipantsanonymousget) | **GET** /api/v1/contacts/{torrowId}/participants/anonymous | 
*ContactApi* | [**apiV1ContactsTorrowIdParticipantsGet**](docs/ContactApi.md#apiv1contactstorrowidparticipantsget) | **GET** /api/v1/contacts/{torrowId}/participants | 
*ContactApi* | [**apiV1ContactsTorrowIdParticipantsNonanonymousGet**](docs/ContactApi.md#apiv1contactstorrowidparticipantsnonanonymousget) | **GET** /api/v1/contacts/{torrowId}/participants/nonanonymous | 
*ContactApi* | [**apiV1ContactsTorrowIdParticipationDeclineaccessPut**](docs/ContactApi.md#apiv1contactstorrowidparticipationdeclineaccessput) | **PUT** /api/v1/contacts/{torrowId}/participation/declineaccess | 
*ContactApi* | [**apiV1ContactsTorrowIdParticipationGrantaccessPut**](docs/ContactApi.md#apiv1contactstorrowidparticipationgrantaccessput) | **PUT** /api/v1/contacts/{torrowId}/participation/grantaccess | 
*ContactApi* | [**apiV1ContactsTorrowIdParticipationParticipantProfileIdTypePut**](docs/ContactApi.md#apiv1contactstorrowidparticipationparticipantprofileidtypeput) | **PUT** /api/v1/contacts/{torrowId}/participation/{participantProfileId}/type | 
*ContactApi* | [**apiV1ContactsTorrowIdParticipationRejectPut**](docs/ContactApi.md#apiv1contactstorrowidparticipationrejectput) | **PUT** /api/v1/contacts/{torrowId}/participation/reject | 
*ContactApi* | [**apiV1ContactsTorrowIdParticipationRejectofferPut**](docs/ContactApi.md#apiv1contactstorrowidparticipationrejectofferput) | **PUT** /api/v1/contacts/{torrowId}/participation/rejectoffer | 
*ContactApi* | [**apiV1ContactsTorrowIdParticipationRequestaccessPut**](docs/ContactApi.md#apiv1contactstorrowidparticipationrequestaccessput) | **PUT** /api/v1/contacts/{torrowId}/participation/requestaccess | 
*ContactApi* | [**apiV1ContactsTorrowIdParticipationRevokeofferPut**](docs/ContactApi.md#apiv1contactstorrowidparticipationrevokeofferput) | **PUT** /api/v1/contacts/{torrowId}/participation/revokeoffer | 
*ContactApi* | [**apiV1ContactsTorrowIdParticipationRevokerequestPut**](docs/ContactApi.md#apiv1contactstorrowidparticipationrevokerequestput) | **PUT** /api/v1/contacts/{torrowId}/participation/revokerequest | 
*ContactApi* | [**apiV1ContactsTorrowIdParticipationSharePut**](docs/ContactApi.md#apiv1contactstorrowidparticipationshareput) | **PUT** /api/v1/contacts/{torrowId}/participation/share | 
*ContactApi* | [**apiV1ContactsTorrowIdParticipationShareitemlinkPost**](docs/ContactApi.md#apiv1contactstorrowidparticipationshareitemlinkpost) | **POST** /api/v1/contacts/{torrowId}/participation/shareitemlink | 
*ContactApi* | [**apiV1ContactsTorrowIdPhotoInfoGet**](docs/ContactApi.md#apiv1contactstorrowidphotoinfoget) | **GET** /api/v1/contacts/{torrowId}/photo/info | 
*ContactApi* | [**apiV1ContactsTorrowIdPhotoPuturlGet**](docs/ContactApi.md#apiv1contactstorrowidphotoputurlget) | **GET** /api/v1/contacts/{torrowId}/photo/puturl | 
*ContactApi* | [**apiV1ContactsTorrowIdPublicityPut**](docs/ContactApi.md#apiv1contactstorrowidpublicityput) | **PUT** /api/v1/contacts/{torrowId}/publicity | 
*ContactApi* | [**apiV1ContactsTorrowIdPut**](docs/ContactApi.md#apiv1contactstorrowidput) | **PUT** /api/v1/contacts/{torrowId} | 
*ContactApi* | [**apiV1ContactsTorrowIdSavetomindmapPut**](docs/ContactApi.md#apiv1contactstorrowidsavetomindmapput) | **PUT** /api/v1/contacts/{torrowId}/savetomindmap | 
*ContactApi* | [**apiV1ContactsTorrowIdShorturlPost**](docs/ContactApi.md#apiv1contactstorrowidshorturlpost) | **POST** /api/v1/contacts/{torrowId}/shorturl | 
*ContactApi* | [**apiV1ContactsTorrowIdSolutiondataPut**](docs/ContactApi.md#apiv1contactstorrowidsolutiondataput) | **PUT** /api/v1/contacts/{torrowId}/solutiondata | 
*ContactApi* | [**apiV1ContactsTorrowIdTagsGet**](docs/ContactApi.md#apiv1contactstorrowidtagsget) | **GET** /api/v1/contacts/{torrowId}/tags | 
*ContactApi* | [**apiV1ContactsTorrowIdTagsPut**](docs/ContactApi.md#apiv1contactstorrowidtagsput) | **PUT** /api/v1/contacts/{torrowId}/tags | 
*ContactApi* | [**apiV1ContactsTorrowIdTimetablePut**](docs/ContactApi.md#apiv1contactstorrowidtimetableput) | **PUT** /api/v1/contacts/{torrowId}/timetable | 
*ContactApi* | [**apiV1ContactsTorrowIdTorrowaccountIdPut**](docs/ContactApi.md#apiv1contactstorrowidtorrowaccountidput) | **PUT** /api/v1/contacts/{torrowId}/torrowaccount/id | 
*ContactApi* | [**apiV1ContactsTorrowIdUpdategroupsPut**](docs/ContactApi.md#apiv1contactstorrowidupdategroupsput) | **PUT** /api/v1/contacts/{torrowId}/updategroups | 
*ContactApi* | [**apiV1ContactsUniquenameUniquenameGet**](docs/ContactApi.md#apiv1contactsuniquenameuniquenameget) | **GET** /api/v1/contacts/uniquename/{uniquename} | 
*ContactViewApi* | [**apiV1ContactsParentIdViewsPinnedChildIdDelete**](docs/ContactViewApi.md#apiv1contactsparentidviewspinnedchildiddelete) | **DELETE** /api/v1/contacts/{parentId}/views/pinned/{childId} | 
*ContactViewApi* | [**apiV1ContactsParentIdViewsPinnedChildIdGet**](docs/ContactViewApi.md#apiv1contactsparentidviewspinnedchildidget) | **GET** /api/v1/contacts/{parentId}/views/pinned/{childId} | 
*ContactViewApi* | [**apiV1ContactsParentIdViewsPinnedChildIdUnpinPost**](docs/ContactViewApi.md#apiv1contactsparentidviewspinnedchildidunpinpost) | **POST** /api/v1/contacts/{parentId}/views/pinned/{childId}/unpin | 
*ContactViewApi* | [**apiV1ContactsParentIdViewsPinnedGet**](docs/ContactViewApi.md#apiv1contactsparentidviewspinnedget) | **GET** /api/v1/contacts/{parentId}/views/pinned | 
*ContactViewApi* | [**apiV1ContactsParentIdViewsPinnedPost**](docs/ContactViewApi.md#apiv1contactsparentidviewspinnedpost) | **POST** /api/v1/contacts/{parentId}/views/pinned | 
*ContactViewApi* | [**apiV1ContactsParentIdViewsPinnedUpdateorderPost**](docs/ContactViewApi.md#apiv1contactsparentidviewspinnedupdateorderpost) | **POST** /api/v1/contacts/{parentId}/views/pinned/updateorder | 
*ContactViewApi* | [**apiV1ContactsParentIdViewsUserChildIdDelete**](docs/ContactViewApi.md#apiv1contactsparentidviewsuserchildiddelete) | **DELETE** /api/v1/contacts/{parentId}/views/user/{childId} | 
*ContactViewApi* | [**apiV1ContactsParentIdViewsUserChildIdGet**](docs/ContactViewApi.md#apiv1contactsparentidviewsuserchildidget) | **GET** /api/v1/contacts/{parentId}/views/user/{childId} | 
*ContactViewApi* | [**apiV1ContactsParentIdViewsUserChildIdPinPost**](docs/ContactViewApi.md#apiv1contactsparentidviewsuserchildidpinpost) | **POST** /api/v1/contacts/{parentId}/views/user/{childId}/pin | 
*ContactViewApi* | [**apiV1ContactsParentIdViewsUserGet**](docs/ContactViewApi.md#apiv1contactsparentidviewsuserget) | **GET** /api/v1/contacts/{parentId}/views/user | 
*ContactViewApi* | [**apiV1ContactsParentIdViewsUserPost**](docs/ContactViewApi.md#apiv1contactsparentidviewsuserpost) | **POST** /api/v1/contacts/{parentId}/views/user | 
*ContactViewApi* | [**apiV1ContactsParentIdViewsUserUpdateorderPost**](docs/ContactViewApi.md#apiv1contactsparentidviewsuserupdateorderpost) | **POST** /api/v1/contacts/{parentId}/views/user/updateorder | 
*ContactViewApi* | [**apiV1ContactsViewsUserGet**](docs/ContactViewApi.md#apiv1contactsviewsuserget) | **GET** /api/v1/contacts/views/user | 
*ContextApi* | [**apiV1ContextsExcludeFromgroupsPut**](docs/ContextApi.md#apiv1contextsexcludefromgroupsput) | **PUT** /api/v1/contexts/exclude/fromgroups | 
*ContextApi* | [**apiV1ContextsIncludeTogroupsPut**](docs/ContextApi.md#apiv1contextsincludetogroupsput) | **PUT** /api/v1/contexts/include/togroups | 
*ContextApi* | [**apiV1ContextsItemIdAliasPut**](docs/ContextApi.md#apiv1contextsitemidaliasput) | **PUT** /api/v1/contexts/{itemId}/alias | 
*ContextApi* | [**apiV1ContextsItemIdBlockPost**](docs/ContextApi.md#apiv1contextsitemidblockpost) | **POST** /api/v1/contexts/{itemId}/block | 
*ContextApi* | [**apiV1ContextsItemIdLastusagetimePut**](docs/ContextApi.md#apiv1contextsitemidlastusagetimeput) | **PUT** /api/v1/contexts/{itemId}/lastusagetime | 
*ContextApi* | [**apiV1ContextsItemIdNotificationwaylistPut**](docs/ContextApi.md#apiv1contextsitemidnotificationwaylistput) | **PUT** /api/v1/contexts/{itemId}/notificationwaylist | 
*ContextApi* | [**apiV1ContextsItemIdOfflinablePut**](docs/ContextApi.md#apiv1contextsitemidofflinableput) | **PUT** /api/v1/contexts/{itemId}/offlinable | 
*ContextApi* | [**apiV1ContextsItemIdParticipationProfilePut**](docs/ContextApi.md#apiv1contextsitemidparticipationprofileput) | **PUT** /api/v1/contexts/{itemId}/participation/profile | 
*ContextApi* | [**apiV1ContextsItemIdPersonalsolutiondataPut**](docs/ContextApi.md#apiv1contextsitemidpersonalsolutiondataput) | **PUT** /api/v1/contexts/{itemId}/personalsolutiondata | 
*ContextApi* | [**apiV1ContextsItemIdRemindersPut**](docs/ContextApi.md#apiv1contextsitemidremindersput) | **PUT** /api/v1/contexts/{itemId}/reminders | 
*ContextApi* | [**apiV1ContextsItemIdSendlinkPut**](docs/ContextApi.md#apiv1contextsitemidsendlinkput) | **PUT** /api/v1/contexts/{itemId}/sendlink | 
*ContextApi* | [**apiV1ContextsItemIdUnblockPost**](docs/ContextApi.md#apiv1contextsitemidunblockpost) | **POST** /api/v1/contexts/{itemId}/unblock | 
*ContextApi* | [**apiV1ContextsItemIdUniquenamePut**](docs/ContextApi.md#apiv1contextsitemiduniquenameput) | **PUT** /api/v1/contexts/{itemId}/uniquename | 
*ContextApi* | [**apiV1ContextsParentIdExcludeFromuserPut**](docs/ContextApi.md#apiv1contextsparentidexcludefromuserput) | **PUT** /api/v1/contexts/{parentId}/exclude/fromuser | 
*ContextApi* | [**apiV1ContextsParentIdExcludeItemsPut**](docs/ContextApi.md#apiv1contextsparentidexcludeitemsput) | **PUT** /api/v1/contexts/{parentId}/exclude/items | 
*ContextApi* | [**apiV1ContextsParentIdIncludeForuserPut**](docs/ContextApi.md#apiv1contextsparentidincludeforuserput) | **PUT** /api/v1/contexts/{parentId}/include/foruser | 
*ContextApi* | [**apiV1ContextsParentIdIncludeItemsPut**](docs/ContextApi.md#apiv1contextsparentidincludeitemsput) | **PUT** /api/v1/contexts/{parentId}/include/items | 
*ContextApi* | [**apiV1ContextsPersonallistGet**](docs/ContextApi.md#apiv1contextspersonallistget) | **GET** /api/v1/contexts/personallist | 
*ContextApi* | [**apiV1ContextsPersonallistItemIdDelete**](docs/ContextApi.md#apiv1contextspersonallistitemiddelete) | **DELETE** /api/v1/contexts/personallist/{itemId} | 
*ContextApi* | [**apiV1ContextsPersonallistUpdateorderPost**](docs/ContextApi.md#apiv1contextspersonallistupdateorderpost) | **POST** /api/v1/contexts/personallist/updateorder | 
*ContextApi* | [**apiV1ContextsPost**](docs/ContextApi.md#apiv1contextspost) | **POST** /api/v1/contexts | 
*ContextApi* | [**apiV1ContextsTorrowIdDelete**](docs/ContextApi.md#apiv1contextstorrowiddelete) | **DELETE** /api/v1/contexts/{torrowId} | 
*ContextApi* | [**apiV1ContextsTorrowIdFeedbacksOptionsPut**](docs/ContextApi.md#apiv1contextstorrowidfeedbacksoptionsput) | **PUT** /api/v1/contexts/{torrowId}/feedbacks/options | 
*ContextApi* | [**apiV1ContextsTorrowIdGet**](docs/ContextApi.md#apiv1contextstorrowidget) | **GET** /api/v1/contexts/{torrowId} | 
*ContextApi* | [**apiV1ContextsTorrowIdGroupListGet**](docs/ContextApi.md#apiv1contextstorrowidgrouplistget) | **GET** /api/v1/contexts/{torrowId}/group/list | 
*ContextApi* | [**apiV1ContextsTorrowIdGroupSetPut**](docs/ContextApi.md#apiv1contextstorrowidgroupsetput) | **PUT** /api/v1/contexts/{torrowId}/group/set | 
*ContextApi* | [**apiV1ContextsTorrowIdGroupUnsetPut**](docs/ContextApi.md#apiv1contextstorrowidgroupunsetput) | **PUT** /api/v1/contexts/{torrowId}/group/unset | 
*ContextApi* | [**apiV1ContextsTorrowIdGroupsGet**](docs/ContextApi.md#apiv1contextstorrowidgroupsget) | **GET** /api/v1/contexts/{torrowId}/groups | 
*ContextApi* | [**apiV1ContextsTorrowIdImageIdPut**](docs/ContextApi.md#apiv1contextstorrowidimageidput) | **PUT** /api/v1/contexts/{torrowId}/image/id | 
*ContextApi* | [**apiV1ContextsTorrowIdImageInfoGet**](docs/ContextApi.md#apiv1contextstorrowidimageinfoget) | **GET** /api/v1/contexts/{torrowId}/image/info | 
*ContextApi* | [**apiV1ContextsTorrowIdImagePuturlGet**](docs/ContextApi.md#apiv1contextstorrowidimageputurlget) | **GET** /api/v1/contexts/{torrowId}/image/puturl | 
*ContextApi* | [**apiV1ContextsTorrowIdIntegrationsPut**](docs/ContextApi.md#apiv1contextstorrowidintegrationsput) | **PUT** /api/v1/contexts/{torrowId}/integrations | 
*ContextApi* | [**apiV1ContextsTorrowIdMasterinfoPut**](docs/ContextApi.md#apiv1contextstorrowidmasterinfoput) | **PUT** /api/v1/contexts/{torrowId}/masterinfo | 
*ContextApi* | [**apiV1ContextsTorrowIdParticipantsAnonymousGet**](docs/ContextApi.md#apiv1contextstorrowidparticipantsanonymousget) | **GET** /api/v1/contexts/{torrowId}/participants/anonymous | 
*ContextApi* | [**apiV1ContextsTorrowIdParticipantsGet**](docs/ContextApi.md#apiv1contextstorrowidparticipantsget) | **GET** /api/v1/contexts/{torrowId}/participants | 
*ContextApi* | [**apiV1ContextsTorrowIdParticipantsNonanonymousGet**](docs/ContextApi.md#apiv1contextstorrowidparticipantsnonanonymousget) | **GET** /api/v1/contexts/{torrowId}/participants/nonanonymous | 
*ContextApi* | [**apiV1ContextsTorrowIdParticipationDeclineaccessPut**](docs/ContextApi.md#apiv1contextstorrowidparticipationdeclineaccessput) | **PUT** /api/v1/contexts/{torrowId}/participation/declineaccess | 
*ContextApi* | [**apiV1ContextsTorrowIdParticipationGrantaccessPut**](docs/ContextApi.md#apiv1contextstorrowidparticipationgrantaccessput) | **PUT** /api/v1/contexts/{torrowId}/participation/grantaccess | 
*ContextApi* | [**apiV1ContextsTorrowIdParticipationParticipantProfileIdTypePut**](docs/ContextApi.md#apiv1contextstorrowidparticipationparticipantprofileidtypeput) | **PUT** /api/v1/contexts/{torrowId}/participation/{participantProfileId}/type | 
*ContextApi* | [**apiV1ContextsTorrowIdParticipationRejectPut**](docs/ContextApi.md#apiv1contextstorrowidparticipationrejectput) | **PUT** /api/v1/contexts/{torrowId}/participation/reject | 
*ContextApi* | [**apiV1ContextsTorrowIdParticipationRejectofferPut**](docs/ContextApi.md#apiv1contextstorrowidparticipationrejectofferput) | **PUT** /api/v1/contexts/{torrowId}/participation/rejectoffer | 
*ContextApi* | [**apiV1ContextsTorrowIdParticipationRequestaccessPut**](docs/ContextApi.md#apiv1contextstorrowidparticipationrequestaccessput) | **PUT** /api/v1/contexts/{torrowId}/participation/requestaccess | 
*ContextApi* | [**apiV1ContextsTorrowIdParticipationRevokeofferPut**](docs/ContextApi.md#apiv1contextstorrowidparticipationrevokeofferput) | **PUT** /api/v1/contexts/{torrowId}/participation/revokeoffer | 
*ContextApi* | [**apiV1ContextsTorrowIdParticipationRevokerequestPut**](docs/ContextApi.md#apiv1contextstorrowidparticipationrevokerequestput) | **PUT** /api/v1/contexts/{torrowId}/participation/revokerequest | 
*ContextApi* | [**apiV1ContextsTorrowIdParticipationSharePut**](docs/ContextApi.md#apiv1contextstorrowidparticipationshareput) | **PUT** /api/v1/contexts/{torrowId}/participation/share | 
*ContextApi* | [**apiV1ContextsTorrowIdParticipationShareitemlinkPost**](docs/ContextApi.md#apiv1contextstorrowidparticipationshareitemlinkpost) | **POST** /api/v1/contexts/{torrowId}/participation/shareitemlink | 
*ContextApi* | [**apiV1ContextsTorrowIdPublicityPut**](docs/ContextApi.md#apiv1contextstorrowidpublicityput) | **PUT** /api/v1/contexts/{torrowId}/publicity | 
*ContextApi* | [**apiV1ContextsTorrowIdPut**](docs/ContextApi.md#apiv1contextstorrowidput) | **PUT** /api/v1/contexts/{torrowId} | 
*ContextApi* | [**apiV1ContextsTorrowIdSavetomindmapPut**](docs/ContextApi.md#apiv1contextstorrowidsavetomindmapput) | **PUT** /api/v1/contexts/{torrowId}/savetomindmap | 
*ContextApi* | [**apiV1ContextsTorrowIdShorturlPost**](docs/ContextApi.md#apiv1contextstorrowidshorturlpost) | **POST** /api/v1/contexts/{torrowId}/shorturl | 
*ContextApi* | [**apiV1ContextsTorrowIdSolutiondataPut**](docs/ContextApi.md#apiv1contextstorrowidsolutiondataput) | **PUT** /api/v1/contexts/{torrowId}/solutiondata | 
*ContextApi* | [**apiV1ContextsTorrowIdTagsGet**](docs/ContextApi.md#apiv1contextstorrowidtagsget) | **GET** /api/v1/contexts/{torrowId}/tags | 
*ContextApi* | [**apiV1ContextsTorrowIdTagsPut**](docs/ContextApi.md#apiv1contextstorrowidtagsput) | **PUT** /api/v1/contexts/{torrowId}/tags | 
*ContextApi* | [**apiV1ContextsTorrowIdTorrowaccountIdPut**](docs/ContextApi.md#apiv1contextstorrowidtorrowaccountidput) | **PUT** /api/v1/contexts/{torrowId}/torrowaccount/id | 
*ContextApi* | [**apiV1ContextsTorrowIdUpdategroupsPut**](docs/ContextApi.md#apiv1contextstorrowidupdategroupsput) | **PUT** /api/v1/contexts/{torrowId}/updategroups | 
*ContextApi* | [**apiV1ContextsUniquenameUniquenameGet**](docs/ContextApi.md#apiv1contextsuniquenameuniquenameget) | **GET** /api/v1/contexts/uniquename/{uniquename} | 
*ContextViewApi* | [**apiV1ContextsParentIdViewsPinnedChildIdDelete**](docs/ContextViewApi.md#apiv1contextsparentidviewspinnedchildiddelete) | **DELETE** /api/v1/contexts/{parentId}/views/pinned/{childId} | 
*ContextViewApi* | [**apiV1ContextsParentIdViewsPinnedChildIdGet**](docs/ContextViewApi.md#apiv1contextsparentidviewspinnedchildidget) | **GET** /api/v1/contexts/{parentId}/views/pinned/{childId} | 
*ContextViewApi* | [**apiV1ContextsParentIdViewsPinnedGet**](docs/ContextViewApi.md#apiv1contextsparentidviewspinnedget) | **GET** /api/v1/contexts/{parentId}/views/pinned | 
*ContextViewApi* | [**apiV1ContextsParentIdViewsPinnedPost**](docs/ContextViewApi.md#apiv1contextsparentidviewspinnedpost) | **POST** /api/v1/contexts/{parentId}/views/pinned | 
*ContextViewApi* | [**apiV1ContextsParentIdViewsPinnedUpdateorderPost**](docs/ContextViewApi.md#apiv1contextsparentidviewspinnedupdateorderpost) | **POST** /api/v1/contexts/{parentId}/views/pinned/updateorder | 
*ContextViewApi* | [**apiV1ContextsParentIdViewsUserChildIdDelete**](docs/ContextViewApi.md#apiv1contextsparentidviewsuserchildiddelete) | **DELETE** /api/v1/contexts/{parentId}/views/user/{childId} | 
*ContextViewApi* | [**apiV1ContextsParentIdViewsUserChildIdGet**](docs/ContextViewApi.md#apiv1contextsparentidviewsuserchildidget) | **GET** /api/v1/contexts/{parentId}/views/user/{childId} | 
*ContextViewApi* | [**apiV1ContextsParentIdViewsUserChildIdPinPost**](docs/ContextViewApi.md#apiv1contextsparentidviewsuserchildidpinpost) | **POST** /api/v1/contexts/{parentId}/views/user/{childId}/pin | 
*ContextViewApi* | [**apiV1ContextsParentIdViewsUserChildIdUnpinPost**](docs/ContextViewApi.md#apiv1contextsparentidviewsuserchildidunpinpost) | **POST** /api/v1/contexts/{parentId}/views/user/{childId}/unpin | 
*ContextViewApi* | [**apiV1ContextsParentIdViewsUserGet**](docs/ContextViewApi.md#apiv1contextsparentidviewsuserget) | **GET** /api/v1/contexts/{parentId}/views/user | 
*ContextViewApi* | [**apiV1ContextsParentIdViewsUserPost**](docs/ContextViewApi.md#apiv1contextsparentidviewsuserpost) | **POST** /api/v1/contexts/{parentId}/views/user | 
*ContextViewApi* | [**apiV1ContextsParentIdViewsUserUpdateorderPost**](docs/ContextViewApi.md#apiv1contextsparentidviewsuserupdateorderpost) | **POST** /api/v1/contexts/{parentId}/views/user/updateorder | 
*ContextViewApi* | [**apiV1ContextsViewsUserGet**](docs/ContextViewApi.md#apiv1contextsviewsuserget) | **GET** /api/v1/contexts/views/user | 
*ExportImportApi* | [**apiV1ExportPost**](docs/ExportImportApi.md#apiv1exportpost) | **POST** /api/v1/export | 
*ExportImportApi* | [**apiV1ImportPost**](docs/ExportImportApi.md#apiv1importpost) | **POST** /api/v1/import | 
*ExportImportApi* | [**apiV1ImportbyuniquenamePost**](docs/ExportImportApi.md#apiv1importbyuniquenamepost) | **POST** /api/v1/importbyuniquename | 
*ExternalAuthApi* | [**apiV1ExternalauthsAllGet**](docs/ExternalAuthApi.md#apiv1externalauthsallget) | **GET** /api/v1/externalauths/all | 
*ExternalAuthApi* | [**apiV1ExternalauthsExternalAuthIdDelete**](docs/ExternalAuthApi.md#apiv1externalauthsexternalauthiddelete) | **DELETE** /api/v1/externalauths/{externalAuthId} | 
*ExternalAuthApi* | [**apiV1ExternalauthsPost**](docs/ExternalAuthApi.md#apiv1externalauthspost) | **POST** /api/v1/externalauths | 
*IdGeneratorApi* | [**apiV1IdgeneratorObjectTypeGet**](docs/IdGeneratorApi.md#apiv1idgeneratorobjecttypeget) | **GET** /api/v1/idgenerator/{objectType} | 
*IftttActionsApi* | [**apiV1IftttV1ActionsActionNameFieldsUserProfileIdOptionsPost**](docs/IftttActionsApi.md#apiv1iftttv1actionsactionnamefieldsuserprofileidoptionspost) | **POST** /api/v1/ifttt/v1/actions/{actionName}/fields/user_profile_id/options | 
*IftttActionsApi* | [**apiV1IftttV1ActionsCreateNewFileNotePost**](docs/IftttActionsApi.md#apiv1iftttv1actionscreatenewfilenotepost) | **POST** /api/v1/ifttt/v1/actions/create_new_file_note | 
*IftttActionsApi* | [**apiV1IftttV1ActionsCreateNewPhotoNotePost**](docs/IftttActionsApi.md#apiv1iftttv1actionscreatenewphotonotepost) | **POST** /api/v1/ifttt/v1/actions/create_new_photo_note | 
*IftttActionsApi* | [**apiV1IftttV1ActionsCreateNewTextNotePost**](docs/IftttActionsApi.md#apiv1iftttv1actionscreatenewtextnotepost) | **POST** /api/v1/ifttt/v1/actions/create_new_text_note | 
*IftttQueriesApi* | [**apiV1IftttV1QueriesPersonalNotesGet**](docs/IftttQueriesApi.md#apiv1iftttv1queriespersonalnotesget) | **GET** /api/v1/ifttt/v1/queries/personal_notes | 
*IftttTriggersApi* | [**apiV1IftttV1TriggersNewNoteCreatedPost**](docs/IftttTriggersApi.md#apiv1iftttv1triggersnewnotecreatedpost) | **POST** /api/v1/ifttt/v1/triggers/new_note_created | 
*IftttUserApi* | [**apiV1IftttV1UserInfoGet**](docs/IftttUserApi.md#apiv1iftttv1userinfoget) | **GET** /api/v1/ifttt/v1/user/info | 
*IntegrationApi* | [**apiV1IntegrationsIntegrationIdDelete**](docs/IntegrationApi.md#apiv1integrationsintegrationiddelete) | **DELETE** /api/v1/integrations/{integrationId} | 
*IntegrationApi* | [**apiV1IntegrationsListGet**](docs/IntegrationApi.md#apiv1integrationslistget) | **GET** /api/v1/integrations/list | 
*IntegrationApi* | [**apiV1IntegrationsPost**](docs/IntegrationApi.md#apiv1integrationspost) | **POST** /api/v1/integrations | 
*IntegrationApi* | [**apiV1IntegrationsTorrowIdPut**](docs/IntegrationApi.md#apiv1integrationstorrowidput) | **PUT** /api/v1/integrations/{torrowId} | 
*ItemApi* | [**apiV1ItemActivateshareitemsessionShareItemSessionIdPut**](docs/ItemApi.md#apiv1itemactivateshareitemsessionshareitemsessionidput) | **PUT** /api/v1/item/activateshareitemsession/{shareItemSessionId} | 
*ItemApi* | [**apiV1ItemTorrowIdFeedbacksGet**](docs/ItemApi.md#apiv1itemtorrowidfeedbacksget) | **GET** /api/v1/item/{torrowId}/feedbacks | 
*ItemApi* | [**apiV1ItemTorrowIdFeedbacksMessageIdDelete**](docs/ItemApi.md#apiv1itemtorrowidfeedbacksmessageiddelete) | **DELETE** /api/v1/item/{torrowId}/feedbacks/{messageId} | 
*ItemApi* | [**apiV1ItemTorrowIdFeedbacksMessageIdGet**](docs/ItemApi.md#apiv1itemtorrowidfeedbacksmessageidget) | **GET** /api/v1/item/{torrowId}/feedbacks/{messageId} | 
*ItemApi* | [**apiV1ItemTorrowIdFeedbacksMessageIdPut**](docs/ItemApi.md#apiv1itemtorrowidfeedbacksmessageidput) | **PUT** /api/v1/item/{torrowId}/feedbacks/{messageId} | 
*ItemApi* | [**apiV1ItemTorrowIdFeedbacksMessageIdRepliesGet**](docs/ItemApi.md#apiv1itemtorrowidfeedbacksmessageidrepliesget) | **GET** /api/v1/item/{torrowId}/feedbacks/{messageId}/replies | 
*ItemApi* | [**apiV1ItemTorrowIdFeedbacksMessageIdReplyPost**](docs/ItemApi.md#apiv1itemtorrowidfeedbacksmessageidreplypost) | **POST** /api/v1/item/{torrowId}/feedbacks/{messageId}/reply | 
*ItemApi* | [**apiV1ItemTorrowIdFeedbacksNewmessagePost**](docs/ItemApi.md#apiv1itemtorrowidfeedbacksnewmessagepost) | **POST** /api/v1/item/{torrowId}/feedbacks/newmessage | 
*ItemApi* | [**apiV1ItemTorrowIdUserfeedbackDelete**](docs/ItemApi.md#apiv1itemtorrowiduserfeedbackdelete) | **DELETE** /api/v1/item/{torrowId}/userfeedback | 
*ItemApi* | [**apiV1ItemTorrowIdUserfeedbackGet**](docs/ItemApi.md#apiv1itemtorrowiduserfeedbackget) | **GET** /api/v1/item/{torrowId}/userfeedback | 
*ItemApi* | [**apiV1ItemTorrowIdUserfeedbackPut**](docs/ItemApi.md#apiv1itemtorrowiduserfeedbackput) | **PUT** /api/v1/item/{torrowId}/userfeedback | 
*ItemApi* | [**apiV1ItemUniquenameUniqueNameGet**](docs/ItemApi.md#apiv1itemuniquenameuniquenameget) | **GET** /api/v1/item/uniquename/{uniqueName} | 
*LoyaltyCardApi* | [**apiV1LoyaltycardsPersonallistGet**](docs/LoyaltyCardApi.md#apiv1loyaltycardspersonallistget) | **GET** /api/v1/loyaltycards/personallist | 
*LoyaltyCardApi* | [**apiV1LoyaltycardsPersonallistTorrowIdDelete**](docs/LoyaltyCardApi.md#apiv1loyaltycardspersonallisttorrowiddelete) | **DELETE** /api/v1/loyaltycards/personallist/{torrowId} | 
*LoyaltyCardApi* | [**apiV1LoyaltycardsPersonallistUpdateorderPost**](docs/LoyaltyCardApi.md#apiv1loyaltycardspersonallistupdateorderpost) | **POST** /api/v1/loyaltycards/personallist/updateorder | 
*LoyaltyCardApi* | [**apiV1LoyaltycardsTorrowIdAliasPut**](docs/LoyaltyCardApi.md#apiv1loyaltycardstorrowidaliasput) | **PUT** /api/v1/loyaltycards/{torrowId}/alias | 
*LoyaltyCardApi* | [**apiV1LoyaltycardsTorrowIdBalanceGet**](docs/LoyaltyCardApi.md#apiv1loyaltycardstorrowidbalanceget) | **GET** /api/v1/loyaltycards/{torrowId}/balance | 
*LoyaltyCardApi* | [**apiV1LoyaltycardsTorrowIdDelete**](docs/LoyaltyCardApi.md#apiv1loyaltycardstorrowiddelete) | **DELETE** /api/v1/loyaltycards/{torrowId} | 
*LoyaltyCardApi* | [**apiV1LoyaltycardsTorrowIdGet**](docs/LoyaltyCardApi.md#apiv1loyaltycardstorrowidget) | **GET** /api/v1/loyaltycards/{torrowId} | 
*LoyaltyCardApi* | [**apiV1LoyaltycardsTorrowIdGroupSetPut**](docs/LoyaltyCardApi.md#apiv1loyaltycardstorrowidgroupsetput) | **PUT** /api/v1/loyaltycards/{torrowId}/group/set | 
*LoyaltyCardApi* | [**apiV1LoyaltycardsTorrowIdGroupUnsetPut**](docs/LoyaltyCardApi.md#apiv1loyaltycardstorrowidgroupunsetput) | **PUT** /api/v1/loyaltycards/{torrowId}/group/unset | 
*LoyaltyCardApi* | [**apiV1LoyaltycardsTorrowIdImageIdPut**](docs/LoyaltyCardApi.md#apiv1loyaltycardstorrowidimageidput) | **PUT** /api/v1/loyaltycards/{torrowId}/image/id | 
*LoyaltyCardApi* | [**apiV1LoyaltycardsTorrowIdImageInfoGet**](docs/LoyaltyCardApi.md#apiv1loyaltycardstorrowidimageinfoget) | **GET** /api/v1/loyaltycards/{torrowId}/image/info | 
*LoyaltyCardApi* | [**apiV1LoyaltycardsTorrowIdImagePuturlGet**](docs/LoyaltyCardApi.md#apiv1loyaltycardstorrowidimageputurlget) | **GET** /api/v1/loyaltycards/{torrowId}/image/puturl | 
*LoyaltyCardApi* | [**apiV1LoyaltycardsTorrowIdIntegrationsPut**](docs/LoyaltyCardApi.md#apiv1loyaltycardstorrowidintegrationsput) | **PUT** /api/v1/loyaltycards/{torrowId}/integrations | 
*LoyaltyCardApi* | [**apiV1LoyaltycardsTorrowIdLastusagetimePut**](docs/LoyaltyCardApi.md#apiv1loyaltycardstorrowidlastusagetimeput) | **PUT** /api/v1/loyaltycards/{torrowId}/lastusagetime | 
*LoyaltyCardApi* | [**apiV1LoyaltycardsTorrowIdMasterinfoPut**](docs/LoyaltyCardApi.md#apiv1loyaltycardstorrowidmasterinfoput) | **PUT** /api/v1/loyaltycards/{torrowId}/masterinfo | 
*LoyaltyCardApi* | [**apiV1LoyaltycardsTorrowIdParticipantsCountGet**](docs/LoyaltyCardApi.md#apiv1loyaltycardstorrowidparticipantscountget) | **GET** /api/v1/loyaltycards/{torrowId}/participants/count | 
*LoyaltyCardApi* | [**apiV1LoyaltycardsTorrowIdParticipantsGet**](docs/LoyaltyCardApi.md#apiv1loyaltycardstorrowidparticipantsget) | **GET** /api/v1/loyaltycards/{torrowId}/participants | 
*LoyaltyCardApi* | [**apiV1LoyaltycardsTorrowIdParticipationDeclineaccessPut**](docs/LoyaltyCardApi.md#apiv1loyaltycardstorrowidparticipationdeclineaccessput) | **PUT** /api/v1/loyaltycards/{torrowId}/participation/declineaccess | 
*LoyaltyCardApi* | [**apiV1LoyaltycardsTorrowIdParticipationGrantaccessPut**](docs/LoyaltyCardApi.md#apiv1loyaltycardstorrowidparticipationgrantaccessput) | **PUT** /api/v1/loyaltycards/{torrowId}/participation/grantaccess | 
*LoyaltyCardApi* | [**apiV1LoyaltycardsTorrowIdParticipationProfileIdTypePut**](docs/LoyaltyCardApi.md#apiv1loyaltycardstorrowidparticipationprofileidtypeput) | **PUT** /api/v1/loyaltycards/{torrowId}/participation/{profileId}/type | 
*LoyaltyCardApi* | [**apiV1LoyaltycardsTorrowIdParticipationProfilePut**](docs/LoyaltyCardApi.md#apiv1loyaltycardstorrowidparticipationprofileput) | **PUT** /api/v1/loyaltycards/{torrowId}/participation/profile | 
*LoyaltyCardApi* | [**apiV1LoyaltycardsTorrowIdParticipationRejectPut**](docs/LoyaltyCardApi.md#apiv1loyaltycardstorrowidparticipationrejectput) | **PUT** /api/v1/loyaltycards/{torrowId}/participation/reject | 
*LoyaltyCardApi* | [**apiV1LoyaltycardsTorrowIdParticipationRejectofferPut**](docs/LoyaltyCardApi.md#apiv1loyaltycardstorrowidparticipationrejectofferput) | **PUT** /api/v1/loyaltycards/{torrowId}/participation/rejectoffer | 
*LoyaltyCardApi* | [**apiV1LoyaltycardsTorrowIdParticipationRequestaccessPut**](docs/LoyaltyCardApi.md#apiv1loyaltycardstorrowidparticipationrequestaccessput) | **PUT** /api/v1/loyaltycards/{torrowId}/participation/requestaccess | 
*LoyaltyCardApi* | [**apiV1LoyaltycardsTorrowIdParticipationRevokeofferPut**](docs/LoyaltyCardApi.md#apiv1loyaltycardstorrowidparticipationrevokeofferput) | **PUT** /api/v1/loyaltycards/{torrowId}/participation/revokeoffer | 
*LoyaltyCardApi* | [**apiV1LoyaltycardsTorrowIdParticipationRevokerequestPut**](docs/LoyaltyCardApi.md#apiv1loyaltycardstorrowidparticipationrevokerequestput) | **PUT** /api/v1/loyaltycards/{torrowId}/participation/revokerequest | 
*LoyaltyCardApi* | [**apiV1LoyaltycardsTorrowIdParticipationSharePut**](docs/LoyaltyCardApi.md#apiv1loyaltycardstorrowidparticipationshareput) | **PUT** /api/v1/loyaltycards/{torrowId}/participation/share | 
*LoyaltyCardApi* | [**apiV1LoyaltycardsTorrowIdPersonalsolutiondataPut**](docs/LoyaltyCardApi.md#apiv1loyaltycardstorrowidpersonalsolutiondataput) | **PUT** /api/v1/loyaltycards/{torrowId}/personalsolutiondata | 
*LoyaltyCardApi* | [**apiV1LoyaltycardsTorrowIdPublicityPut**](docs/LoyaltyCardApi.md#apiv1loyaltycardstorrowidpublicityput) | **PUT** /api/v1/loyaltycards/{torrowId}/publicity | 
*LoyaltyCardApi* | [**apiV1LoyaltycardsTorrowIdPut**](docs/LoyaltyCardApi.md#apiv1loyaltycardstorrowidput) | **PUT** /api/v1/loyaltycards/{torrowId} | 
*LoyaltyCardApi* | [**apiV1LoyaltycardsTorrowIdSavetomindmapPut**](docs/LoyaltyCardApi.md#apiv1loyaltycardstorrowidsavetomindmapput) | **PUT** /api/v1/loyaltycards/{torrowId}/savetomindmap | 
*LoyaltyCardApi* | [**apiV1LoyaltycardsTorrowIdSendlinkPut**](docs/LoyaltyCardApi.md#apiv1loyaltycardstorrowidsendlinkput) | **PUT** /api/v1/loyaltycards/{torrowId}/sendlink | 
*LoyaltyCardApi* | [**apiV1LoyaltycardsTorrowIdShorturlPost**](docs/LoyaltyCardApi.md#apiv1loyaltycardstorrowidshorturlpost) | **POST** /api/v1/loyaltycards/{torrowId}/shorturl | 
*LoyaltyCardApi* | [**apiV1LoyaltycardsTorrowIdSolutiondataPut**](docs/LoyaltyCardApi.md#apiv1loyaltycardstorrowidsolutiondataput) | **PUT** /api/v1/loyaltycards/{torrowId}/solutiondata | 
*LoyaltyCardApi* | [**apiV1LoyaltycardsTorrowIdSubscriptionsSubscriptionIdBalanceGet**](docs/LoyaltyCardApi.md#apiv1loyaltycardstorrowidsubscriptionssubscriptionidbalanceget) | **GET** /api/v1/loyaltycards/{torrowId}/subscriptions/{subscriptionId}/balance | 
*LoyaltyCardApi* | [**apiV1LoyaltycardsTorrowIdTagsPut**](docs/LoyaltyCardApi.md#apiv1loyaltycardstorrowidtagsput) | **PUT** /api/v1/loyaltycards/{torrowId}/tags | 
*LoyaltyCardApi* | [**apiV1LoyaltycardsTorrowIdTorrowaccountIdPut**](docs/LoyaltyCardApi.md#apiv1loyaltycardstorrowidtorrowaccountidput) | **PUT** /api/v1/loyaltycards/{torrowId}/torrowaccount/id | 
*LoyaltyCardApi* | [**apiV1LoyaltycardsTorrowIdUniquenamePut**](docs/LoyaltyCardApi.md#apiv1loyaltycardstorrowiduniquenameput) | **PUT** /api/v1/loyaltycards/{torrowId}/uniquename | 
*LoyaltyCardApi* | [**apiV1LoyaltycardsUniquenameUniqueNameGet**](docs/LoyaltyCardApi.md#apiv1loyaltycardsuniquenameuniquenameget) | **GET** /api/v1/loyaltycards/uniquename/{uniqueName} | 
*LoyaltySystemApi* | [**apiV1LoyaltysystemsPersonallistGet**](docs/LoyaltySystemApi.md#apiv1loyaltysystemspersonallistget) | **GET** /api/v1/loyaltysystems/personallist | 
*LoyaltySystemApi* | [**apiV1LoyaltysystemsPersonallistTorrowIdDelete**](docs/LoyaltySystemApi.md#apiv1loyaltysystemspersonallisttorrowiddelete) | **DELETE** /api/v1/loyaltysystems/personallist/{torrowId} | 
*LoyaltySystemApi* | [**apiV1LoyaltysystemsPersonallistUpdateorderPost**](docs/LoyaltySystemApi.md#apiv1loyaltysystemspersonallistupdateorderpost) | **POST** /api/v1/loyaltysystems/personallist/updateorder | 
*LoyaltySystemApi* | [**apiV1LoyaltysystemsPost**](docs/LoyaltySystemApi.md#apiv1loyaltysystemspost) | **POST** /api/v1/loyaltysystems | 
*LoyaltySystemApi* | [**apiV1LoyaltysystemsTorrowIdAliasPut**](docs/LoyaltySystemApi.md#apiv1loyaltysystemstorrowidaliasput) | **PUT** /api/v1/loyaltysystems/{torrowId}/alias | 
*LoyaltySystemApi* | [**apiV1LoyaltysystemsTorrowIdDelete**](docs/LoyaltySystemApi.md#apiv1loyaltysystemstorrowiddelete) | **DELETE** /api/v1/loyaltysystems/{torrowId} | 
*LoyaltySystemApi* | [**apiV1LoyaltysystemsTorrowIdGet**](docs/LoyaltySystemApi.md#apiv1loyaltysystemstorrowidget) | **GET** /api/v1/loyaltysystems/{torrowId} | 
*LoyaltySystemApi* | [**apiV1LoyaltysystemsTorrowIdGroupSetPut**](docs/LoyaltySystemApi.md#apiv1loyaltysystemstorrowidgroupsetput) | **PUT** /api/v1/loyaltysystems/{torrowId}/group/set | 
*LoyaltySystemApi* | [**apiV1LoyaltysystemsTorrowIdGroupUnsetPut**](docs/LoyaltySystemApi.md#apiv1loyaltysystemstorrowidgroupunsetput) | **PUT** /api/v1/loyaltysystems/{torrowId}/group/unset | 
*LoyaltySystemApi* | [**apiV1LoyaltysystemsTorrowIdImageIdPut**](docs/LoyaltySystemApi.md#apiv1loyaltysystemstorrowidimageidput) | **PUT** /api/v1/loyaltysystems/{torrowId}/image/id | 
*LoyaltySystemApi* | [**apiV1LoyaltysystemsTorrowIdImageInfoGet**](docs/LoyaltySystemApi.md#apiv1loyaltysystemstorrowidimageinfoget) | **GET** /api/v1/loyaltysystems/{torrowId}/image/info | 
*LoyaltySystemApi* | [**apiV1LoyaltysystemsTorrowIdImagePuturlGet**](docs/LoyaltySystemApi.md#apiv1loyaltysystemstorrowidimageputurlget) | **GET** /api/v1/loyaltysystems/{torrowId}/image/puturl | 
*LoyaltySystemApi* | [**apiV1LoyaltysystemsTorrowIdIntegrationsPut**](docs/LoyaltySystemApi.md#apiv1loyaltysystemstorrowidintegrationsput) | **PUT** /api/v1/loyaltysystems/{torrowId}/integrations | 
*LoyaltySystemApi* | [**apiV1LoyaltysystemsTorrowIdLastusagetimePut**](docs/LoyaltySystemApi.md#apiv1loyaltysystemstorrowidlastusagetimeput) | **PUT** /api/v1/loyaltysystems/{torrowId}/lastusagetime | 
*LoyaltySystemApi* | [**apiV1LoyaltysystemsTorrowIdMasterinfoPut**](docs/LoyaltySystemApi.md#apiv1loyaltysystemstorrowidmasterinfoput) | **PUT** /api/v1/loyaltysystems/{torrowId}/masterinfo | 
*LoyaltySystemApi* | [**apiV1LoyaltysystemsTorrowIdParticipantsCountGet**](docs/LoyaltySystemApi.md#apiv1loyaltysystemstorrowidparticipantscountget) | **GET** /api/v1/loyaltysystems/{torrowId}/participants/count | 
*LoyaltySystemApi* | [**apiV1LoyaltysystemsTorrowIdParticipantsGet**](docs/LoyaltySystemApi.md#apiv1loyaltysystemstorrowidparticipantsget) | **GET** /api/v1/loyaltysystems/{torrowId}/participants | 
*LoyaltySystemApi* | [**apiV1LoyaltysystemsTorrowIdParticipationDeclineaccessPut**](docs/LoyaltySystemApi.md#apiv1loyaltysystemstorrowidparticipationdeclineaccessput) | **PUT** /api/v1/loyaltysystems/{torrowId}/participation/declineaccess | 
*LoyaltySystemApi* | [**apiV1LoyaltysystemsTorrowIdParticipationGrantaccessPut**](docs/LoyaltySystemApi.md#apiv1loyaltysystemstorrowidparticipationgrantaccessput) | **PUT** /api/v1/loyaltysystems/{torrowId}/participation/grantaccess | 
*LoyaltySystemApi* | [**apiV1LoyaltysystemsTorrowIdParticipationProfileIdTypePut**](docs/LoyaltySystemApi.md#apiv1loyaltysystemstorrowidparticipationprofileidtypeput) | **PUT** /api/v1/loyaltysystems/{torrowId}/participation/{profileId}/type | 
*LoyaltySystemApi* | [**apiV1LoyaltysystemsTorrowIdParticipationProfilePut**](docs/LoyaltySystemApi.md#apiv1loyaltysystemstorrowidparticipationprofileput) | **PUT** /api/v1/loyaltysystems/{torrowId}/participation/profile | 
*LoyaltySystemApi* | [**apiV1LoyaltysystemsTorrowIdParticipationRejectPut**](docs/LoyaltySystemApi.md#apiv1loyaltysystemstorrowidparticipationrejectput) | **PUT** /api/v1/loyaltysystems/{torrowId}/participation/reject | 
*LoyaltySystemApi* | [**apiV1LoyaltysystemsTorrowIdParticipationRejectofferPut**](docs/LoyaltySystemApi.md#apiv1loyaltysystemstorrowidparticipationrejectofferput) | **PUT** /api/v1/loyaltysystems/{torrowId}/participation/rejectoffer | 
*LoyaltySystemApi* | [**apiV1LoyaltysystemsTorrowIdParticipationRequestaccessPut**](docs/LoyaltySystemApi.md#apiv1loyaltysystemstorrowidparticipationrequestaccessput) | **PUT** /api/v1/loyaltysystems/{torrowId}/participation/requestaccess | 
*LoyaltySystemApi* | [**apiV1LoyaltysystemsTorrowIdParticipationRevokeofferPut**](docs/LoyaltySystemApi.md#apiv1loyaltysystemstorrowidparticipationrevokeofferput) | **PUT** /api/v1/loyaltysystems/{torrowId}/participation/revokeoffer | 
*LoyaltySystemApi* | [**apiV1LoyaltysystemsTorrowIdParticipationRevokerequestPut**](docs/LoyaltySystemApi.md#apiv1loyaltysystemstorrowidparticipationrevokerequestput) | **PUT** /api/v1/loyaltysystems/{torrowId}/participation/revokerequest | 
*LoyaltySystemApi* | [**apiV1LoyaltysystemsTorrowIdParticipationSharePut**](docs/LoyaltySystemApi.md#apiv1loyaltysystemstorrowidparticipationshareput) | **PUT** /api/v1/loyaltysystems/{torrowId}/participation/share | 
*LoyaltySystemApi* | [**apiV1LoyaltysystemsTorrowIdPersonalsolutiondataPut**](docs/LoyaltySystemApi.md#apiv1loyaltysystemstorrowidpersonalsolutiondataput) | **PUT** /api/v1/loyaltysystems/{torrowId}/personalsolutiondata | 
*LoyaltySystemApi* | [**apiV1LoyaltysystemsTorrowIdPublicityPut**](docs/LoyaltySystemApi.md#apiv1loyaltysystemstorrowidpublicityput) | **PUT** /api/v1/loyaltysystems/{torrowId}/publicity | 
*LoyaltySystemApi* | [**apiV1LoyaltysystemsTorrowIdPut**](docs/LoyaltySystemApi.md#apiv1loyaltysystemstorrowidput) | **PUT** /api/v1/loyaltysystems/{torrowId} | 
*LoyaltySystemApi* | [**apiV1LoyaltysystemsTorrowIdSavetomindmapPut**](docs/LoyaltySystemApi.md#apiv1loyaltysystemstorrowidsavetomindmapput) | **PUT** /api/v1/loyaltysystems/{torrowId}/savetomindmap | 
*LoyaltySystemApi* | [**apiV1LoyaltysystemsTorrowIdSendlinkPut**](docs/LoyaltySystemApi.md#apiv1loyaltysystemstorrowidsendlinkput) | **PUT** /api/v1/loyaltysystems/{torrowId}/sendlink | 
*LoyaltySystemApi* | [**apiV1LoyaltysystemsTorrowIdShorturlPost**](docs/LoyaltySystemApi.md#apiv1loyaltysystemstorrowidshorturlpost) | **POST** /api/v1/loyaltysystems/{torrowId}/shorturl | 
*LoyaltySystemApi* | [**apiV1LoyaltysystemsTorrowIdSolutiondataPut**](docs/LoyaltySystemApi.md#apiv1loyaltysystemstorrowidsolutiondataput) | **PUT** /api/v1/loyaltysystems/{torrowId}/solutiondata | 
*LoyaltySystemApi* | [**apiV1LoyaltysystemsTorrowIdTagsPut**](docs/LoyaltySystemApi.md#apiv1loyaltysystemstorrowidtagsput) | **PUT** /api/v1/loyaltysystems/{torrowId}/tags | 
*LoyaltySystemApi* | [**apiV1LoyaltysystemsTorrowIdTorrowaccountIdPut**](docs/LoyaltySystemApi.md#apiv1loyaltysystemstorrowidtorrowaccountidput) | **PUT** /api/v1/loyaltysystems/{torrowId}/torrowaccount/id | 
*LoyaltySystemApi* | [**apiV1LoyaltysystemsTorrowIdUniquenamePut**](docs/LoyaltySystemApi.md#apiv1loyaltysystemstorrowiduniquenameput) | **PUT** /api/v1/loyaltysystems/{torrowId}/uniquename | 
*LoyaltySystemApi* | [**apiV1LoyaltysystemsUniquenameUniqueNameGet**](docs/LoyaltySystemApi.md#apiv1loyaltysystemsuniquenameuniquenameget) | **GET** /api/v1/loyaltysystems/uniquename/{uniqueName} | 
*NoteApi* | [**apiV1NotesExcludeFromgroupsPut**](docs/NoteApi.md#apiv1notesexcludefromgroupsput) | **PUT** /api/v1/notes/exclude/fromgroups | 
*NoteApi* | [**apiV1NotesIncludeTogroupsPut**](docs/NoteApi.md#apiv1notesincludetogroupsput) | **PUT** /api/v1/notes/include/togroups | 
*NoteApi* | [**apiV1NotesItemIdAliasPut**](docs/NoteApi.md#apiv1notesitemidaliasput) | **PUT** /api/v1/notes/{itemId}/alias | 
*NoteApi* | [**apiV1NotesItemIdBlockPost**](docs/NoteApi.md#apiv1notesitemidblockpost) | **POST** /api/v1/notes/{itemId}/block | 
*NoteApi* | [**apiV1NotesItemIdLastusagetimePut**](docs/NoteApi.md#apiv1notesitemidlastusagetimeput) | **PUT** /api/v1/notes/{itemId}/lastusagetime | 
*NoteApi* | [**apiV1NotesItemIdNotificationwaylistPut**](docs/NoteApi.md#apiv1notesitemidnotificationwaylistput) | **PUT** /api/v1/notes/{itemId}/notificationwaylist | 
*NoteApi* | [**apiV1NotesItemIdOfflinablePut**](docs/NoteApi.md#apiv1notesitemidofflinableput) | **PUT** /api/v1/notes/{itemId}/offlinable | 
*NoteApi* | [**apiV1NotesItemIdParticipationProfilePut**](docs/NoteApi.md#apiv1notesitemidparticipationprofileput) | **PUT** /api/v1/notes/{itemId}/participation/profile | 
*NoteApi* | [**apiV1NotesItemIdPersonalsolutiondataPut**](docs/NoteApi.md#apiv1notesitemidpersonalsolutiondataput) | **PUT** /api/v1/notes/{itemId}/personalsolutiondata | 
*NoteApi* | [**apiV1NotesItemIdRemindersPut**](docs/NoteApi.md#apiv1notesitemidremindersput) | **PUT** /api/v1/notes/{itemId}/reminders | 
*NoteApi* | [**apiV1NotesItemIdSendlinkPut**](docs/NoteApi.md#apiv1notesitemidsendlinkput) | **PUT** /api/v1/notes/{itemId}/sendlink | 
*NoteApi* | [**apiV1NotesItemIdUnblockPost**](docs/NoteApi.md#apiv1notesitemidunblockpost) | **POST** /api/v1/notes/{itemId}/unblock | 
*NoteApi* | [**apiV1NotesItemIdUniquenamePut**](docs/NoteApi.md#apiv1notesitemiduniquenameput) | **PUT** /api/v1/notes/{itemId}/uniquename | 
*NoteApi* | [**apiV1NotesParentIdExcludeFromuserPut**](docs/NoteApi.md#apiv1notesparentidexcludefromuserput) | **PUT** /api/v1/notes/{parentId}/exclude/fromuser | 
*NoteApi* | [**apiV1NotesParentIdExcludeItemsPut**](docs/NoteApi.md#apiv1notesparentidexcludeitemsput) | **PUT** /api/v1/notes/{parentId}/exclude/items | 
*NoteApi* | [**apiV1NotesParentIdIncludeForuserPut**](docs/NoteApi.md#apiv1notesparentidincludeforuserput) | **PUT** /api/v1/notes/{parentId}/include/foruser | 
*NoteApi* | [**apiV1NotesParentIdIncludeItemsPut**](docs/NoteApi.md#apiv1notesparentidincludeitemsput) | **PUT** /api/v1/notes/{parentId}/include/items | 
*NoteApi* | [**apiV1NotesPersonallistGet**](docs/NoteApi.md#apiv1notespersonallistget) | **GET** /api/v1/notes/personallist | 
*NoteApi* | [**apiV1NotesPersonallistItemIdDelete**](docs/NoteApi.md#apiv1notespersonallistitemiddelete) | **DELETE** /api/v1/notes/personallist/{itemId} | 
*NoteApi* | [**apiV1NotesPersonallistUpdateorderPost**](docs/NoteApi.md#apiv1notespersonallistupdateorderpost) | **POST** /api/v1/notes/personallist/updateorder | 
*NoteApi* | [**apiV1NotesPost**](docs/NoteApi.md#apiv1notespost) | **POST** /api/v1/notes | 
*NoteApi* | [**apiV1NotesTorrowIdDelete**](docs/NoteApi.md#apiv1notestorrowiddelete) | **DELETE** /api/v1/notes/{torrowId} | 
*NoteApi* | [**apiV1NotesTorrowIdFeedbacksOptionsPut**](docs/NoteApi.md#apiv1notestorrowidfeedbacksoptionsput) | **PUT** /api/v1/notes/{torrowId}/feedbacks/options | 
*NoteApi* | [**apiV1NotesTorrowIdFileInfoGet**](docs/NoteApi.md#apiv1notestorrowidfileinfoget) | **GET** /api/v1/notes/{torrowId}/file/info | 
*NoteApi* | [**apiV1NotesTorrowIdFilePuturlGet**](docs/NoteApi.md#apiv1notestorrowidfileputurlget) | **GET** /api/v1/notes/{torrowId}/file/puturl | 
*NoteApi* | [**apiV1NotesTorrowIdGet**](docs/NoteApi.md#apiv1notestorrowidget) | **GET** /api/v1/notes/{torrowId} | 
*NoteApi* | [**apiV1NotesTorrowIdGroupListGet**](docs/NoteApi.md#apiv1notestorrowidgrouplistget) | **GET** /api/v1/notes/{torrowId}/group/list | 
*NoteApi* | [**apiV1NotesTorrowIdGroupSetPut**](docs/NoteApi.md#apiv1notestorrowidgroupsetput) | **PUT** /api/v1/notes/{torrowId}/group/set | 
*NoteApi* | [**apiV1NotesTorrowIdGroupUnsetPut**](docs/NoteApi.md#apiv1notestorrowidgroupunsetput) | **PUT** /api/v1/notes/{torrowId}/group/unset | 
*NoteApi* | [**apiV1NotesTorrowIdGroupsGet**](docs/NoteApi.md#apiv1notestorrowidgroupsget) | **GET** /api/v1/notes/{torrowId}/groups | 
*NoteApi* | [**apiV1NotesTorrowIdImageIdPut**](docs/NoteApi.md#apiv1notestorrowidimageidput) | **PUT** /api/v1/notes/{torrowId}/image/id | 
*NoteApi* | [**apiV1NotesTorrowIdImageInfoGet**](docs/NoteApi.md#apiv1notestorrowidimageinfoget) | **GET** /api/v1/notes/{torrowId}/image/info | 
*NoteApi* | [**apiV1NotesTorrowIdImagePuturlGet**](docs/NoteApi.md#apiv1notestorrowidimageputurlget) | **GET** /api/v1/notes/{torrowId}/image/puturl | 
*NoteApi* | [**apiV1NotesTorrowIdIntegrationsPut**](docs/NoteApi.md#apiv1notestorrowidintegrationsput) | **PUT** /api/v1/notes/{torrowId}/integrations | 
*NoteApi* | [**apiV1NotesTorrowIdMasterinfoPut**](docs/NoteApi.md#apiv1notestorrowidmasterinfoput) | **PUT** /api/v1/notes/{torrowId}/masterinfo | 
*NoteApi* | [**apiV1NotesTorrowIdParticipantsAnonymousGet**](docs/NoteApi.md#apiv1notestorrowidparticipantsanonymousget) | **GET** /api/v1/notes/{torrowId}/participants/anonymous | 
*NoteApi* | [**apiV1NotesTorrowIdParticipantsGet**](docs/NoteApi.md#apiv1notestorrowidparticipantsget) | **GET** /api/v1/notes/{torrowId}/participants | 
*NoteApi* | [**apiV1NotesTorrowIdParticipantsNonanonymousGet**](docs/NoteApi.md#apiv1notestorrowidparticipantsnonanonymousget) | **GET** /api/v1/notes/{torrowId}/participants/nonanonymous | 
*NoteApi* | [**apiV1NotesTorrowIdParticipationDeclineaccessPut**](docs/NoteApi.md#apiv1notestorrowidparticipationdeclineaccessput) | **PUT** /api/v1/notes/{torrowId}/participation/declineaccess | 
*NoteApi* | [**apiV1NotesTorrowIdParticipationGrantaccessPut**](docs/NoteApi.md#apiv1notestorrowidparticipationgrantaccessput) | **PUT** /api/v1/notes/{torrowId}/participation/grantaccess | 
*NoteApi* | [**apiV1NotesTorrowIdParticipationParticipantProfileIdTypePut**](docs/NoteApi.md#apiv1notestorrowidparticipationparticipantprofileidtypeput) | **PUT** /api/v1/notes/{torrowId}/participation/{participantProfileId}/type | 
*NoteApi* | [**apiV1NotesTorrowIdParticipationRejectPut**](docs/NoteApi.md#apiv1notestorrowidparticipationrejectput) | **PUT** /api/v1/notes/{torrowId}/participation/reject | 
*NoteApi* | [**apiV1NotesTorrowIdParticipationRejectofferPut**](docs/NoteApi.md#apiv1notestorrowidparticipationrejectofferput) | **PUT** /api/v1/notes/{torrowId}/participation/rejectoffer | 
*NoteApi* | [**apiV1NotesTorrowIdParticipationRequestaccessPut**](docs/NoteApi.md#apiv1notestorrowidparticipationrequestaccessput) | **PUT** /api/v1/notes/{torrowId}/participation/requestaccess | 
*NoteApi* | [**apiV1NotesTorrowIdParticipationRevokeofferPut**](docs/NoteApi.md#apiv1notestorrowidparticipationrevokeofferput) | **PUT** /api/v1/notes/{torrowId}/participation/revokeoffer | 
*NoteApi* | [**apiV1NotesTorrowIdParticipationRevokerequestPut**](docs/NoteApi.md#apiv1notestorrowidparticipationrevokerequestput) | **PUT** /api/v1/notes/{torrowId}/participation/revokerequest | 
*NoteApi* | [**apiV1NotesTorrowIdParticipationSharePut**](docs/NoteApi.md#apiv1notestorrowidparticipationshareput) | **PUT** /api/v1/notes/{torrowId}/participation/share | 
*NoteApi* | [**apiV1NotesTorrowIdParticipationShareitemlinkPost**](docs/NoteApi.md#apiv1notestorrowidparticipationshareitemlinkpost) | **POST** /api/v1/notes/{torrowId}/participation/shareitemlink | 
*NoteApi* | [**apiV1NotesTorrowIdPublicityPut**](docs/NoteApi.md#apiv1notestorrowidpublicityput) | **PUT** /api/v1/notes/{torrowId}/publicity | 
*NoteApi* | [**apiV1NotesTorrowIdPut**](docs/NoteApi.md#apiv1notestorrowidput) | **PUT** /api/v1/notes/{torrowId} | 
*NoteApi* | [**apiV1NotesTorrowIdSavetomindmapPut**](docs/NoteApi.md#apiv1notestorrowidsavetomindmapput) | **PUT** /api/v1/notes/{torrowId}/savetomindmap | 
*NoteApi* | [**apiV1NotesTorrowIdShorturlPost**](docs/NoteApi.md#apiv1notestorrowidshorturlpost) | **POST** /api/v1/notes/{torrowId}/shorturl | 
*NoteApi* | [**apiV1NotesTorrowIdSolutiondataPut**](docs/NoteApi.md#apiv1notestorrowidsolutiondataput) | **PUT** /api/v1/notes/{torrowId}/solutiondata | 
*NoteApi* | [**apiV1NotesTorrowIdTagsGet**](docs/NoteApi.md#apiv1notestorrowidtagsget) | **GET** /api/v1/notes/{torrowId}/tags | 
*NoteApi* | [**apiV1NotesTorrowIdTagsPut**](docs/NoteApi.md#apiv1notestorrowidtagsput) | **PUT** /api/v1/notes/{torrowId}/tags | 
*NoteApi* | [**apiV1NotesTorrowIdTorrowaccountIdPut**](docs/NoteApi.md#apiv1notestorrowidtorrowaccountidput) | **PUT** /api/v1/notes/{torrowId}/torrowaccount/id | 
*NoteApi* | [**apiV1NotesTorrowIdUpdategroupsPut**](docs/NoteApi.md#apiv1notestorrowidupdategroupsput) | **PUT** /api/v1/notes/{torrowId}/updategroups | 
*NoteApi* | [**apiV1NotesUniquenameUniquenameGet**](docs/NoteApi.md#apiv1notesuniquenameuniquenameget) | **GET** /api/v1/notes/uniquename/{uniquename} | 
*NoteViewApi* | [**apiV1NotesParentIdViewsPinnedChildIdDelete**](docs/NoteViewApi.md#apiv1notesparentidviewspinnedchildiddelete) | **DELETE** /api/v1/notes/{parentId}/views/pinned/{childId} | 
*NoteViewApi* | [**apiV1NotesParentIdViewsPinnedChildIdGet**](docs/NoteViewApi.md#apiv1notesparentidviewspinnedchildidget) | **GET** /api/v1/notes/{parentId}/views/pinned/{childId} | 
*NoteViewApi* | [**apiV1NotesParentIdViewsPinnedGet**](docs/NoteViewApi.md#apiv1notesparentidviewspinnedget) | **GET** /api/v1/notes/{parentId}/views/pinned | 
*NoteViewApi* | [**apiV1NotesParentIdViewsPinnedPost**](docs/NoteViewApi.md#apiv1notesparentidviewspinnedpost) | **POST** /api/v1/notes/{parentId}/views/pinned | 
*NoteViewApi* | [**apiV1NotesParentIdViewsPinnedUpdateorderPost**](docs/NoteViewApi.md#apiv1notesparentidviewspinnedupdateorderpost) | **POST** /api/v1/notes/{parentId}/views/pinned/updateorder | 
*NoteViewApi* | [**apiV1NotesParentIdViewsUserChildIdDelete**](docs/NoteViewApi.md#apiv1notesparentidviewsuserchildiddelete) | **DELETE** /api/v1/notes/{parentId}/views/user/{childId} | 
*NoteViewApi* | [**apiV1NotesParentIdViewsUserChildIdGet**](docs/NoteViewApi.md#apiv1notesparentidviewsuserchildidget) | **GET** /api/v1/notes/{parentId}/views/user/{childId} | 
*NoteViewApi* | [**apiV1NotesParentIdViewsUserChildIdPinPost**](docs/NoteViewApi.md#apiv1notesparentidviewsuserchildidpinpost) | **POST** /api/v1/notes/{parentId}/views/user/{childId}/pin | 
*NoteViewApi* | [**apiV1NotesParentIdViewsUserChildIdUnpinPost**](docs/NoteViewApi.md#apiv1notesparentidviewsuserchildidunpinpost) | **POST** /api/v1/notes/{parentId}/views/user/{childId}/unpin | 
*NoteViewApi* | [**apiV1NotesParentIdViewsUserGet**](docs/NoteViewApi.md#apiv1notesparentidviewsuserget) | **GET** /api/v1/notes/{parentId}/views/user | 
*NoteViewApi* | [**apiV1NotesParentIdViewsUserPost**](docs/NoteViewApi.md#apiv1notesparentidviewsuserpost) | **POST** /api/v1/notes/{parentId}/views/user | 
*NoteViewApi* | [**apiV1NotesParentIdViewsUserUpdateorderPost**](docs/NoteViewApi.md#apiv1notesparentidviewsuserupdateorderpost) | **POST** /api/v1/notes/{parentId}/views/user/updateorder | 
*NoteViewApi* | [**apiV1NotesViewsUserGet**](docs/NoteViewApi.md#apiv1notesviewsuserget) | **GET** /api/v1/notes/views/user | 
*ReportApi* | [**apiV1ReportsPost**](docs/ReportApi.md#apiv1reportspost) | **POST** /api/v1/reports | 
*ReportApi* | [**apiV1ReportsProfileIdPost**](docs/ReportApi.md#apiv1reportsprofileidpost) | **POST** /api/v1/reports/{profileId} | 
*ResourceApi* | [**apiV1ResourcesExcludeFromgroupsPut**](docs/ResourceApi.md#apiv1resourcesexcludefromgroupsput) | **PUT** /api/v1/resources/exclude/fromgroups | 
*ResourceApi* | [**apiV1ResourcesIncludeTogroupsPut**](docs/ResourceApi.md#apiv1resourcesincludetogroupsput) | **PUT** /api/v1/resources/include/togroups | 
*ResourceApi* | [**apiV1ResourcesItemIdAliasPut**](docs/ResourceApi.md#apiv1resourcesitemidaliasput) | **PUT** /api/v1/resources/{itemId}/alias | 
*ResourceApi* | [**apiV1ResourcesItemIdBlockPost**](docs/ResourceApi.md#apiv1resourcesitemidblockpost) | **POST** /api/v1/resources/{itemId}/block | 
*ResourceApi* | [**apiV1ResourcesItemIdLastusagetimePut**](docs/ResourceApi.md#apiv1resourcesitemidlastusagetimeput) | **PUT** /api/v1/resources/{itemId}/lastusagetime | 
*ResourceApi* | [**apiV1ResourcesItemIdNotificationwaylistPut**](docs/ResourceApi.md#apiv1resourcesitemidnotificationwaylistput) | **PUT** /api/v1/resources/{itemId}/notificationwaylist | 
*ResourceApi* | [**apiV1ResourcesItemIdOfflinablePut**](docs/ResourceApi.md#apiv1resourcesitemidofflinableput) | **PUT** /api/v1/resources/{itemId}/offlinable | 
*ResourceApi* | [**apiV1ResourcesItemIdParticipationProfilePut**](docs/ResourceApi.md#apiv1resourcesitemidparticipationprofileput) | **PUT** /api/v1/resources/{itemId}/participation/profile | 
*ResourceApi* | [**apiV1ResourcesItemIdPersonalsolutiondataPut**](docs/ResourceApi.md#apiv1resourcesitemidpersonalsolutiondataput) | **PUT** /api/v1/resources/{itemId}/personalsolutiondata | 
*ResourceApi* | [**apiV1ResourcesItemIdRemindersPut**](docs/ResourceApi.md#apiv1resourcesitemidremindersput) | **PUT** /api/v1/resources/{itemId}/reminders | 
*ResourceApi* | [**apiV1ResourcesItemIdSendlinkPut**](docs/ResourceApi.md#apiv1resourcesitemidsendlinkput) | **PUT** /api/v1/resources/{itemId}/sendlink | 
*ResourceApi* | [**apiV1ResourcesItemIdUnblockPost**](docs/ResourceApi.md#apiv1resourcesitemidunblockpost) | **POST** /api/v1/resources/{itemId}/unblock | 
*ResourceApi* | [**apiV1ResourcesItemIdUniquenamePut**](docs/ResourceApi.md#apiv1resourcesitemiduniquenameput) | **PUT** /api/v1/resources/{itemId}/uniquename | 
*ResourceApi* | [**apiV1ResourcesParentIdExcludeFromuserPut**](docs/ResourceApi.md#apiv1resourcesparentidexcludefromuserput) | **PUT** /api/v1/resources/{parentId}/exclude/fromuser | 
*ResourceApi* | [**apiV1ResourcesParentIdExcludeItemsPut**](docs/ResourceApi.md#apiv1resourcesparentidexcludeitemsput) | **PUT** /api/v1/resources/{parentId}/exclude/items | 
*ResourceApi* | [**apiV1ResourcesParentIdIncludeForuserPut**](docs/ResourceApi.md#apiv1resourcesparentidincludeforuserput) | **PUT** /api/v1/resources/{parentId}/include/foruser | 
*ResourceApi* | [**apiV1ResourcesParentIdIncludeItemsPut**](docs/ResourceApi.md#apiv1resourcesparentidincludeitemsput) | **PUT** /api/v1/resources/{parentId}/include/items | 
*ResourceApi* | [**apiV1ResourcesPersonallistGet**](docs/ResourceApi.md#apiv1resourcespersonallistget) | **GET** /api/v1/resources/personallist | 
*ResourceApi* | [**apiV1ResourcesPersonallistItemIdDelete**](docs/ResourceApi.md#apiv1resourcespersonallistitemiddelete) | **DELETE** /api/v1/resources/personallist/{itemId} | 
*ResourceApi* | [**apiV1ResourcesPersonallistUpdateorderPost**](docs/ResourceApi.md#apiv1resourcespersonallistupdateorderpost) | **POST** /api/v1/resources/personallist/updateorder | 
*ResourceApi* | [**apiV1ResourcesPost**](docs/ResourceApi.md#apiv1resourcespost) | **POST** /api/v1/resources | 
*ResourceApi* | [**apiV1ResourcesResourceIdPickorderPost**](docs/ResourceApi.md#apiv1resourcesresourceidpickorderpost) | **POST** /api/v1/resources/{resourceId}/pickorder | 
*ResourceApi* | [**apiV1ResourcesResourceIdReturnorderPost**](docs/ResourceApi.md#apiv1resourcesresourceidreturnorderpost) | **POST** /api/v1/resources/{resourceId}/returnorder | 
*ResourceApi* | [**apiV1ResourcesTorrowIdDelete**](docs/ResourceApi.md#apiv1resourcestorrowiddelete) | **DELETE** /api/v1/resources/{torrowId} | 
*ResourceApi* | [**apiV1ResourcesTorrowIdFeedbacksOptionsPut**](docs/ResourceApi.md#apiv1resourcestorrowidfeedbacksoptionsput) | **PUT** /api/v1/resources/{torrowId}/feedbacks/options | 
*ResourceApi* | [**apiV1ResourcesTorrowIdGet**](docs/ResourceApi.md#apiv1resourcestorrowidget) | **GET** /api/v1/resources/{torrowId} | 
*ResourceApi* | [**apiV1ResourcesTorrowIdGroupListGet**](docs/ResourceApi.md#apiv1resourcestorrowidgrouplistget) | **GET** /api/v1/resources/{torrowId}/group/list | 
*ResourceApi* | [**apiV1ResourcesTorrowIdGroupSetPut**](docs/ResourceApi.md#apiv1resourcestorrowidgroupsetput) | **PUT** /api/v1/resources/{torrowId}/group/set | 
*ResourceApi* | [**apiV1ResourcesTorrowIdGroupUnsetPut**](docs/ResourceApi.md#apiv1resourcestorrowidgroupunsetput) | **PUT** /api/v1/resources/{torrowId}/group/unset | 
*ResourceApi* | [**apiV1ResourcesTorrowIdGroupsGet**](docs/ResourceApi.md#apiv1resourcestorrowidgroupsget) | **GET** /api/v1/resources/{torrowId}/groups | 
*ResourceApi* | [**apiV1ResourcesTorrowIdImageIdPut**](docs/ResourceApi.md#apiv1resourcestorrowidimageidput) | **PUT** /api/v1/resources/{torrowId}/image/id | 
*ResourceApi* | [**apiV1ResourcesTorrowIdImageInfoGet**](docs/ResourceApi.md#apiv1resourcestorrowidimageinfoget) | **GET** /api/v1/resources/{torrowId}/image/info | 
*ResourceApi* | [**apiV1ResourcesTorrowIdImagePuturlGet**](docs/ResourceApi.md#apiv1resourcestorrowidimageputurlget) | **GET** /api/v1/resources/{torrowId}/image/puturl | 
*ResourceApi* | [**apiV1ResourcesTorrowIdIntegrationsPut**](docs/ResourceApi.md#apiv1resourcestorrowidintegrationsput) | **PUT** /api/v1/resources/{torrowId}/integrations | 
*ResourceApi* | [**apiV1ResourcesTorrowIdMasterinfoPut**](docs/ResourceApi.md#apiv1resourcestorrowidmasterinfoput) | **PUT** /api/v1/resources/{torrowId}/masterinfo | 
*ResourceApi* | [**apiV1ResourcesTorrowIdParticipantsAnonymousGet**](docs/ResourceApi.md#apiv1resourcestorrowidparticipantsanonymousget) | **GET** /api/v1/resources/{torrowId}/participants/anonymous | 
*ResourceApi* | [**apiV1ResourcesTorrowIdParticipantsGet**](docs/ResourceApi.md#apiv1resourcestorrowidparticipantsget) | **GET** /api/v1/resources/{torrowId}/participants | 
*ResourceApi* | [**apiV1ResourcesTorrowIdParticipantsNonanonymousGet**](docs/ResourceApi.md#apiv1resourcestorrowidparticipantsnonanonymousget) | **GET** /api/v1/resources/{torrowId}/participants/nonanonymous | 
*ResourceApi* | [**apiV1ResourcesTorrowIdParticipationDeclineaccessPut**](docs/ResourceApi.md#apiv1resourcestorrowidparticipationdeclineaccessput) | **PUT** /api/v1/resources/{torrowId}/participation/declineaccess | 
*ResourceApi* | [**apiV1ResourcesTorrowIdParticipationGrantaccessPut**](docs/ResourceApi.md#apiv1resourcestorrowidparticipationgrantaccessput) | **PUT** /api/v1/resources/{torrowId}/participation/grantaccess | 
*ResourceApi* | [**apiV1ResourcesTorrowIdParticipationParticipantProfileIdTypePut**](docs/ResourceApi.md#apiv1resourcestorrowidparticipationparticipantprofileidtypeput) | **PUT** /api/v1/resources/{torrowId}/participation/{participantProfileId}/type | 
*ResourceApi* | [**apiV1ResourcesTorrowIdParticipationRejectPut**](docs/ResourceApi.md#apiv1resourcestorrowidparticipationrejectput) | **PUT** /api/v1/resources/{torrowId}/participation/reject | 
*ResourceApi* | [**apiV1ResourcesTorrowIdParticipationRejectofferPut**](docs/ResourceApi.md#apiv1resourcestorrowidparticipationrejectofferput) | **PUT** /api/v1/resources/{torrowId}/participation/rejectoffer | 
*ResourceApi* | [**apiV1ResourcesTorrowIdParticipationRequestaccessPut**](docs/ResourceApi.md#apiv1resourcestorrowidparticipationrequestaccessput) | **PUT** /api/v1/resources/{torrowId}/participation/requestaccess | 
*ResourceApi* | [**apiV1ResourcesTorrowIdParticipationRevokeofferPut**](docs/ResourceApi.md#apiv1resourcestorrowidparticipationrevokeofferput) | **PUT** /api/v1/resources/{torrowId}/participation/revokeoffer | 
*ResourceApi* | [**apiV1ResourcesTorrowIdParticipationRevokerequestPut**](docs/ResourceApi.md#apiv1resourcestorrowidparticipationrevokerequestput) | **PUT** /api/v1/resources/{torrowId}/participation/revokerequest | 
*ResourceApi* | [**apiV1ResourcesTorrowIdParticipationSharePut**](docs/ResourceApi.md#apiv1resourcestorrowidparticipationshareput) | **PUT** /api/v1/resources/{torrowId}/participation/share | 
*ResourceApi* | [**apiV1ResourcesTorrowIdParticipationShareitemlinkPost**](docs/ResourceApi.md#apiv1resourcestorrowidparticipationshareitemlinkpost) | **POST** /api/v1/resources/{torrowId}/participation/shareitemlink | 
*ResourceApi* | [**apiV1ResourcesTorrowIdPublicityPut**](docs/ResourceApi.md#apiv1resourcestorrowidpublicityput) | **PUT** /api/v1/resources/{torrowId}/publicity | 
*ResourceApi* | [**apiV1ResourcesTorrowIdPut**](docs/ResourceApi.md#apiv1resourcestorrowidput) | **PUT** /api/v1/resources/{torrowId} | 
*ResourceApi* | [**apiV1ResourcesTorrowIdSavetomindmapPut**](docs/ResourceApi.md#apiv1resourcestorrowidsavetomindmapput) | **PUT** /api/v1/resources/{torrowId}/savetomindmap | 
*ResourceApi* | [**apiV1ResourcesTorrowIdShorturlPost**](docs/ResourceApi.md#apiv1resourcestorrowidshorturlpost) | **POST** /api/v1/resources/{torrowId}/shorturl | 
*ResourceApi* | [**apiV1ResourcesTorrowIdSolutiondataPut**](docs/ResourceApi.md#apiv1resourcestorrowidsolutiondataput) | **PUT** /api/v1/resources/{torrowId}/solutiondata | 
*ResourceApi* | [**apiV1ResourcesTorrowIdTagsGet**](docs/ResourceApi.md#apiv1resourcestorrowidtagsget) | **GET** /api/v1/resources/{torrowId}/tags | 
*ResourceApi* | [**apiV1ResourcesTorrowIdTagsPut**](docs/ResourceApi.md#apiv1resourcestorrowidtagsput) | **PUT** /api/v1/resources/{torrowId}/tags | 
*ResourceApi* | [**apiV1ResourcesTorrowIdTimetablePut**](docs/ResourceApi.md#apiv1resourcestorrowidtimetableput) | **PUT** /api/v1/resources/{torrowId}/timetable | 
*ResourceApi* | [**apiV1ResourcesTorrowIdTorrowaccountIdPut**](docs/ResourceApi.md#apiv1resourcestorrowidtorrowaccountidput) | **PUT** /api/v1/resources/{torrowId}/torrowaccount/id | 
*ResourceApi* | [**apiV1ResourcesTorrowIdUpdategroupsPut**](docs/ResourceApi.md#apiv1resourcestorrowidupdategroupsput) | **PUT** /api/v1/resources/{torrowId}/updategroups | 
*ResourceApi* | [**apiV1ResourcesTorrowIdWorkloadGet**](docs/ResourceApi.md#apiv1resourcestorrowidworkloadget) | **GET** /api/v1/resources/{torrowId}/workload | 
*ResourceApi* | [**apiV1ResourcesUniquenameUniquenameGet**](docs/ResourceApi.md#apiv1resourcesuniquenameuniquenameget) | **GET** /api/v1/resources/uniquename/{uniquename} | 
*ResourceViewApi* | [**apiV1ResourcesParentIdViewsPinnedChildIdDelete**](docs/ResourceViewApi.md#apiv1resourcesparentidviewspinnedchildiddelete) | **DELETE** /api/v1/resources/{parentId}/views/pinned/{childId} | 
*ResourceViewApi* | [**apiV1ResourcesParentIdViewsPinnedChildIdGet**](docs/ResourceViewApi.md#apiv1resourcesparentidviewspinnedchildidget) | **GET** /api/v1/resources/{parentId}/views/pinned/{childId} | 
*ResourceViewApi* | [**apiV1ResourcesParentIdViewsPinnedGet**](docs/ResourceViewApi.md#apiv1resourcesparentidviewspinnedget) | **GET** /api/v1/resources/{parentId}/views/pinned | 
*ResourceViewApi* | [**apiV1ResourcesParentIdViewsPinnedPost**](docs/ResourceViewApi.md#apiv1resourcesparentidviewspinnedpost) | **POST** /api/v1/resources/{parentId}/views/pinned | 
*ResourceViewApi* | [**apiV1ResourcesParentIdViewsPinnedUpdateorderPost**](docs/ResourceViewApi.md#apiv1resourcesparentidviewspinnedupdateorderpost) | **POST** /api/v1/resources/{parentId}/views/pinned/updateorder | 
*ResourceViewApi* | [**apiV1ResourcesParentIdViewsUserChildIdDelete**](docs/ResourceViewApi.md#apiv1resourcesparentidviewsuserchildiddelete) | **DELETE** /api/v1/resources/{parentId}/views/user/{childId} | 
*ResourceViewApi* | [**apiV1ResourcesParentIdViewsUserChildIdGet**](docs/ResourceViewApi.md#apiv1resourcesparentidviewsuserchildidget) | **GET** /api/v1/resources/{parentId}/views/user/{childId} | 
*ResourceViewApi* | [**apiV1ResourcesParentIdViewsUserChildIdPinPost**](docs/ResourceViewApi.md#apiv1resourcesparentidviewsuserchildidpinpost) | **POST** /api/v1/resources/{parentId}/views/user/{childId}/pin | 
*ResourceViewApi* | [**apiV1ResourcesParentIdViewsUserChildIdUnpinPost**](docs/ResourceViewApi.md#apiv1resourcesparentidviewsuserchildidunpinpost) | **POST** /api/v1/resources/{parentId}/views/user/{childId}/unpin | 
*ResourceViewApi* | [**apiV1ResourcesParentIdViewsUserGet**](docs/ResourceViewApi.md#apiv1resourcesparentidviewsuserget) | **GET** /api/v1/resources/{parentId}/views/user | 
*ResourceViewApi* | [**apiV1ResourcesParentIdViewsUserPost**](docs/ResourceViewApi.md#apiv1resourcesparentidviewsuserpost) | **POST** /api/v1/resources/{parentId}/views/user | 
*ResourceViewApi* | [**apiV1ResourcesParentIdViewsUserUpdateorderPost**](docs/ResourceViewApi.md#apiv1resourcesparentidviewsuserupdateorderpost) | **POST** /api/v1/resources/{parentId}/views/user/updateorder | 
*ResourceViewApi* | [**apiV1ResourcesViewsUserGet**](docs/ResourceViewApi.md#apiv1resourcesviewsuserget) | **GET** /api/v1/resources/views/user | 
*SearchApi* | [**apiV1SearchAdviseditemsGet**](docs/SearchApi.md#apiv1searchadviseditemsget) | **GET** /api/v1/search/adviseditems | 
*SearchApi* | [**apiV1SearchCalendarsGet**](docs/SearchApi.md#apiv1searchcalendarsget) | **GET** /api/v1/search/calendars | 
*SearchApi* | [**apiV1SearchCasesGet**](docs/SearchApi.md#apiv1searchcasesget) | **GET** /api/v1/search/cases | 
*SearchApi* | [**apiV1SearchContactsGet**](docs/SearchApi.md#apiv1searchcontactsget) | **GET** /api/v1/search/contacts | 
*SearchApi* | [**apiV1SearchNotesGet**](docs/SearchApi.md#apiv1searchnotesget) | **GET** /api/v1/search/notes | 
*SearchApi* | [**apiV1SearchResourcesGet**](docs/SearchApi.md#apiv1searchresourcesget) | **GET** /api/v1/search/resources | 
*SearchApi* | [**apiV1SearchServicesGet**](docs/SearchApi.md#apiv1searchservicesget) | **GET** /api/v1/search/services | 
*SearchApi* | [**apiV1SearchTorrowIdOrdersPut**](docs/SearchApi.md#apiv1searchtorrowidordersput) | **PUT** /api/v1/search/{torrowId}/orders | 
*ServiceApi* | [**apiV1ServicesExcludeFromgroupsPut**](docs/ServiceApi.md#apiv1servicesexcludefromgroupsput) | **PUT** /api/v1/services/exclude/fromgroups | 
*ServiceApi* | [**apiV1ServicesIncludeTogroupsPut**](docs/ServiceApi.md#apiv1servicesincludetogroupsput) | **PUT** /api/v1/services/include/togroups | 
*ServiceApi* | [**apiV1ServicesItemIdAliasPut**](docs/ServiceApi.md#apiv1servicesitemidaliasput) | **PUT** /api/v1/services/{itemId}/alias | 
*ServiceApi* | [**apiV1ServicesItemIdBlockPost**](docs/ServiceApi.md#apiv1servicesitemidblockpost) | **POST** /api/v1/services/{itemId}/block | 
*ServiceApi* | [**apiV1ServicesItemIdLastusagetimePut**](docs/ServiceApi.md#apiv1servicesitemidlastusagetimeput) | **PUT** /api/v1/services/{itemId}/lastusagetime | 
*ServiceApi* | [**apiV1ServicesItemIdNotificationwaylistPut**](docs/ServiceApi.md#apiv1servicesitemidnotificationwaylistput) | **PUT** /api/v1/services/{itemId}/notificationwaylist | 
*ServiceApi* | [**apiV1ServicesItemIdOfflinablePut**](docs/ServiceApi.md#apiv1servicesitemidofflinableput) | **PUT** /api/v1/services/{itemId}/offlinable | 
*ServiceApi* | [**apiV1ServicesItemIdParticipationProfilePut**](docs/ServiceApi.md#apiv1servicesitemidparticipationprofileput) | **PUT** /api/v1/services/{itemId}/participation/profile | 
*ServiceApi* | [**apiV1ServicesItemIdPersonalsolutiondataPut**](docs/ServiceApi.md#apiv1servicesitemidpersonalsolutiondataput) | **PUT** /api/v1/services/{itemId}/personalsolutiondata | 
*ServiceApi* | [**apiV1ServicesItemIdRemindersPut**](docs/ServiceApi.md#apiv1servicesitemidremindersput) | **PUT** /api/v1/services/{itemId}/reminders | 
*ServiceApi* | [**apiV1ServicesItemIdSendlinkPut**](docs/ServiceApi.md#apiv1servicesitemidsendlinkput) | **PUT** /api/v1/services/{itemId}/sendlink | 
*ServiceApi* | [**apiV1ServicesItemIdUnblockPost**](docs/ServiceApi.md#apiv1servicesitemidunblockpost) | **POST** /api/v1/services/{itemId}/unblock | 
*ServiceApi* | [**apiV1ServicesItemIdUniquenamePut**](docs/ServiceApi.md#apiv1servicesitemiduniquenameput) | **PUT** /api/v1/services/{itemId}/uniquename | 
*ServiceApi* | [**apiV1ServicesParentIdExcludeFromuserPut**](docs/ServiceApi.md#apiv1servicesparentidexcludefromuserput) | **PUT** /api/v1/services/{parentId}/exclude/fromuser | 
*ServiceApi* | [**apiV1ServicesParentIdExcludeItemsPut**](docs/ServiceApi.md#apiv1servicesparentidexcludeitemsput) | **PUT** /api/v1/services/{parentId}/exclude/items | 
*ServiceApi* | [**apiV1ServicesParentIdIncludeForuserPut**](docs/ServiceApi.md#apiv1servicesparentidincludeforuserput) | **PUT** /api/v1/services/{parentId}/include/foruser | 
*ServiceApi* | [**apiV1ServicesParentIdIncludeItemsPut**](docs/ServiceApi.md#apiv1servicesparentidincludeitemsput) | **PUT** /api/v1/services/{parentId}/include/items | 
*ServiceApi* | [**apiV1ServicesPersonallistGet**](docs/ServiceApi.md#apiv1servicespersonallistget) | **GET** /api/v1/services/personallist | 
*ServiceApi* | [**apiV1ServicesPersonallistItemIdDelete**](docs/ServiceApi.md#apiv1servicespersonallistitemiddelete) | **DELETE** /api/v1/services/personallist/{itemId} | 
*ServiceApi* | [**apiV1ServicesPersonallistUpdateorderPost**](docs/ServiceApi.md#apiv1servicespersonallistupdateorderpost) | **POST** /api/v1/services/personallist/updateorder | 
*ServiceApi* | [**apiV1ServicesPost**](docs/ServiceApi.md#apiv1servicespost) | **POST** /api/v1/services | 
*ServiceApi* | [**apiV1ServicesServiceIdChangeorderservicePut**](docs/ServiceApi.md#apiv1servicesserviceidchangeorderserviceput) | **PUT** /api/v1/services/{serviceId}/changeorderservice | 
*ServiceApi* | [**apiV1ServicesServiceIdOrderPost**](docs/ServiceApi.md#apiv1servicesserviceidorderpost) | **POST** /api/v1/services/{serviceId}/order | 
*ServiceApi* | [**apiV1ServicesServiceIdSessionPost**](docs/ServiceApi.md#apiv1servicesserviceidsessionpost) | **POST** /api/v1/services/{serviceId}/session | 
*ServiceApi* | [**apiV1ServicesServiceIdSessionPut**](docs/ServiceApi.md#apiv1servicesserviceidsessionput) | **PUT** /api/v1/services/{serviceId}/session | 
*ServiceApi* | [**apiV1ServicesServiceIdUpdateorder2Patch**](docs/ServiceApi.md#apiv1servicesserviceidupdateorder2patch) | **PATCH** /api/v1/services/{serviceId}/updateorder2 | 
*ServiceApi* | [**apiV1ServicesServiceIdUpdateorderPatch**](docs/ServiceApi.md#apiv1servicesserviceidupdateorderpatch) | **PATCH** /api/v1/services/{serviceId}/updateorder | 
*ServiceApi* | [**apiV1ServicesServiceIdUpdateorderinfoPatch**](docs/ServiceApi.md#apiv1servicesserviceidupdateorderinfopatch) | **PATCH** /api/v1/services/{serviceId}/updateorderinfo | 
*ServiceApi* | [**apiV1ServicesTorrowIdCheckinschedulePost**](docs/ServiceApi.md#apiv1servicestorrowidcheckinschedulepost) | **POST** /api/v1/services/{torrowId}/checkinschedule | 
*ServiceApi* | [**apiV1ServicesTorrowIdDelete**](docs/ServiceApi.md#apiv1servicestorrowiddelete) | **DELETE** /api/v1/services/{torrowId} | 
*ServiceApi* | [**apiV1ServicesTorrowIdFeedbacksOptionsPut**](docs/ServiceApi.md#apiv1servicestorrowidfeedbacksoptionsput) | **PUT** /api/v1/services/{torrowId}/feedbacks/options | 
*ServiceApi* | [**apiV1ServicesTorrowIdGeneratesecuritytokenPost**](docs/ServiceApi.md#apiv1servicestorrowidgeneratesecuritytokenpost) | **POST** /api/v1/services/{torrowId}/generatesecuritytoken | 
*ServiceApi* | [**apiV1ServicesTorrowIdGet**](docs/ServiceApi.md#apiv1servicestorrowidget) | **GET** /api/v1/services/{torrowId} | 
*ServiceApi* | [**apiV1ServicesTorrowIdGroupListGet**](docs/ServiceApi.md#apiv1servicestorrowidgrouplistget) | **GET** /api/v1/services/{torrowId}/group/list | 
*ServiceApi* | [**apiV1ServicesTorrowIdGroupSetPut**](docs/ServiceApi.md#apiv1servicestorrowidgroupsetput) | **PUT** /api/v1/services/{torrowId}/group/set | 
*ServiceApi* | [**apiV1ServicesTorrowIdGroupUnsetPut**](docs/ServiceApi.md#apiv1servicestorrowidgroupunsetput) | **PUT** /api/v1/services/{torrowId}/group/unset | 
*ServiceApi* | [**apiV1ServicesTorrowIdGroupsGet**](docs/ServiceApi.md#apiv1servicestorrowidgroupsget) | **GET** /api/v1/services/{torrowId}/groups | 
*ServiceApi* | [**apiV1ServicesTorrowIdImageIdPut**](docs/ServiceApi.md#apiv1servicestorrowidimageidput) | **PUT** /api/v1/services/{torrowId}/image/id | 
*ServiceApi* | [**apiV1ServicesTorrowIdImageInfoGet**](docs/ServiceApi.md#apiv1servicestorrowidimageinfoget) | **GET** /api/v1/services/{torrowId}/image/info | 
*ServiceApi* | [**apiV1ServicesTorrowIdImagePuturlGet**](docs/ServiceApi.md#apiv1servicestorrowidimageputurlget) | **GET** /api/v1/services/{torrowId}/image/puturl | 
*ServiceApi* | [**apiV1ServicesTorrowIdIntegrationsPut**](docs/ServiceApi.md#apiv1servicestorrowidintegrationsput) | **PUT** /api/v1/services/{torrowId}/integrations | 
*ServiceApi* | [**apiV1ServicesTorrowIdMasterinfoPut**](docs/ServiceApi.md#apiv1servicestorrowidmasterinfoput) | **PUT** /api/v1/services/{torrowId}/masterinfo | 
*ServiceApi* | [**apiV1ServicesTorrowIdParticipantsAnonymousGet**](docs/ServiceApi.md#apiv1servicestorrowidparticipantsanonymousget) | **GET** /api/v1/services/{torrowId}/participants/anonymous | 
*ServiceApi* | [**apiV1ServicesTorrowIdParticipantsGet**](docs/ServiceApi.md#apiv1servicestorrowidparticipantsget) | **GET** /api/v1/services/{torrowId}/participants | 
*ServiceApi* | [**apiV1ServicesTorrowIdParticipantsNonanonymousGet**](docs/ServiceApi.md#apiv1servicestorrowidparticipantsnonanonymousget) | **GET** /api/v1/services/{torrowId}/participants/nonanonymous | 
*ServiceApi* | [**apiV1ServicesTorrowIdParticipationDeclineaccessPut**](docs/ServiceApi.md#apiv1servicestorrowidparticipationdeclineaccessput) | **PUT** /api/v1/services/{torrowId}/participation/declineaccess | 
*ServiceApi* | [**apiV1ServicesTorrowIdParticipationGrantaccessPut**](docs/ServiceApi.md#apiv1servicestorrowidparticipationgrantaccessput) | **PUT** /api/v1/services/{torrowId}/participation/grantaccess | 
*ServiceApi* | [**apiV1ServicesTorrowIdParticipationParticipantProfileIdTypePut**](docs/ServiceApi.md#apiv1servicestorrowidparticipationparticipantprofileidtypeput) | **PUT** /api/v1/services/{torrowId}/participation/{participantProfileId}/type | 
*ServiceApi* | [**apiV1ServicesTorrowIdParticipationRejectPut**](docs/ServiceApi.md#apiv1servicestorrowidparticipationrejectput) | **PUT** /api/v1/services/{torrowId}/participation/reject | 
*ServiceApi* | [**apiV1ServicesTorrowIdParticipationRejectofferPut**](docs/ServiceApi.md#apiv1servicestorrowidparticipationrejectofferput) | **PUT** /api/v1/services/{torrowId}/participation/rejectoffer | 
*ServiceApi* | [**apiV1ServicesTorrowIdParticipationRequestaccessPut**](docs/ServiceApi.md#apiv1servicestorrowidparticipationrequestaccessput) | **PUT** /api/v1/services/{torrowId}/participation/requestaccess | 
*ServiceApi* | [**apiV1ServicesTorrowIdParticipationRevokeofferPut**](docs/ServiceApi.md#apiv1servicestorrowidparticipationrevokeofferput) | **PUT** /api/v1/services/{torrowId}/participation/revokeoffer | 
*ServiceApi* | [**apiV1ServicesTorrowIdParticipationRevokerequestPut**](docs/ServiceApi.md#apiv1servicestorrowidparticipationrevokerequestput) | **PUT** /api/v1/services/{torrowId}/participation/revokerequest | 
*ServiceApi* | [**apiV1ServicesTorrowIdParticipationSharePut**](docs/ServiceApi.md#apiv1servicestorrowidparticipationshareput) | **PUT** /api/v1/services/{torrowId}/participation/share | 
*ServiceApi* | [**apiV1ServicesTorrowIdParticipationShareitemlinkPost**](docs/ServiceApi.md#apiv1servicestorrowidparticipationshareitemlinkpost) | **POST** /api/v1/services/{torrowId}/participation/shareitemlink | 
*ServiceApi* | [**apiV1ServicesTorrowIdPublicityPut**](docs/ServiceApi.md#apiv1servicestorrowidpublicityput) | **PUT** /api/v1/services/{torrowId}/publicity | 
*ServiceApi* | [**apiV1ServicesTorrowIdPut**](docs/ServiceApi.md#apiv1servicestorrowidput) | **PUT** /api/v1/services/{torrowId} | 
*ServiceApi* | [**apiV1ServicesTorrowIdRecheckinschedulePut**](docs/ServiceApi.md#apiv1servicestorrowidrecheckinscheduleput) | **PUT** /api/v1/services/{torrowId}/recheckinschedule | 
*ServiceApi* | [**apiV1ServicesTorrowIdResourcesPost**](docs/ServiceApi.md#apiv1servicestorrowidresourcespost) | **POST** /api/v1/services/{torrowId}/resources | 
*ServiceApi* | [**apiV1ServicesTorrowIdResourceswithdetalizationPost**](docs/ServiceApi.md#apiv1servicestorrowidresourceswithdetalizationpost) | **POST** /api/v1/services/{torrowId}/resourceswithdetalization | 
*ServiceApi* | [**apiV1ServicesTorrowIdSavetomindmapPut**](docs/ServiceApi.md#apiv1servicestorrowidsavetomindmapput) | **PUT** /api/v1/services/{torrowId}/savetomindmap | 
*ServiceApi* | [**apiV1ServicesTorrowIdShorturlPost**](docs/ServiceApi.md#apiv1servicestorrowidshorturlpost) | **POST** /api/v1/services/{torrowId}/shorturl | 
*ServiceApi* | [**apiV1ServicesTorrowIdSolutiondataPut**](docs/ServiceApi.md#apiv1servicestorrowidsolutiondataput) | **PUT** /api/v1/services/{torrowId}/solutiondata | 
*ServiceApi* | [**apiV1ServicesTorrowIdTagsGet**](docs/ServiceApi.md#apiv1servicestorrowidtagsget) | **GET** /api/v1/services/{torrowId}/tags | 
*ServiceApi* | [**apiV1ServicesTorrowIdTagsPut**](docs/ServiceApi.md#apiv1servicestorrowidtagsput) | **PUT** /api/v1/services/{torrowId}/tags | 
*ServiceApi* | [**apiV1ServicesTorrowIdTimetablePut**](docs/ServiceApi.md#apiv1servicestorrowidtimetableput) | **PUT** /api/v1/services/{torrowId}/timetable | 
*ServiceApi* | [**apiV1ServicesTorrowIdTorrowaccountIdPut**](docs/ServiceApi.md#apiv1servicestorrowidtorrowaccountidput) | **PUT** /api/v1/services/{torrowId}/torrowaccount/id | 
*ServiceApi* | [**apiV1ServicesTorrowIdUpdategroupsPut**](docs/ServiceApi.md#apiv1servicestorrowidupdategroupsput) | **PUT** /api/v1/services/{torrowId}/updategroups | 
*ServiceApi* | [**apiV1ServicesUniquenameUniqueNameGet**](docs/ServiceApi.md#apiv1servicesuniquenameuniquenameget) | **GET** /api/v1/services/uniquename/{uniqueName} | 
*ServiceApi* | [**apiV1ServicesWorkloadinfoPut**](docs/ServiceApi.md#apiv1servicesworkloadinfoput) | **PUT** /api/v1/services/workloadinfo | 
*ServiceViewApi* | [**apiV1ServicesParentIdViewsPinnedChildIdDelete**](docs/ServiceViewApi.md#apiv1servicesparentidviewspinnedchildiddelete) | **DELETE** /api/v1/services/{parentId}/views/pinned/{childId} | 
*ServiceViewApi* | [**apiV1ServicesParentIdViewsPinnedChildIdGet**](docs/ServiceViewApi.md#apiv1servicesparentidviewspinnedchildidget) | **GET** /api/v1/services/{parentId}/views/pinned/{childId} | 
*ServiceViewApi* | [**apiV1ServicesParentIdViewsPinnedGet**](docs/ServiceViewApi.md#apiv1servicesparentidviewspinnedget) | **GET** /api/v1/services/{parentId}/views/pinned | 
*ServiceViewApi* | [**apiV1ServicesParentIdViewsPinnedPost**](docs/ServiceViewApi.md#apiv1servicesparentidviewspinnedpost) | **POST** /api/v1/services/{parentId}/views/pinned | 
*ServiceViewApi* | [**apiV1ServicesParentIdViewsPinnedUpdateorderPost**](docs/ServiceViewApi.md#apiv1servicesparentidviewspinnedupdateorderpost) | **POST** /api/v1/services/{parentId}/views/pinned/updateorder | 
*ServiceViewApi* | [**apiV1ServicesParentIdViewsUserChildIdDelete**](docs/ServiceViewApi.md#apiv1servicesparentidviewsuserchildiddelete) | **DELETE** /api/v1/services/{parentId}/views/user/{childId} | 
*ServiceViewApi* | [**apiV1ServicesParentIdViewsUserChildIdGet**](docs/ServiceViewApi.md#apiv1servicesparentidviewsuserchildidget) | **GET** /api/v1/services/{parentId}/views/user/{childId} | 
*ServiceViewApi* | [**apiV1ServicesParentIdViewsUserChildIdPinPost**](docs/ServiceViewApi.md#apiv1servicesparentidviewsuserchildidpinpost) | **POST** /api/v1/services/{parentId}/views/user/{childId}/pin | 
*ServiceViewApi* | [**apiV1ServicesParentIdViewsUserChildIdUnpinPost**](docs/ServiceViewApi.md#apiv1servicesparentidviewsuserchildidunpinpost) | **POST** /api/v1/services/{parentId}/views/user/{childId}/unpin | 
*ServiceViewApi* | [**apiV1ServicesParentIdViewsUserGet**](docs/ServiceViewApi.md#apiv1servicesparentidviewsuserget) | **GET** /api/v1/services/{parentId}/views/user | 
*ServiceViewApi* | [**apiV1ServicesParentIdViewsUserPost**](docs/ServiceViewApi.md#apiv1servicesparentidviewsuserpost) | **POST** /api/v1/services/{parentId}/views/user | 
*ServiceViewApi* | [**apiV1ServicesParentIdViewsUserUpdateorderPost**](docs/ServiceViewApi.md#apiv1servicesparentidviewsuserupdateorderpost) | **POST** /api/v1/services/{parentId}/views/user/updateorder | 
*ServiceViewApi* | [**apiV1ServicesViewsUserGet**](docs/ServiceViewApi.md#apiv1servicesviewsuserget) | **GET** /api/v1/services/views/user | 
*ThesaurusApi* | [**apiV1ThesaurusHobbiesGet**](docs/ThesaurusApi.md#apiv1thesaurushobbiesget) | **GET** /api/v1/thesaurus/hobbies | 
*ThesaurusApi* | [**apiV1ThesaurusPlacesGet**](docs/ThesaurusApi.md#apiv1thesaurusplacesget) | **GET** /api/v1/thesaurus/places | 
*UrlApi* | [**apiV1UShortUrlFullGet**](docs/UrlApi.md#apiv1ushorturlfullget) | **GET** /api/v1/u/{shortUrl}/full | 
*UrlApi* | [**apiV1UShortUrlGet**](docs/UrlApi.md#apiv1ushorturlget) | **GET** /api/v1/u/{shortUrl} | 
*UserApi* | [**apiV1UserAccountsGet**](docs/UserApi.md#apiv1useraccountsget) | **GET** /api/v1/user/accounts | 
*UserApi* | [**apiV1UserCalendarsGet**](docs/UserApi.md#apiv1usercalendarsget) | **GET** /api/v1/user/calendars | 
*UserApi* | [**apiV1UserCalendarsUpdatePut**](docs/UserApi.md#apiv1usercalendarsupdateput) | **PUT** /api/v1/user/calendars/update | 
*UserApi* | [**apiV1UserCountGet**](docs/UserApi.md#apiv1usercountget) | **GET** /api/v1/user/count | 
*UserApi* | [**apiV1UserDefaultnotificationwaysGet**](docs/UserApi.md#apiv1userdefaultnotificationwaysget) | **GET** /api/v1/user/defaultnotificationways | 
*UserApi* | [**apiV1UserDefaultnotificationwaysPut**](docs/UserApi.md#apiv1userdefaultnotificationwaysput) | **PUT** /api/v1/user/defaultnotificationways | 
*UserApi* | [**apiV1UserDefaultprofileGet**](docs/UserApi.md#apiv1userdefaultprofileget) | **GET** /api/v1/user/defaultprofile | 
*UserApi* | [**apiV1UserDefaultprofilePost**](docs/UserApi.md#apiv1userdefaultprofilepost) | **POST** /api/v1/user/defaultprofile | 
*UserApi* | [**apiV1UserDefaultprofilePut**](docs/UserApi.md#apiv1userdefaultprofileput) | **PUT** /api/v1/user/defaultprofile | 
*UserApi* | [**apiV1UserDeletingcompleteSessionIdDelete**](docs/UserApi.md#apiv1userdeletingcompletesessioniddelete) | **DELETE** /api/v1/user/deletingcomplete/{sessionId} | 
*UserApi* | [**apiV1UserDeletinginitDelete**](docs/UserApi.md#apiv1userdeletinginitdelete) | **DELETE** /api/v1/user/deletinginit | 
*UserApi* | [**apiV1UserDeliverywaysGet**](docs/UserApi.md#apiv1userdeliverywaysget) | **GET** /api/v1/user/deliveryways | 
*UserApi* | [**apiV1UserDevicesDeviceIdDelete**](docs/UserApi.md#apiv1userdevicesdeviceiddelete) | **DELETE** /api/v1/user/devices/{deviceId} | 
*UserApi* | [**apiV1UserDevicesDeviceIdSettingsGet**](docs/UserApi.md#apiv1userdevicesdeviceidsettingsget) | **GET** /api/v1/user/devices/{deviceId}/settings | 
*UserApi* | [**apiV1UserDevicesDeviceIdSettingsPut**](docs/UserApi.md#apiv1userdevicesdeviceidsettingsput) | **PUT** /api/v1/user/devices/{deviceId}/settings | 
*UserApi* | [**apiV1UserDevicesGet**](docs/UserApi.md#apiv1userdevicesget) | **GET** /api/v1/user/devices | 
*UserApi* | [**apiV1UserLoyaltycardGet**](docs/UserApi.md#apiv1userloyaltycardget) | **GET** /api/v1/user/loyaltycard | 
*UserApi* | [**apiV1UserPlacePut**](docs/UserApi.md#apiv1userplaceput) | **PUT** /api/v1/user/place | 
*UserApi* | [**apiV1UserProfilesGet**](docs/UserApi.md#apiv1userprofilesget) | **GET** /api/v1/user/profiles | 
*UserApi* | [**apiV1UserProfilesPost**](docs/UserApi.md#apiv1userprofilespost) | **POST** /api/v1/user/profiles | 
*UserApi* | [**apiV1UserProfilesProfileIdDelete**](docs/UserApi.md#apiv1userprofilesprofileiddelete) | **DELETE** /api/v1/user/profiles/{profileId} | 
*UserApi* | [**apiV1UserProfilesProfileIdProfilepropertiesPut**](docs/UserApi.md#apiv1userprofilesprofileidprofilepropertiesput) | **PUT** /api/v1/user/profiles/{profileId}/profileproperties | 
*UserApi* | [**apiV1UserProfilesPut**](docs/UserApi.md#apiv1userprofilesput) | **PUT** /api/v1/user/profiles | 
*UserApi* | [**apiV1UserRegisterPost**](docs/UserApi.md#apiv1userregisterpost) | **POST** /api/v1/user/register | 
*UserApi* | [**apiV1UserSettingsGet**](docs/UserApi.md#apiv1usersettingsget) | **GET** /api/v1/user/settings | 
*UserApi* | [**apiV1UserSettingsUpdatePut**](docs/UserApi.md#apiv1usersettingsupdateput) | **PUT** /api/v1/user/settings/update | 
*UserApi* | [**apiV1UserTimetablePut**](docs/UserApi.md#apiv1usertimetableput) | **PUT** /api/v1/user/timetable | 

<a name="documentation-for-models"></a>
## Documentation for Models

 - [net.torrow.api.models.AccessLevel](docs/AccessLevel.md)
 - [net.torrow.api.models.Account](docs/Account.md)
 - [net.torrow.api.models.AccountType](docs/AccountType.md)
 - [net.torrow.api.models.AccountingProductName](docs/AccountingProductName.md)
 - [net.torrow.api.models.ActionHistoryInfo](docs/ActionHistoryInfo.md)
 - [net.torrow.api.models.ActionHistoryState](docs/ActionHistoryState.md)
 - [net.torrow.api.models.ActionHistoryType](docs/ActionHistoryType.md)
 - [net.torrow.api.models.ActivityState](docs/ActivityState.md)
 - [net.torrow.api.models.ActivityStatus](docs/ActivityStatus.md)
 - [net.torrow.api.models.AddExternalAuthReq](docs/AddExternalAuthReq.md)
 - [net.torrow.api.models.AddExternalAuthResp](docs/AddExternalAuthResp.md)
 - [net.torrow.api.models.AddProfileResp](docs/AddProfileResp.md)
 - [net.torrow.api.models.Address](docs/Address.md)
 - [net.torrow.api.models.AdvisedItemType](docs/AdvisedItemType.md)
 - [net.torrow.api.models.Agent](docs/Agent.md)
 - [net.torrow.api.models.AgentType](docs/AgentType.md)
 - [net.torrow.api.models.AmountProperties](docs/AmountProperties.md)
 - [net.torrow.api.models.AnnouncementCategory](docs/AnnouncementCategory.md)
 - [net.torrow.api.models.AnnouncementInfo](docs/AnnouncementInfo.md)
 - [net.torrow.api.models.AnnouncementPriority](docs/AnnouncementPriority.md)
 - [net.torrow.api.models.AnnouncementState](docs/AnnouncementState.md)
 - [net.torrow.api.models.AnnouncementType](docs/AnnouncementType.md)
 - [net.torrow.api.models.AnyoneAccess](docs/AnyoneAccess.md)
 - [net.torrow.api.models.Appendix](docs/Appendix.md)
 - [net.torrow.api.models.ApproveCaseParticipationReq](docs/ApproveCaseParticipationReq.md)
 - [net.torrow.api.models.ArchiveState](docs/ArchiveState.md)
 - [net.torrow.api.models.AuthorizationPurposeType](docs/AuthorizationPurposeType.md)
 - [net.torrow.api.models.AuthorizationType](docs/AuthorizationType.md)
 - [net.torrow.api.models.AvailabilityTime](docs/AvailabilityTime.md)
 - [net.torrow.api.models.AvailableResources](docs/AvailableResources.md)
 - [net.torrow.api.models.BalanceValue](docs/BalanceValue.md)
 - [net.torrow.api.models.BaseItemProperties](docs/BaseItemProperties.md)
 - [net.torrow.api.models.BlockInfo](docs/BlockInfo.md)
 - [net.torrow.api.models.BlockReason](docs/BlockReason.md)
 - [net.torrow.api.models.BlockSettings](docs/BlockSettings.md)
 - [net.torrow.api.models.BookResourcesForMeReq](docs/BookResourcesForMeReq.md)
 - [net.torrow.api.models.BookResourcesForOthersReq](docs/BookResourcesForOthersReq.md)
 - [net.torrow.api.models.BookResourcesReq](docs/BookResourcesReq.md)
 - [net.torrow.api.models.BookedResource](docs/BookedResource.md)
 - [net.torrow.api.models.BookingProperties](docs/BookingProperties.md)
 - [net.torrow.api.models.BookingPropertiesFilter](docs/BookingPropertiesFilter.md)
 - [net.torrow.api.models.BookingResource](docs/BookingResource.md)
 - [net.torrow.api.models.BookingResourceFilter](docs/BookingResourceFilter.md)
 - [net.torrow.api.models.BookingResourceReq](docs/BookingResourceReq.md)
 - [net.torrow.api.models.CalendarItem](docs/CalendarItem.md)
 - [net.torrow.api.models.CalendarView](docs/CalendarView.md)
 - [net.torrow.api.models.CancelCaseParticipationReq](docs/CancelCaseParticipationReq.md)
 - [net.torrow.api.models.CancelMyCaseParticipationReq](docs/CancelMyCaseParticipationReq.md)
 - [net.torrow.api.models.CancelOtherCaseParticipationReq](docs/CancelOtherCaseParticipationReq.md)
 - [net.torrow.api.models.CardIssueInformation](docs/CardIssueInformation.md)
 - [net.torrow.api.models.CaseAction](docs/CaseAction.md)
 - [net.torrow.api.models.CaseChangeProperties](docs/CaseChangeProperties.md)
 - [net.torrow.api.models.CaseConsumer](docs/CaseConsumer.md)
 - [net.torrow.api.models.CaseItem](docs/CaseItem.md)
 - [net.torrow.api.models.CaseItemJsonPatchDocument](docs/CaseItemJsonPatchDocument.md)
 - [net.torrow.api.models.CaseItemOperation](docs/CaseItemOperation.md)
 - [net.torrow.api.models.CaseParticipant](docs/CaseParticipant.md)
 - [net.torrow.api.models.CaseParticipantFields](docs/CaseParticipantFields.md)
 - [net.torrow.api.models.CaseParticipantFilter](docs/CaseParticipantFilter.md)
 - [net.torrow.api.models.CaseParticipantState](docs/CaseParticipantState.md)
 - [net.torrow.api.models.CaseParticipantType](docs/CaseParticipantType.md)
 - [net.torrow.api.models.CaseParticipantView](docs/CaseParticipantView.md)
 - [net.torrow.api.models.CasePersonalInfo](docs/CasePersonalInfo.md)
 - [net.torrow.api.models.CaseState](docs/CaseState.md)
 - [net.torrow.api.models.CaseSummary](docs/CaseSummary.md)
 - [net.torrow.api.models.CaseType](docs/CaseType.md)
 - [net.torrow.api.models.CaseView](docs/CaseView.md)
 - [net.torrow.api.models.CaseVisitCard](docs/CaseVisitCard.md)
 - [net.torrow.api.models.CaseVisitCardField](docs/CaseVisitCardField.md)
 - [net.torrow.api.models.ChangeMoneyReceiveReq](docs/ChangeMoneyReceiveReq.md)
 - [net.torrow.api.models.ChangeOrderServiceReq](docs/ChangeOrderServiceReq.md)
 - [net.torrow.api.models.CheckInOtherReq](docs/CheckInOtherReq.md)
 - [net.torrow.api.models.CheckInProps](docs/CheckInProps.md)
 - [net.torrow.api.models.CheckInReq](docs/CheckInReq.md)
 - [net.torrow.api.models.CheckInScheduleType](docs/CheckInScheduleType.md)
 - [net.torrow.api.models.CheckinPermission](docs/CheckinPermission.md)
 - [net.torrow.api.models.ChildItemStat](docs/ChildItemStat.md)
 - [net.torrow.api.models.Communication](docs/Communication.md)
 - [net.torrow.api.models.CommunicationCheckState](docs/CommunicationCheckState.md)
 - [net.torrow.api.models.CommunicationType](docs/CommunicationType.md)
 - [net.torrow.api.models.Conditions](docs/Conditions.md)
 - [net.torrow.api.models.ConfirmationWaitingState](docs/ConfirmationWaitingState.md)
 - [net.torrow.api.models.ConfirmedState](docs/ConfirmedState.md)
 - [net.torrow.api.models.ContactInformation](docs/ContactInformation.md)
 - [net.torrow.api.models.ContactItem](docs/ContactItem.md)
 - [net.torrow.api.models.ContactPersonalInfo](docs/ContactPersonalInfo.md)
 - [net.torrow.api.models.ContactProperties](docs/ContactProperties.md)
 - [net.torrow.api.models.ContactSummary](docs/ContactSummary.md)
 - [net.torrow.api.models.ContactView](docs/ContactView.md)
 - [net.torrow.api.models.ContactVisitCard](docs/ContactVisitCard.md)
 - [net.torrow.api.models.ContactVisitCardField](docs/ContactVisitCardField.md)
 - [net.torrow.api.models.ContextItem](docs/ContextItem.md)
 - [net.torrow.api.models.ContextView](docs/ContextView.md)
 - [net.torrow.api.models.CreateCaseReq](docs/CreateCaseReq.md)
 - [net.torrow.api.models.CreateOrderReq](docs/CreateOrderReq.md)
 - [net.torrow.api.models.CreateViewListReq](docs/CreateViewListReq.md)
 - [net.torrow.api.models.CreateViewListResp](docs/CreateViewListResp.md)
 - [net.torrow.api.models.DefaultCheckinProperties](docs/DefaultCheckinProperties.md)
 - [net.torrow.api.models.DeleteResponse](docs/DeleteResponse.md)
 - [net.torrow.api.models.DeleteState](docs/DeleteState.md)
 - [net.torrow.api.models.DeletingCompleteResp](docs/DeletingCompleteResp.md)
 - [net.torrow.api.models.DeliveryChannel](docs/DeliveryChannel.md)
 - [net.torrow.api.models.DeliveryChannelMessage](docs/DeliveryChannelMessage.md)
 - [net.torrow.api.models.DeliveryStrategy](docs/DeliveryStrategy.md)
 - [net.torrow.api.models.DeliveryWay](docs/DeliveryWay.md)
 - [net.torrow.api.models.DeviceInfo](docs/DeviceInfo.md)
 - [net.torrow.api.models.DeviceSettingsInfo](docs/DeviceSettingsInfo.md)
 - [net.torrow.api.models.DeviceType](docs/DeviceType.md)
 - [net.torrow.api.models.DictionarySortCondition](docs/DictionarySortCondition.md)
 - [net.torrow.api.models.ExcludeFromGroupsReq](docs/ExcludeFromGroupsReq.md)
 - [net.torrow.api.models.ExcludeReq](docs/ExcludeReq.md)
 - [net.torrow.api.models.ExcludeResp](docs/ExcludeResp.md)
 - [net.torrow.api.models.ExcludedLinkMeta](docs/ExcludedLinkMeta.md)
 - [net.torrow.api.models.ExportGraph](docs/ExportGraph.md)
 - [net.torrow.api.models.ExportRequest](docs/ExportRequest.md)
 - [net.torrow.api.models.ExternalAuth](docs/ExternalAuth.md)
 - [net.torrow.api.models.ExternalAuthorizationSolutionData](docs/ExternalAuthorizationSolutionData.md)
 - [net.torrow.api.models.ExternalServiceType](docs/ExternalServiceType.md)
 - [net.torrow.api.models.Feedback](docs/Feedback.md)
 - [net.torrow.api.models.FeedbackMessageReason](docs/FeedbackMessageReason.md)
 - [net.torrow.api.models.FeedbackMessageState](docs/FeedbackMessageState.md)
 - [net.torrow.api.models.FeedbackOptions](docs/FeedbackOptions.md)
 - [net.torrow.api.models.FeedbackType](docs/FeedbackType.md)
 - [net.torrow.api.models.FileInfo](docs/FileInfo.md)
 - [net.torrow.api.models.Filter](docs/Filter.md)
 - [net.torrow.api.models.Gender](docs/Gender.md)
 - [net.torrow.api.models.GenerateReportReq](docs/GenerateReportReq.md)
 - [net.torrow.api.models.GenerateReportResp](docs/GenerateReportResp.md)
 - [net.torrow.api.models.GenerateSecurityTokenReq](docs/GenerateSecurityTokenReq.md)
 - [net.torrow.api.models.GenerateSecurityTokenResp](docs/GenerateSecurityTokenResp.md)
 - [net.torrow.api.models.GetCaseParticipationCountResp](docs/GetCaseParticipationCountResp.md)
 - [net.torrow.api.models.GetCheckInScheduleReq](docs/GetCheckInScheduleReq.md)
 - [net.torrow.api.models.GetCheckInScheduleResp](docs/GetCheckInScheduleResp.md)
 - [net.torrow.api.models.GetParticipationCountResp](docs/GetParticipationCountResp.md)
 - [net.torrow.api.models.GetReCheckInScheduleReq](docs/GetReCheckInScheduleReq.md)
 - [net.torrow.api.models.GetServiceWorkloadInfoRequest](docs/GetServiceWorkloadInfoRequest.md)
 - [net.torrow.api.models.GetServiceWorkloadInfoResp](docs/GetServiceWorkloadInfoResp.md)
 - [net.torrow.api.models.GetShareItemSessionReq](docs/GetShareItemSessionReq.md)
 - [net.torrow.api.models.GetTorrowIdResp](docs/GetTorrowIdResp.md)
 - [net.torrow.api.models.GroupCaseProperties](docs/GroupCaseProperties.md)
 - [net.torrow.api.models.GroupInfo](docs/GroupInfo.md)
 - [net.torrow.api.models.GroupItemProperties](docs/GroupItemProperties.md)
 - [net.torrow.api.models.GroupStatus](docs/GroupStatus.md)
 - [net.torrow.api.models.GuaranteedQuantity](docs/GuaranteedQuantity.md)
 - [net.torrow.api.models.HighlightedField](docs/HighlightedField.md)
 - [net.torrow.api.models.Hobby](docs/Hobby.md)
 - [net.torrow.api.models.IftttActionRequest](docs/IftttActionRequest.md)
 - [net.torrow.api.models.IftttTriggerRequest](docs/IftttTriggerRequest.md)
 - [net.torrow.api.models.ImagePreviewSize](docs/ImagePreviewSize.md)
 - [net.torrow.api.models.ImportByFileRequest](docs/ImportByFileRequest.md)
 - [net.torrow.api.models.ImportByUniqueNameRequest](docs/ImportByUniqueNameRequest.md)
 - [net.torrow.api.models.IncludeExcludeResp](docs/IncludeExcludeResp.md)
 - [net.torrow.api.models.IncludeForUserReq](docs/IncludeForUserReq.md)
 - [net.torrow.api.models.IncludeResp](docs/IncludeResp.md)
 - [net.torrow.api.models.IncludeToGroupsReq](docs/IncludeToGroupsReq.md)
 - [net.torrow.api.models.IncludeToParentReq](docs/IncludeToParentReq.md)
 - [net.torrow.api.models.IncludedLinkMeta](docs/IncludedLinkMeta.md)
 - [net.torrow.api.models.InitialSubscription](docs/InitialSubscription.md)
 - [net.torrow.api.models.Integration](docs/Integration.md)
 - [net.torrow.api.models.IntegrationType](docs/IntegrationType.md)
 - [net.torrow.api.models.InvitationRight](docs/InvitationRight.md)
 - [net.torrow.api.models.ItemContentType](docs/ItemContentType.md)
 - [net.torrow.api.models.ItemFeedback](docs/ItemFeedback.md)
 - [net.torrow.api.models.ItemLink](docs/ItemLink.md)
 - [net.torrow.api.models.ItemLinkKey](docs/ItemLinkKey.md)
 - [net.torrow.api.models.ItemProperties](docs/ItemProperties.md)
 - [net.torrow.api.models.ItemSummary](docs/ItemSummary.md)
 - [net.torrow.api.models.ItemView](docs/ItemView.md)
 - [net.torrow.api.models.ItemViewSortCondition](docs/ItemViewSortCondition.md)
 - [net.torrow.api.models.LanguageMessage](docs/LanguageMessage.md)
 - [net.torrow.api.models.LinkType](docs/LinkType.md)
 - [net.torrow.api.models.LocationActivation](docs/LocationActivation.md)
 - [net.torrow.api.models.LoyaltyCardIssueType](docs/LoyaltyCardIssueType.md)
 - [net.torrow.api.models.LoyaltyCardItem](docs/LoyaltyCardItem.md)
 - [net.torrow.api.models.LoyaltyCardNumber](docs/LoyaltyCardNumber.md)
 - [net.torrow.api.models.LoyaltyCardState](docs/LoyaltyCardState.md)
 - [net.torrow.api.models.LoyaltyCardSubscription](docs/LoyaltyCardSubscription.md)
 - [net.torrow.api.models.LoyaltyCardUpdateKeyInformation](docs/LoyaltyCardUpdateKeyInformation.md)
 - [net.torrow.api.models.LoyaltyCardUpdateNonKeyInformation](docs/LoyaltyCardUpdateNonKeyInformation.md)
 - [net.torrow.api.models.LoyaltySystemItem](docs/LoyaltySystemItem.md)
 - [net.torrow.api.models.LoyaltyTransactionProperties](docs/LoyaltyTransactionProperties.md)
 - [net.torrow.api.models.MasterInfo](docs/MasterInfo.md)
 - [net.torrow.api.models.MemorableDate](docs/MemorableDate.md)
 - [net.torrow.api.models.Metrics](docs/Metrics.md)
 - [net.torrow.api.models.MultiLanguageMessage](docs/MultiLanguageMessage.md)
 - [net.torrow.api.models.NoteItem](docs/NoteItem.md)
 - [net.torrow.api.models.NoteType](docs/NoteType.md)
 - [net.torrow.api.models.NoteView](docs/NoteView.md)
 - [net.torrow.api.models.NotificationProperties](docs/NotificationProperties.md)
 - [net.torrow.api.models.NotificationWay](docs/NotificationWay.md)
 - [net.torrow.api.models.NumeratorInfo](docs/NumeratorInfo.md)
 - [net.torrow.api.models.OAuthResp](docs/OAuthResp.md)
 - [net.torrow.api.models.OS](docs/OS.md)
 - [net.torrow.api.models.OSType](docs/OSType.md)
 - [net.torrow.api.models.ObjectIEnumerableIftttResponse](docs/ObjectIEnumerableIftttResponse.md)
 - [net.torrow.api.models.ObjectInfo](docs/ObjectInfo.md)
 - [net.torrow.api.models.OperationProperties](docs/OperationProperties.md)
 - [net.torrow.api.models.OperationType](docs/OperationType.md)
 - [net.torrow.api.models.OrderFilter](docs/OrderFilter.md)
 - [net.torrow.api.models.OrderInfo](docs/OrderInfo.md)
 - [net.torrow.api.models.OrderNumber](docs/OrderNumber.md)
 - [net.torrow.api.models.OrderResp](docs/OrderResp.md)
 - [net.torrow.api.models.OrderViewSortCondition](docs/OrderViewSortCondition.md)
 - [net.torrow.api.models.PackingStrategyProperties](docs/PackingStrategyProperties.md)
 - [net.torrow.api.models.PackingStrategyType](docs/PackingStrategyType.md)
 - [net.torrow.api.models.ParticipantState](docs/ParticipantState.md)
 - [net.torrow.api.models.ParticipantTimeZone](docs/ParticipantTimeZone.md)
 - [net.torrow.api.models.ParticipantType](docs/ParticipantType.md)
 - [net.torrow.api.models.ParticipantView](docs/ParticipantView.md)
 - [net.torrow.api.models.ParticipateFieldRequirement](docs/ParticipateFieldRequirement.md)
 - [net.torrow.api.models.ParticipateFieldRequirements](docs/ParticipateFieldRequirements.md)
 - [net.torrow.api.models.ParticipateFieldValue](docs/ParticipateFieldValue.md)
 - [net.torrow.api.models.Participation](docs/Participation.md)
 - [net.torrow.api.models.ParticipationFieldRequirementType](docs/ParticipationFieldRequirementType.md)
 - [net.torrow.api.models.ParticipationFieldType](docs/ParticipationFieldType.md)
 - [net.torrow.api.models.ParticipationResp](docs/ParticipationResp.md)
 - [net.torrow.api.models.PatchCaseReq](docs/PatchCaseReq.md)
 - [net.torrow.api.models.PaymentParameters](docs/PaymentParameters.md)
 - [net.torrow.api.models.PaymentProperties](docs/PaymentProperties.md)
 - [net.torrow.api.models.PaymentProviderType](docs/PaymentProviderType.md)
 - [net.torrow.api.models.PersonalInfo](docs/PersonalInfo.md)
 - [net.torrow.api.models.PersonalLinkInfo](docs/PersonalLinkInfo.md)
 - [net.torrow.api.models.PersonalLinkKey](docs/PersonalLinkKey.md)
 - [net.torrow.api.models.PersonalOrder](docs/PersonalOrder.md)
 - [net.torrow.api.models.PersonalReminder](docs/PersonalReminder.md)
 - [net.torrow.api.models.PersonalSolutionData](docs/PersonalSolutionData.md)
 - [net.torrow.api.models.PersonalViewInfo](docs/PersonalViewInfo.md)
 - [net.torrow.api.models.PickOrderReq](docs/PickOrderReq.md)
 - [net.torrow.api.models.PickOrderResp](docs/PickOrderResp.md)
 - [net.torrow.api.models.Place](docs/Place.md)
 - [net.torrow.api.models.PriceProperties](docs/PriceProperties.md)
 - [net.torrow.api.models.ProfileListResp](docs/ProfileListResp.md)
 - [net.torrow.api.models.ProfileProperties](docs/ProfileProperties.md)
 - [net.torrow.api.models.ProfileType](docs/ProfileType.md)
 - [net.torrow.api.models.ProfileUserAvailability](docs/ProfileUserAvailability.md)
 - [net.torrow.api.models.ProfileWithError](docs/ProfileWithError.md)
 - [net.torrow.api.models.PublicityType](docs/PublicityType.md)
 - [net.torrow.api.models.PutUrlResp](docs/PutUrlResp.md)
 - [net.torrow.api.models.QueueReProcessingType](docs/QueueReProcessingType.md)
 - [net.torrow.api.models.Rating](docs/Rating.md)
 - [net.torrow.api.models.RecurringConditions](docs/RecurringConditions.md)
 - [net.torrow.api.models.RefreshReq](docs/RefreshReq.md)
 - [net.torrow.api.models.RegisterInfo](docs/RegisterInfo.md)
 - [net.torrow.api.models.RegisterUserForAccountResp](docs/RegisterUserForAccountResp.md)
 - [net.torrow.api.models.RegistrationUserInfo](docs/RegistrationUserInfo.md)
 - [net.torrow.api.models.ReminderLocationDirection](docs/ReminderLocationDirection.md)
 - [net.torrow.api.models.RemoveProfileResp](docs/RemoveProfileResp.md)
 - [net.torrow.api.models.ReportDeliveryType](docs/ReportDeliveryType.md)
 - [net.torrow.api.models.ReportOptions](docs/ReportOptions.md)
 - [net.torrow.api.models.ReportProperties](docs/ReportProperties.md)
 - [net.torrow.api.models.RequestConfirmationProperties](docs/RequestConfirmationProperties.md)
 - [net.torrow.api.models.RequestedResource](docs/RequestedResource.md)
 - [net.torrow.api.models.ResourceGroup](docs/ResourceGroup.md)
 - [net.torrow.api.models.ResourceGroupStructure](docs/ResourceGroupStructure.md)
 - [net.torrow.api.models.ResourceItem](docs/ResourceItem.md)
 - [net.torrow.api.models.ResourceView](docs/ResourceView.md)
 - [net.torrow.api.models.ReturnOrderReq](docs/ReturnOrderReq.md)
 - [net.torrow.api.models.ReturnOrderResp](docs/ReturnOrderResp.md)
 - [net.torrow.api.models.RevokeReq](docs/RevokeReq.md)
 - [net.torrow.api.models.SaveItemToMindMapReq](docs/SaveItemToMindMapReq.md)
 - [net.torrow.api.models.Schedule](docs/Schedule.md)
 - [net.torrow.api.models.ScheduleRange](docs/ScheduleRange.md)
 - [net.torrow.api.models.ScheduleRangeExceptions](docs/ScheduleRangeExceptions.md)
 - [net.torrow.api.models.SearchMode](docs/SearchMode.md)
 - [net.torrow.api.models.SearchServiceResourcesReq](docs/SearchServiceResourcesReq.md)
 - [net.torrow.api.models.SearchServiceResourcesResp](docs/SearchServiceResourcesResp.md)
 - [net.torrow.api.models.SendCodeReq](docs/SendCodeReq.md)
 - [net.torrow.api.models.SendCodeResp](docs/SendCodeResp.md)
 - [net.torrow.api.models.SendCommunicationCodeReq](docs/SendCommunicationCodeReq.md)
 - [net.torrow.api.models.SendCommunicationCodeResp](docs/SendCommunicationCodeResp.md)
 - [net.torrow.api.models.SendLinkOfItemReq](docs/SendLinkOfItemReq.md)
 - [net.torrow.api.models.SendLinkOfItemResp](docs/SendLinkOfItemResp.md)
 - [net.torrow.api.models.ServiceDescription](docs/ServiceDescription.md)
 - [net.torrow.api.models.ServiceItem](docs/ServiceItem.md)
 - [net.torrow.api.models.ServiceStructure](docs/ServiceStructure.md)
 - [net.torrow.api.models.ServiceSummary](docs/ServiceSummary.md)
 - [net.torrow.api.models.ServiceView](docs/ServiceView.md)
 - [net.torrow.api.models.ServiceWorkloadOptions](docs/ServiceWorkloadOptions.md)
 - [net.torrow.api.models.SessionDurationProperties](docs/SessionDurationProperties.md)
 - [net.torrow.api.models.SessionDurationType](docs/SessionDurationType.md)
 - [net.torrow.api.models.SessionPrecisionType](docs/SessionPrecisionType.md)
 - [net.torrow.api.models.SetGroupItemReq](docs/SetGroupItemReq.md)
 - [net.torrow.api.models.ShareItemReq](docs/ShareItemReq.md)
 - [net.torrow.api.models.ShowCaseInTimetableType](docs/ShowCaseInTimetableType.md)
 - [net.torrow.api.models.SolutionData](docs/SolutionData.md)
 - [net.torrow.api.models.StateManagementType](docs/StateManagementType.md)
 - [net.torrow.api.models.StepDescription](docs/StepDescription.md)
 - [net.torrow.api.models.StepParameter](docs/StepParameter.md)
 - [net.torrow.api.models.StringObjectDictionaryIEnumerableIftttResponse](docs/StringObjectDictionaryIEnumerableIftttResponse.md)
 - [net.torrow.api.models.Subscription](docs/Subscription.md)
 - [net.torrow.api.models.TicketKey](docs/TicketKey.md)
 - [net.torrow.api.models.TicketNumber](docs/TicketNumber.md)
 - [net.torrow.api.models.TicketProperties](docs/TicketProperties.md)
 - [net.torrow.api.models.TicketState](docs/TicketState.md)
 - [net.torrow.api.models.TimePeriod](docs/TimePeriod.md)
 - [net.torrow.api.models.TimeRange](docs/TimeRange.md)
 - [net.torrow.api.models.TimeSelectionType](docs/TimeSelectionType.md)
 - [net.torrow.api.models.TimetableCase](docs/TimetableCase.md)
 - [net.torrow.api.models.TimetableDetailsVisibility](docs/TimetableDetailsVisibility.md)
 - [net.torrow.api.models.TimetableFilter](docs/TimetableFilter.md)
 - [net.torrow.api.models.TimetableVisibility](docs/TimetableVisibility.md)
 - [net.torrow.api.models.TimetableVisibilityRight](docs/TimetableVisibilityRight.md)
 - [net.torrow.api.models.TokenReq](docs/TokenReq.md)
 - [net.torrow.api.models.TokenResp](docs/TokenResp.md)
 - [net.torrow.api.models.TorrowErrorClient](docs/TorrowErrorClient.md)
 - [net.torrow.api.models.TorrowItem](docs/TorrowItem.md)
 - [net.torrow.api.models.TorrowObject](docs/TorrowObject.md)
 - [net.torrow.api.models.TorrowObjectType](docs/TorrowObjectType.md)
 - [net.torrow.api.models.TrackingInformation](docs/TrackingInformation.md)
 - [net.torrow.api.models.TransactionValue](docs/TransactionValue.md)
 - [net.torrow.api.models.Trigger](docs/Trigger.md)
 - [net.torrow.api.models.TriggerType](docs/TriggerType.md)
 - [net.torrow.api.models.Type](docs/Type.md)
 - [net.torrow.api.models.UnablePickOrderReason](docs/UnablePickOrderReason.md)
 - [net.torrow.api.models.UnableProvideExternalAuthReason](docs/UnableProvideExternalAuthReason.md)
 - [net.torrow.api.models.UnsetGroupItemReq](docs/UnsetGroupItemReq.md)
 - [net.torrow.api.models.UpdateAnnouncementStateReq](docs/UpdateAnnouncementStateReq.md)
 - [net.torrow.api.models.UpdateContactPropertiesResp](docs/UpdateContactPropertiesResp.md)
 - [net.torrow.api.models.UpdateFileIdResp](docs/UpdateFileIdResp.md)
 - [net.torrow.api.models.UpdateItemGroupsReq](docs/UpdateItemGroupsReq.md)
 - [net.torrow.api.models.UpdateMasterInfoReq](docs/UpdateMasterInfoReq.md)
 - [net.torrow.api.models.UpdateOrderInfoReq](docs/UpdateOrderInfoReq.md)
 - [net.torrow.api.models.UpdateOrderReq](docs/UpdateOrderReq.md)
 - [net.torrow.api.models.UpdatePersonalListOrderReq](docs/UpdatePersonalListOrderReq.md)
 - [net.torrow.api.models.UpdatePersonalListOrderResp](docs/UpdatePersonalListOrderResp.md)
 - [net.torrow.api.models.UpdateProfilePropertiesResp](docs/UpdateProfilePropertiesResp.md)
 - [net.torrow.api.models.UpdateViewListOrderReq](docs/UpdateViewListOrderReq.md)
 - [net.torrow.api.models.UpdateViewListOrderResp](docs/UpdateViewListOrderResp.md)
 - [net.torrow.api.models.UsageCondition](docs/UsageCondition.md)
 - [net.torrow.api.models.UsageConditionType](docs/UsageConditionType.md)
 - [net.torrow.api.models.UsageType](docs/UsageType.md)
 - [net.torrow.api.models.User](docs/User.md)
 - [net.torrow.api.models.UserAccessLevel](docs/UserAccessLevel.md)
 - [net.torrow.api.models.UserCalendar](docs/UserCalendar.md)
 - [net.torrow.api.models.UserDeletingInitResp](docs/UserDeletingInitResp.md)
 - [net.torrow.api.models.UserDeliveryWay](docs/UserDeliveryWay.md)
 - [net.torrow.api.models.UserFeedback](docs/UserFeedback.md)
 - [net.torrow.api.models.UserInformation](docs/UserInformation.md)
 - [net.torrow.api.models.UserInformationIftttResponse](docs/UserInformationIftttResponse.md)
 - [net.torrow.api.models.UserProfile](docs/UserProfile.md)
 - [net.torrow.api.models.UserSettingsInfo](docs/UserSettingsInfo.md)
 - [net.torrow.api.models.UserType](docs/UserType.md)
 - [net.torrow.api.models.Utm](docs/Utm.md)
 - [net.torrow.api.models.VerifyCommunicationCodeReq](docs/VerifyCommunicationCodeReq.md)
 - [net.torrow.api.models.VerifyCommunicationCodeResp](docs/VerifyCommunicationCodeResp.md)
 - [net.torrow.api.models.ViewBlockSettings](docs/ViewBlockSettings.md)
 - [net.torrow.api.models.ViewInfo](docs/ViewInfo.md)
 - [net.torrow.api.models.ViewOrder](docs/ViewOrder.md)
 - [net.torrow.api.models.WorkloadInfo](docs/WorkloadInfo.md)
 - [net.torrow.api.models.WorkloadOptions](docs/WorkloadOptions.md)
 - [net.torrow.api.models.WorkloadPeriod](docs/WorkloadPeriod.md)
 - [net.torrow.api.models.WorkloadPeriodStatus](docs/WorkloadPeriodStatus.md)

<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="Basic"></a>
### Basic

- **Type**: HTTP basic authentication

<a name="Bearer"></a>
### Bearer


