# NoteViewApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1NotesParentIdViewsPinnedChildIdDelete**](NoteViewApi.md#apiV1NotesParentIdViewsPinnedChildIdDelete) | **DELETE** /api/v1/notes/{parentId}/views/pinned/{childId} | 
[**apiV1NotesParentIdViewsPinnedChildIdGet**](NoteViewApi.md#apiV1NotesParentIdViewsPinnedChildIdGet) | **GET** /api/v1/notes/{parentId}/views/pinned/{childId} | 
[**apiV1NotesParentIdViewsPinnedGet**](NoteViewApi.md#apiV1NotesParentIdViewsPinnedGet) | **GET** /api/v1/notes/{parentId}/views/pinned | 
[**apiV1NotesParentIdViewsPinnedPost**](NoteViewApi.md#apiV1NotesParentIdViewsPinnedPost) | **POST** /api/v1/notes/{parentId}/views/pinned | 
[**apiV1NotesParentIdViewsPinnedUpdateorderPost**](NoteViewApi.md#apiV1NotesParentIdViewsPinnedUpdateorderPost) | **POST** /api/v1/notes/{parentId}/views/pinned/updateorder | 
[**apiV1NotesParentIdViewsUserChildIdDelete**](NoteViewApi.md#apiV1NotesParentIdViewsUserChildIdDelete) | **DELETE** /api/v1/notes/{parentId}/views/user/{childId} | 
[**apiV1NotesParentIdViewsUserChildIdGet**](NoteViewApi.md#apiV1NotesParentIdViewsUserChildIdGet) | **GET** /api/v1/notes/{parentId}/views/user/{childId} | 
[**apiV1NotesParentIdViewsUserChildIdPinPost**](NoteViewApi.md#apiV1NotesParentIdViewsUserChildIdPinPost) | **POST** /api/v1/notes/{parentId}/views/user/{childId}/pin | 
[**apiV1NotesParentIdViewsUserChildIdUnpinPost**](NoteViewApi.md#apiV1NotesParentIdViewsUserChildIdUnpinPost) | **POST** /api/v1/notes/{parentId}/views/user/{childId}/unpin | 
[**apiV1NotesParentIdViewsUserGet**](NoteViewApi.md#apiV1NotesParentIdViewsUserGet) | **GET** /api/v1/notes/{parentId}/views/user | 
[**apiV1NotesParentIdViewsUserPost**](NoteViewApi.md#apiV1NotesParentIdViewsUserPost) | **POST** /api/v1/notes/{parentId}/views/user | 
[**apiV1NotesParentIdViewsUserUpdateorderPost**](NoteViewApi.md#apiV1NotesParentIdViewsUserUpdateorderPost) | **POST** /api/v1/notes/{parentId}/views/user/updateorder | 
[**apiV1NotesViewsUserGet**](NoteViewApi.md#apiV1NotesViewsUserGet) | **GET** /api/v1/notes/views/user | 

<a name="apiV1NotesParentIdViewsPinnedChildIdDelete"></a>
# **apiV1NotesParentIdViewsPinnedChildIdDelete**
> DeleteResponse apiV1NotesParentIdViewsPinnedChildIdDelete(parentId, childId)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = NoteViewApi()
val parentId : kotlin.String = parentId_example // kotlin.String | 
val childId : kotlin.String = childId_example // kotlin.String | 
try {
    val result : DeleteResponse = apiInstance.apiV1NotesParentIdViewsPinnedChildIdDelete(parentId, childId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NoteViewApi#apiV1NotesParentIdViewsPinnedChildIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NoteViewApi#apiV1NotesParentIdViewsPinnedChildIdDelete")
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

<a name="apiV1NotesParentIdViewsPinnedChildIdGet"></a>
# **apiV1NotesParentIdViewsPinnedChildIdGet**
> NoteView apiV1NotesParentIdViewsPinnedChildIdGet(parentId, childId)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = NoteViewApi()
val parentId : kotlin.String = parentId_example // kotlin.String | 
val childId : kotlin.String = childId_example // kotlin.String | 
try {
    val result : NoteView = apiInstance.apiV1NotesParentIdViewsPinnedChildIdGet(parentId, childId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NoteViewApi#apiV1NotesParentIdViewsPinnedChildIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NoteViewApi#apiV1NotesParentIdViewsPinnedChildIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **kotlin.String**|  |
 **childId** | **kotlin.String**|  |

### Return type

[**NoteView**](NoteView.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1NotesParentIdViewsPinnedGet"></a>
# **apiV1NotesParentIdViewsPinnedGet**
> kotlin.Array&lt;NoteView&gt; apiV1NotesParentIdViewsPinnedGet(parentId, tags, take, skip, lmFrom, lmTo, includeDeleted, sort)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = NoteViewApi()
val parentId : kotlin.String = parentId_example // kotlin.String | 
val tags : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
val take : kotlin.Int = 56 // kotlin.Int | 
val skip : kotlin.Int = 56 // kotlin.Int | 
val lmFrom : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val lmTo : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val includeDeleted : kotlin.Boolean = true // kotlin.Boolean | 
val sort : ItemViewSortCondition =  // ItemViewSortCondition | 
try {
    val result : kotlin.Array<NoteView> = apiInstance.apiV1NotesParentIdViewsPinnedGet(parentId, tags, take, skip, lmFrom, lmTo, includeDeleted, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NoteViewApi#apiV1NotesParentIdViewsPinnedGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NoteViewApi#apiV1NotesParentIdViewsPinnedGet")
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

[**kotlin.Array&lt;NoteView&gt;**](NoteView.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1NotesParentIdViewsPinnedPost"></a>
# **apiV1NotesParentIdViewsPinnedPost**
> CreateViewListResp apiV1NotesParentIdViewsPinnedPost(parentId, body)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = NoteViewApi()
val parentId : kotlin.String = parentId_example // kotlin.String | 
val body : CreateViewListReq =  // CreateViewListReq | 
try {
    val result : CreateViewListResp = apiInstance.apiV1NotesParentIdViewsPinnedPost(parentId, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NoteViewApi#apiV1NotesParentIdViewsPinnedPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NoteViewApi#apiV1NotesParentIdViewsPinnedPost")
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

<a name="apiV1NotesParentIdViewsPinnedUpdateorderPost"></a>
# **apiV1NotesParentIdViewsPinnedUpdateorderPost**
> UpdateViewListOrderResp apiV1NotesParentIdViewsPinnedUpdateorderPost(parentId, body)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = NoteViewApi()
val parentId : kotlin.String = parentId_example // kotlin.String | 
val body : UpdateViewListOrderReq =  // UpdateViewListOrderReq | 
try {
    val result : UpdateViewListOrderResp = apiInstance.apiV1NotesParentIdViewsPinnedUpdateorderPost(parentId, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NoteViewApi#apiV1NotesParentIdViewsPinnedUpdateorderPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NoteViewApi#apiV1NotesParentIdViewsPinnedUpdateorderPost")
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

<a name="apiV1NotesParentIdViewsUserChildIdDelete"></a>
# **apiV1NotesParentIdViewsUserChildIdDelete**
> DeleteResponse apiV1NotesParentIdViewsUserChildIdDelete(parentId, childId)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = NoteViewApi()
val parentId : kotlin.String = parentId_example // kotlin.String | 
val childId : kotlin.String = childId_example // kotlin.String | 
try {
    val result : DeleteResponse = apiInstance.apiV1NotesParentIdViewsUserChildIdDelete(parentId, childId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NoteViewApi#apiV1NotesParentIdViewsUserChildIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NoteViewApi#apiV1NotesParentIdViewsUserChildIdDelete")
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

<a name="apiV1NotesParentIdViewsUserChildIdGet"></a>
# **apiV1NotesParentIdViewsUserChildIdGet**
> NoteView apiV1NotesParentIdViewsUserChildIdGet(parentId, childId)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = NoteViewApi()
val parentId : kotlin.String = parentId_example // kotlin.String | 
val childId : kotlin.String = childId_example // kotlin.String | 
try {
    val result : NoteView = apiInstance.apiV1NotesParentIdViewsUserChildIdGet(parentId, childId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NoteViewApi#apiV1NotesParentIdViewsUserChildIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NoteViewApi#apiV1NotesParentIdViewsUserChildIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **kotlin.String**|  |
 **childId** | **kotlin.String**|  |

### Return type

[**NoteView**](NoteView.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1NotesParentIdViewsUserChildIdPinPost"></a>
# **apiV1NotesParentIdViewsUserChildIdPinPost**
> ObjectInfo apiV1NotesParentIdViewsUserChildIdPinPost(parentId, childId, alias)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = NoteViewApi()
val parentId : kotlin.String = parentId_example // kotlin.String | 
val childId : kotlin.String = childId_example // kotlin.String | 
val alias : kotlin.String = alias_example // kotlin.String | 
try {
    val result : ObjectInfo = apiInstance.apiV1NotesParentIdViewsUserChildIdPinPost(parentId, childId, alias)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NoteViewApi#apiV1NotesParentIdViewsUserChildIdPinPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NoteViewApi#apiV1NotesParentIdViewsUserChildIdPinPost")
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

<a name="apiV1NotesParentIdViewsUserChildIdUnpinPost"></a>
# **apiV1NotesParentIdViewsUserChildIdUnpinPost**
> ObjectInfo apiV1NotesParentIdViewsUserChildIdUnpinPost(parentId, childId, alias)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = NoteViewApi()
val parentId : kotlin.String = parentId_example // kotlin.String | 
val childId : kotlin.String = childId_example // kotlin.String | 
val alias : kotlin.String = alias_example // kotlin.String | 
try {
    val result : ObjectInfo = apiInstance.apiV1NotesParentIdViewsUserChildIdUnpinPost(parentId, childId, alias)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NoteViewApi#apiV1NotesParentIdViewsUserChildIdUnpinPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NoteViewApi#apiV1NotesParentIdViewsUserChildIdUnpinPost")
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

<a name="apiV1NotesParentIdViewsUserGet"></a>
# **apiV1NotesParentIdViewsUserGet**
> kotlin.Array&lt;NoteView&gt; apiV1NotesParentIdViewsUserGet(parentId, tags, take, skip, lmFrom, lmTo, includeDeleted, sort)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = NoteViewApi()
val parentId : kotlin.String = parentId_example // kotlin.String | 
val tags : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
val take : kotlin.Int = 56 // kotlin.Int | 
val skip : kotlin.Int = 56 // kotlin.Int | 
val lmFrom : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val lmTo : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val includeDeleted : kotlin.Boolean = true // kotlin.Boolean | 
val sort : ItemViewSortCondition =  // ItemViewSortCondition | 
try {
    val result : kotlin.Array<NoteView> = apiInstance.apiV1NotesParentIdViewsUserGet(parentId, tags, take, skip, lmFrom, lmTo, includeDeleted, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NoteViewApi#apiV1NotesParentIdViewsUserGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NoteViewApi#apiV1NotesParentIdViewsUserGet")
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

[**kotlin.Array&lt;NoteView&gt;**](NoteView.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1NotesParentIdViewsUserPost"></a>
# **apiV1NotesParentIdViewsUserPost**
> CreateViewListResp apiV1NotesParentIdViewsUserPost(parentId, body)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = NoteViewApi()
val parentId : kotlin.String = parentId_example // kotlin.String | 
val body : CreateViewListReq =  // CreateViewListReq | 
try {
    val result : CreateViewListResp = apiInstance.apiV1NotesParentIdViewsUserPost(parentId, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NoteViewApi#apiV1NotesParentIdViewsUserPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NoteViewApi#apiV1NotesParentIdViewsUserPost")
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

<a name="apiV1NotesParentIdViewsUserUpdateorderPost"></a>
# **apiV1NotesParentIdViewsUserUpdateorderPost**
> UpdateViewListOrderResp apiV1NotesParentIdViewsUserUpdateorderPost(parentId, body)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = NoteViewApi()
val parentId : kotlin.String = parentId_example // kotlin.String | 
val body : UpdateViewListOrderReq =  // UpdateViewListOrderReq | 
try {
    val result : UpdateViewListOrderResp = apiInstance.apiV1NotesParentIdViewsUserUpdateorderPost(parentId, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NoteViewApi#apiV1NotesParentIdViewsUserUpdateorderPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NoteViewApi#apiV1NotesParentIdViewsUserUpdateorderPost")
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

<a name="apiV1NotesViewsUserGet"></a>
# **apiV1NotesViewsUserGet**
> kotlin.Array&lt;NoteView&gt; apiV1NotesViewsUserGet(take, skip, lmFrom, lmTo, includeDeleted, sort)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = NoteViewApi()
val take : kotlin.Int = 56 // kotlin.Int | 
val skip : kotlin.Int = 56 // kotlin.Int | 
val lmFrom : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val lmTo : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val includeDeleted : kotlin.Boolean = true // kotlin.Boolean | 
val sort : ItemViewSortCondition =  // ItemViewSortCondition | 
try {
    val result : kotlin.Array<NoteView> = apiInstance.apiV1NotesViewsUserGet(take, skip, lmFrom, lmTo, includeDeleted, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NoteViewApi#apiV1NotesViewsUserGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NoteViewApi#apiV1NotesViewsUserGet")
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

[**kotlin.Array&lt;NoteView&gt;**](NoteView.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

