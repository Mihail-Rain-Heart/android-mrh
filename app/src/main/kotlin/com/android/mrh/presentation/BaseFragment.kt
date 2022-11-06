package com.android.mrh.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<BINDING : ViewBinding> : Fragment() {

    abstract val bindingInflater: ((LayoutInflater, ViewGroup?, Boolean) -> BINDING)
    private var _binding: BINDING? = null
    protected val binding: BINDING
        get() = _binding ?: error("binding in BaseFragment not init. Please check you fragment")

    protected val navController by lazy { findNavController() }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = bindingInflater(inflater, container, false)
        setupToolbar()?.setupWithNavController(
            navController = navController,
            configuration = AppBarConfiguration(navController.graph)
        )
        return binding.root
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

    /**
     * Колбек для связки тулбара фрагмента с NavComponent
     * @return null, если тулбар не должен быть связан с navComponent, иначе вернуть тулбар из биндинга фрагмента
     */
    protected open fun setupToolbar(): Toolbar? = null
}