package com.android.mrh.presentation.settings

import android.view.LayoutInflater
import android.view.ViewGroup
import com.android.mrh.databinding.FragmentSettingsBinding
import com.android.mrh.presentation.BaseFragment

class SettingsFragment : BaseFragment<FragmentSettingsBinding>() {

    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentSettingsBinding =
        FragmentSettingsBinding::inflate
}