@file:Suppress("unused")

package com.unfixedbo1t.internal.dependencies

object Test {
    /**
     * JUnit is a unit testing framework for Java, created by Erich Gamma and Kent Beck.
     * @see [https://mvnrepository.com/artifact/junit/junit]
     */
    const val jUnit = "junit:junit:${Versions.jUnitVersion}"

    /**
     * JUnit support
     * @see [https://mvnrepository.com/artifact/androidx.test.ext/junit]
     */
    const val jUnitExtension = "androidx.test.ext:junit:${Versions.jUnitExtensionVersion}"

    /**
     * The AndroidX Test Library provides an extensive framework for testing Android apps
     * @see [The AndroidX Test Library provides an extensive framework for testing Android apps]
     */
    const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espressoVersion}"

    /**
     * Compose testing integration with JUnit4
     * @see [https://mvnrepository.com/artifact/androidx.compose.ui/ui-test-junit4]
     */
    const val composeJunit = "androidx.compose.ui:ui-test-junit4:${Versions.composeJunitVersion}"
}