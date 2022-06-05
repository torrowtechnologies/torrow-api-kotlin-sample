# ThesaurusApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1ThesaurusHobbiesGet**](ThesaurusApi.md#apiV1ThesaurusHobbiesGet) | **GET** /api/v1/thesaurus/hobbies | 
[**apiV1ThesaurusPlacesGet**](ThesaurusApi.md#apiV1ThesaurusPlacesGet) | **GET** /api/v1/thesaurus/places | 

<a name="apiV1ThesaurusHobbiesGet"></a>
# **apiV1ThesaurusHobbiesGet**
> kotlin.Array&lt;Hobby&gt; apiV1ThesaurusHobbiesGet(lng, take, skip, includeDeleted, sort)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = ThesaurusApi()
val lng : kotlin.String = lng_example // kotlin.String | 
val take : kotlin.Int = 56 // kotlin.Int | 
val skip : kotlin.Int = 56 // kotlin.Int | 
val includeDeleted : kotlin.Boolean = true // kotlin.Boolean | 
val sort : DictionarySortCondition =  // DictionarySortCondition | 
try {
    val result : kotlin.Array<Hobby> = apiInstance.apiV1ThesaurusHobbiesGet(lng, take, skip, includeDeleted, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ThesaurusApi#apiV1ThesaurusHobbiesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ThesaurusApi#apiV1ThesaurusHobbiesGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lng** | **kotlin.String**|  | [optional]
 **take** | **kotlin.Int**|  | [optional]
 **skip** | **kotlin.Int**|  | [optional]
 **includeDeleted** | **kotlin.Boolean**|  | [optional]
 **sort** | [**DictionarySortCondition**](.md)|  | [optional]

### Return type

[**kotlin.Array&lt;Hobby&gt;**](Hobby.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1ThesaurusPlacesGet"></a>
# **apiV1ThesaurusPlacesGet**
> kotlin.Array&lt;Place&gt; apiV1ThesaurusPlacesGet(lat, lon, r, txt, lng, take, skip, includeDeleted, sort)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = ThesaurusApi()
val lat : kotlin.Double = 1.2 // kotlin.Double | 
val lon : kotlin.Double = 1.2 // kotlin.Double | 
val r : kotlin.Double = 1.2 // kotlin.Double | 
val txt : kotlin.String = txt_example // kotlin.String | 
val lng : kotlin.String = lng_example // kotlin.String | 
val take : kotlin.Int = 56 // kotlin.Int | 
val skip : kotlin.Int = 56 // kotlin.Int | 
val includeDeleted : kotlin.Boolean = true // kotlin.Boolean | 
val sort : DictionarySortCondition =  // DictionarySortCondition | 
try {
    val result : kotlin.Array<Place> = apiInstance.apiV1ThesaurusPlacesGet(lat, lon, r, txt, lng, take, skip, includeDeleted, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ThesaurusApi#apiV1ThesaurusPlacesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ThesaurusApi#apiV1ThesaurusPlacesGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lat** | **kotlin.Double**|  | [optional]
 **lon** | **kotlin.Double**|  | [optional]
 **r** | **kotlin.Double**|  | [optional]
 **txt** | **kotlin.String**|  | [optional]
 **lng** | **kotlin.String**|  | [optional]
 **take** | **kotlin.Int**|  | [optional]
 **skip** | **kotlin.Int**|  | [optional]
 **includeDeleted** | **kotlin.Boolean**|  | [optional]
 **sort** | [**DictionarySortCondition**](.md)|  | [optional]

### Return type

[**kotlin.Array&lt;Place&gt;**](Place.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

