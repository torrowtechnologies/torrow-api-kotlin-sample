# ItemApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1ItemActivateshareitemsessionShareItemSessionIdPut**](ItemApi.md#apiV1ItemActivateshareitemsessionShareItemSessionIdPut) | **PUT** /api/v1/item/activateshareitemsession/{shareItemSessionId} | 
[**apiV1ItemTorrowIdFeedbacksGet**](ItemApi.md#apiV1ItemTorrowIdFeedbacksGet) | **GET** /api/v1/item/{torrowId}/feedbacks | 
[**apiV1ItemTorrowIdFeedbacksMessageIdDelete**](ItemApi.md#apiV1ItemTorrowIdFeedbacksMessageIdDelete) | **DELETE** /api/v1/item/{torrowId}/feedbacks/{messageId} | 
[**apiV1ItemTorrowIdFeedbacksMessageIdGet**](ItemApi.md#apiV1ItemTorrowIdFeedbacksMessageIdGet) | **GET** /api/v1/item/{torrowId}/feedbacks/{messageId} | 
[**apiV1ItemTorrowIdFeedbacksMessageIdPut**](ItemApi.md#apiV1ItemTorrowIdFeedbacksMessageIdPut) | **PUT** /api/v1/item/{torrowId}/feedbacks/{messageId} | 
[**apiV1ItemTorrowIdFeedbacksMessageIdRepliesGet**](ItemApi.md#apiV1ItemTorrowIdFeedbacksMessageIdRepliesGet) | **GET** /api/v1/item/{torrowId}/feedbacks/{messageId}/replies | 
[**apiV1ItemTorrowIdFeedbacksMessageIdReplyPost**](ItemApi.md#apiV1ItemTorrowIdFeedbacksMessageIdReplyPost) | **POST** /api/v1/item/{torrowId}/feedbacks/{messageId}/reply | 
[**apiV1ItemTorrowIdFeedbacksNewmessagePost**](ItemApi.md#apiV1ItemTorrowIdFeedbacksNewmessagePost) | **POST** /api/v1/item/{torrowId}/feedbacks/newmessage | 
[**apiV1ItemTorrowIdUserfeedbackDelete**](ItemApi.md#apiV1ItemTorrowIdUserfeedbackDelete) | **DELETE** /api/v1/item/{torrowId}/userfeedback | 
[**apiV1ItemTorrowIdUserfeedbackGet**](ItemApi.md#apiV1ItemTorrowIdUserfeedbackGet) | **GET** /api/v1/item/{torrowId}/userfeedback | 
[**apiV1ItemTorrowIdUserfeedbackPut**](ItemApi.md#apiV1ItemTorrowIdUserfeedbackPut) | **PUT** /api/v1/item/{torrowId}/userfeedback | 
[**apiV1ItemUniquenameUniqueNameGet**](ItemApi.md#apiV1ItemUniquenameUniqueNameGet) | **GET** /api/v1/item/uniquename/{uniqueName} | 

<a name="apiV1ItemActivateshareitemsessionShareItemSessionIdPut"></a>
# **apiV1ItemActivateshareitemsessionShareItemSessionIdPut**
> ParticipationResp apiV1ItemActivateshareitemsessionShareItemSessionIdPut(shareItemSessionId, userProfileId, code)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = ItemApi()
val shareItemSessionId : kotlin.String = shareItemSessionId_example // kotlin.String | 
val userProfileId : kotlin.String = userProfileId_example // kotlin.String | 
val code : kotlin.String = code_example // kotlin.String | 
try {
    val result : ParticipationResp = apiInstance.apiV1ItemActivateshareitemsessionShareItemSessionIdPut(shareItemSessionId, userProfileId, code)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemApi#apiV1ItemActivateshareitemsessionShareItemSessionIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemApi#apiV1ItemActivateshareitemsessionShareItemSessionIdPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shareItemSessionId** | **kotlin.String**|  |
 **userProfileId** | **kotlin.String**|  | [optional]
 **code** | **kotlin.String**|  | [optional]

### Return type

[**ParticipationResp**](ParticipationResp.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1ItemTorrowIdFeedbacksGet"></a>
# **apiV1ItemTorrowIdFeedbacksGet**
> kotlin.Array&lt;ItemFeedback&gt; apiV1ItemTorrowIdFeedbacksGet(torrowId, createDateFrom, createDateTo, scoreFrom, scoreTo, profileIdsFilter, take, skip, lmfrom, lmto, includeDeleted, sort)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = ItemApi()
val torrowId : kotlin.String = torrowId_example // kotlin.String | 
val createDateFrom : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val createDateTo : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val scoreFrom : kotlin.Double = 1.2 // kotlin.Double | 
val scoreTo : kotlin.Double = 1.2 // kotlin.Double | 
val profileIdsFilter : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
val take : kotlin.Int = 56 // kotlin.Int | 
val skip : kotlin.Int = 56 // kotlin.Int | 
val lmfrom : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val lmto : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val includeDeleted : kotlin.Boolean = true // kotlin.Boolean | 
val sort : ItemViewSortCondition =  // ItemViewSortCondition | 
try {
    val result : kotlin.Array<ItemFeedback> = apiInstance.apiV1ItemTorrowIdFeedbacksGet(torrowId, createDateFrom, createDateTo, scoreFrom, scoreTo, profileIdsFilter, take, skip, lmfrom, lmto, includeDeleted, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemApi#apiV1ItemTorrowIdFeedbacksGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemApi#apiV1ItemTorrowIdFeedbacksGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **torrowId** | **kotlin.String**|  |
 **createDateFrom** | **java.time.LocalDateTime**|  | [optional]
 **createDateTo** | **java.time.LocalDateTime**|  | [optional]
 **scoreFrom** | **kotlin.Double**|  | [optional]
 **scoreTo** | **kotlin.Double**|  | [optional]
 **profileIdsFilter** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]
 **take** | **kotlin.Int**|  | [optional] [default to 2147483647]
 **skip** | **kotlin.Int**|  | [optional] [default to 0]
 **lmfrom** | **java.time.LocalDateTime**|  | [optional]
 **lmto** | **java.time.LocalDateTime**|  | [optional]
 **includeDeleted** | **kotlin.Boolean**|  | [optional] [default to false]
 **sort** | [**ItemViewSortCondition**](.md)|  | [optional]

### Return type

[**kotlin.Array&lt;ItemFeedback&gt;**](ItemFeedback.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1ItemTorrowIdFeedbacksMessageIdDelete"></a>
# **apiV1ItemTorrowIdFeedbacksMessageIdDelete**
> DeleteResponse apiV1ItemTorrowIdFeedbacksMessageIdDelete(torrowId, messageId, versionToCheck, isNeedAnnouncement)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = ItemApi()
val torrowId : kotlin.String = torrowId_example // kotlin.String | 
val messageId : kotlin.String = messageId_example // kotlin.String | 
val versionToCheck : kotlin.Int = 56 // kotlin.Int | 
val isNeedAnnouncement : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : DeleteResponse = apiInstance.apiV1ItemTorrowIdFeedbacksMessageIdDelete(torrowId, messageId, versionToCheck, isNeedAnnouncement)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemApi#apiV1ItemTorrowIdFeedbacksMessageIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemApi#apiV1ItemTorrowIdFeedbacksMessageIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **torrowId** | **kotlin.String**|  |
 **messageId** | **kotlin.String**|  |
 **versionToCheck** | **kotlin.Int**|  | [optional] [default to 0]
 **isNeedAnnouncement** | **kotlin.Boolean**|  | [optional] [default to true]

### Return type

[**DeleteResponse**](DeleteResponse.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1ItemTorrowIdFeedbacksMessageIdGet"></a>
# **apiV1ItemTorrowIdFeedbacksMessageIdGet**
> Feedback apiV1ItemTorrowIdFeedbacksMessageIdGet(torrowId, messageId, versionToCheck, includeDeleted)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = ItemApi()
val torrowId : kotlin.String = torrowId_example // kotlin.String | 
val messageId : kotlin.String = messageId_example // kotlin.String | 
val versionToCheck : kotlin.Int = 56 // kotlin.Int | 
val includeDeleted : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : Feedback = apiInstance.apiV1ItemTorrowIdFeedbacksMessageIdGet(torrowId, messageId, versionToCheck, includeDeleted)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemApi#apiV1ItemTorrowIdFeedbacksMessageIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemApi#apiV1ItemTorrowIdFeedbacksMessageIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **torrowId** | **kotlin.String**|  |
 **messageId** | **kotlin.String**|  |
 **versionToCheck** | **kotlin.Int**|  | [optional] [default to 0]
 **includeDeleted** | **kotlin.Boolean**|  | [optional] [default to false]

### Return type

[**Feedback**](Feedback.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1ItemTorrowIdFeedbacksMessageIdPut"></a>
# **apiV1ItemTorrowIdFeedbacksMessageIdPut**
> Feedback apiV1ItemTorrowIdFeedbacksMessageIdPut(torrowId, messageId, profileId, header, text, versionToCheck, isNeedAnnouncement)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = ItemApi()
val torrowId : kotlin.String = torrowId_example // kotlin.String | 
val messageId : kotlin.String = messageId_example // kotlin.String | 
val profileId : kotlin.String = profileId_example // kotlin.String | 
val header : kotlin.String = header_example // kotlin.String | 
val text : kotlin.String = text_example // kotlin.String | 
val versionToCheck : kotlin.Int = 56 // kotlin.Int | 
val isNeedAnnouncement : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : Feedback = apiInstance.apiV1ItemTorrowIdFeedbacksMessageIdPut(torrowId, messageId, profileId, header, text, versionToCheck, isNeedAnnouncement)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemApi#apiV1ItemTorrowIdFeedbacksMessageIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemApi#apiV1ItemTorrowIdFeedbacksMessageIdPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **torrowId** | **kotlin.String**|  |
 **messageId** | **kotlin.String**|  |
 **profileId** | **kotlin.String**|  | [optional]
 **header** | **kotlin.String**|  | [optional]
 **text** | **kotlin.String**|  | [optional]
 **versionToCheck** | **kotlin.Int**|  | [optional] [default to 0]
 **isNeedAnnouncement** | **kotlin.Boolean**|  | [optional] [default to true]

### Return type

[**Feedback**](Feedback.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1ItemTorrowIdFeedbacksMessageIdRepliesGet"></a>
# **apiV1ItemTorrowIdFeedbacksMessageIdRepliesGet**
> kotlin.Array&lt;Feedback&gt; apiV1ItemTorrowIdFeedbacksMessageIdRepliesGet(torrowId, messageId, createDateFrom, createDateTo, profileIdsFilter, take, skip, lmfrom, lmto, includeDeleted, sort)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = ItemApi()
val torrowId : kotlin.String = torrowId_example // kotlin.String | 
val messageId : kotlin.String = messageId_example // kotlin.String | 
val createDateFrom : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val createDateTo : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val profileIdsFilter : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
val take : kotlin.Int = 56 // kotlin.Int | 
val skip : kotlin.Int = 56 // kotlin.Int | 
val lmfrom : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val lmto : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val includeDeleted : kotlin.Boolean = true // kotlin.Boolean | 
val sort : ItemViewSortCondition =  // ItemViewSortCondition | 
try {
    val result : kotlin.Array<Feedback> = apiInstance.apiV1ItemTorrowIdFeedbacksMessageIdRepliesGet(torrowId, messageId, createDateFrom, createDateTo, profileIdsFilter, take, skip, lmfrom, lmto, includeDeleted, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemApi#apiV1ItemTorrowIdFeedbacksMessageIdRepliesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemApi#apiV1ItemTorrowIdFeedbacksMessageIdRepliesGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **torrowId** | **kotlin.String**|  |
 **messageId** | **kotlin.String**|  |
 **createDateFrom** | **java.time.LocalDateTime**|  | [optional]
 **createDateTo** | **java.time.LocalDateTime**|  | [optional]
 **profileIdsFilter** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]
 **take** | **kotlin.Int**|  | [optional] [default to 2147483647]
 **skip** | **kotlin.Int**|  | [optional] [default to 0]
 **lmfrom** | **java.time.LocalDateTime**|  | [optional]
 **lmto** | **java.time.LocalDateTime**|  | [optional]
 **includeDeleted** | **kotlin.Boolean**|  | [optional] [default to false]
 **sort** | [**ItemViewSortCondition**](.md)|  | [optional]

### Return type

[**kotlin.Array&lt;Feedback&gt;**](Feedback.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1ItemTorrowIdFeedbacksMessageIdReplyPost"></a>
# **apiV1ItemTorrowIdFeedbacksMessageIdReplyPost**
> Feedback apiV1ItemTorrowIdFeedbacksMessageIdReplyPost(torrowId, messageId, profileId, header, text, checkVersion, isNeedAnnouncement)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = ItemApi()
val torrowId : kotlin.String = torrowId_example // kotlin.String | 
val messageId : kotlin.String = messageId_example // kotlin.String | 
val profileId : kotlin.String = profileId_example // kotlin.String | 
val header : kotlin.String = header_example // kotlin.String | 
val text : kotlin.String = text_example // kotlin.String | 
val checkVersion : kotlin.Boolean = true // kotlin.Boolean | 
val isNeedAnnouncement : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : Feedback = apiInstance.apiV1ItemTorrowIdFeedbacksMessageIdReplyPost(torrowId, messageId, profileId, header, text, checkVersion, isNeedAnnouncement)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemApi#apiV1ItemTorrowIdFeedbacksMessageIdReplyPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemApi#apiV1ItemTorrowIdFeedbacksMessageIdReplyPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **torrowId** | **kotlin.String**|  |
 **messageId** | **kotlin.String**|  |
 **profileId** | **kotlin.String**|  | [optional]
 **header** | **kotlin.String**|  | [optional]
 **text** | **kotlin.String**|  | [optional]
 **checkVersion** | **kotlin.Boolean**|  | [optional] [default to true]
 **isNeedAnnouncement** | **kotlin.Boolean**|  | [optional] [default to true]

### Return type

[**Feedback**](Feedback.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1ItemTorrowIdFeedbacksNewmessagePost"></a>
# **apiV1ItemTorrowIdFeedbacksNewmessagePost**
> Feedback apiV1ItemTorrowIdFeedbacksNewmessagePost(torrowId, profileId, header, text, checkVersion, isNeedAnnouncement)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = ItemApi()
val torrowId : kotlin.String = torrowId_example // kotlin.String | 
val profileId : kotlin.String = profileId_example // kotlin.String | 
val header : kotlin.String = header_example // kotlin.String | 
val text : kotlin.String = text_example // kotlin.String | 
val checkVersion : kotlin.Boolean = true // kotlin.Boolean | 
val isNeedAnnouncement : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : Feedback = apiInstance.apiV1ItemTorrowIdFeedbacksNewmessagePost(torrowId, profileId, header, text, checkVersion, isNeedAnnouncement)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemApi#apiV1ItemTorrowIdFeedbacksNewmessagePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemApi#apiV1ItemTorrowIdFeedbacksNewmessagePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **torrowId** | **kotlin.String**|  |
 **profileId** | **kotlin.String**|  | [optional]
 **header** | **kotlin.String**|  | [optional]
 **text** | **kotlin.String**|  | [optional]
 **checkVersion** | **kotlin.Boolean**|  | [optional] [default to true]
 **isNeedAnnouncement** | **kotlin.Boolean**|  | [optional] [default to true]

### Return type

[**Feedback**](Feedback.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1ItemTorrowIdUserfeedbackDelete"></a>
# **apiV1ItemTorrowIdUserfeedbackDelete**
> DeleteResponse apiV1ItemTorrowIdUserfeedbackDelete(torrowId, profileId, messageId, versionToCheck, isNeedAnnouncement)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = ItemApi()
val torrowId : kotlin.String = torrowId_example // kotlin.String | 
val profileId : kotlin.String = profileId_example // kotlin.String | 
val messageId : kotlin.String = messageId_example // kotlin.String | 
val versionToCheck : kotlin.Int = 56 // kotlin.Int | 
val isNeedAnnouncement : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : DeleteResponse = apiInstance.apiV1ItemTorrowIdUserfeedbackDelete(torrowId, profileId, messageId, versionToCheck, isNeedAnnouncement)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemApi#apiV1ItemTorrowIdUserfeedbackDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemApi#apiV1ItemTorrowIdUserfeedbackDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **torrowId** | **kotlin.String**|  |
 **profileId** | **kotlin.String**|  | [optional]
 **messageId** | **kotlin.String**|  | [optional]
 **versionToCheck** | **kotlin.Int**|  | [optional] [default to 0]
 **isNeedAnnouncement** | **kotlin.Boolean**|  | [optional] [default to true]

### Return type

[**DeleteResponse**](DeleteResponse.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1ItemTorrowIdUserfeedbackGet"></a>
# **apiV1ItemTorrowIdUserfeedbackGet**
> UserFeedback apiV1ItemTorrowIdUserfeedbackGet(torrowId, throwExceptionIfNotFound, versionToCheck, includeDeleted)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = ItemApi()
val torrowId : kotlin.String = torrowId_example // kotlin.String | 
val throwExceptionIfNotFound : kotlin.Boolean = true // kotlin.Boolean | 
val versionToCheck : kotlin.Int = 56 // kotlin.Int | 
val includeDeleted : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : UserFeedback = apiInstance.apiV1ItemTorrowIdUserfeedbackGet(torrowId, throwExceptionIfNotFound, versionToCheck, includeDeleted)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemApi#apiV1ItemTorrowIdUserfeedbackGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemApi#apiV1ItemTorrowIdUserfeedbackGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **torrowId** | **kotlin.String**|  |
 **throwExceptionIfNotFound** | **kotlin.Boolean**|  | [optional] [default to false]
 **versionToCheck** | **kotlin.Int**|  | [optional] [default to 0]
 **includeDeleted** | **kotlin.Boolean**|  | [optional] [default to false]

### Return type

[**UserFeedback**](UserFeedback.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1ItemTorrowIdUserfeedbackPut"></a>
# **apiV1ItemTorrowIdUserfeedbackPut**
> UserFeedback apiV1ItemTorrowIdUserfeedbackPut(torrowId, profileId, score, header, text, surveyResponse, versionToCheck, isNeedAnnouncement)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = ItemApi()
val torrowId : kotlin.String = torrowId_example // kotlin.String | 
val profileId : kotlin.String = profileId_example // kotlin.String | 
val score : kotlin.Double = 1.2 // kotlin.Double | 
val header : kotlin.String = header_example // kotlin.String | 
val text : kotlin.String = text_example // kotlin.String | 
val surveyResponse : kotlin.String = surveyResponse_example // kotlin.String | 
val versionToCheck : kotlin.Int = 56 // kotlin.Int | 
val isNeedAnnouncement : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : UserFeedback = apiInstance.apiV1ItemTorrowIdUserfeedbackPut(torrowId, profileId, score, header, text, surveyResponse, versionToCheck, isNeedAnnouncement)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemApi#apiV1ItemTorrowIdUserfeedbackPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemApi#apiV1ItemTorrowIdUserfeedbackPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **torrowId** | **kotlin.String**|  |
 **profileId** | **kotlin.String**|  | [optional]
 **score** | **kotlin.Double**|  | [optional]
 **header** | **kotlin.String**|  | [optional]
 **text** | **kotlin.String**|  | [optional]
 **surveyResponse** | **kotlin.String**|  | [optional]
 **versionToCheck** | **kotlin.Int**|  | [optional] [default to 0]
 **isNeedAnnouncement** | **kotlin.Boolean**|  | [optional] [default to true]

### Return type

[**UserFeedback**](UserFeedback.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1ItemUniquenameUniqueNameGet"></a>
# **apiV1ItemUniquenameUniqueNameGet**
> kotlin.String apiV1ItemUniquenameUniqueNameGet(uniqueName)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = ItemApi()
val uniqueName : kotlin.String = uniqueName_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.apiV1ItemUniquenameUniqueNameGet(uniqueName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemApi#apiV1ItemUniquenameUniqueNameGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemApi#apiV1ItemUniquenameUniqueNameGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uniqueName** | **kotlin.String**|  |

### Return type

**kotlin.String**

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

