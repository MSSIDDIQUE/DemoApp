package com.baymax.demoapp.ui.activity.main_activity.ui

import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.baymax.demoapp.R
import com.baymax.demoapp.api.domain_model.HoldingDM
import com.baymax.demoapp.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.coroutines.flow.collectLatest
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {
    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!
    private lateinit var holdingsListAdapter: HoldingsListAdapter
    private lateinit var linearLayoutManager: LinearLayoutManager

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private lateinit var viewModel: MainActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(
            this,
            viewModelFactory
        )[MainActivityViewModel::class.java].apply {
            fetchHoldingsState()
        }
        setupObservers()
    }

    private fun setupObservers() = lifecycleScope.launchWhenStarted {
        viewModel.holdingsPageViewState.collectLatest { state ->
            setHoldingsPageState(state)
        }
    }

    private fun setHoldingsPageState(state: HoldingsPageViewState) = binding.apply {
        when (state) {
            is HoldingsPageViewState.Success -> {
                setupRecyclerView(state.stateData.holdingsData?.holdings)
                holdingsPageStateData = state.stateData
            }
            is HoldingsPageViewState.Error -> {
                Snackbar.make(
                    root,
                    getString(R.string.something_went_wrong),
                    Snackbar.LENGTH_LONG
                ).show()
                holdingsPageStateData = state.stateData
            }
            is HoldingsPageViewState.Loading -> {
                holdingsPageStateData = state.stateData
            }
        }
    }

    private fun setupRecyclerView(list: List<HoldingDM>?) = binding.recyclerView.apply {
        if (list != null) {
            visibility = View.VISIBLE
            holdingsListAdapter = HoldingsListAdapter(list)
            linearLayoutManager = LinearLayoutManager(context)
            layoutManager = linearLayoutManager
            adapter = holdingsListAdapter
        } else
            visibility = View.GONE
    }
}