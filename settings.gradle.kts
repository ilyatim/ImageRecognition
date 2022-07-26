pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

rootProject.name = "ImageRecognition"

include(":app")
includeBuild("app/internal")
