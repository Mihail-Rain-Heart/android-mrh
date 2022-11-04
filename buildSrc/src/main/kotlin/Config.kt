object Config {
    const val applicationId = "com.android.mrh"

    object Sdk {
        const val compile = 31
        const val min = 21
        const val target = 31
    }

    object Versions {
        const val code = 1
        const val name = "1.0"
    }

    object Test {
        const val instrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    object Kotlin {
        object Options {
            const val jvmTarget = "1.8"
        }
    }

    object Namespace {
        const val Core = "com.mrh.core"
    }

    // Конфиги билд вариантов
    object Release {
        const val minifyEnabled = false

        object Proguard {
            const val name = "proguard-android-optimize.txt"
            const val rules = "proguard-rules.pro"
        }
    }
}
