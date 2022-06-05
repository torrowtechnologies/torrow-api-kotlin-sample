# IftttQueriesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1IftttV1QueriesPersonalNotesGet**](IftttQueriesApi.md#apiV1IftttV1QueriesPersonalNotesGet) | **GET** /api/v1/ifttt/v1/queries/personal_notes | 

<a name="apiV1IftttV1QueriesPersonalNotesGet"></a>
# **apiV1IftttV1QueriesPersonalNotesGet**
> kotlin.Array&lt;NoteItem&gt; apiV1IftttV1QueriesPersonalNotesGet(take, skip, lmfrom, lmto, includeDeleted, sort, profileId, onlyWithEmptyProfile, participantStateList, participantTypeList)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = IftttQueriesApi()
val take : kotlin.Int = 56 // kotlin.Int | 
val skip : kotlin.Int = 56 // kotlin.Int | 
val lmfrom : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val lmto : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val includeDeleted : kotlin.Boolean = true // kotlin.Boolean | 
val sort : ItemViewSortCondition =  // ItemViewSortCondition | 
val profileId : kotlin.String = profileId_example // kotlin.String | 
val onlyWithEmptyProfile : kotlin.Boolean = true // kotlin.Boolean | 
val participantStateList : kotlin.Array<ParticipantState> =  // kotlin.Array<ParticipantState> | 
val participantTypeList : kotlin.Array<ParticipantType> =  // kotlin.Array<ParticipantType> | 
try {
    val result : kotlin.Array<NoteItem> = apiInstance.apiV1IftttV1QueriesPersonalNotesGet(take, skip, lmfrom, lmto, includeDeleted, sort, profileId, onlyWithEmptyProfile, participantStateList, participantTypeList)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IftttQueriesApi#apiV1IftttV1QueriesPersonalNotesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IftttQueriesApi#apiV1IftttV1QueriesPersonalNotesGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **take** | **kotlin.Int**|  | [optional] [default to 2147483647]
 **skip** | **kotlin.Int**|  | [optional] [default to 0]
 **lmfrom** | **java.time.LocalDateTime**|  | [optional]
 **lmto** | **java.time.LocalDateTime**|  | [optional]
 **includeDeleted** | **kotlin.Boolean**|  | [optional] [default to false]
 **sort** | [**ItemViewSortCondition**](.md)|  | [optional]
 **profileId** | **kotlin.String**|  | [optional]
 **onlyWithEmptyProfile** | **kotlin.Boolean**|  | [optional]
 **participantStateList** | [**kotlin.Array&lt;ParticipantState&gt;**](ParticipantState.md)|  | [optional]
 **participantTypeList** | [**kotlin.Array&lt;ParticipantType&gt;**](ParticipantType.md)|  | [optional]

### Return type

[**kotlin.Array&lt;NoteItem&gt;**](NoteItem.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

