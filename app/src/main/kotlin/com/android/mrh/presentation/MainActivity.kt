package com.android.mrh.presentation

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.android.mrh.databinding.ActivityMainBinding
import com.android.mrh.utils.VMFactory
import com.android.mrh.utils.getAppComponent

class MainActivity : AppCompatActivity() {

    private val viewModel by viewModels<MainViewModel> { VMFactory }
    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getAppComponent().inject(this)
        binding = ActivityMainBinding.inflate(layoutInflater)
            .apply { setContentView(root) }
    }

    override fun onDestroy() {
        binding = null
        super.onDestroy()
    }
}