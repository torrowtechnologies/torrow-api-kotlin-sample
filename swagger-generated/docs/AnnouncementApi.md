# AnnouncementApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1AnnouncementsGet**](AnnouncementApi.md#apiV1AnnouncementsGet) | **GET** /api/v1/announcements | 
[**apiV1AnnouncementsUpdatestatePost**](AnnouncementApi.md#apiV1AnnouncementsUpdatestatePost) | **POST** /api/v1/announcements/updatestate | 

<a name="apiV1AnnouncementsGet"></a>
# **apiV1AnnouncementsGet**
> kotlin.Array&lt;AnnouncementInfo&gt; apiV1AnnouncementsGet(language, state, stateList, take, skip, lmfrom, lmto, includeDeleted, sort, profileId)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = AnnouncementApi()
val language : kotlin.String = language_example // kotlin.String | 
val state : AnnouncementState =  // AnnouncementState | 
val stateList : kotlin.Array<AnnouncementState> =  // kotlin.Array<AnnouncementState> | 
val take : kotlin.Int = 56 // kotlin.Int | 
val skip : kotlin.Int = 56 // kotlin.Int | 
val lmfrom : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val lmto : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val includeDeleted : kotlin.Boolean = true // kotlin.Boolean | 
val sort : ItemViewSortCondition =  // ItemViewSortCondition | 
val profileId : kotlin.String = profileId_example // kotlin.String | 
try {
    val result : kotlin.Array<AnnouncementInfo> = apiInstance.apiV1AnnouncementsGet(language, state, stateList, take, skip, lmfrom, lmto, includeDeleted, sort, profileId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AnnouncementApi#apiV1AnnouncementsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AnnouncementApi#apiV1AnnouncementsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **language** | **kotlin.String**|  | [optional]
 **state** | [**AnnouncementState**](.md)|  | [optional]
 **stateList** | [**kotlin.Array&lt;AnnouncementState&gt;**](AnnouncementState.md)|  | [optional]
 **take** | **kotlin.Int**|  | [optional] [default to 2147483647]
 **skip** | **kotlin.Int**|  | [optional] [default to 0]
 **lmfrom** | **java.time.LocalDateTime**|  | [optional]
 **lmto** | **java.time.LocalDateTime**|  | [optional]
 **includeDeleted** | **kotlin.Boolean**|  | [optional] [default to false]
 **sort** | [**ItemViewSortCondition**](.md)|  | [optional]
 **profileId** | **kotlin.String**|  | [optional]

### Return type

[**kotlin.Array&lt;AnnouncementInfo&gt;**](AnnouncementInfo.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1AnnouncementsUpdatestatePost"></a>
# **apiV1AnnouncementsUpdatestatePost**
> kotlin.Array&lt;TorrowObject&gt; apiV1AnnouncementsUpdatestatePost(body)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = AnnouncementApi()
val body : kotlin.Array<UpdateAnnouncementStateReq> =  // kotlin.Array<UpdateAnnouncementStateReq> | 
try {
    val result : kotlin.Array<TorrowObject> = apiInstance.apiV1AnnouncementsUpdatestatePost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AnnouncementApi#apiV1AnnouncementsUpdatestatePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AnnouncementApi#apiV1AnnouncementsUpdatestatePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**kotlin.Array&lt;UpdateAnnouncementStateReq&gt;**](UpdateAnnouncementStateReq.md)|  | [optional]

### Return type

[**kotlin.Array&lt;TorrowObject&gt;**](TorrowObject.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

