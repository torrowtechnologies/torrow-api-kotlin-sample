# BlockReasonApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1BlockreasonAllGet**](BlockReasonApi.md#apiV1BlockreasonAllGet) | **GET** /api/v1/blockreason/all | 
[**apiV1BlockreasonIdDelete**](BlockReasonApi.md#apiV1BlockreasonIdDelete) | **DELETE** /api/v1/blockreason/{id} | 
[**apiV1BlockreasonIdGet**](BlockReasonApi.md#apiV1BlockreasonIdGet) | **GET** /api/v1/blockreason/{id} | 
[**apiV1BlockreasonPost**](BlockReasonApi.md#apiV1BlockreasonPost) | **POST** /api/v1/blockreason | 

<a name="apiV1BlockreasonAllGet"></a>
# **apiV1BlockreasonAllGet**
> kotlin.Array&lt;BlockReason&gt; apiV1BlockreasonAllGet(lng, take, skip, limit, includeDeleted, sort)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = BlockReasonApi()
val lng : kotlin.String = lng_example // kotlin.String | 
val take : kotlin.Int = 56 // kotlin.Int | 
val skip : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val includeDeleted : kotlin.Boolean = true // kotlin.Boolean | 
val sort : DictionarySortCondition =  // DictionarySortCondition | 
try {
    val result : kotlin.Array<BlockReason> = apiInstance.apiV1BlockreasonAllGet(lng, take, skip, limit, includeDeleted, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BlockReasonApi#apiV1BlockreasonAllGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BlockReasonApi#apiV1BlockreasonAllGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lng** | **kotlin.String**|  | [optional]
 **take** | **kotlin.Int**|  | [optional]
 **skip** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **includeDeleted** | **kotlin.Boolean**|  | [optional]
 **sort** | [**DictionarySortCondition**](.md)|  | [optional]

### Return type

[**kotlin.Array&lt;BlockReason&gt;**](BlockReason.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1BlockreasonIdDelete"></a>
# **apiV1BlockreasonIdDelete**
> kotlin.Int apiV1BlockreasonIdDelete(id)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = BlockReasonApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.Int = apiInstance.apiV1BlockreasonIdDelete(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BlockReasonApi#apiV1BlockreasonIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BlockReasonApi#apiV1BlockreasonIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**|  |

### Return type

**kotlin.Int**

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1BlockreasonIdGet"></a>
# **apiV1BlockreasonIdGet**
> BlockReason apiV1BlockreasonIdGet(id, lng)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = BlockReasonApi()
val id : kotlin.Int = 56 // kotlin.Int | 
val lng : kotlin.String = lng_example // kotlin.String | 
try {
    val result : BlockReason = apiInstance.apiV1BlockreasonIdGet(id, lng)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BlockReasonApi#apiV1BlockreasonIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BlockReasonApi#apiV1BlockreasonIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**|  |
 **lng** | **kotlin.String**|  | [optional]

### Return type

[**BlockReason**](BlockReason.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1BlockreasonPost"></a>
# **apiV1BlockreasonPost**
> kotlin.Int apiV1BlockreasonPost(body)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = BlockReasonApi()
val body : BlockReason =  // BlockReason | 
try {
    val result : kotlin.Int = apiInstance.apiV1BlockreasonPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BlockReasonApi#apiV1BlockreasonPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BlockReasonApi#apiV1BlockreasonPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BlockReason**](BlockReason.md)|  | [optional]

### Return type

**kotlin.Int**

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

