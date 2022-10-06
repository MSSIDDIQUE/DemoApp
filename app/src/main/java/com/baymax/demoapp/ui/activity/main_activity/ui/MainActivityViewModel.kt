package com.baymax.demoapp.ui.activity.main_activity.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.baymax.demoapp.data.Result
import com.baymax.demoapp.ui.activity.main_activity.data.Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

class MainActivityViewModel @Inject constructor(
    private val repo: Repository
) : ViewModel() {

    private val _mutableHoldingsPageViewState = MutableStateFlow<HoldingsPageViewState>(
        HoldingsPageViewState.Loading(
            HoldingsPageStateData(
                progressBarVisibility = true,
                listVisibility = false
            )
        )
    )
    val holdingsPageViewState = _mutableHoldingsPageViewState

    fun fetchHoldingsState() = viewModelScope.launch {
        _mutableHoldingsPageViewState.value = when (val data = withContext(Dispatchers.IO) {
            repo.fetchHoldings()
        }) {
            is Result.Failure -> HoldingsPageViewState.Error(
                HoldingsPageStateData(
                    listVisibility = false,
                    progressBarVisibility = false,
                    summaryCardVisibility = false,
                    errorMessage = data.msg
                )
            )
            is Result.Success -> HoldingsPageViewState.Success(
                HoldingsPageStateData(
                    listVisibility = true,
                    progressBarVisibility = false,
                    summaryCardVisibility = data.data.holdingsData.isSummaryCardDataAvailable(),
                    holdingsData = data.data.holdingsData
                )
            )
        }
    }
}