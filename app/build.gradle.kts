plugins {
    id("com.unfixedbo1t.imagerecognition.android.application.compose")
    id("com.unfixedbo1t.imagerecognition.android.application")
    id("com.unfixedbo1t.imagerecognition.android.hilt")
}

android {
    namespace = "com.unfixedbo1t.imagerecognitionapp"
    defaultConfig {
        applicationId = "com.unfixedbo1t.imagerecognition"
        versionCode = 1
        versionName = "$versionCode"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    packagingOptions {
        resources {
            excludes.add("/META-INF/{AL2.0,LGPL2.1}")
        }
    }
}
dependencies {
    implementation(project(":uikit"))
}
