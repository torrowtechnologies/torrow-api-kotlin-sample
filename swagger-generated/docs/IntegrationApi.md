# IntegrationApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1IntegrationsIntegrationIdDelete**](IntegrationApi.md#apiV1IntegrationsIntegrationIdDelete) | **DELETE** /api/v1/integrations/{integrationId} | 
[**apiV1IntegrationsListGet**](IntegrationApi.md#apiV1IntegrationsListGet) | **GET** /api/v1/integrations/list | 
[**apiV1IntegrationsPost**](IntegrationApi.md#apiV1IntegrationsPost) | **POST** /api/v1/integrations | 
[**apiV1IntegrationsTorrowIdPut**](IntegrationApi.md#apiV1IntegrationsTorrowIdPut) | **PUT** /api/v1/integrations/{torrowId} | 

<a name="apiV1IntegrationsIntegrationIdDelete"></a>
# **apiV1IntegrationsIntegrationIdDelete**
> DeleteResponse apiV1IntegrationsIntegrationIdDelete(integrationId, versionToCheck, isNeedAnnouncement)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = IntegrationApi()
val integrationId : kotlin.String = integrationId_example // kotlin.String | 
val versionToCheck : kotlin.Int = 56 // kotlin.Int | 
val isNeedAnnouncement : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : DeleteResponse = apiInstance.apiV1IntegrationsIntegrationIdDelete(integrationId, versionToCheck, isNeedAnnouncement)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IntegrationApi#apiV1IntegrationsIntegrationIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IntegrationApi#apiV1IntegrationsIntegrationIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integrationId** | **kotlin.String**|  |
 **versionToCheck** | **kotlin.Int**|  | [optional] [default to 0]
 **isNeedAnnouncement** | **kotlin.Boolean**|  | [optional] [default to true]

### Return type

[**DeleteResponse**](DeleteResponse.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1IntegrationsListGet"></a>
# **apiV1IntegrationsListGet**
> kotlin.Array&lt;Integration&gt; apiV1IntegrationsListGet(integrationIds, includeDeleted)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = IntegrationApi()
val integrationIds : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
val includeDeleted : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : kotlin.Array<Integration> = apiInstance.apiV1IntegrationsListGet(integrationIds, includeDeleted)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IntegrationApi#apiV1IntegrationsListGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IntegrationApi#apiV1IntegrationsListGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integrationIds** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]
 **includeDeleted** | **kotlin.Boolean**|  | [optional] [default to false]

### Return type

[**kotlin.Array&lt;Integration&gt;**](Integration.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1IntegrationsPost"></a>
# **apiV1IntegrationsPost**
> Integration apiV1IntegrationsPost(body)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = IntegrationApi()
val body : Integration =  // Integration | 
try {
    val result : Integration = apiInstance.apiV1IntegrationsPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IntegrationApi#apiV1IntegrationsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IntegrationApi#apiV1IntegrationsPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Integration**](Integration.md)|  | [optional]

### Return type

[**Integration**](Integration.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1IntegrationsTorrowIdPut"></a>
# **apiV1IntegrationsTorrowIdPut**
> Integration apiV1IntegrationsTorrowIdPut(torrowId, body, checkVersion, isNeedAnnouncement)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = IntegrationApi()
val torrowId : kotlin.String = torrowId_example // kotlin.String | 
val body : Integration =  // Integration | 
val checkVersion : kotlin.Boolean = true // kotlin.Boolean | 
val isNeedAnnouncement : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : Integration = apiInstance.apiV1IntegrationsTorrowIdPut(torrowId, body, checkVersion, isNeedAnnouncement)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IntegrationApi#apiV1IntegrationsTorrowIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IntegrationApi#apiV1IntegrationsTorrowIdPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **torrowId** | **kotlin.String**|  |
 **body** | [**Integration**](Integration.md)|  | [optional]
 **checkVersion** | **kotlin.Boolean**|  | [optional] [default to true]
 **isNeedAnnouncement** | **kotlin.Boolean**|  | [optional] [default to false]

### Return type

[**Integration**](Integration.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

