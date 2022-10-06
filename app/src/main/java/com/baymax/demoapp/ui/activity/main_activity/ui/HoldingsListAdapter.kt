package com.baymax.demoapp.ui.activity.main_activity.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.baymax.demoapp.api.domain_model.HoldingDM
import com.baymax.demoapp.databinding.HoldingItemBinding

class HoldingsListAdapter(
    private val list: List<HoldingDM>
) : RecyclerView.Adapter<HoldingsListAdapter.PrItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PrItemViewHolder {
        val binding = HoldingItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PrItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PrItemViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class PrItemViewHolder(
        private val binding: HoldingItemBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(data: HoldingDM) {
            binding.holdingData = data
        }
    }
}