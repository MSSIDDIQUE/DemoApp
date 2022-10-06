package com.baymax.demoapp.ui.activity.main_activity.ui

sealed interface HoldingsPageViewState {
    data class Success(val stateData: HoldingsPageStateData) : HoldingsPageViewState
    data class Error(val stateData: HoldingsPageStateData) : HoldingsPageViewState
    data class Loading(val stateData: HoldingsPageStateData) : HoldingsPageViewState
}