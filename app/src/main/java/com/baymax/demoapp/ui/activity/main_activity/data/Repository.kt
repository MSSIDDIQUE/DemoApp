package com.baymax.demoapp.ui.activity.main_activity.data

import com.baymax.demoapp.api.mappers.HoldingsResponseMappers
import com.baymax.demoapp.utils.MappersUtils.map

class Repository(private val remoteDataSource: RemoteDataSource) {
    suspend fun fetchHoldings() = remoteDataSource.getHoldings().map { dto ->
        HoldingsResponseMappers.apiResponseMapper().invoke(dto)
    }
}