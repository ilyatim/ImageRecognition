package com.unfixedbo1t.internal.plugins.common

import com.android.build.api.dsl.CommonExtension
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

internal fun Project.configureFeatureDependencies(
    extension: CommonExtension<*, *, *, *>
) {
    extension.apply {
        dependencies {
            implementation(project(":uikit"))

            //implementation(dep.navigation.hiltComposeNavigation)
            implementation(dep.lifecycle.composeLifecycleRuntimeExt)
            implementation(dep.lifecycle.viewModel)
            implementation(dep.lifecycle.lifecycleRunKtx)
        }
    }
}