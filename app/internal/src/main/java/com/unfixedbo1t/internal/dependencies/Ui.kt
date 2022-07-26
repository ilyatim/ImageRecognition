@file:Suppress("unused")

package com.unfixedbo1t.internal.dependencies

object Ui {
    /**
     * Compose Material Design Components library
     * @see [https://mvnrepository.com/artifact/androidx.compose.material/material]
     */
    const val composeMaterial = "androidx.compose.material:material:${Versions.composeMaterialVersion}"

    /**
     * Compose UI primitives. This library contains the primitives that form the Compose UI Toolkit,
     * such as drawing, measurement and layout.
     * @see [https://mvnrepository.com/artifact/androidx.compose.ui/ui]
     */
    const val composeUi = "androidx.compose.ui:ui:${Versions.composeUiVersion}"

    /**
     * Compose tooling library API. This library provides the API required to declare
     * @Preview composables in user apps.
     * @see [https://mvnrepository.com/artifact/androidx.compose.ui/ui]
     */
    const val composeToolingPreview = "androidx.compose.ui:ui-tooling-preview:${Versions.composeToolingPreviewVersion}"

    /**
     * Compose tooling library. This library exposes information to our tools for better IDE support.
     * @see [https://mvnrepository.com/artifact/androidx.compose.ui/ui-tooling]
     */
    const val composeTooling = "androidx.compose.ui:ui-tooling:${Versions.composeToolingVersion}"

    /**
     * Compose testing library that should be added as a debugImplementation dependency to
     * add properties to the debug manifest necessary for testing an application
     * @see [https://mvnrepository.com/artifact/androidx.compose.ui/ui-test-manifest]
     */
    const val composeTestManifest = "androidx.compose.ui:ui-test-manifest:${Versions.composeTestManifestVersion}"
}