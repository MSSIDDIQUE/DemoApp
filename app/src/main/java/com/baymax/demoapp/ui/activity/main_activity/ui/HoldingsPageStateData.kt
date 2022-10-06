package com.baymax.demoapp.ui.activity.main_activity.ui

import com.baymax.demoapp.api.domain_model.HoldingsDataDM

data class HoldingsPageStateData(
    val listVisibility: Boolean = false,
    val progressBarVisibility: Boolean = false,
    val summaryCardVisibility: Boolean = false,
    val holdingsData: HoldingsDataDM? = null,
    val errorMessage: String? = null
)