# ResourceViewApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1ResourcesParentIdViewsPinnedChildIdDelete**](ResourceViewApi.md#apiV1ResourcesParentIdViewsPinnedChildIdDelete) | **DELETE** /api/v1/resources/{parentId}/views/pinned/{childId} | 
[**apiV1ResourcesParentIdViewsPinnedChildIdGet**](ResourceViewApi.md#apiV1ResourcesParentIdViewsPinnedChildIdGet) | **GET** /api/v1/resources/{parentId}/views/pinned/{childId} | 
[**apiV1ResourcesParentIdViewsPinnedGet**](ResourceViewApi.md#apiV1ResourcesParentIdViewsPinnedGet) | **GET** /api/v1/resources/{parentId}/views/pinned | 
[**apiV1ResourcesParentIdViewsPinnedPost**](ResourceViewApi.md#apiV1ResourcesParentIdViewsPinnedPost) | **POST** /api/v1/resources/{parentId}/views/pinned | 
[**apiV1ResourcesParentIdViewsPinnedUpdateorderPost**](ResourceViewApi.md#apiV1ResourcesParentIdViewsPinnedUpdateorderPost) | **POST** /api/v1/resources/{parentId}/views/pinned/updateorder | 
[**apiV1ResourcesParentIdViewsUserChildIdDelete**](ResourceViewApi.md#apiV1ResourcesParentIdViewsUserChildIdDelete) | **DELETE** /api/v1/resources/{parentId}/views/user/{childId} | 
[**apiV1ResourcesParentIdViewsUserChildIdGet**](ResourceViewApi.md#apiV1ResourcesParentIdViewsUserChildIdGet) | **GET** /api/v1/resources/{parentId}/views/user/{childId} | 
[**apiV1ResourcesParentIdViewsUserChildIdPinPost**](ResourceViewApi.md#apiV1ResourcesParentIdViewsUserChildIdPinPost) | **POST** /api/v1/resources/{parentId}/views/user/{childId}/pin | 
[**apiV1ResourcesParentIdViewsUserChildIdUnpinPost**](ResourceViewApi.md#apiV1ResourcesParentIdViewsUserChildIdUnpinPost) | **POST** /api/v1/resources/{parentId}/views/user/{childId}/unpin | 
[**apiV1ResourcesParentIdViewsUserGet**](ResourceViewApi.md#apiV1ResourcesParentIdViewsUserGet) | **GET** /api/v1/resources/{parentId}/views/user | 
[**apiV1ResourcesParentIdViewsUserPost**](ResourceViewApi.md#apiV1ResourcesParentIdViewsUserPost) | **POST** /api/v1/resources/{parentId}/views/user | 
[**apiV1ResourcesParentIdViewsUserUpdateorderPost**](ResourceViewApi.md#apiV1ResourcesParentIdViewsUserUpdateorderPost) | **POST** /api/v1/resources/{parentId}/views/user/updateorder | 
[**apiV1ResourcesViewsUserGet**](ResourceViewApi.md#apiV1ResourcesViewsUserGet) | **GET** /api/v1/resources/views/user | 

<a name="apiV1ResourcesParentIdViewsPinnedChildIdDelete"></a>
# **apiV1ResourcesParentIdViewsPinnedChildIdDelete**
> DeleteResponse apiV1ResourcesParentIdViewsPinnedChildIdDelete(parentId, childId)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = ResourceViewApi()
val parentId : kotlin.String = parentId_example // kotlin.String | 
val childId : kotlin.String = childId_example // kotlin.String | 
try {
    val result : DeleteResponse = apiInstance.apiV1ResourcesParentIdViewsPinnedChildIdDelete(parentId, childId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ResourceViewApi#apiV1ResourcesParentIdViewsPinnedChildIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResourceViewApi#apiV1ResourcesParentIdViewsPinnedChildIdDelete")
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

<a name="apiV1ResourcesParentIdViewsPinnedChildIdGet"></a>
# **apiV1ResourcesParentIdViewsPinnedChildIdGet**
> ResourceView apiV1ResourcesParentIdViewsPinnedChildIdGet(parentId, childId)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = ResourceViewApi()
val parentId : kotlin.String = parentId_example // kotlin.String | 
val childId : kotlin.String = childId_example // kotlin.String | 
try {
    val result : ResourceView = apiInstance.apiV1ResourcesParentIdViewsPinnedChildIdGet(parentId, childId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ResourceViewApi#apiV1ResourcesParentIdViewsPinnedChildIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResourceViewApi#apiV1ResourcesParentIdViewsPinnedChildIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **kotlin.String**|  |
 **childId** | **kotlin.String**|  |

### Return type

[**ResourceView**](ResourceView.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1ResourcesParentIdViewsPinnedGet"></a>
# **apiV1ResourcesParentIdViewsPinnedGet**
> kotlin.Array&lt;ResourceView&gt; apiV1ResourcesParentIdViewsPinnedGet(parentId, tags, take, skip, lmFrom, lmTo, includeDeleted, sort)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = ResourceViewApi()
val parentId : kotlin.String = parentId_example // kotlin.String | 
val tags : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
val take : kotlin.Int = 56 // kotlin.Int | 
val skip : kotlin.Int = 56 // kotlin.Int | 
val lmFrom : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val lmTo : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val includeDeleted : kotlin.Boolean = true // kotlin.Boolean | 
val sort : ItemViewSortCondition =  // ItemViewSortCondition | 
try {
    val result : kotlin.Array<ResourceView> = apiInstance.apiV1ResourcesParentIdViewsPinnedGet(parentId, tags, take, skip, lmFrom, lmTo, includeDeleted, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ResourceViewApi#apiV1ResourcesParentIdViewsPinnedGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResourceViewApi#apiV1ResourcesParentIdViewsPinnedGet")
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

[**kotlin.Array&lt;ResourceView&gt;**](ResourceView.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1ResourcesParentIdViewsPinnedPost"></a>
# **apiV1ResourcesParentIdViewsPinnedPost**
> CreateViewListResp apiV1ResourcesParentIdViewsPinnedPost(parentId, body)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = ResourceViewApi()
val parentId : kotlin.String = parentId_example // kotlin.String | 
val body : CreateViewListReq =  // CreateViewListReq | 
try {
    val result : CreateViewListResp = apiInstance.apiV1ResourcesParentIdViewsPinnedPost(parentId, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ResourceViewApi#apiV1ResourcesParentIdViewsPinnedPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResourceViewApi#apiV1ResourcesParentIdViewsPinnedPost")
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

<a name="apiV1ResourcesParentIdViewsPinnedUpdateorderPost"></a>
# **apiV1ResourcesParentIdViewsPinnedUpdateorderPost**
> UpdateViewListOrderResp apiV1ResourcesParentIdViewsPinnedUpdateorderPost(parentId, body)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = ResourceViewApi()
val parentId : kotlin.String = parentId_example // kotlin.String | 
val body : UpdateViewListOrderReq =  // UpdateViewListOrderReq | 
try {
    val result : UpdateViewListOrderResp = apiInstance.apiV1ResourcesParentIdViewsPinnedUpdateorderPost(parentId, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ResourceViewApi#apiV1ResourcesParentIdViewsPinnedUpdateorderPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResourceViewApi#apiV1ResourcesParentIdViewsPinnedUpdateorderPost")
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

<a name="apiV1ResourcesParentIdViewsUserChildIdDelete"></a>
# **apiV1ResourcesParentIdViewsUserChildIdDelete**
> DeleteResponse apiV1ResourcesParentIdViewsUserChildIdDelete(parentId, childId)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = ResourceViewApi()
val parentId : kotlin.String = parentId_example // kotlin.String | 
val childId : kotlin.String = childId_example // kotlin.String | 
try {
    val result : DeleteResponse = apiInstance.apiV1ResourcesParentIdViewsUserChildIdDelete(parentId, childId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ResourceViewApi#apiV1ResourcesParentIdViewsUserChildIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResourceViewApi#apiV1ResourcesParentIdViewsUserChildIdDelete")
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

<a name="apiV1ResourcesParentIdViewsUserChildIdGet"></a>
# **apiV1ResourcesParentIdViewsUserChildIdGet**
> ResourceView apiV1ResourcesParentIdViewsUserChildIdGet(parentId, childId)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = ResourceViewApi()
val parentId : kotlin.String = parentId_example // kotlin.String | 
val childId : kotlin.String = childId_example // kotlin.String | 
try {
    val result : ResourceView = apiInstance.apiV1ResourcesParentIdViewsUserChildIdGet(parentId, childId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ResourceViewApi#apiV1ResourcesParentIdViewsUserChildIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResourceViewApi#apiV1ResourcesParentIdViewsUserChildIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **kotlin.String**|  |
 **childId** | **kotlin.String**|  |

### Return type

[**ResourceView**](ResourceView.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1ResourcesParentIdViewsUserChildIdPinPost"></a>
# **apiV1ResourcesParentIdViewsUserChildIdPinPost**
> ObjectInfo apiV1ResourcesParentIdViewsUserChildIdPinPost(parentId, childId, alias)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = ResourceViewApi()
val parentId : kotlin.String = parentId_example // kotlin.String | 
val childId : kotlin.String = childId_example // kotlin.String | 
val alias : kotlin.String = alias_example // kotlin.String | 
try {
    val result : ObjectInfo = apiInstance.apiV1ResourcesParentIdViewsUserChildIdPinPost(parentId, childId, alias)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ResourceViewApi#apiV1ResourcesParentIdViewsUserChildIdPinPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResourceViewApi#apiV1ResourcesParentIdViewsUserChildIdPinPost")
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

<a name="apiV1ResourcesParentIdViewsUserChildIdUnpinPost"></a>
# **apiV1ResourcesParentIdViewsUserChildIdUnpinPost**
> ObjectInfo apiV1ResourcesParentIdViewsUserChildIdUnpinPost(parentId, childId, alias)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = ResourceViewApi()
val parentId : kotlin.String = parentId_example // kotlin.String | 
val childId : kotlin.String = childId_example // kotlin.String | 
val alias : kotlin.String = alias_example // kotlin.String | 
try {
    val result : ObjectInfo = apiInstance.apiV1ResourcesParentIdViewsUserChildIdUnpinPost(parentId, childId, alias)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ResourceViewApi#apiV1ResourcesParentIdViewsUserChildIdUnpinPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResourceViewApi#apiV1ResourcesParentIdViewsUserChildIdUnpinPost")
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

<a name="apiV1ResourcesParentIdViewsUserGet"></a>
# **apiV1ResourcesParentIdViewsUserGet**
> kotlin.Array&lt;ResourceView&gt; apiV1ResourcesParentIdViewsUserGet(parentId, tags, take, skip, lmFrom, lmTo, includeDeleted, sort)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = ResourceViewApi()
val parentId : kotlin.String = parentId_example // kotlin.String | 
val tags : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
val take : kotlin.Int = 56 // kotlin.Int | 
val skip : kotlin.Int = 56 // kotlin.Int | 
val lmFrom : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val lmTo : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val includeDeleted : kotlin.Boolean = true // kotlin.Boolean | 
val sort : ItemViewSortCondition =  // ItemViewSortCondition | 
try {
    val result : kotlin.Array<ResourceView> = apiInstance.apiV1ResourcesParentIdViewsUserGet(parentId, tags, take, skip, lmFrom, lmTo, includeDeleted, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ResourceViewApi#apiV1ResourcesParentIdViewsUserGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResourceViewApi#apiV1ResourcesParentIdViewsUserGet")
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

[**kotlin.Array&lt;ResourceView&gt;**](ResourceView.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1ResourcesParentIdViewsUserPost"></a>
# **apiV1ResourcesParentIdViewsUserPost**
> CreateViewListResp apiV1ResourcesParentIdViewsUserPost(parentId, body)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = ResourceViewApi()
val parentId : kotlin.String = parentId_example // kotlin.String | 
val body : CreateViewListReq =  // CreateViewListReq | 
try {
    val result : CreateViewListResp = apiInstance.apiV1ResourcesParentIdViewsUserPost(parentId, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ResourceViewApi#apiV1ResourcesParentIdViewsUserPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResourceViewApi#apiV1ResourcesParentIdViewsUserPost")
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

<a name="apiV1ResourcesParentIdViewsUserUpdateorderPost"></a>
# **apiV1ResourcesParentIdViewsUserUpdateorderPost**
> UpdateViewListOrderResp apiV1ResourcesParentIdViewsUserUpdateorderPost(parentId, body)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = ResourceViewApi()
val parentId : kotlin.String = parentId_example // kotlin.String | 
val body : UpdateViewListOrderReq =  // UpdateViewListOrderReq | 
try {
    val result : UpdateViewListOrderResp = apiInstance.apiV1ResourcesParentIdViewsUserUpdateorderPost(parentId, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ResourceViewApi#apiV1ResourcesParentIdViewsUserUpdateorderPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResourceViewApi#apiV1ResourcesParentIdViewsUserUpdateorderPost")
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

<a name="apiV1ResourcesViewsUserGet"></a>
# **apiV1ResourcesViewsUserGet**
> kotlin.Array&lt;ResourceView&gt; apiV1ResourcesViewsUserGet(take, skip, lmFrom, lmTo, includeDeleted, sort)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = ResourceViewApi()
val take : kotlin.Int = 56 // kotlin.Int | 
val skip : kotlin.Int = 56 // kotlin.Int | 
val lmFrom : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val lmTo : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val includeDeleted : kotlin.Boolean = true // kotlin.Boolean | 
val sort : ItemViewSortCondition =  // ItemViewSortCondition | 
try {
    val result : kotlin.Array<ResourceView> = apiInstance.apiV1ResourcesViewsUserGet(take, skip, lmFrom, lmTo, includeDeleted, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ResourceViewApi#apiV1ResourcesViewsUserGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResourceViewApi#apiV1ResourcesViewsUserGet")
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

[**kotlin.Array&lt;ResourceView&gt;**](ResourceView.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

