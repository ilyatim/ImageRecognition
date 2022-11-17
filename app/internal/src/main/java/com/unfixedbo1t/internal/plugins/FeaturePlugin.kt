package com.unfixedbo1t.internal.plugins

import com.android.build.api.dsl.LibraryExtension
import com.unfixedbo1t.internal.plugins.common.configureFeatureDependencies
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType

class FeaturePlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("com.unfixedbo1t.android.library")
                apply("com.unfixedbo1t.android.hilt")
            }
            configureFeatureDependencies(extensions.getByType<LibraryExtension>())
        }
    }
}