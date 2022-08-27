package com.android.mrh.presentation.main

import android.view.LayoutInflater
import android.view.ViewGroup
import com.android.mrh.databinding.SecondFragmentBinding
import com.android.mrh.presentation.BaseFragment

class SecondFragment : BaseFragment<SecondFragmentBinding>() {

    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> SecondFragmentBinding =
        SecondFragmentBinding::inflate
}