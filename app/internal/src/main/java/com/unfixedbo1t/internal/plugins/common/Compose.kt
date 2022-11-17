@file:Suppress("UnstableApiUsage")

package com.unfixedbo1t.internal.plugins.common

import com.android.build.api.dsl.CommonExtension
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

internal fun Project.configureComposeAndroid(
    extension: CommonExtension<*, *, *, *>
) {
    extension.apply {
        composeOptions {
            kotlinCompilerExtensionVersion = and.kotlinCompileExtVersion
        }
        buildFeatures {
            compose = true
        }
        dependencies {
            implementation(dep.ui.composeMaterial)
            implementation(dep.ui.composeUi)
            implementation(dep.ui.composeToolingPreview)
            implementation(dep.ui.constraintLayout)
            debugImplementation(dep.ui.composeTooling)
            debugImplementation(dep.ui.composeTestManifest)
        }
    }
}