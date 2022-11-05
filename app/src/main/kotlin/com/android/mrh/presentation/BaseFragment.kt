package com.android.mrh.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<BINDING : ViewBinding> : Fragment() {

    abstract val bindingInflater: ((LayoutInflater, ViewGroup?, Boolean) -> BINDING)
    private var _binding: BINDING? = null
    protected val binding: BINDING
        get() = _binding ?: error("binding in BaseFragment not init. Please check you fragment")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = bindingInflater(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}