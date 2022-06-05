# IftttUserApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1IftttV1UserInfoGet**](IftttUserApi.md#apiV1IftttV1UserInfoGet) | **GET** /api/v1/ifttt/v1/user/info | 

<a name="apiV1IftttV1UserInfoGet"></a>
# **apiV1IftttV1UserInfoGet**
> UserInformationIftttResponse apiV1IftttV1UserInfoGet()



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = IftttUserApi()
try {
    val result : UserInformationIftttResponse = apiInstance.apiV1IftttV1UserInfoGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IftttUserApi#apiV1IftttV1UserInfoGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IftttUserApi#apiV1IftttV1UserInfoGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UserInformationIftttResponse**](UserInformationIftttResponse.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

