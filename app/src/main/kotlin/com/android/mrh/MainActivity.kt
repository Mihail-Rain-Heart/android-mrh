package com.android.mrh

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.android.mrh.utils.VMFactory
import com.android.mrh.utils.getAppComponent

class MainActivity : AppCompatActivity() {

    // TODO: убратьвсе тестовое
    // TODO: продумать инжекты (см. ContextExt.kt)
    val a by viewModels<TestViewModel> { VMFactory }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getAppComponent().inject(this)
        setContentView(R.layout.activity_main)
        println(a.a)
        a.a = "sajksjaksa"
    }
}