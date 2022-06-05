# ActionHistoryApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1ActionhistoryGet**](ActionHistoryApi.md#apiV1ActionhistoryGet) | **GET** /api/v1/actionhistory | 

<a name="apiV1ActionhistoryGet"></a>
# **apiV1ActionhistoryGet**
> kotlin.Array&lt;ActionHistoryInfo&gt; apiV1ActionhistoryGet(language, take, skip, lmfrom, lmto, includeDeleted, sort, types, states, itemIds)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = ActionHistoryApi()
val language : kotlin.String = language_example // kotlin.String | 
val take : kotlin.Int = 56 // kotlin.Int | 
val skip : kotlin.Int = 56 // kotlin.Int | 
val lmfrom : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val lmto : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val includeDeleted : kotlin.Boolean = true // kotlin.Boolean | 
val sort : ItemViewSortCondition =  // ItemViewSortCondition | 
val types : kotlin.Array<ActionHistoryType> =  // kotlin.Array<ActionHistoryType> | 
val states : kotlin.Array<ActionHistoryState> =  // kotlin.Array<ActionHistoryState> | 
val itemIds : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
try {
    val result : kotlin.Array<ActionHistoryInfo> = apiInstance.apiV1ActionhistoryGet(language, take, skip, lmfrom, lmto, includeDeleted, sort, types, states, itemIds)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionHistoryApi#apiV1ActionhistoryGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionHistoryApi#apiV1ActionhistoryGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **language** | **kotlin.String**|  | [optional]
 **take** | **kotlin.Int**|  | [optional] [default to 2147483647]
 **skip** | **kotlin.Int**|  | [optional] [default to 0]
 **lmfrom** | **java.time.LocalDateTime**|  | [optional]
 **lmto** | **java.time.LocalDateTime**|  | [optional]
 **includeDeleted** | **kotlin.Boolean**|  | [optional] [default to false]
 **sort** | [**ItemViewSortCondition**](.md)|  | [optional]
 **types** | [**kotlin.Array&lt;ActionHistoryType&gt;**](ActionHistoryType.md)|  | [optional]
 **states** | [**kotlin.Array&lt;ActionHistoryState&gt;**](ActionHistoryState.md)|  | [optional]
 **itemIds** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]

### Return type

[**kotlin.Array&lt;ActionHistoryInfo&gt;**](ActionHistoryInfo.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

