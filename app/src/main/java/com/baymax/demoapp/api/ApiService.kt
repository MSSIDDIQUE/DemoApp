package com.baymax.demoapp.api

import com.baymax.demoapp.api.data_trasfeer_model.ApiResponseDTO
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("6d0ad460-f600-47a7-b973-4a779ebbaeaf")
    suspend fun getHoldings(): Response<ApiResponseDTO>
}