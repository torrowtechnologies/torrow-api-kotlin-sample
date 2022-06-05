# ServiceViewApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1ServicesParentIdViewsPinnedChildIdDelete**](ServiceViewApi.md#apiV1ServicesParentIdViewsPinnedChildIdDelete) | **DELETE** /api/v1/services/{parentId}/views/pinned/{childId} | 
[**apiV1ServicesParentIdViewsPinnedChildIdGet**](ServiceViewApi.md#apiV1ServicesParentIdViewsPinnedChildIdGet) | **GET** /api/v1/services/{parentId}/views/pinned/{childId} | 
[**apiV1ServicesParentIdViewsPinnedGet**](ServiceViewApi.md#apiV1ServicesParentIdViewsPinnedGet) | **GET** /api/v1/services/{parentId}/views/pinned | 
[**apiV1ServicesParentIdViewsPinnedPost**](ServiceViewApi.md#apiV1ServicesParentIdViewsPinnedPost) | **POST** /api/v1/services/{parentId}/views/pinned | 
[**apiV1ServicesParentIdViewsPinnedUpdateorderPost**](ServiceViewApi.md#apiV1ServicesParentIdViewsPinnedUpdateorderPost) | **POST** /api/v1/services/{parentId}/views/pinned/updateorder | 
[**apiV1ServicesParentIdViewsUserChildIdDelete**](ServiceViewApi.md#apiV1ServicesParentIdViewsUserChildIdDelete) | **DELETE** /api/v1/services/{parentId}/views/user/{childId} | 
[**apiV1ServicesParentIdViewsUserChildIdGet**](ServiceViewApi.md#apiV1ServicesParentIdViewsUserChildIdGet) | **GET** /api/v1/services/{parentId}/views/user/{childId} | 
[**apiV1ServicesParentIdViewsUserChildIdPinPost**](ServiceViewApi.md#apiV1ServicesParentIdViewsUserChildIdPinPost) | **POST** /api/v1/services/{parentId}/views/user/{childId}/pin | 
[**apiV1ServicesParentIdViewsUserChildIdUnpinPost**](ServiceViewApi.md#apiV1ServicesParentIdViewsUserChildIdUnpinPost) | **POST** /api/v1/services/{parentId}/views/user/{childId}/unpin | 
[**apiV1ServicesParentIdViewsUserGet**](ServiceViewApi.md#apiV1ServicesParentIdViewsUserGet) | **GET** /api/v1/services/{parentId}/views/user | 
[**apiV1ServicesParentIdViewsUserPost**](ServiceViewApi.md#apiV1ServicesParentIdViewsUserPost) | **POST** /api/v1/services/{parentId}/views/user | 
[**apiV1ServicesParentIdViewsUserUpdateorderPost**](ServiceViewApi.md#apiV1ServicesParentIdViewsUserUpdateorderPost) | **POST** /api/v1/services/{parentId}/views/user/updateorder | 
[**apiV1ServicesViewsUserGet**](ServiceViewApi.md#apiV1ServicesViewsUserGet) | **GET** /api/v1/services/views/user | 

<a name="apiV1ServicesParentIdViewsPinnedChildIdDelete"></a>
# **apiV1ServicesParentIdViewsPinnedChildIdDelete**
> DeleteResponse apiV1ServicesParentIdViewsPinnedChildIdDelete(parentId, childId)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = ServiceViewApi()
val parentId : kotlin.String = parentId_example // kotlin.String | 
val childId : kotlin.String = childId_example // kotlin.String | 
try {
    val result : DeleteResponse = apiInstance.apiV1ServicesParentIdViewsPinnedChildIdDelete(parentId, childId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceViewApi#apiV1ServicesParentIdViewsPinnedChildIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceViewApi#apiV1ServicesParentIdViewsPinnedChildIdDelete")
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

<a name="apiV1ServicesParentIdViewsPinnedChildIdGet"></a>
# **apiV1ServicesParentIdViewsPinnedChildIdGet**
> ServiceView apiV1ServicesParentIdViewsPinnedChildIdGet(parentId, childId)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = ServiceViewApi()
val parentId : kotlin.String = parentId_example // kotlin.String | 
val childId : kotlin.String = childId_example // kotlin.String | 
try {
    val result : ServiceView = apiInstance.apiV1ServicesParentIdViewsPinnedChildIdGet(parentId, childId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceViewApi#apiV1ServicesParentIdViewsPinnedChildIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceViewApi#apiV1ServicesParentIdViewsPinnedChildIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **kotlin.String**|  |
 **childId** | **kotlin.String**|  |

### Return type

[**ServiceView**](ServiceView.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1ServicesParentIdViewsPinnedGet"></a>
# **apiV1ServicesParentIdViewsPinnedGet**
> kotlin.Array&lt;ServiceView&gt; apiV1ServicesParentIdViewsPinnedGet(parentId, tags, take, skip, lmFrom, lmTo, includeDeleted, sort)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = ServiceViewApi()
val parentId : kotlin.String = parentId_example // kotlin.String | 
val tags : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
val take : kotlin.Int = 56 // kotlin.Int | 
val skip : kotlin.Int = 56 // kotlin.Int | 
val lmFrom : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val lmTo : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val includeDeleted : kotlin.Boolean = true // kotlin.Boolean | 
val sort : ItemViewSortCondition =  // ItemViewSortCondition | 
try {
    val result : kotlin.Array<ServiceView> = apiInstance.apiV1ServicesParentIdViewsPinnedGet(parentId, tags, take, skip, lmFrom, lmTo, includeDeleted, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceViewApi#apiV1ServicesParentIdViewsPinnedGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceViewApi#apiV1ServicesParentIdViewsPinnedGet")
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

[**kotlin.Array&lt;ServiceView&gt;**](ServiceView.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1ServicesParentIdViewsPinnedPost"></a>
# **apiV1ServicesParentIdViewsPinnedPost**
> CreateViewListResp apiV1ServicesParentIdViewsPinnedPost(parentId, body)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = ServiceViewApi()
val parentId : kotlin.String = parentId_example // kotlin.String | 
val body : CreateViewListReq =  // CreateViewListReq | 
try {
    val result : CreateViewListResp = apiInstance.apiV1ServicesParentIdViewsPinnedPost(parentId, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceViewApi#apiV1ServicesParentIdViewsPinnedPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceViewApi#apiV1ServicesParentIdViewsPinnedPost")
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

<a name="apiV1ServicesParentIdViewsPinnedUpdateorderPost"></a>
# **apiV1ServicesParentIdViewsPinnedUpdateorderPost**
> UpdateViewListOrderResp apiV1ServicesParentIdViewsPinnedUpdateorderPost(parentId, body)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = ServiceViewApi()
val parentId : kotlin.String = parentId_example // kotlin.String | 
val body : UpdateViewListOrderReq =  // UpdateViewListOrderReq | 
try {
    val result : UpdateViewListOrderResp = apiInstance.apiV1ServicesParentIdViewsPinnedUpdateorderPost(parentId, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceViewApi#apiV1ServicesParentIdViewsPinnedUpdateorderPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceViewApi#apiV1ServicesParentIdViewsPinnedUpdateorderPost")
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

<a name="apiV1ServicesParentIdViewsUserChildIdDelete"></a>
# **apiV1ServicesParentIdViewsUserChildIdDelete**
> DeleteResponse apiV1ServicesParentIdViewsUserChildIdDelete(parentId, childId)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = ServiceViewApi()
val parentId : kotlin.String = parentId_example // kotlin.String | 
val childId : kotlin.String = childId_example // kotlin.String | 
try {
    val result : DeleteResponse = apiInstance.apiV1ServicesParentIdViewsUserChildIdDelete(parentId, childId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceViewApi#apiV1ServicesParentIdViewsUserChildIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceViewApi#apiV1ServicesParentIdViewsUserChildIdDelete")
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

<a name="apiV1ServicesParentIdViewsUserChildIdGet"></a>
# **apiV1ServicesParentIdViewsUserChildIdGet**
> ServiceView apiV1ServicesParentIdViewsUserChildIdGet(parentId, childId)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = ServiceViewApi()
val parentId : kotlin.String = parentId_example // kotlin.String | 
val childId : kotlin.String = childId_example // kotlin.String | 
try {
    val result : ServiceView = apiInstance.apiV1ServicesParentIdViewsUserChildIdGet(parentId, childId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceViewApi#apiV1ServicesParentIdViewsUserChildIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceViewApi#apiV1ServicesParentIdViewsUserChildIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **kotlin.String**|  |
 **childId** | **kotlin.String**|  |

### Return type

[**ServiceView**](ServiceView.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1ServicesParentIdViewsUserChildIdPinPost"></a>
# **apiV1ServicesParentIdViewsUserChildIdPinPost**
> ObjectInfo apiV1ServicesParentIdViewsUserChildIdPinPost(parentId, childId, alias)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = ServiceViewApi()
val parentId : kotlin.String = parentId_example // kotlin.String | 
val childId : kotlin.String = childId_example // kotlin.String | 
val alias : kotlin.String = alias_example // kotlin.String | 
try {
    val result : ObjectInfo = apiInstance.apiV1ServicesParentIdViewsUserChildIdPinPost(parentId, childId, alias)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceViewApi#apiV1ServicesParentIdViewsUserChildIdPinPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceViewApi#apiV1ServicesParentIdViewsUserChildIdPinPost")
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

<a name="apiV1ServicesParentIdViewsUserChildIdUnpinPost"></a>
# **apiV1ServicesParentIdViewsUserChildIdUnpinPost**
> ObjectInfo apiV1ServicesParentIdViewsUserChildIdUnpinPost(parentId, childId, alias)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = ServiceViewApi()
val parentId : kotlin.String = parentId_example // kotlin.String | 
val childId : kotlin.String = childId_example // kotlin.String | 
val alias : kotlin.String = alias_example // kotlin.String | 
try {
    val result : ObjectInfo = apiInstance.apiV1ServicesParentIdViewsUserChildIdUnpinPost(parentId, childId, alias)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceViewApi#apiV1ServicesParentIdViewsUserChildIdUnpinPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceViewApi#apiV1ServicesParentIdViewsUserChildIdUnpinPost")
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

<a name="apiV1ServicesParentIdViewsUserGet"></a>
# **apiV1ServicesParentIdViewsUserGet**
> kotlin.Array&lt;ServiceView&gt; apiV1ServicesParentIdViewsUserGet(parentId, tags, take, skip, lmFrom, lmTo, includeDeleted, sort)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = ServiceViewApi()
val parentId : kotlin.String = parentId_example // kotlin.String | 
val tags : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
val take : kotlin.Int = 56 // kotlin.Int | 
val skip : kotlin.Int = 56 // kotlin.Int | 
val lmFrom : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val lmTo : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val includeDeleted : kotlin.Boolean = true // kotlin.Boolean | 
val sort : ItemViewSortCondition =  // ItemViewSortCondition | 
try {
    val result : kotlin.Array<ServiceView> = apiInstance.apiV1ServicesParentIdViewsUserGet(parentId, tags, take, skip, lmFrom, lmTo, includeDeleted, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceViewApi#apiV1ServicesParentIdViewsUserGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceViewApi#apiV1ServicesParentIdViewsUserGet")
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

[**kotlin.Array&lt;ServiceView&gt;**](ServiceView.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1ServicesParentIdViewsUserPost"></a>
# **apiV1ServicesParentIdViewsUserPost**
> CreateViewListResp apiV1ServicesParentIdViewsUserPost(parentId, body)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = ServiceViewApi()
val parentId : kotlin.String = parentId_example // kotlin.String | 
val body : CreateViewListReq =  // CreateViewListReq | 
try {
    val result : CreateViewListResp = apiInstance.apiV1ServicesParentIdViewsUserPost(parentId, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceViewApi#apiV1ServicesParentIdViewsUserPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceViewApi#apiV1ServicesParentIdViewsUserPost")
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

<a name="apiV1ServicesParentIdViewsUserUpdateorderPost"></a>
# **apiV1ServicesParentIdViewsUserUpdateorderPost**
> UpdateViewListOrderResp apiV1ServicesParentIdViewsUserUpdateorderPost(parentId, body)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = ServiceViewApi()
val parentId : kotlin.String = parentId_example // kotlin.String | 
val body : UpdateViewListOrderReq =  // UpdateViewListOrderReq | 
try {
    val result : UpdateViewListOrderResp = apiInstance.apiV1ServicesParentIdViewsUserUpdateorderPost(parentId, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceViewApi#apiV1ServicesParentIdViewsUserUpdateorderPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceViewApi#apiV1ServicesParentIdViewsUserUpdateorderPost")
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

<a name="apiV1ServicesViewsUserGet"></a>
# **apiV1ServicesViewsUserGet**
> kotlin.Array&lt;ServiceView&gt; apiV1ServicesViewsUserGet(take, skip, lmFrom, lmTo, includeDeleted, sort)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = ServiceViewApi()
val take : kotlin.Int = 56 // kotlin.Int | 
val skip : kotlin.Int = 56 // kotlin.Int | 
val lmFrom : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val lmTo : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val includeDeleted : kotlin.Boolean = true // kotlin.Boolean | 
val sort : ItemViewSortCondition =  // ItemViewSortCondition | 
try {
    val result : kotlin.Array<ServiceView> = apiInstance.apiV1ServicesViewsUserGet(take, skip, lmFrom, lmTo, includeDeleted, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceViewApi#apiV1ServicesViewsUserGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceViewApi#apiV1ServicesViewsUserGet")
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

[**kotlin.Array&lt;ServiceView&gt;**](ServiceView.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

