package com.android.mrh.utils.baseAdapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.android.mrh.databinding.ItemBaseBinding
import com.android.mrh.utils.baseAdapter.view_holders.SettingsViewHolder

class BaseAdapter : RecyclerView.Adapter<ViewHolder>() {

    private val items: MutableList<BaseItem> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return SettingsViewHolder(
            ItemBaseBinding.inflate(
                LayoutInflater.from(parent.context)
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        (holder as SettingsViewHolder).bind(items[position])
    }

    override fun getItemCount() = items.size

    @SuppressLint("NotifyDataSetChanged")
    fun submitList(_items: List<BaseItem>) {
        items.clear()
        items.addAll(_items)
        notifyDataSetChanged()
    }
}