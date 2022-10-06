package com.baymax.demoapp.api.domain_model

import com.baymax.demoapp.api.data_trasfeer_model.HoldingDTO
import com.google.gson.annotations.SerializedName

data class ApiResponseDM(
    @SerializedName("client_id")
    val clientId: String,
    @SerializedName("data")
    val holdingsData: HoldingsDataDM,
    @SerializedName("error")
    val error: String,
    @SerializedName("response_type")
    val responseType: String,
    @SerializedName("timestamp")
    val timestamp: Long
)