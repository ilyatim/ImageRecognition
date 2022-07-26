typealias and = com.unfixedbo1t.internal.dependencies.Android
typealias dep = com.unfixedbo1t.internal.dependencies.Dependencies

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("dependencies")
}

android {
    compileSdk = and.compileSdk

    defaultConfig {
        applicationId = "com.unfixedbo1t.imagerecognition"
        minSdk = and.minSdk
        targetSdk = and.targetSdk
        versionCode = and.versionCode
        versionName = "$versionCode"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = com.unfixedbo1t.internal.dependencies.Versions.composeVersion
    }
    packagingOptions {
        resources {
            excludes.add("/META-INF/{AL2.0,LGPL2.1}")
        }
    }
}

dependencies {
    dep.test.apply {
        testImplementation(jUnit)
        androidTestImplementation(jUnitExtension)
        androidTestImplementation(espressoCore)
        androidTestImplementation(composeJunit)
    }

    dep.core.apply {
        implementation(coreKtx)
        implementation(lifecycleKtx)
        implementation(composeActivity)
    }

    dep.ui.apply {
        implementation(composeMaterial)
        implementation(composeUi)
        implementation(composeToolingPreview)
        debugImplementation(composeTooling)
        debugImplementation(composeTestManifest)
    }
}