# AuthIdentityApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1AuthRefreshPost**](AuthIdentityApi.md#apiV1AuthRefreshPost) | **POST** /api/v1/auth/refresh | 
[**apiV1AuthRevokePost**](AuthIdentityApi.md#apiV1AuthRevokePost) | **POST** /api/v1/auth/revoke | 
[**apiV1AuthSendcodePost**](AuthIdentityApi.md#apiV1AuthSendcodePost) | **POST** /api/v1/auth/sendcode | 
[**apiV1AuthTokenPost**](AuthIdentityApi.md#apiV1AuthTokenPost) | **POST** /api/v1/auth/token | 

<a name="apiV1AuthRefreshPost"></a>
# **apiV1AuthRefreshPost**
> TokenResp apiV1AuthRefreshPost(body)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = AuthIdentityApi()
val body : RefreshReq =  // RefreshReq | 
try {
    val result : TokenResp = apiInstance.apiV1AuthRefreshPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthIdentityApi#apiV1AuthRefreshPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthIdentityApi#apiV1AuthRefreshPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RefreshReq**](RefreshReq.md)|  | [optional]

### Return type

[**TokenResp**](TokenResp.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1AuthRevokePost"></a>
# **apiV1AuthRevokePost**
> apiV1AuthRevokePost(body)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = AuthIdentityApi()
val body : RevokeReq =  // RevokeReq | 
try {
    apiInstance.apiV1AuthRevokePost(body)
} catch (e: ClientException) {
    println("4xx response calling AuthIdentityApi#apiV1AuthRevokePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthIdentityApi#apiV1AuthRevokePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RevokeReq**](RevokeReq.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: Not defined

<a name="apiV1AuthSendcodePost"></a>
# **apiV1AuthSendcodePost**
> SendCodeResp apiV1AuthSendcodePost(body)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = AuthIdentityApi()
val body : SendCodeReq =  // SendCodeReq | 
try {
    val result : SendCodeResp = apiInstance.apiV1AuthSendcodePost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthIdentityApi#apiV1AuthSendcodePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthIdentityApi#apiV1AuthSendcodePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SendCodeReq**](SendCodeReq.md)|  | [optional]

### Return type

[**SendCodeResp**](SendCodeResp.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1AuthTokenPost"></a>
# **apiV1AuthTokenPost**
> TokenResp apiV1AuthTokenPost(body)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = AuthIdentityApi()
val body : TokenReq =  // TokenReq | 
try {
    val result : TokenResp = apiInstance.apiV1AuthTokenPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthIdentityApi#apiV1AuthTokenPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthIdentityApi#apiV1AuthTokenPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TokenReq**](TokenReq.md)|  | [optional]

### Return type

[**TokenResp**](TokenResp.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

