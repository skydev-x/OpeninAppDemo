package com.skydev.openinapp.data.remote

import com.skydev.openinapp.data.model.DashBoardResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header

const val BASE_URL = "https://api.inopenapp.com/api/v1/"

interface ApiService {

    @GET("dashboardNew")
    suspend fun getDashboard(
        @Header("Authorization") token: String,
        ): Response<DashBoardResponse>

}