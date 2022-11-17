plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
}

group = "com.unfixedbo1t.internal"

dependencies {
    compileOnly("com.android.tools.build:gradle:7.3.1")
    compileOnly("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.20")
}

gradlePlugin {
    plugins.register("androidComposeApplication") {
        id = "com.unfixedbo1t.imagerecognition.android.application.compose"
        implementationClass = "com.unfixedbo1t.internal.plugins.ComposeApplicationPlugin"
    }
    plugins.register("androidApplication") {
        id = "com.unfixedbo1t.imagerecognition.android.application"
        implementationClass = "com.unfixedbo1t.internal.plugins.ApplicationPlugin"
    }
    plugins.register("androidLibrary") {
        id = "com.unfixedbo1t.imagerecognition.android.library"
        implementationClass = "com.unfixedbo1t.internal.plugins.LibraryPlugin"
    }
    plugins.register("androidHilt") {
        id = "com.unfixedbo1t.imagerecognition.android.hilt"
        implementationClass = "com.unfixedbo1t.internal.plugins.HiltPlugin"
    }
    plugins.register("androidCompose") {
        id = "com.unfixedbo1t.imagerecognition.android.library.compose"
        implementationClass = "com.unfixedbo1t.internal.plugins.ComposeLibraryPlugin"
    }
    plugins.register("androidFeature") {
        id = "com.unfixedbo1t.imagerecognition.android.feature"
        implementationClass = "com.unfixedbo1t.internal.plugins.FeaturePlugin"
    }
    plugins.register("androidComposeFeature") {
        id = "com.unfixedbo1t.imagerecognition.android.feature.compose"
        implementationClass = "com.unfixedbo1t.internal.plugins.ComposeFeaturePlugin"
    }
}