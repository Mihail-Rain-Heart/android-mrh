package com.android.mrh.utils

import android.content.Context
import com.android.mrh.app.App

// TODO: рахобраться с получением appComponent
fun Context.getAppComponent() = when (this) {
    is App -> appComponent
    else -> (applicationContext as App).appComponent
}

val Context.VMFactory get() = getAppComponent().factory
