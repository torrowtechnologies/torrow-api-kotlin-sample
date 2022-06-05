# UserApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1UserAccountsGet**](UserApi.md#apiV1UserAccountsGet) | **GET** /api/v1/user/accounts | 
[**apiV1UserCalendarsGet**](UserApi.md#apiV1UserCalendarsGet) | **GET** /api/v1/user/calendars | 
[**apiV1UserCalendarsUpdatePut**](UserApi.md#apiV1UserCalendarsUpdatePut) | **PUT** /api/v1/user/calendars/update | 
[**apiV1UserCountGet**](UserApi.md#apiV1UserCountGet) | **GET** /api/v1/user/count | 
[**apiV1UserDefaultnotificationwaysGet**](UserApi.md#apiV1UserDefaultnotificationwaysGet) | **GET** /api/v1/user/defaultnotificationways | 
[**apiV1UserDefaultnotificationwaysPut**](UserApi.md#apiV1UserDefaultnotificationwaysPut) | **PUT** /api/v1/user/defaultnotificationways | 
[**apiV1UserDefaultprofileGet**](UserApi.md#apiV1UserDefaultprofileGet) | **GET** /api/v1/user/defaultprofile | 
[**apiV1UserDefaultprofilePost**](UserApi.md#apiV1UserDefaultprofilePost) | **POST** /api/v1/user/defaultprofile | 
[**apiV1UserDefaultprofilePut**](UserApi.md#apiV1UserDefaultprofilePut) | **PUT** /api/v1/user/defaultprofile | 
[**apiV1UserDeletingcompleteSessionIdDelete**](UserApi.md#apiV1UserDeletingcompleteSessionIdDelete) | **DELETE** /api/v1/user/deletingcomplete/{sessionId} | 
[**apiV1UserDeletinginitDelete**](UserApi.md#apiV1UserDeletinginitDelete) | **DELETE** /api/v1/user/deletinginit | 
[**apiV1UserDeliverywaysGet**](UserApi.md#apiV1UserDeliverywaysGet) | **GET** /api/v1/user/deliveryways | 
[**apiV1UserDevicesDeviceIdDelete**](UserApi.md#apiV1UserDevicesDeviceIdDelete) | **DELETE** /api/v1/user/devices/{deviceId} | 
[**apiV1UserDevicesDeviceIdSettingsGet**](UserApi.md#apiV1UserDevicesDeviceIdSettingsGet) | **GET** /api/v1/user/devices/{deviceId}/settings | 
[**apiV1UserDevicesDeviceIdSettingsPut**](UserApi.md#apiV1UserDevicesDeviceIdSettingsPut) | **PUT** /api/v1/user/devices/{deviceId}/settings | 
[**apiV1UserDevicesGet**](UserApi.md#apiV1UserDevicesGet) | **GET** /api/v1/user/devices | 
[**apiV1UserLoyaltycardGet**](UserApi.md#apiV1UserLoyaltycardGet) | **GET** /api/v1/user/loyaltycard | 
[**apiV1UserPlacePut**](UserApi.md#apiV1UserPlacePut) | **PUT** /api/v1/user/place | 
[**apiV1UserProfilesGet**](UserApi.md#apiV1UserProfilesGet) | **GET** /api/v1/user/profiles | 
[**apiV1UserProfilesPost**](UserApi.md#apiV1UserProfilesPost) | **POST** /api/v1/user/profiles | 
[**apiV1UserProfilesProfileIdDelete**](UserApi.md#apiV1UserProfilesProfileIdDelete) | **DELETE** /api/v1/user/profiles/{profileId} | 
[**apiV1UserProfilesProfileIdProfilepropertiesPut**](UserApi.md#apiV1UserProfilesProfileIdProfilepropertiesPut) | **PUT** /api/v1/user/profiles/{profileId}/profileproperties | 
[**apiV1UserProfilesPut**](UserApi.md#apiV1UserProfilesPut) | **PUT** /api/v1/user/profiles | 
[**apiV1UserRegisterPost**](UserApi.md#apiV1UserRegisterPost) | **POST** /api/v1/user/register | 
[**apiV1UserSettingsGet**](UserApi.md#apiV1UserSettingsGet) | **GET** /api/v1/user/settings | 
[**apiV1UserSettingsUpdatePut**](UserApi.md#apiV1UserSettingsUpdatePut) | **PUT** /api/v1/user/settings/update | 
[**apiV1UserTimetablePut**](UserApi.md#apiV1UserTimetablePut) | **PUT** /api/v1/user/timetable | 

<a name="apiV1UserAccountsGet"></a>
# **apiV1UserAccountsGet**
> kotlin.Array&lt;Account&gt; apiV1UserAccountsGet(take, skip, lmfrom, lmto, includeDeleted, sort)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = UserApi()
val take : kotlin.Int = 56 // kotlin.Int | 
val skip : kotlin.Int = 56 // kotlin.Int | 
val lmfrom : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val lmto : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val includeDeleted : kotlin.Boolean = true // kotlin.Boolean | 
val sort : ItemViewSortCondition =  // ItemViewSortCondition | 
try {
    val result : kotlin.Array<Account> = apiInstance.apiV1UserAccountsGet(take, skip, lmfrom, lmto, includeDeleted, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#apiV1UserAccountsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#apiV1UserAccountsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **take** | **kotlin.Int**|  | [optional] [default to 2147483647]
 **skip** | **kotlin.Int**|  | [optional] [default to 0]
 **lmfrom** | **java.time.LocalDateTime**|  | [optional]
 **lmto** | **java.time.LocalDateTime**|  | [optional]
 **includeDeleted** | **kotlin.Boolean**|  | [optional] [default to false]
 **sort** | [**ItemViewSortCondition**](.md)|  | [optional]

### Return type

[**kotlin.Array&lt;Account&gt;**](Account.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1UserCalendarsGet"></a>
# **apiV1UserCalendarsGet**
> kotlin.Array&lt;UserCalendar&gt; apiV1UserCalendarsGet()



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = UserApi()
try {
    val result : kotlin.Array<UserCalendar> = apiInstance.apiV1UserCalendarsGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#apiV1UserCalendarsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#apiV1UserCalendarsGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;UserCalendar&gt;**](UserCalendar.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1UserCalendarsUpdatePut"></a>
# **apiV1UserCalendarsUpdatePut**
> TorrowObject apiV1UserCalendarsUpdatePut(body)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = UserApi()
val body : kotlin.Array<UserCalendar> =  // kotlin.Array<UserCalendar> | 
try {
    val result : TorrowObject = apiInstance.apiV1UserCalendarsUpdatePut(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#apiV1UserCalendarsUpdatePut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#apiV1UserCalendarsUpdatePut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**kotlin.Array&lt;UserCalendar&gt;**](UserCalendar.md)|  | [optional]

### Return type

[**TorrowObject**](TorrowObject.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1UserCountGet"></a>
# **apiV1UserCountGet**
> kotlin.Long apiV1UserCountGet()



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = UserApi()
try {
    val result : kotlin.Long = apiInstance.apiV1UserCountGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#apiV1UserCountGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#apiV1UserCountGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.Long**

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1UserDefaultnotificationwaysGet"></a>
# **apiV1UserDefaultnotificationwaysGet**
> kotlin.Array&lt;NotificationWay&gt; apiV1UserDefaultnotificationwaysGet()



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = UserApi()
try {
    val result : kotlin.Array<NotificationWay> = apiInstance.apiV1UserDefaultnotificationwaysGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#apiV1UserDefaultnotificationwaysGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#apiV1UserDefaultnotificationwaysGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;NotificationWay&gt;**](NotificationWay.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1UserDefaultnotificationwaysPut"></a>
# **apiV1UserDefaultnotificationwaysPut**
> TorrowObject apiV1UserDefaultnotificationwaysPut(body, versionToCheck, isNeedAnnouncement)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = UserApi()
val body : kotlin.Array<NotificationWay> =  // kotlin.Array<NotificationWay> | 
val versionToCheck : kotlin.Int = 56 // kotlin.Int | 
val isNeedAnnouncement : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : TorrowObject = apiInstance.apiV1UserDefaultnotificationwaysPut(body, versionToCheck, isNeedAnnouncement)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#apiV1UserDefaultnotificationwaysPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#apiV1UserDefaultnotificationwaysPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**kotlin.Array&lt;NotificationWay&gt;**](NotificationWay.md)|  | [optional]
 **versionToCheck** | **kotlin.Int**|  | [optional] [default to 0]
 **isNeedAnnouncement** | **kotlin.Boolean**|  | [optional] [default to false]

### Return type

[**TorrowObject**](TorrowObject.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1UserDefaultprofileGet"></a>
# **apiV1UserDefaultprofileGet**
> ContactItem apiV1UserDefaultprofileGet()



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = UserApi()
try {
    val result : ContactItem = apiInstance.apiV1UserDefaultprofileGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#apiV1UserDefaultprofileGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#apiV1UserDefaultprofileGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ContactItem**](ContactItem.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1UserDefaultprofilePost"></a>
# **apiV1UserDefaultprofilePost**
> AddProfileResp apiV1UserDefaultprofilePost(body)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = UserApi()
val body : ContactItem =  // ContactItem | 
try {
    val result : AddProfileResp = apiInstance.apiV1UserDefaultprofilePost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#apiV1UserDefaultprofilePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#apiV1UserDefaultprofilePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ContactItem**](ContactItem.md)|  | [optional]

### Return type

[**AddProfileResp**](AddProfileResp.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1UserDefaultprofilePut"></a>
# **apiV1UserDefaultprofilePut**
> AddProfileResp apiV1UserDefaultprofilePut(body)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = UserApi()
val body : kotlin.String =  // kotlin.String | 
try {
    val result : AddProfileResp = apiInstance.apiV1UserDefaultprofilePut(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#apiV1UserDefaultprofilePut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#apiV1UserDefaultprofilePut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**kotlin.String**](kotlin.String.md)|  | [optional]

### Return type

[**AddProfileResp**](AddProfileResp.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1UserDeletingcompleteSessionIdDelete"></a>
# **apiV1UserDeletingcompleteSessionIdDelete**
> DeletingCompleteResp apiV1UserDeletingcompleteSessionIdDelete(sessionId, body)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = UserApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | 
val body : kotlin.String =  // kotlin.String | 
try {
    val result : DeletingCompleteResp = apiInstance.apiV1UserDeletingcompleteSessionIdDelete(sessionId, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#apiV1UserDeletingcompleteSessionIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#apiV1UserDeletingcompleteSessionIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**|  |
 **body** | [**kotlin.String**](kotlin.String.md)|  | [optional]

### Return type

[**DeletingCompleteResp**](DeletingCompleteResp.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1UserDeletinginitDelete"></a>
# **apiV1UserDeletinginitDelete**
> UserDeletingInitResp apiV1UserDeletinginitDelete()



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = UserApi()
try {
    val result : UserDeletingInitResp = apiInstance.apiV1UserDeletinginitDelete()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#apiV1UserDeletinginitDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#apiV1UserDeletinginitDelete")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UserDeletingInitResp**](UserDeletingInitResp.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1UserDeliverywaysGet"></a>
# **apiV1UserDeliverywaysGet**
> kotlin.Array&lt;UserDeliveryWay&gt; apiV1UserDeliverywaysGet(deliveryChannelList)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = UserApi()
val deliveryChannelList : kotlin.Array<DeliveryChannel> =  // kotlin.Array<DeliveryChannel> | 
try {
    val result : kotlin.Array<UserDeliveryWay> = apiInstance.apiV1UserDeliverywaysGet(deliveryChannelList)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#apiV1UserDeliverywaysGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#apiV1UserDeliverywaysGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deliveryChannelList** | [**kotlin.Array&lt;DeliveryChannel&gt;**](DeliveryChannel.md)|  | [optional]

### Return type

[**kotlin.Array&lt;UserDeliveryWay&gt;**](UserDeliveryWay.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1UserDevicesDeviceIdDelete"></a>
# **apiV1UserDevicesDeviceIdDelete**
> DeleteResponse apiV1UserDevicesDeviceIdDelete(deviceId)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = UserApi()
val deviceId : kotlin.String = deviceId_example // kotlin.String | 
try {
    val result : DeleteResponse = apiInstance.apiV1UserDevicesDeviceIdDelete(deviceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#apiV1UserDevicesDeviceIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#apiV1UserDevicesDeviceIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **kotlin.String**|  |

### Return type

[**DeleteResponse**](DeleteResponse.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1UserDevicesDeviceIdSettingsGet"></a>
# **apiV1UserDevicesDeviceIdSettingsGet**
> DeviceSettingsInfo apiV1UserDevicesDeviceIdSettingsGet(deviceId)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = UserApi()
val deviceId : kotlin.String = deviceId_example // kotlin.String | 
try {
    val result : DeviceSettingsInfo = apiInstance.apiV1UserDevicesDeviceIdSettingsGet(deviceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#apiV1UserDevicesDeviceIdSettingsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#apiV1UserDevicesDeviceIdSettingsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **kotlin.String**|  |

### Return type

[**DeviceSettingsInfo**](DeviceSettingsInfo.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1UserDevicesDeviceIdSettingsPut"></a>
# **apiV1UserDevicesDeviceIdSettingsPut**
> TorrowObject apiV1UserDevicesDeviceIdSettingsPut(deviceId, settings)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = UserApi()
val deviceId : kotlin.String = deviceId_example // kotlin.String | 
val settings : kotlin.String = settings_example // kotlin.String | 
try {
    val result : TorrowObject = apiInstance.apiV1UserDevicesDeviceIdSettingsPut(deviceId, settings)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#apiV1UserDevicesDeviceIdSettingsPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#apiV1UserDevicesDeviceIdSettingsPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **kotlin.String**|  |
 **settings** | **kotlin.String**|  | [optional]

### Return type

[**TorrowObject**](TorrowObject.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1UserDevicesGet"></a>
# **apiV1UserDevicesGet**
> kotlin.Array&lt;DeviceInfo&gt; apiV1UserDevicesGet(deviceTypes)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = UserApi()
val deviceTypes : kotlin.Array<DeviceType> =  // kotlin.Array<DeviceType> | 
try {
    val result : kotlin.Array<DeviceInfo> = apiInstance.apiV1UserDevicesGet(deviceTypes)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#apiV1UserDevicesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#apiV1UserDevicesGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceTypes** | [**kotlin.Array&lt;DeviceType&gt;**](DeviceType.md)|  | [optional]

### Return type

[**kotlin.Array&lt;DeviceInfo&gt;**](DeviceInfo.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1UserLoyaltycardGet"></a>
# **apiV1UserLoyaltycardGet**
> LoyaltyCardItem apiV1UserLoyaltycardGet()



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = UserApi()
try {
    val result : LoyaltyCardItem = apiInstance.apiV1UserLoyaltycardGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#apiV1UserLoyaltycardGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#apiV1UserLoyaltycardGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**LoyaltyCardItem**](LoyaltyCardItem.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1UserPlacePut"></a>
# **apiV1UserPlacePut**
> TorrowObject apiV1UserPlacePut(profileId, placeId)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = UserApi()
val profileId : kotlin.String = profileId_example // kotlin.String | 
val placeId : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : TorrowObject = apiInstance.apiV1UserPlacePut(profileId, placeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#apiV1UserPlacePut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#apiV1UserPlacePut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **profileId** | **kotlin.String**|  | [optional]
 **placeId** | **kotlin.Int**|  | [optional]

### Return type

[**TorrowObject**](TorrowObject.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1UserProfilesGet"></a>
# **apiV1UserProfilesGet**
> ProfileListResp apiV1UserProfilesGet()



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = UserApi()
try {
    val result : ProfileListResp = apiInstance.apiV1UserProfilesGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#apiV1UserProfilesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#apiV1UserProfilesGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ProfileListResp**](ProfileListResp.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1UserProfilesPost"></a>
# **apiV1UserProfilesPost**
> AddProfileResp apiV1UserProfilesPost(body)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = UserApi()
val body : ContactItem =  // ContactItem | 
try {
    val result : AddProfileResp = apiInstance.apiV1UserProfilesPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#apiV1UserProfilesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#apiV1UserProfilesPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ContactItem**](ContactItem.md)|  | [optional]

### Return type

[**AddProfileResp**](AddProfileResp.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1UserProfilesProfileIdDelete"></a>
# **apiV1UserProfilesProfileIdDelete**
> RemoveProfileResp apiV1UserProfilesProfileIdDelete(profileId)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = UserApi()
val profileId : kotlin.String = profileId_example // kotlin.String | 
try {
    val result : RemoveProfileResp = apiInstance.apiV1UserProfilesProfileIdDelete(profileId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#apiV1UserProfilesProfileIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#apiV1UserProfilesProfileIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **profileId** | **kotlin.String**|  |

### Return type

[**RemoveProfileResp**](RemoveProfileResp.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1UserProfilesProfileIdProfilepropertiesPut"></a>
# **apiV1UserProfilesProfileIdProfilepropertiesPut**
> UpdateProfilePropertiesResp apiV1UserProfilesProfileIdProfilepropertiesPut(profileId, body)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = UserApi()
val profileId : kotlin.String = profileId_example // kotlin.String | 
val body : ProfileProperties =  // ProfileProperties | 
try {
    val result : UpdateProfilePropertiesResp = apiInstance.apiV1UserProfilesProfileIdProfilepropertiesPut(profileId, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#apiV1UserProfilesProfileIdProfilepropertiesPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#apiV1UserProfilesProfileIdProfilepropertiesPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **profileId** | **kotlin.String**|  |
 **body** | [**ProfileProperties**](ProfileProperties.md)|  | [optional]

### Return type

[**UpdateProfilePropertiesResp**](UpdateProfilePropertiesResp.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1UserProfilesPut"></a>
# **apiV1UserProfilesPut**
> AddProfileResp apiV1UserProfilesPut(body)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = UserApi()
val body : kotlin.String =  // kotlin.String | 
try {
    val result : AddProfileResp = apiInstance.apiV1UserProfilesPut(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#apiV1UserProfilesPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#apiV1UserProfilesPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**kotlin.String**](kotlin.String.md)|  | [optional]

### Return type

[**AddProfileResp**](AddProfileResp.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1UserRegisterPost"></a>
# **apiV1UserRegisterPost**
> RegisterUserForAccountResp apiV1UserRegisterPost(body, templateContactId, inviterProfileId)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = UserApi()
val body : RegistrationUserInfo =  // RegistrationUserInfo | 
val templateContactId : kotlin.String = templateContactId_example // kotlin.String | 
val inviterProfileId : kotlin.String = inviterProfileId_example // kotlin.String | 
try {
    val result : RegisterUserForAccountResp = apiInstance.apiV1UserRegisterPost(body, templateContactId, inviterProfileId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#apiV1UserRegisterPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#apiV1UserRegisterPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RegistrationUserInfo**](RegistrationUserInfo.md)|  | [optional]
 **templateContactId** | **kotlin.String**|  | [optional]
 **inviterProfileId** | **kotlin.String**|  | [optional]

### Return type

[**RegisterUserForAccountResp**](RegisterUserForAccountResp.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1UserSettingsGet"></a>
# **apiV1UserSettingsGet**
> UserSettingsInfo apiV1UserSettingsGet()



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = UserApi()
try {
    val result : UserSettingsInfo = apiInstance.apiV1UserSettingsGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#apiV1UserSettingsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#apiV1UserSettingsGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UserSettingsInfo**](UserSettingsInfo.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1UserSettingsUpdatePut"></a>
# **apiV1UserSettingsUpdatePut**
> TorrowObject apiV1UserSettingsUpdatePut(body)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = UserApi()
val body : UserSettingsInfo =  // UserSettingsInfo | 
try {
    val result : TorrowObject = apiInstance.apiV1UserSettingsUpdatePut(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#apiV1UserSettingsUpdatePut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#apiV1UserSettingsUpdatePut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserSettingsInfo**](UserSettingsInfo.md)|  | [optional]

### Return type

[**TorrowObject**](TorrowObject.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiV1UserTimetablePut"></a>
# **apiV1UserTimetablePut**
> kotlin.Array&lt;TimetableCase&gt; apiV1UserTimetablePut(body, visibility, take, skip, lmfrom, lmto, includeDeleted, sort)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import net.torrow.api.models.*;

val apiInstance = UserApi()
val body : TimetableFilter =  // TimetableFilter | 
val visibility : TimetableDetailsVisibility =  // TimetableDetailsVisibility | 
val take : kotlin.Int = 56 // kotlin.Int | 
val skip : kotlin.Int = 56 // kotlin.Int | 
val lmfrom : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val lmto : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val includeDeleted : kotlin.Boolean = true // kotlin.Boolean | 
val sort : ItemViewSortCondition =  // ItemViewSortCondition | 
try {
    val result : kotlin.Array<TimetableCase> = apiInstance.apiV1UserTimetablePut(body, visibility, take, skip, lmfrom, lmto, includeDeleted, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#apiV1UserTimetablePut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#apiV1UserTimetablePut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TimetableFilter**](TimetableFilter.md)|  | [optional]
 **visibility** | [**TimetableDetailsVisibility**](.md)|  | [optional]
 **take** | **kotlin.Int**|  | [optional] [default to 2147483647]
 **skip** | **kotlin.Int**|  | [optional] [default to 0]
 **lmfrom** | **java.time.LocalDateTime**|  | [optional]
 **lmto** | **java.time.LocalDateTime**|  | [optional]
 **includeDeleted** | **kotlin.Boolean**|  | [optional] [default to false]
 **sort** | [**ItemViewSortCondition**](.md)|  | [optional]

### Return type

[**kotlin.Array&lt;TimetableCase&gt;**](TimetableCase.md)

### Authorization

[Basic](../README.md#Basic), [Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

