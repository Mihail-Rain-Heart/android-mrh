package com.android.mrh.app

import android.app.Application
import com.android.mrh.di.AppComponent
import com.android.mrh.di.DaggerAppComponent

class App : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent
            .builder()
            .build()
    }
}
