# SearchApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1SearchAdviseditemsGet**](SearchApi.md#apiV1SearchAdviseditemsGet) | **GET** /api/v1/search/adviseditems | 
[**apiV1SearchCalendarsGet**](SearchApi.md#apiV1SearchCalendarsGet) | **GET** /api/v1/search/calendars | 
[**apiV1SearchCasesGet**](SearchApi.md#apiV1SearchCasesGet) | **GET** /api/v1/search/cases | 
[**apiV1SearchContactsGet**](SearchApi.md#apiV1SearchContactsGet) | **GET** /api/v1/search/contacts | 
[**apiV1SearchNotesGet**](SearchApi.md#apiV1SearchNotesGet) | **GET** /api/v1/search/notes | 
[**apiV1SearchResourcesGet**](SearchApi.md#apiV1SearchResourcesGet) | **GET** /api/v1/search/resources | 
[**apiV1SearchServicesGet**](SearchApi.md#apiV1SearchServicesGet) | **GET** /api/v1/search/services | 
[**apiV1SearchTorrowIdOrdersPut**](SearchApi.md#apiV1SearchTorrowIdOrdersPut) | **PUT** /api/v1/search/{torrowId}/orders | 

<a name="apiV1SearchAdviseditemsGet"></a>
# **apiV1SearchAdviseditemsGet**
> kotlin.Array&lt;TorrowItem&gt; apiV1SearchAdviseditemsGet(type, longitude, latitude, language, take, skip)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = SearchApi()
val type : AdvisedItemType =  // AdvisedItemType | 
val longitude : kotlin.Double = 1.2 // kotlin.Double | 
val latitude : kotlin.Double = 1.2 // kotlin.Double | 
val language : kotlin.String = language_example // kotlin.String | 
val take : kotlin.Int = 56 // kotlin.Int | 
val skip : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.Array<TorrowItem> = apiInstance.apiV1SearchAdviseditemsGet(type, longitude, latitude, language, take, skip)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SearchApi#apiV1SearchAdviseditemsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SearchApi#apiV1SearchAdviseditemsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | [**AdvisedItemType**](.md)|  | [optional]
 **longitude** | **kotlin.Double**|  | [optional]
 **latitude** | **kotlin.Double**|  | [optional]
 **language** | **kotlin.String**|  | [optional]
 **take** | **kotlin.Int**|  | [optional]
 **skip** | **kotlin.Int**|  | [optional]

### Return type

[**kotlin.Array&lt;TorrowItem&gt;**](TorrowItem.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1SearchCalendarsGet"></a>
# **apiV1SearchCalendarsGet**
> kotlin.Array&lt;CalendarView&gt; apiV1SearchCalendarsGet(text, distance, take, skip, groupIds)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = SearchApi()
val text : kotlin.String = text_example // kotlin.String | 
val distance : kotlin.Int = 56 // kotlin.Int | 
val take : kotlin.Int = 56 // kotlin.Int | 
val skip : kotlin.Int = 56 // kotlin.Int | 
val groupIds : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
try {
    val result : kotlin.Array<CalendarView> = apiInstance.apiV1SearchCalendarsGet(text, distance, take, skip, groupIds)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SearchApi#apiV1SearchCalendarsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SearchApi#apiV1SearchCalendarsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **text** | **kotlin.String**|  | [optional]
 **distance** | **kotlin.Int**|  | [optional]
 **take** | **kotlin.Int**|  | [optional]
 **skip** | **kotlin.Int**|  | [optional]
 **groupIds** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]

### Return type

[**kotlin.Array&lt;CalendarView&gt;**](CalendarView.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1SearchCasesGet"></a>
# **apiV1SearchCasesGet**
> kotlin.Array&lt;CaseView&gt; apiV1SearchCasesGet(text, distance, take, skip, groupIds)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = SearchApi()
val text : kotlin.String = text_example // kotlin.String | 
val distance : kotlin.Int = 56 // kotlin.Int | 
val take : kotlin.Int = 56 // kotlin.Int | 
val skip : kotlin.Int = 56 // kotlin.Int | 
val groupIds : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
try {
    val result : kotlin.Array<CaseView> = apiInstance.apiV1SearchCasesGet(text, distance, take, skip, groupIds)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SearchApi#apiV1SearchCasesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SearchApi#apiV1SearchCasesGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **text** | **kotlin.String**|  | [optional]
 **distance** | **kotlin.Int**|  | [optional]
 **take** | **kotlin.Int**|  | [optional]
 **skip** | **kotlin.Int**|  | [optional]
 **groupIds** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]

### Return type

[**kotlin.Array&lt;CaseView&gt;**](CaseView.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1SearchContactsGet"></a>
# **apiV1SearchContactsGet**
> kotlin.Array&lt;ContactView&gt; apiV1SearchContactsGet(text, distance, usersOnly, take, skip, groupIds, isSubscribersSearch)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = SearchApi()
val text : kotlin.String = text_example // kotlin.String | 
val distance : kotlin.Int = 56 // kotlin.Int | 
val usersOnly : kotlin.Boolean = true // kotlin.Boolean | 
val take : kotlin.Int = 56 // kotlin.Int | 
val skip : kotlin.Int = 56 // kotlin.Int | 
val groupIds : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
val isSubscribersSearch : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : kotlin.Array<ContactView> = apiInstance.apiV1SearchContactsGet(text, distance, usersOnly, take, skip, groupIds, isSubscribersSearch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SearchApi#apiV1SearchContactsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SearchApi#apiV1SearchContactsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **text** | **kotlin.String**|  | [optional]
 **distance** | **kotlin.Int**|  | [optional]
 **usersOnly** | **kotlin.Boolean**|  | [optional]
 **take** | **kotlin.Int**|  | [optional]
 **skip** | **kotlin.Int**|  | [optional]
 **groupIds** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]
 **isSubscribersSearch** | **kotlin.Boolean**|  | [optional] [default to false]

### Return type

[**kotlin.Array&lt;ContactView&gt;**](ContactView.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1SearchNotesGet"></a>
# **apiV1SearchNotesGet**
> kotlin.Array&lt;NoteView&gt; apiV1SearchNotesGet(text, distance, take, skip, groupIds)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = SearchApi()
val text : kotlin.String = text_example // kotlin.String | 
val distance : kotlin.Int = 56 // kotlin.Int | 
val take : kotlin.Int = 56 // kotlin.Int | 
val skip : kotlin.Int = 56 // kotlin.Int | 
val groupIds : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
try {
    val result : kotlin.Array<NoteView> = apiInstance.apiV1SearchNotesGet(text, distance, take, skip, groupIds)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SearchApi#apiV1SearchNotesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SearchApi#apiV1SearchNotesGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **text** | **kotlin.String**|  | [optional]
 **distance** | **kotlin.Int**|  | [optional]
 **take** | **kotlin.Int**|  | [optional]
 **skip** | **kotlin.Int**|  | [optional]
 **groupIds** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]

### Return type

[**kotlin.Array&lt;NoteView&gt;**](NoteView.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1SearchResourcesGet"></a>
# **apiV1SearchResourcesGet**
> kotlin.Array&lt;ResourceView&gt; apiV1SearchResourcesGet(text, distance, take, skip, groupIds)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = SearchApi()
val text : kotlin.String = text_example // kotlin.String | 
val distance : kotlin.Int = 56 // kotlin.Int | 
val take : kotlin.Int = 56 // kotlin.Int | 
val skip : kotlin.Int = 56 // kotlin.Int | 
val groupIds : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
try {
    val result : kotlin.Array<ResourceView> = apiInstance.apiV1SearchResourcesGet(text, distance, take, skip, groupIds)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SearchApi#apiV1SearchResourcesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SearchApi#apiV1SearchResourcesGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **text** | **kotlin.String**|  | [optional]
 **distance** | **kotlin.Int**|  | [optional]
 **take** | **kotlin.Int**|  | [optional]
 **skip** | **kotlin.Int**|  | [optional]
 **groupIds** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]

### Return type

[**kotlin.Array&lt;ResourceView&gt;**](ResourceView.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1SearchServicesGet"></a>
# **apiV1SearchServicesGet**
> kotlin.Array&lt;ServiceView&gt; apiV1SearchServicesGet(text, distance, take, skip, groupIds)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = SearchApi()
val text : kotlin.String = text_example // kotlin.String | 
val distance : kotlin.Int = 56 // kotlin.Int | 
val take : kotlin.Int = 56 // kotlin.Int | 
val skip : kotlin.Int = 56 // kotlin.Int | 
val groupIds : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
try {
    val result : kotlin.Array<ServiceView> = apiInstance.apiV1SearchServicesGet(text, distance, take, skip, groupIds)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SearchApi#apiV1SearchServicesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SearchApi#apiV1SearchServicesGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **text** | **kotlin.String**|  | [optional]
 **distance** | **kotlin.Int**|  | [optional]
 **take** | **kotlin.Int**|  | [optional]
 **skip** | **kotlin.Int**|  | [optional]
 **groupIds** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]

### Return type

[**kotlin.Array&lt;ServiceView&gt;**](ServiceView.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1SearchTorrowIdOrdersPut"></a>
# **apiV1SearchTorrowIdOrdersPut**
> kotlin.Array&lt;CaseView&gt; apiV1SearchTorrowIdOrdersPut(torrowId, body, take, skip, lmFrom, lmTo, createDateFrom, createDateTo, sort)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = SearchApi()
val torrowId : kotlin.String = torrowId_example // kotlin.String | 
val body : OrderFilter =  // OrderFilter | 
val take : kotlin.Int = 56 // kotlin.Int | 
val skip : kotlin.Int = 56 // kotlin.Int | 
val lmFrom : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val lmTo : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val createDateFrom : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val createDateTo : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val sort : OrderViewSortCondition =  // OrderViewSortCondition | 
try {
    val result : kotlin.Array<CaseView> = apiInstance.apiV1SearchTorrowIdOrdersPut(torrowId, body, take, skip, lmFrom, lmTo, createDateFrom, createDateTo, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SearchApi#apiV1SearchTorrowIdOrdersPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SearchApi#apiV1SearchTorrowIdOrdersPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **torrowId** | **kotlin.String**|  |
 **body** | [**OrderFilter**](OrderFilter.md)|  | [optional]
 **take** | **kotlin.Int**|  | [optional] [default to 2147483647]
 **skip** | **kotlin.Int**|  | [optional] [default to 0]
 **lmFrom** | **java.time.LocalDateTime**|  | [optional]
 **lmTo** | **java.time.LocalDateTime**|  | [optional]
 **createDateFrom** | **java.time.LocalDateTime**|  | [optional]
 **createDateTo** | **java.time.LocalDateTime**|  | [optional]
 **sort** | [**OrderViewSortCondition**](.md)|  | [optional]

### Return type

[**kotlin.Array&lt;CaseView&gt;**](CaseView.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

