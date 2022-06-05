# UrlApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1UShortUrlFullGet**](UrlApi.md#apiV1UShortUrlFullGet) | **GET** /api/v1/u/{shortUrl}/full | 
[**apiV1UShortUrlGet**](UrlApi.md#apiV1UShortUrlGet) | **GET** /api/v1/u/{shortUrl} | 

<a name="apiV1UShortUrlFullGet"></a>
# **apiV1UShortUrlFullGet**
> kotlin.String apiV1UShortUrlFullGet(shortUrl)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = UrlApi()
val shortUrl : kotlin.String = shortUrl_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.apiV1UShortUrlFullGet(shortUrl)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UrlApi#apiV1UShortUrlFullGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UrlApi#apiV1UShortUrlFullGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortUrl** | **kotlin.String**|  |

### Return type

**kotlin.String**

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1UShortUrlGet"></a>
# **apiV1UShortUrlGet**
> apiV1UShortUrlGet(shortUrl)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = UrlApi()
val shortUrl : kotlin.String = shortUrl_example // kotlin.String | 
try {
    apiInstance.apiV1UShortUrlGet(shortUrl)
} catch (e: ClientException) {
    println("4xx response calling UrlApi#apiV1UShortUrlGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UrlApi#apiV1UShortUrlGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortUrl** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

