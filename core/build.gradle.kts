plugins {
    id(Dependencies.Plugins.library)
    id(Dependencies.Plugins.kotlin)
}

android {
    namespace = Config.Namespace.Core
    compileSdk = Config.Sdk.compile

    defaultConfig {
        minSdk = Config.Sdk.min
        targetSdk = Config.Sdk.target

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

    // Тесты
    testImplementation(Dependencies.Test.junit)
    androidTestImplementation(Dependencies.Test.junitExt)
    androidTestImplementation(Dependencies.Test.espresso)
}