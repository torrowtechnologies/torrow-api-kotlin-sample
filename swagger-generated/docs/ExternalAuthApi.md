# ExternalAuthApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1ExternalauthsAllGet**](ExternalAuthApi.md#apiV1ExternalauthsAllGet) | **GET** /api/v1/externalauths/all | 
[**apiV1ExternalauthsExternalAuthIdDelete**](ExternalAuthApi.md#apiV1ExternalauthsExternalAuthIdDelete) | **DELETE** /api/v1/externalauths/{externalAuthId} | 
[**apiV1ExternalauthsPost**](ExternalAuthApi.md#apiV1ExternalauthsPost) | **POST** /api/v1/externalauths | 

<a name="apiV1ExternalauthsAllGet"></a>
# **apiV1ExternalauthsAllGet**
> kotlin.Array&lt;ExternalAuth&gt; apiV1ExternalauthsAllGet(take, skip, lmfrom, lmto, includeDeleted, sort)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = ExternalAuthApi()
val take : kotlin.Int = 56 // kotlin.Int | 
val skip : kotlin.Int = 56 // kotlin.Int | 
val lmfrom : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val lmto : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val includeDeleted : kotlin.Boolean = true // kotlin.Boolean | 
val sort : ItemViewSortCondition =  // ItemViewSortCondition | 
try {
    val result : kotlin.Array<ExternalAuth> = apiInstance.apiV1ExternalauthsAllGet(take, skip, lmfrom, lmto, includeDeleted, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExternalAuthApi#apiV1ExternalauthsAllGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExternalAuthApi#apiV1ExternalauthsAllGet")
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

### Return type

[**kotlin.Array&lt;ExternalAuth&gt;**](ExternalAuth.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1ExternalauthsExternalAuthIdDelete"></a>
# **apiV1ExternalauthsExternalAuthIdDelete**
> DeleteResponse apiV1ExternalauthsExternalAuthIdDelete(externalAuthId, versionToCheck, isNeedAnnouncement)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = ExternalAuthApi()
val externalAuthId : kotlin.String = externalAuthId_example // kotlin.String | 
val versionToCheck : kotlin.Int = 56 // kotlin.Int | 
val isNeedAnnouncement : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : DeleteResponse = apiInstance.apiV1ExternalauthsExternalAuthIdDelete(externalAuthId, versionToCheck, isNeedAnnouncement)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExternalAuthApi#apiV1ExternalauthsExternalAuthIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExternalAuthApi#apiV1ExternalauthsExternalAuthIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalAuthId** | **kotlin.String**|  |
 **versionToCheck** | **kotlin.Int**|  | [optional] [default to 0]
 **isNeedAnnouncement** | **kotlin.Boolean**|  | [optional] [default to true]

### Return type

[**DeleteResponse**](DeleteResponse.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1ExternalauthsPost"></a>
# **apiV1ExternalauthsPost**
> AddExternalAuthResp apiV1ExternalauthsPost(body)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = ExternalAuthApi()
val body : AddExternalAuthReq =  // AddExternalAuthReq | 
try {
    val result : AddExternalAuthResp = apiInstance.apiV1ExternalauthsPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExternalAuthApi#apiV1ExternalauthsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExternalAuthApi#apiV1ExternalauthsPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AddExternalAuthReq**](AddExternalAuthReq.md)|  | [optional]

### Return type

[**AddExternalAuthResp**](AddExternalAuthResp.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

