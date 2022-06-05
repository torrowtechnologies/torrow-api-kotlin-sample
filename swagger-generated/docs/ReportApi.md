# ReportApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1ReportsPost**](ReportApi.md#apiV1ReportsPost) | **POST** /api/v1/reports | 
[**apiV1ReportsProfileIdPost**](ReportApi.md#apiV1ReportsProfileIdPost) | **POST** /api/v1/reports/{profileId} | 

<a name="apiV1ReportsPost"></a>
# **apiV1ReportsPost**
> GenerateReportResp apiV1ReportsPost(body, profileId)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = ReportApi()
val body : GenerateReportReq =  // GenerateReportReq | 
val profileId : kotlin.String = profileId_example // kotlin.String | 
try {
    val result : GenerateReportResp = apiInstance.apiV1ReportsPost(body, profileId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReportApi#apiV1ReportsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportApi#apiV1ReportsPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GenerateReportReq**](GenerateReportReq.md)|  | [optional]
 **profileId** | **kotlin.String**|  | [optional]

### Return type

[**GenerateReportResp**](GenerateReportResp.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1ReportsProfileIdPost"></a>
# **apiV1ReportsProfileIdPost**
> GenerateReportResp apiV1ReportsProfileIdPost(profileId, body)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = ReportApi()
val profileId : kotlin.String = profileId_example // kotlin.String | 
val body : GenerateReportReq =  // GenerateReportReq | 
try {
    val result : GenerateReportResp = apiInstance.apiV1ReportsProfileIdPost(profileId, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReportApi#apiV1ReportsProfileIdPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportApi#apiV1ReportsProfileIdPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **profileId** | **kotlin.String**|  |
 **body** | [**GenerateReportReq**](GenerateReportReq.md)|  | [optional]

### Return type

[**GenerateReportResp**](GenerateReportResp.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

