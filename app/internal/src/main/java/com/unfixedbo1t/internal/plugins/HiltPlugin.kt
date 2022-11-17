@file:Suppress("unused")

package com.unfixedbo1t.internal.plugins

import com.unfixedbo1t.internal.plugins.common.dep
import com.unfixedbo1t.internal.plugins.common.implementation
import com.unfixedbo1t.internal.plugins.common.kapt
import com.unfixedbo1t.internal.plugins.common.kaptAndroidTest
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class HiltPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("dagger.hilt.android.plugin")
                apply("org.jetbrains.kotlin.kapt")
            }

            dependencies {
                implementation(dep.di.hiltAndroid)
                kapt(dep.di.hiltAndroidCompiler)
                kaptAndroidTest(dep.di.hiltAndroidCompiler)
            }
        }
    }
}