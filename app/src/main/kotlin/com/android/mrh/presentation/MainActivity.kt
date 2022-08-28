package com.android.mrh.presentation

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.android.mrh.R
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

        val navController =
            (supportFragmentManager.findFragmentById(R.id.nav_host_fragment_container) as NavHostFragment)
                .navController

        binding?.let {
            setupToolbar(it, navController)
        }
    }

    override fun onDestroy() {
        binding = null
        super.onDestroy()
    }

    private fun setupToolbar(binding: ActivityMainBinding, navController: NavController) =
        with(binding) {
            toolbar.setupWithNavController(
                navController = navController,
                configuration = AppBarConfiguration(navController.graph)
            )
        }
}