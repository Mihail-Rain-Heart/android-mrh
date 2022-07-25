package com.android.mrh.app

import android.app.Application
import com.android.mrh.di.AppComponent
import com.android.mrh.di.DaggerAppComponent

class App : Application() {

    val appComponent by lazy<AppComponent> {
        DaggerAppComponent
            .builder()
            .build()
    }

    override fun onCreate() {
        super.onCreate()
    }
}
