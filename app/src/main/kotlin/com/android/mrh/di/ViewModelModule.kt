package com.android.mrh.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.android.mrh.TestViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import javax.inject.Singleton

@Module
interface ViewModelModule {
    @Singleton
    @Binds
    fun factory(factory: ViewModelFactory): ViewModelProvider.Factory

    @[Binds IntoMap ViewModelKey(TestViewModel::class)]
    fun provideTestViewModel(testViewModel: TestViewModel): ViewModel
}