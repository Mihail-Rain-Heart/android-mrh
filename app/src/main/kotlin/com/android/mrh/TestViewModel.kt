package com.android.mrh

import androidx.lifecycle.ViewModel
import javax.inject.Inject

class TestViewModel @Inject constructor() : ViewModel() {
    var a = "Before"
}