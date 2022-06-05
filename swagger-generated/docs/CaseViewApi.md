# CaseViewApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1CasesParentIdViewsPinnedChildIdDelete**](CaseViewApi.md#apiV1CasesParentIdViewsPinnedChildIdDelete) | **DELETE** /api/v1/cases/{parentId}/views/pinned/{childId} | 
[**apiV1CasesParentIdViewsPinnedChildIdGet**](CaseViewApi.md#apiV1CasesParentIdViewsPinnedChildIdGet) | **GET** /api/v1/cases/{parentId}/views/pinned/{childId} | 
[**apiV1CasesParentIdViewsPinnedGet**](CaseViewApi.md#apiV1CasesParentIdViewsPinnedGet) | **GET** /api/v1/cases/{parentId}/views/pinned | 
[**apiV1CasesParentIdViewsPinnedPost**](CaseViewApi.md#apiV1CasesParentIdViewsPinnedPost) | **POST** /api/v1/cases/{parentId}/views/pinned | 
[**apiV1CasesParentIdViewsPinnedUpdateorderPost**](CaseViewApi.md#apiV1CasesParentIdViewsPinnedUpdateorderPost) | **POST** /api/v1/cases/{parentId}/views/pinned/updateorder | 
[**apiV1CasesParentIdViewsUserChildIdDelete**](CaseViewApi.md#apiV1CasesParentIdViewsUserChildIdDelete) | **DELETE** /api/v1/cases/{parentId}/views/user/{childId} | 
[**apiV1CasesParentIdViewsUserChildIdGet**](CaseViewApi.md#apiV1CasesParentIdViewsUserChildIdGet) | **GET** /api/v1/cases/{parentId}/views/user/{childId} | 
[**apiV1CasesParentIdViewsUserChildIdPinPost**](CaseViewApi.md#apiV1CasesParentIdViewsUserChildIdPinPost) | **POST** /api/v1/cases/{parentId}/views/user/{childId}/pin | 
[**apiV1CasesParentIdViewsUserChildIdUnpinPost**](CaseViewApi.md#apiV1CasesParentIdViewsUserChildIdUnpinPost) | **POST** /api/v1/cases/{parentId}/views/user/{childId}/unpin | 
[**apiV1CasesParentIdViewsUserGet**](CaseViewApi.md#apiV1CasesParentIdViewsUserGet) | **GET** /api/v1/cases/{parentId}/views/user | 
[**apiV1CasesParentIdViewsUserPost**](CaseViewApi.md#apiV1CasesParentIdViewsUserPost) | **POST** /api/v1/cases/{parentId}/views/user | 
[**apiV1CasesParentIdViewsUserUpdateorderPost**](CaseViewApi.md#apiV1CasesParentIdViewsUserUpdateorderPost) | **POST** /api/v1/cases/{parentId}/views/user/updateorder | 
[**apiV1CasesViewsUserGet**](CaseViewApi.md#apiV1CasesViewsUserGet) | **GET** /api/v1/cases/views/user | 

<a name="apiV1CasesParentIdViewsPinnedChildIdDelete"></a>
# **apiV1CasesParentIdViewsPinnedChildIdDelete**
> DeleteResponse apiV1CasesParentIdViewsPinnedChildIdDelete(parentId, childId)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = CaseViewApi()
val parentId : kotlin.String = parentId_example // kotlin.String | 
val childId : kotlin.String = childId_example // kotlin.String | 
try {
    val result : DeleteResponse = apiInstance.apiV1CasesParentIdViewsPinnedChildIdDelete(parentId, childId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CaseViewApi#apiV1CasesParentIdViewsPinnedChildIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CaseViewApi#apiV1CasesParentIdViewsPinnedChildIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **kotlin.String**|  |
 **childId** | **kotlin.String**|  |

### Return type

[**DeleteResponse**](DeleteResponse.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1CasesParentIdViewsPinnedChildIdGet"></a>
# **apiV1CasesParentIdViewsPinnedChildIdGet**
> CaseView apiV1CasesParentIdViewsPinnedChildIdGet(parentId, childId)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = CaseViewApi()
val parentId : kotlin.String = parentId_example // kotlin.String | 
val childId : kotlin.String = childId_example // kotlin.String | 
try {
    val result : CaseView = apiInstance.apiV1CasesParentIdViewsPinnedChildIdGet(parentId, childId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CaseViewApi#apiV1CasesParentIdViewsPinnedChildIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CaseViewApi#apiV1CasesParentIdViewsPinnedChildIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **kotlin.String**|  |
 **childId** | **kotlin.String**|  |

### Return type

[**CaseView**](CaseView.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1CasesParentIdViewsPinnedGet"></a>
# **apiV1CasesParentIdViewsPinnedGet**
> kotlin.Array&lt;CaseView&gt; apiV1CasesParentIdViewsPinnedGet(parentId, tags, take, skip, lmFrom, lmTo, includeDeleted, sort)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = CaseViewApi()
val parentId : kotlin.String = parentId_example // kotlin.String | 
val tags : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
val take : kotlin.Int = 56 // kotlin.Int | 
val skip : kotlin.Int = 56 // kotlin.Int | 
val lmFrom : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val lmTo : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val includeDeleted : kotlin.Boolean = true // kotlin.Boolean | 
val sort : ItemViewSortCondition =  // ItemViewSortCondition | 
try {
    val result : kotlin.Array<CaseView> = apiInstance.apiV1CasesParentIdViewsPinnedGet(parentId, tags, take, skip, lmFrom, lmTo, includeDeleted, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CaseViewApi#apiV1CasesParentIdViewsPinnedGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CaseViewApi#apiV1CasesParentIdViewsPinnedGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **kotlin.String**|  |
 **tags** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]
 **take** | **kotlin.Int**|  | [optional] [default to 2147483647]
 **skip** | **kotlin.Int**|  | [optional] [default to 0]
 **lmFrom** | **java.time.LocalDateTime**|  | [optional]
 **lmTo** | **java.time.LocalDateTime**|  | [optional]
 **includeDeleted** | **kotlin.Boolean**|  | [optional] [default to false]
 **sort** | [**ItemViewSortCondition**](.md)|  | [optional]

### Return type

[**kotlin.Array&lt;CaseView&gt;**](CaseView.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1CasesParentIdViewsPinnedPost"></a>
# **apiV1CasesParentIdViewsPinnedPost**
> CreateViewListResp apiV1CasesParentIdViewsPinnedPost(parentId, body)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = CaseViewApi()
val parentId : kotlin.String = parentId_example // kotlin.String | 
val body : CreateViewListReq =  // CreateViewListReq | 
try {
    val result : CreateViewListResp = apiInstance.apiV1CasesParentIdViewsPinnedPost(parentId, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CaseViewApi#apiV1CasesParentIdViewsPinnedPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CaseViewApi#apiV1CasesParentIdViewsPinnedPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **kotlin.String**|  |
 **body** | [**CreateViewListReq**](CreateViewListReq.md)|  | [optional]

### Return type

[**CreateViewListResp**](CreateViewListResp.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1CasesParentIdViewsPinnedUpdateorderPost"></a>
# **apiV1CasesParentIdViewsPinnedUpdateorderPost**
> UpdateViewListOrderResp apiV1CasesParentIdViewsPinnedUpdateorderPost(parentId, body)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = CaseViewApi()
val parentId : kotlin.String = parentId_example // kotlin.String | 
val body : UpdateViewListOrderReq =  // UpdateViewListOrderReq | 
try {
    val result : UpdateViewListOrderResp = apiInstance.apiV1CasesParentIdViewsPinnedUpdateorderPost(parentId, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CaseViewApi#apiV1CasesParentIdViewsPinnedUpdateorderPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CaseViewApi#apiV1CasesParentIdViewsPinnedUpdateorderPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **kotlin.String**|  |
 **body** | [**UpdateViewListOrderReq**](UpdateViewListOrderReq.md)|  | [optional]

### Return type

[**UpdateViewListOrderResp**](UpdateViewListOrderResp.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1CasesParentIdViewsUserChildIdDelete"></a>
# **apiV1CasesParentIdViewsUserChildIdDelete**
> DeleteResponse apiV1CasesParentIdViewsUserChildIdDelete(parentId, childId)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = CaseViewApi()
val parentId : kotlin.String = parentId_example // kotlin.String | 
val childId : kotlin.String = childId_example // kotlin.String | 
try {
    val result : DeleteResponse = apiInstance.apiV1CasesParentIdViewsUserChildIdDelete(parentId, childId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CaseViewApi#apiV1CasesParentIdViewsUserChildIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CaseViewApi#apiV1CasesParentIdViewsUserChildIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **kotlin.String**|  |
 **childId** | **kotlin.String**|  |

### Return type

[**DeleteResponse**](DeleteResponse.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1CasesParentIdViewsUserChildIdGet"></a>
# **apiV1CasesParentIdViewsUserChildIdGet**
> CaseView apiV1CasesParentIdViewsUserChildIdGet(parentId, childId)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = CaseViewApi()
val parentId : kotlin.String = parentId_example // kotlin.String | 
val childId : kotlin.String = childId_example // kotlin.String | 
try {
    val result : CaseView = apiInstance.apiV1CasesParentIdViewsUserChildIdGet(parentId, childId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CaseViewApi#apiV1CasesParentIdViewsUserChildIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CaseViewApi#apiV1CasesParentIdViewsUserChildIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **kotlin.String**|  |
 **childId** | **kotlin.String**|  |

### Return type

[**CaseView**](CaseView.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1CasesParentIdViewsUserChildIdPinPost"></a>
# **apiV1CasesParentIdViewsUserChildIdPinPost**
> ObjectInfo apiV1CasesParentIdViewsUserChildIdPinPost(parentId, childId, alias)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = CaseViewApi()
val parentId : kotlin.String = parentId_example // kotlin.String | 
val childId : kotlin.String = childId_example // kotlin.String | 
val alias : kotlin.String = alias_example // kotlin.String | 
try {
    val result : ObjectInfo = apiInstance.apiV1CasesParentIdViewsUserChildIdPinPost(parentId, childId, alias)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CaseViewApi#apiV1CasesParentIdViewsUserChildIdPinPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CaseViewApi#apiV1CasesParentIdViewsUserChildIdPinPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **kotlin.String**|  |
 **childId** | **kotlin.String**|  |
 **alias** | **kotlin.String**|  | [optional]

### Return type

[**ObjectInfo**](ObjectInfo.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1CasesParentIdViewsUserChildIdUnpinPost"></a>
# **apiV1CasesParentIdViewsUserChildIdUnpinPost**
> ObjectInfo apiV1CasesParentIdViewsUserChildIdUnpinPost(parentId, childId, alias)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = CaseViewApi()
val parentId : kotlin.String = parentId_example // kotlin.String | 
val childId : kotlin.String = childId_example // kotlin.String | 
val alias : kotlin.String = alias_example // kotlin.String | 
try {
    val result : ObjectInfo = apiInstance.apiV1CasesParentIdViewsUserChildIdUnpinPost(parentId, childId, alias)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CaseViewApi#apiV1CasesParentIdViewsUserChildIdUnpinPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CaseViewApi#apiV1CasesParentIdViewsUserChildIdUnpinPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **kotlin.String**|  |
 **childId** | **kotlin.String**|  |
 **alias** | **kotlin.String**|  | [optional]

### Return type

[**ObjectInfo**](ObjectInfo.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1CasesParentIdViewsUserGet"></a>
# **apiV1CasesParentIdViewsUserGet**
> kotlin.Array&lt;CaseView&gt; apiV1CasesParentIdViewsUserGet(parentId, tags, take, skip, lmFrom, lmTo, includeDeleted, sort)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = CaseViewApi()
val parentId : kotlin.String = parentId_example // kotlin.String | 
val tags : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
val take : kotlin.Int = 56 // kotlin.Int | 
val skip : kotlin.Int = 56 // kotlin.Int | 
val lmFrom : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val lmTo : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val includeDeleted : kotlin.Boolean = true // kotlin.Boolean | 
val sort : ItemViewSortCondition =  // ItemViewSortCondition | 
try {
    val result : kotlin.Array<CaseView> = apiInstance.apiV1CasesParentIdViewsUserGet(parentId, tags, take, skip, lmFrom, lmTo, includeDeleted, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CaseViewApi#apiV1CasesParentIdViewsUserGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CaseViewApi#apiV1CasesParentIdViewsUserGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **kotlin.String**|  |
 **tags** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]
 **take** | **kotlin.Int**|  | [optional] [default to 2147483647]
 **skip** | **kotlin.Int**|  | [optional] [default to 0]
 **lmFrom** | **java.time.LocalDateTime**|  | [optional]
 **lmTo** | **java.time.LocalDateTime**|  | [optional]
 **includeDeleted** | **kotlin.Boolean**|  | [optional] [default to false]
 **sort** | [**ItemViewSortCondition**](.md)|  | [optional]

### Return type

[**kotlin.Array&lt;CaseView&gt;**](CaseView.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1CasesParentIdViewsUserPost"></a>
# **apiV1CasesParentIdViewsUserPost**
> CreateViewListResp apiV1CasesParentIdViewsUserPost(parentId, body)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = CaseViewApi()
val parentId : kotlin.String = parentId_example // kotlin.String | 
val body : CreateViewListReq =  // CreateViewListReq | 
try {
    val result : CreateViewListResp = apiInstance.apiV1CasesParentIdViewsUserPost(parentId, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CaseViewApi#apiV1CasesParentIdViewsUserPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CaseViewApi#apiV1CasesParentIdViewsUserPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **kotlin.String**|  |
 **body** | [**CreateViewListReq**](CreateViewListReq.md)|  | [optional]

### Return type

[**CreateViewListResp**](CreateViewListResp.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1CasesParentIdViewsUserUpdateorderPost"></a>
# **apiV1CasesParentIdViewsUserUpdateorderPost**
> UpdateViewListOrderResp apiV1CasesParentIdViewsUserUpdateorderPost(parentId, body)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = CaseViewApi()
val parentId : kotlin.String = parentId_example // kotlin.String | 
val body : UpdateViewListOrderReq =  // UpdateViewListOrderReq | 
try {
    val result : UpdateViewListOrderResp = apiInstance.apiV1CasesParentIdViewsUserUpdateorderPost(parentId, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CaseViewApi#apiV1CasesParentIdViewsUserUpdateorderPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CaseViewApi#apiV1CasesParentIdViewsUserUpdateorderPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **kotlin.String**|  |
 **body** | [**UpdateViewListOrderReq**](UpdateViewListOrderReq.md)|  | [optional]

### Return type

[**UpdateViewListOrderResp**](UpdateViewListOrderResp.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1CasesViewsUserGet"></a>
# **apiV1CasesViewsUserGet**
> kotlin.Array&lt;CaseView&gt; apiV1CasesViewsUserGet(take, skip, lmFrom, lmTo, includeDeleted, sort)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = CaseViewApi()
val take : kotlin.Int = 56 // kotlin.Int | 
val skip : kotlin.Int = 56 // kotlin.Int | 
val lmFrom : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val lmTo : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val includeDeleted : kotlin.Boolean = true // kotlin.Boolean | 
val sort : ItemViewSortCondition =  // ItemViewSortCondition | 
try {
    val result : kotlin.Array<CaseView> = apiInstance.apiV1CasesViewsUserGet(take, skip, lmFrom, lmTo, includeDeleted, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CaseViewApi#apiV1CasesViewsUserGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CaseViewApi#apiV1CasesViewsUserGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **take** | **kotlin.Int**|  | [optional] [default to 2147483647]
 **skip** | **kotlin.Int**|  | [optional] [default to 0]
 **lmFrom** | **java.time.LocalDateTime**|  | [optional]
 **lmTo** | **java.time.LocalDateTime**|  | [optional]
 **includeDeleted** | **kotlin.Boolean**|  | [optional] [default to false]
 **sort** | [**ItemViewSortCondition**](.md)|  | [optional]

### Return type

[**kotlin.Array&lt;CaseView&gt;**](CaseView.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

