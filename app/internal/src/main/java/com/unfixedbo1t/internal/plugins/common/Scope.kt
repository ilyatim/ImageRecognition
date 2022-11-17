package com.unfixedbo1t.internal.plugins.common

import org.gradle.api.artifacts.Dependency
import org.gradle.kotlin.dsl.DependencyHandlerScope

internal fun DependencyHandlerScope.implementation(notation: Any): Dependency? =
    add("implementation", notation)

internal fun DependencyHandlerScope.androidTestImplementation(notation: Any): Dependency? =
    add("androidTestImplementation", notation)

internal fun DependencyHandlerScope.debugImplementation(notation: Any): Dependency? =
    add("debugImplementation", notation)

internal fun DependencyHandlerScope.kapt(notation: Any): Dependency? =
    add("kapt", notation)

internal fun DependencyHandlerScope.kaptAndroidTest(notation: Any): Dependency? =
    add("kaptAndroidTest", notation)