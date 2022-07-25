package com.android.mrh.di

import androidx.lifecycle.ViewModelProvider
import com.android.mrh.presentation.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        DataModule::class,
        DomainModule::class,
        ViewModelModule::class,
    ]
)
interface AppComponent {

    val factory: ViewModelProvider.Factory

    fun inject(activity: MainActivity)
}