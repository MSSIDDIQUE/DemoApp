package com.baymax.demoapp.api.mappers

import com.baymax.demoapp.api.data_trasfeer_model.ApiResponseDTO
import com.baymax.demoapp.api.data_trasfeer_model.HoldingDTO
import com.baymax.demoapp.api.domain_model.ApiResponseDM
import com.baymax.demoapp.api.domain_model.HoldingDM
import com.baymax.demoapp.api.domain_model.HoldingsDataDM
import com.baymax.demoapp.utils.MappersUtils.mapNullInputList
import com.baymax.demoapp.utils.roundOffDecimal

object HoldingsResponseMappers {

    fun apiResponseMapper(): (ApiResponseDTO) -> ApiResponseDM = { apiResponseDTO ->
        mapApiResponseDTO(apiResponseDTO) { holdingsDTOSList ->
            mapHoldingsList(holdingsDTOSList) { holdingsList ->
                mapNullInputList(holdingsList) { holdingDTO ->
                    mapHoldingDTO(holdingDTO)
                }
            }
        }
    }

    private inline fun mapApiResponseDTO(
        input: ApiResponseDTO,
        mapHoldingsList: (List<HoldingDTO>?) -> HoldingsDataDM
    ) = ApiResponseDM(
        clientId = input.clientId.orEmpty(),
        holdingsData = mapHoldingsList(input.holdingsDTOS),
        error = input.error.orEmpty(),
        responseType = input.responseType.orEmpty(),
        timestamp = input.timestamp ?: -1
    )

    private inline fun mapHoldingsList(
        input: List<HoldingDTO>?,
        mapHoldingsListDTO: (List<HoldingDTO>?) -> List<HoldingDM>
    ): HoldingsDataDM {
        val holdingDMSummary = mapHoldingsListDTO(input)
        val currentValue = holdingDMSummary.sumOf { it.currentValue }
        val totalInvestmentValue = holdingDMSummary.sumOf { it.investmentValue }
        val totalPnLValue = currentValue.minus(totalInvestmentValue)
        val todaysPnLValue = holdingDMSummary.sumOf {
            it.close.toDoubleOrNull()?.minus(it.ltp.toDoubleOrNull() ?: 0.0)
                ?.times(it.quantity.toIntOrNull() ?: 0) ?: 0.0
        }
        return HoldingsDataDM(
            currentValue = currentValue.roundOffDecimal()?.toString().orEmpty(),
            totalInvestment = totalInvestmentValue.roundOffDecimal()?.toString().orEmpty(),
            todaysPnL = todaysPnLValue.roundOffDecimal()?.toString().orEmpty(),
            pnl = totalPnLValue.roundOffDecimal()?.toString().orEmpty(),
            holdings = mapHoldingsListDTO(input)
        )
    }

    private fun mapHoldingDTO(
        input: HoldingDTO?
    ): HoldingDM {
        return HoldingDM(
            symbol = input?.symbol.orEmpty(),
            ltp = input?.ltp?.toString().orEmpty(),
            close = input?.close?.toString().orEmpty(),
            quantity = input?.quantity?.toString().orEmpty(),
            avgPrice = input?.avgPrice.orEmpty()
        )
    }
}