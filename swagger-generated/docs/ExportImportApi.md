# ExportImportApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1ExportPost**](ExportImportApi.md#apiV1ExportPost) | **POST** /api/v1/export | 
[**apiV1ImportPost**](ExportImportApi.md#apiV1ImportPost) | **POST** /api/v1/import | 
[**apiV1ImportbyuniquenamePost**](ExportImportApi.md#apiV1ImportbyuniquenamePost) | **POST** /api/v1/importbyuniquename | 

<a name="apiV1ExportPost"></a>
# **apiV1ExportPost**
> ExportGraph apiV1ExportPost(body)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = ExportImportApi()
val body : ExportRequest =  // ExportRequest | 
try {
    val result : ExportGraph = apiInstance.apiV1ExportPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExportImportApi#apiV1ExportPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExportImportApi#apiV1ExportPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ExportRequest**](ExportRequest.md)|  | [optional]

### Return type

[**ExportGraph**](ExportGraph.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1ImportPost"></a>
# **apiV1ImportPost**
> TorrowItem apiV1ImportPost(body)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = ExportImportApi()
val body : ImportByFileRequest =  // ImportByFileRequest | 
try {
    val result : TorrowItem = apiInstance.apiV1ImportPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExportImportApi#apiV1ImportPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExportImportApi#apiV1ImportPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ImportByFileRequest**](ImportByFileRequest.md)|  | [optional]

### Return type

[**TorrowItem**](TorrowItem.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1ImportbyuniquenamePost"></a>
# **apiV1ImportbyuniquenamePost**
> TorrowItem apiV1ImportbyuniquenamePost(body)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = ExportImportApi()
val body : ImportByUniqueNameRequest =  // ImportByUniqueNameRequest | 
try {
    val result : TorrowItem = apiInstance.apiV1ImportbyuniquenamePost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExportImportApi#apiV1ImportbyuniquenamePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExportImportApi#apiV1ImportbyuniquenamePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ImportByUniqueNameRequest**](ImportByUniqueNameRequest.md)|  | [optional]

### Return type

[**TorrowItem**](TorrowItem.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

