plugins {
    id(Dependencies.Plugins.application)
    id(Dependencies.Plugins.kotlin)
    id(Dependencies.Plugins.kapt)
}

android {
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
}

dependencies {

    implementation(Dependencies.Default.core)
    implementation(Dependencies.Default.appCompat)
    implementation(Dependencies.Default.material)
    //DI
    implementation(Dependencies.Dagger.dagger)
    kapt(Dependencies.Dagger.compiler)
    // Тесты
    testImplementation(Dependencies.Test.junit)
    androidTestImplementation(Dependencies.Test.junitExt)
    androidTestImplementation(Dependencies.Test.espresso)
}
