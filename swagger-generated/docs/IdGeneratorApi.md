# IdGeneratorApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1IdgeneratorObjectTypeGet**](IdGeneratorApi.md#apiV1IdgeneratorObjectTypeGet) | **GET** /api/v1/idgenerator/{objectType} | 

<a name="apiV1IdgeneratorObjectTypeGet"></a>
# **apiV1IdgeneratorObjectTypeGet**
> GetTorrowIdResp apiV1IdgeneratorObjectTypeGet(objectType)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = IdGeneratorApi()
val objectType : TorrowObjectType =  // TorrowObjectType | 
try {
    val result : GetTorrowIdResp = apiInstance.apiV1IdgeneratorObjectTypeGet(objectType)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IdGeneratorApi#apiV1IdgeneratorObjectTypeGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IdGeneratorApi#apiV1IdgeneratorObjectTypeGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectType** | [**TorrowObjectType**](.md)|  |

### Return type

[**GetTorrowIdResp**](GetTorrowIdResp.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

