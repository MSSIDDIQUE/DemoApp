package com.baymax.demoapp.ui.activity.main_activity.data

import com.baymax.demoapp.api.ApiService
import com.baymax.demoapp.api.BaseDataSource

class RemoteDataSource(
    private val apiService: ApiService
) : BaseDataSource() {
    suspend fun getHoldings() = getResult {
        apiService.getHoldings()
    }
}