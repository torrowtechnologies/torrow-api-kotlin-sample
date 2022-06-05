# ContextViewApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1ContextsParentIdViewsPinnedChildIdDelete**](ContextViewApi.md#apiV1ContextsParentIdViewsPinnedChildIdDelete) | **DELETE** /api/v1/contexts/{parentId}/views/pinned/{childId} | 
[**apiV1ContextsParentIdViewsPinnedChildIdGet**](ContextViewApi.md#apiV1ContextsParentIdViewsPinnedChildIdGet) | **GET** /api/v1/contexts/{parentId}/views/pinned/{childId} | 
[**apiV1ContextsParentIdViewsPinnedGet**](ContextViewApi.md#apiV1ContextsParentIdViewsPinnedGet) | **GET** /api/v1/contexts/{parentId}/views/pinned | 
[**apiV1ContextsParentIdViewsPinnedPost**](ContextViewApi.md#apiV1ContextsParentIdViewsPinnedPost) | **POST** /api/v1/contexts/{parentId}/views/pinned | 
[**apiV1ContextsParentIdViewsPinnedUpdateorderPost**](ContextViewApi.md#apiV1ContextsParentIdViewsPinnedUpdateorderPost) | **POST** /api/v1/contexts/{parentId}/views/pinned/updateorder | 
[**apiV1ContextsParentIdViewsUserChildIdDelete**](ContextViewApi.md#apiV1ContextsParentIdViewsUserChildIdDelete) | **DELETE** /api/v1/contexts/{parentId}/views/user/{childId} | 
[**apiV1ContextsParentIdViewsUserChildIdGet**](ContextViewApi.md#apiV1ContextsParentIdViewsUserChildIdGet) | **GET** /api/v1/contexts/{parentId}/views/user/{childId} | 
[**apiV1ContextsParentIdViewsUserChildIdPinPost**](ContextViewApi.md#apiV1ContextsParentIdViewsUserChildIdPinPost) | **POST** /api/v1/contexts/{parentId}/views/user/{childId}/pin | 
[**apiV1ContextsParentIdViewsUserChildIdUnpinPost**](ContextViewApi.md#apiV1ContextsParentIdViewsUserChildIdUnpinPost) | **POST** /api/v1/contexts/{parentId}/views/user/{childId}/unpin | 
[**apiV1ContextsParentIdViewsUserGet**](ContextViewApi.md#apiV1ContextsParentIdViewsUserGet) | **GET** /api/v1/contexts/{parentId}/views/user | 
[**apiV1ContextsParentIdViewsUserPost**](ContextViewApi.md#apiV1ContextsParentIdViewsUserPost) | **POST** /api/v1/contexts/{parentId}/views/user | 
[**apiV1ContextsParentIdViewsUserUpdateorderPost**](ContextViewApi.md#apiV1ContextsParentIdViewsUserUpdateorderPost) | **POST** /api/v1/contexts/{parentId}/views/user/updateorder | 
[**apiV1ContextsViewsUserGet**](ContextViewApi.md#apiV1ContextsViewsUserGet) | **GET** /api/v1/contexts/views/user | 

<a name="apiV1ContextsParentIdViewsPinnedChildIdDelete"></a>
# **apiV1ContextsParentIdViewsPinnedChildIdDelete**
> DeleteResponse apiV1ContextsParentIdViewsPinnedChildIdDelete(parentId, childId)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = ContextViewApi()
val parentId : kotlin.String = parentId_example // kotlin.String | 
val childId : kotlin.String = childId_example // kotlin.String | 
try {
    val result : DeleteResponse = apiInstance.apiV1ContextsParentIdViewsPinnedChildIdDelete(parentId, childId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContextViewApi#apiV1ContextsParentIdViewsPinnedChildIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContextViewApi#apiV1ContextsParentIdViewsPinnedChildIdDelete")
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

<a name="apiV1ContextsParentIdViewsPinnedChildIdGet"></a>
# **apiV1ContextsParentIdViewsPinnedChildIdGet**
> ContextView apiV1ContextsParentIdViewsPinnedChildIdGet(parentId, childId)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = ContextViewApi()
val parentId : kotlin.String = parentId_example // kotlin.String | 
val childId : kotlin.String = childId_example // kotlin.String | 
try {
    val result : ContextView = apiInstance.apiV1ContextsParentIdViewsPinnedChildIdGet(parentId, childId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContextViewApi#apiV1ContextsParentIdViewsPinnedChildIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContextViewApi#apiV1ContextsParentIdViewsPinnedChildIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **kotlin.String**|  |
 **childId** | **kotlin.String**|  |

### Return type

[**ContextView**](ContextView.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1ContextsParentIdViewsPinnedGet"></a>
# **apiV1ContextsParentIdViewsPinnedGet**
> kotlin.Array&lt;ContextView&gt; apiV1ContextsParentIdViewsPinnedGet(parentId, tags, take, skip, lmFrom, lmTo, includeDeleted, sort)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = ContextViewApi()
val parentId : kotlin.String = parentId_example // kotlin.String | 
val tags : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
val take : kotlin.Int = 56 // kotlin.Int | 
val skip : kotlin.Int = 56 // kotlin.Int | 
val lmFrom : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val lmTo : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val includeDeleted : kotlin.Boolean = true // kotlin.Boolean | 
val sort : ItemViewSortCondition =  // ItemViewSortCondition | 
try {
    val result : kotlin.Array<ContextView> = apiInstance.apiV1ContextsParentIdViewsPinnedGet(parentId, tags, take, skip, lmFrom, lmTo, includeDeleted, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContextViewApi#apiV1ContextsParentIdViewsPinnedGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContextViewApi#apiV1ContextsParentIdViewsPinnedGet")
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

[**kotlin.Array&lt;ContextView&gt;**](ContextView.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1ContextsParentIdViewsPinnedPost"></a>
# **apiV1ContextsParentIdViewsPinnedPost**
> CreateViewListResp apiV1ContextsParentIdViewsPinnedPost(parentId, body)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = ContextViewApi()
val parentId : kotlin.String = parentId_example // kotlin.String | 
val body : CreateViewListReq =  // CreateViewListReq | 
try {
    val result : CreateViewListResp = apiInstance.apiV1ContextsParentIdViewsPinnedPost(parentId, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContextViewApi#apiV1ContextsParentIdViewsPinnedPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContextViewApi#apiV1ContextsParentIdViewsPinnedPost")
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

<a name="apiV1ContextsParentIdViewsPinnedUpdateorderPost"></a>
# **apiV1ContextsParentIdViewsPinnedUpdateorderPost**
> UpdateViewListOrderResp apiV1ContextsParentIdViewsPinnedUpdateorderPost(parentId, body)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = ContextViewApi()
val parentId : kotlin.String = parentId_example // kotlin.String | 
val body : UpdateViewListOrderReq =  // UpdateViewListOrderReq | 
try {
    val result : UpdateViewListOrderResp = apiInstance.apiV1ContextsParentIdViewsPinnedUpdateorderPost(parentId, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContextViewApi#apiV1ContextsParentIdViewsPinnedUpdateorderPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContextViewApi#apiV1ContextsParentIdViewsPinnedUpdateorderPost")
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

<a name="apiV1ContextsParentIdViewsUserChildIdDelete"></a>
# **apiV1ContextsParentIdViewsUserChildIdDelete**
> DeleteResponse apiV1ContextsParentIdViewsUserChildIdDelete(parentId, childId)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = ContextViewApi()
val parentId : kotlin.String = parentId_example // kotlin.String | 
val childId : kotlin.String = childId_example // kotlin.String | 
try {
    val result : DeleteResponse = apiInstance.apiV1ContextsParentIdViewsUserChildIdDelete(parentId, childId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContextViewApi#apiV1ContextsParentIdViewsUserChildIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContextViewApi#apiV1ContextsParentIdViewsUserChildIdDelete")
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

<a name="apiV1ContextsParentIdViewsUserChildIdGet"></a>
# **apiV1ContextsParentIdViewsUserChildIdGet**
> ContextView apiV1ContextsParentIdViewsUserChildIdGet(parentId, childId)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = ContextViewApi()
val parentId : kotlin.String = parentId_example // kotlin.String | 
val childId : kotlin.String = childId_example // kotlin.String | 
try {
    val result : ContextView = apiInstance.apiV1ContextsParentIdViewsUserChildIdGet(parentId, childId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContextViewApi#apiV1ContextsParentIdViewsUserChildIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContextViewApi#apiV1ContextsParentIdViewsUserChildIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **kotlin.String**|  |
 **childId** | **kotlin.String**|  |

### Return type

[**ContextView**](ContextView.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1ContextsParentIdViewsUserChildIdPinPost"></a>
# **apiV1ContextsParentIdViewsUserChildIdPinPost**
> ObjectInfo apiV1ContextsParentIdViewsUserChildIdPinPost(parentId, childId, alias)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = ContextViewApi()
val parentId : kotlin.String = parentId_example // kotlin.String | 
val childId : kotlin.String = childId_example // kotlin.String | 
val alias : kotlin.String = alias_example // kotlin.String | 
try {
    val result : ObjectInfo = apiInstance.apiV1ContextsParentIdViewsUserChildIdPinPost(parentId, childId, alias)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContextViewApi#apiV1ContextsParentIdViewsUserChildIdPinPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContextViewApi#apiV1ContextsParentIdViewsUserChildIdPinPost")
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

<a name="apiV1ContextsParentIdViewsUserChildIdUnpinPost"></a>
# **apiV1ContextsParentIdViewsUserChildIdUnpinPost**
> ObjectInfo apiV1ContextsParentIdViewsUserChildIdUnpinPost(parentId, childId, alias)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = ContextViewApi()
val parentId : kotlin.String = parentId_example // kotlin.String | 
val childId : kotlin.String = childId_example // kotlin.String | 
val alias : kotlin.String = alias_example // kotlin.String | 
try {
    val result : ObjectInfo = apiInstance.apiV1ContextsParentIdViewsUserChildIdUnpinPost(parentId, childId, alias)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContextViewApi#apiV1ContextsParentIdViewsUserChildIdUnpinPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContextViewApi#apiV1ContextsParentIdViewsUserChildIdUnpinPost")
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

<a name="apiV1ContextsParentIdViewsUserGet"></a>
# **apiV1ContextsParentIdViewsUserGet**
> kotlin.Array&lt;ContextView&gt; apiV1ContextsParentIdViewsUserGet(parentId, tags, take, skip, lmFrom, lmTo, includeDeleted, sort)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = ContextViewApi()
val parentId : kotlin.String = parentId_example // kotlin.String | 
val tags : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
val take : kotlin.Int = 56 // kotlin.Int | 
val skip : kotlin.Int = 56 // kotlin.Int | 
val lmFrom : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val lmTo : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val includeDeleted : kotlin.Boolean = true // kotlin.Boolean | 
val sort : ItemViewSortCondition =  // ItemViewSortCondition | 
try {
    val result : kotlin.Array<ContextView> = apiInstance.apiV1ContextsParentIdViewsUserGet(parentId, tags, take, skip, lmFrom, lmTo, includeDeleted, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContextViewApi#apiV1ContextsParentIdViewsUserGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContextViewApi#apiV1ContextsParentIdViewsUserGet")
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

[**kotlin.Array&lt;ContextView&gt;**](ContextView.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1ContextsParentIdViewsUserPost"></a>
# **apiV1ContextsParentIdViewsUserPost**
> CreateViewListResp apiV1ContextsParentIdViewsUserPost(parentId, body)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = ContextViewApi()
val parentId : kotlin.String = parentId_example // kotlin.String | 
val body : CreateViewListReq =  // CreateViewListReq | 
try {
    val result : CreateViewListResp = apiInstance.apiV1ContextsParentIdViewsUserPost(parentId, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContextViewApi#apiV1ContextsParentIdViewsUserPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContextViewApi#apiV1ContextsParentIdViewsUserPost")
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

<a name="apiV1ContextsParentIdViewsUserUpdateorderPost"></a>
# **apiV1ContextsParentIdViewsUserUpdateorderPost**
> UpdateViewListOrderResp apiV1ContextsParentIdViewsUserUpdateorderPost(parentId, body)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = ContextViewApi()
val parentId : kotlin.String = parentId_example // kotlin.String | 
val body : UpdateViewListOrderReq =  // UpdateViewListOrderReq | 
try {
    val result : UpdateViewListOrderResp = apiInstance.apiV1ContextsParentIdViewsUserUpdateorderPost(parentId, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContextViewApi#apiV1ContextsParentIdViewsUserUpdateorderPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContextViewApi#apiV1ContextsParentIdViewsUserUpdateorderPost")
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

<a name="apiV1ContextsViewsUserGet"></a>
# **apiV1ContextsViewsUserGet**
> kotlin.Array&lt;ContextView&gt; apiV1ContextsViewsUserGet(take, skip, lmFrom, lmTo, includeDeleted, sort)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = ContextViewApi()
val take : kotlin.Int = 56 // kotlin.Int | 
val skip : kotlin.Int = 56 // kotlin.Int | 
val lmFrom : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val lmTo : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val includeDeleted : kotlin.Boolean = true // kotlin.Boolean | 
val sort : ItemViewSortCondition =  // ItemViewSortCondition | 
try {
    val result : kotlin.Array<ContextView> = apiInstance.apiV1ContextsViewsUserGet(take, skip, lmFrom, lmTo, includeDeleted, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContextViewApi#apiV1ContextsViewsUserGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContextViewApi#apiV1ContextsViewsUserGet")
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

[**kotlin.Array&lt;ContextView&gt;**](ContextView.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

