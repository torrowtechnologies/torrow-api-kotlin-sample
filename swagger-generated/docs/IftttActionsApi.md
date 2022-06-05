# IftttActionsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1IftttV1ActionsActionNameFieldsUserProfileIdOptionsPost**](IftttActionsApi.md#apiV1IftttV1ActionsActionNameFieldsUserProfileIdOptionsPost) | **POST** /api/v1/ifttt/v1/actions/{actionName}/fields/user_profile_id/options | 
[**apiV1IftttV1ActionsCreateNewFileNotePost**](IftttActionsApi.md#apiV1IftttV1ActionsCreateNewFileNotePost) | **POST** /api/v1/ifttt/v1/actions/create_new_file_note | 
[**apiV1IftttV1ActionsCreateNewPhotoNotePost**](IftttActionsApi.md#apiV1IftttV1ActionsCreateNewPhotoNotePost) | **POST** /api/v1/ifttt/v1/actions/create_new_photo_note | 
[**apiV1IftttV1ActionsCreateNewTextNotePost**](IftttActionsApi.md#apiV1IftttV1ActionsCreateNewTextNotePost) | **POST** /api/v1/ifttt/v1/actions/create_new_text_note | 

<a name="apiV1IftttV1ActionsActionNameFieldsUserProfileIdOptionsPost"></a>
# **apiV1IftttV1ActionsActionNameFieldsUserProfileIdOptionsPost**
> ObjectIEnumerableIftttResponse apiV1IftttV1ActionsActionNameFieldsUserProfileIdOptionsPost(actionName)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = IftttActionsApi()
val actionName : kotlin.String = actionName_example // kotlin.String | 
try {
    val result : ObjectIEnumerableIftttResponse = apiInstance.apiV1IftttV1ActionsActionNameFieldsUserProfileIdOptionsPost(actionName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IftttActionsApi#apiV1IftttV1ActionsActionNameFieldsUserProfileIdOptionsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IftttActionsApi#apiV1IftttV1ActionsActionNameFieldsUserProfileIdOptionsPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **actionName** | **kotlin.String**|  |

### Return type

[**ObjectIEnumerableIftttResponse**](ObjectIEnumerableIftttResponse.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1IftttV1ActionsCreateNewFileNotePost"></a>
# **apiV1IftttV1ActionsCreateNewFileNotePost**
> NoteItem apiV1IftttV1ActionsCreateNewFileNotePost(body)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = IftttActionsApi()
val body : IftttActionRequest =  // IftttActionRequest | 
try {
    val result : NoteItem = apiInstance.apiV1IftttV1ActionsCreateNewFileNotePost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IftttActionsApi#apiV1IftttV1ActionsCreateNewFileNotePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IftttActionsApi#apiV1IftttV1ActionsCreateNewFileNotePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IftttActionRequest**](IftttActionRequest.md)|  | [optional]

### Return type

[**NoteItem**](NoteItem.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1IftttV1ActionsCreateNewPhotoNotePost"></a>
# **apiV1IftttV1ActionsCreateNewPhotoNotePost**
> NoteItem apiV1IftttV1ActionsCreateNewPhotoNotePost(body)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = IftttActionsApi()
val body : IftttActionRequest =  // IftttActionRequest | 
try {
    val result : NoteItem = apiInstance.apiV1IftttV1ActionsCreateNewPhotoNotePost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IftttActionsApi#apiV1IftttV1ActionsCreateNewPhotoNotePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IftttActionsApi#apiV1IftttV1ActionsCreateNewPhotoNotePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IftttActionRequest**](IftttActionRequest.md)|  | [optional]

### Return type

[**NoteItem**](NoteItem.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1IftttV1ActionsCreateNewTextNotePost"></a>
# **apiV1IftttV1ActionsCreateNewTextNotePost**
> NoteItem apiV1IftttV1ActionsCreateNewTextNotePost(body)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = IftttActionsApi()
val body : IftttActionRequest =  // IftttActionRequest | 
try {
    val result : NoteItem = apiInstance.apiV1IftttV1ActionsCreateNewTextNotePost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IftttActionsApi#apiV1IftttV1ActionsCreateNewTextNotePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IftttActionsApi#apiV1IftttV1ActionsCreateNewTextNotePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IftttActionRequest**](IftttActionRequest.md)|  | [optional]

### Return type

[**NoteItem**](NoteItem.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

