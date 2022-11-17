pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

rootProject.name = "ImageRecognition"

include(":app")
include(":uikit")
includeBuild("app/internal")
