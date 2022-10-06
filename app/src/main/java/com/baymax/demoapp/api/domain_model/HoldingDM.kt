package com.baymax.demoapp.api.domain_model

import com.baymax.demoapp.utils.roundOffDecimal

data class HoldingDM(
    val symbol: String,
    val ltp: String,
    val close: String,
    val quantity: String,
    val avgPrice: String
) {
    val currentValue: Double by lazy {
        ltp.toDoubleOrNull()?.times(quantity.toIntOrNull() ?: 0) ?: 0.0
    }

    val investmentValue: Double by lazy {
        avgPrice.toDoubleOrNull()?.times(quantity.toIntOrNull() ?: 0) ?: 0.0
    }

    val pln: String by lazy {
        currentValue?.minus(investmentValue ?: 0.0)?.roundOffDecimal()?.also {
            "P/L : ₹ $it"
        }?.toString().orEmpty()
    }
}