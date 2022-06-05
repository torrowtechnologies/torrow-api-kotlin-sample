package net.torrow.api.client

import com.fasterxml.jackson.databind.util.ISO8601DateFormat
import com.fasterxml.jackson.databind.util.StdDateFormat
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.engine.cio.*
import io.ktor.client.plugins.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.serialization.jackson.*
import net.torrow.api.models.*

class TorrowApiClient internal constructor(val token: String) {
    var basePath = "https://torrow.net/api/v1"
    var defaultAuthHeader = "Basic d2ViLm1vYmlsZWFwcC50b3Jyb3cubmV0OmY1RmBkaXk2d2AndEg4YTojXw=="
    var client: HttpClient
    var accessToken: String? = null

    init {
        client = HttpClient(CIO){
            install(ContentNegotiation){
                jackson(){
                    registerModule(JavaTimeModule())
                    dateFormat = StdDateFormat()
                }
            }
        }

        client.plugin(HttpSend).intercept { request ->
            if(request.url.pathSegments.contains("auth")){
                return@intercept execute(request)
            }

            if(accessToken == null){
                accessToken = getAccessToken()
            }

            if(!request.headers.contains(HttpHeaders.Authorization)){
                request.headers[HttpHeaders.Authorization] = "Bearer ${accessToken!!}"
            }

            val originalCall = execute(request)

            if (originalCall.response.status.value == 401) {
                accessToken = getAccessToken()
                request.headers[HttpHeaders.Authorization] = "Bearer ${accessToken!!}"
                execute(request)
            } else {
                originalCall
            }
        }
    }

    suspend fun getServiceTimetable(
        serviceId: kotlin.String,
        timetableFilter: TimetableFilter? = null,
        visibility: TimetableDetailsVisibility? = null,
        take: kotlin.Int? = null,
        skip: kotlin.Int? = null,
        lmfrom: java.time.LocalDateTime? = null,
        lmto: java.time.LocalDateTime? = null,
        includeDeleted: kotlin.Boolean? = null,
        sort: ItemViewSortCondition? = null): Array<TimetableCase> {

        var resp : Array<TimetableCase> =  client.put("${basePath}/services/${serviceId}/timetable"){
            accept(ContentType.Application.Json)
            contentType(ContentType.Application.Json)
            parameter("visibility", visibility)
            parameter("take", take)
            parameter("skip", skip)
            parameter("lmfrom", lmfrom)
            parameter("lmto", lmto)
            parameter("includeDeleted", includeDeleted)
            parameter("sort", sort)
            setBody(timetableFilter)
        }.body()

        return resp;
    }

    suspend fun createService(
        service: ServiceItem? = null,
        parentId: String? = null,
        profileId: String? = null): ServiceItem {
        var resp : ServiceItem =  client.post("${basePath}/services"){
            accept(ContentType.Application.Json)
            contentType(ContentType.Application.Json)
            parameter("parentId", parentId)
            parameter("profileId", profileId)
            setBody(service)
        }.body()

        return resp;
    }

    private suspend fun getAccessToken(): String {
        val tokenResp: TokenResp =  client.post("${basePath}/auth/refresh"){
            contentType(ContentType.Application.Json)
            headers {
                append(HttpHeaders.Authorization, defaultAuthHeader)
            }
            setBody(RefreshReq(refreshToken = token))
        }.body()

        return tokenResp.accessToken.toString()
    }
}