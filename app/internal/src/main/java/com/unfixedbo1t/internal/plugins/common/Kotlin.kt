package com.unfixedbo1t.internal.plugins.common

import com.android.build.api.dsl.CommonExtension
import org.gradle.api.JavaVersion
import org.gradle.api.Project
import org.gradle.api.plugins.ExtensionAware
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmOptions

internal fun Project.configureKotlinAndroid(
    extension: CommonExtension<*, *, *, *>
) {
    extension.apply {
        compileSdk = and.compileSdk

        defaultConfig {
            minSdk = and.minSdk
        }

        compileOptions {
            sourceCompatibility = JavaVersion.VERSION_1_8
            targetCompatibility = JavaVersion.VERSION_1_8
        }

        (this as ExtensionAware).extensions.configure<KotlinJvmOptions>("kotlinOptions") {
            jvmTarget = JavaVersion.VERSION_1_8.toString()
        }
    }
}