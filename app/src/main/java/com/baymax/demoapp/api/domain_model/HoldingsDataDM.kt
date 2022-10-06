package com.baymax.demoapp.api.domain_model

data class HoldingsDataDM(
    val currentValue: String,
    val totalInvestment: String,
    val todaysPnL: String,
    val pnl: String,
    val holdings: List<HoldingDM>
) {
    fun isSummaryCardDataAvailable() = listOf(
        currentValue.isEmpty(),
        totalInvestment.isEmpty(),
        todaysPnL.isEmpty(),
        pnl.isEmpty()
    ).contains(false)
}