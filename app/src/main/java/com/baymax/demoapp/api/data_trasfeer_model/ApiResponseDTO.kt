package com.baymax.demoapp.api.data_trasfeer_model

import com.google.gson.annotations.SerializedName

data class ApiResponseDTO(
    @SerializedName("client_id")
    val clientId: String?,
    @SerializedName("data")
    val holdingsDTOS: List<HoldingDTO>?,
    @SerializedName("error")
    val error: String?,
    @SerializedName("response_type")
    val responseType: String?,
    @SerializedName("timestamp")
    val timestamp: Long?
)