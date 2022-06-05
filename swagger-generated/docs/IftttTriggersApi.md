# IftttTriggersApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1IftttV1TriggersNewNoteCreatedPost**](IftttTriggersApi.md#apiV1IftttV1TriggersNewNoteCreatedPost) | **POST** /api/v1/ifttt/v1/triggers/new_note_created | 

<a name="apiV1IftttV1TriggersNewNoteCreatedPost"></a>
# **apiV1IftttV1TriggersNewNoteCreatedPost**
> StringObjectDictionaryIEnumerableIftttResponse apiV1IftttV1TriggersNewNoteCreatedPost(body)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = IftttTriggersApi()
val body : IftttTriggerRequest =  // IftttTriggerRequest | 
try {
    val result : StringObjectDictionaryIEnumerableIftttResponse = apiInstance.apiV1IftttV1TriggersNewNoteCreatedPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IftttTriggersApi#apiV1IftttV1TriggersNewNoteCreatedPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IftttTriggersApi#apiV1IftttV1TriggersNewNoteCreatedPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IftttTriggerRequest**](IftttTriggerRequest.md)|  | [optional]

### Return type

[**StringObjectDictionaryIEnumerableIftttResponse**](StringObjectDictionaryIEnumerableIftttResponse.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

