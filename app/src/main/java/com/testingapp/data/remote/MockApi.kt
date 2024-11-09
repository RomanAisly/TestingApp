package com.testingapp.data.remote

import com.testingapp.data.remote.response.MockResponse
import retrofit2.http.GET


interface MockApi {
    @GET("mock-api/path")
    suspend fun getMockResponse(): MockResponse

}