package com.android.mrh.presentation

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.android.mrh.R
import com.android.mrh.utils.VMFactory
import com.android.mrh.utils.getAppComponent

class MainActivity : AppCompatActivity() {

    private val viewModel by viewModels<MainViewModel> { VMFactory }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getAppComponent().inject(this)
        setContentView(R.layout.activity_main)
        println(viewModel.a)
        viewModel.a = "sajksjaksa"
    }
}