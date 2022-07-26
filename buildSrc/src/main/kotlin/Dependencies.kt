object Dependencies {
    object Test {
        const val junit = "junit:junit:4.13.2"
        const val junitExt = "androidx.test.ext:junit:1.1.3"
        const val espresso = "androidx.test.espresso:espresso-core:3.4.0"
    }

    object Plugins {
        const val application = "com.android.application"
        const val library = "com.android.library"
        const val kotlin = "org.jetbrains.kotlin.android"
        const val kapt = "kotlin-kapt"
    }

    object Default {
        const val core = "androidx.core:core-ktx:${Versions.Default.core}"
        const val appCompat = "androidx.appcompat:appcompat:${Versions.Default.appCompat}"
        const val material = "com.google.android.material:material:${Versions.Default.material}"
    }

    object Dagger {
        const val dagger = "com.google.dagger:dagger:${Versions.Dagger.dagger}"
        const val compiler = "com.google.dagger:dagger-compiler:${Versions.Dagger.dagger}"
    }

    object Lifecycle {
        const val lifecycle = "androidx.lifecycle:lifecycle-extensions:${Versions.Lifecycle.lifecycle}"
        const val lifecycleCompiler = "androidx.lifecycle:lifecycle-compiler:${Versions.Lifecycle.lifecycle}"
        const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.Lifecycle.lifecycle}"
        const val activity = "androidx.activity:activity-ktx:${Versions.Lifecycle.activity}"
        const val fragment = "androidx.fragment:fragment-ktx:${Versions.Lifecycle.activity}"
    }
}
