package com.android.mrh.presentation.settings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.mrh.databinding.FragmentSettingsBinding
import com.android.mrh.presentation.BaseFragment
import core.view.adapter.BaseAdapter
import core.view.adapter.items.BaseItem

class SettingsFragment : BaseFragment<FragmentSettingsBinding>() {

    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentSettingsBinding =
        FragmentSettingsBinding::inflate

    private val adapter = BaseAdapter()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        super.onCreateView(inflater, container, savedInstanceState)
        binding.items.adapter = adapter
        adapter.submitList(
            (1..10).map { BaseItem.Field }
        )
        return binding.root
    }
}