plugins {
    id(Dependencies.Plugins.application)
    id(Dependencies.Plugins.kotlin)
    id(Dependencies.Plugins.kapt)
}

android {
    namespace = Config.applicationId
    compileSdk = Config.Sdk.compile

    defaultConfig {
        applicationId = Config.applicationId
        minSdk = Config.Sdk.min
        targetSdk = Config.Sdk.target
        versionCode = Config.Versions.code
        versionName = Config.Versions.name
        // Тесты
        testInstrumentationRunner = Config.Test.instrumentationRunner
    }

    buildTypes {
        release {
            isMinifyEnabled = Config.Release.minifyEnabled
            proguardFiles(
                getDefaultProguardFile(Config.Release.Proguard.name),
                Config.Release.Proguard.rules
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = Config.Kotlin.Options.jvmTarget
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    // Модули приложения
    implementation(project(":core"))

    implementation(Dependencies.Default.core)
    implementation(Dependencies.Default.appCompat)
    implementation(Dependencies.Default.material)
    //Activity
    implementation(Dependencies.Lifecycle.activity)
    //Fragment
    implementation(Dependencies.Lifecycle.fragment)
    // ViewModel
    implementation(Dependencies.Lifecycle.viewModel)
    // Lifecycle
    implementation(Dependencies.Lifecycle.lifecycle)
    kapt(Dependencies.Lifecycle.lifecycleCompiler)
    // DI
    implementation(Dependencies.Dagger.dagger)
    kapt(Dependencies.Dagger.compiler)

    // Navigation
    implementation(Dependencies.Navigation.navFragment)
    implementation(Dependencies.Navigation.navUi)

    // Тесты
    testImplementation(Dependencies.Test.junit)
    androidTestImplementation(Dependencies.Test.junitExt)
    androidTestImplementation(Dependencies.Test.espresso)
}
