package com.android.mrh.presentation.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.android.mrh.R
import com.android.mrh.databinding.FragmentMainBinding
import com.android.mrh.presentation.BaseFragment

class MainFragment : BaseFragment<FragmentMainBinding>() {

    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentMainBinding =
        FragmentMainBinding::inflate

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        super.onCreateView(inflater, container, savedInstanceState)
        binding.goNext.setOnClickListener {
            findNavController().navigate(R.id.to_settingsFragment)
        }
        return binding.root
    }
}