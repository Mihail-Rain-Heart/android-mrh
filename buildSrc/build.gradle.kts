plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    google()
}

sourceSets.all {
    java.srcDirs(
        "src/$name/kotlin",
        "src/$name/test/kotlin",
        "src/$name/androidTest/kotlin"
    )
}
