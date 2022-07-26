@file:Suppress("unused")

package com.unfixedbo1t.internal.dependencies

object Core {
    /**
     * Kotlin extensions for 'core' artifact
     * @see [https://mvnrepository.com/artifact/androidx.core/core-ktx]
     */
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtxVersion}"

    /**
     * Kotlin extensions for 'lifecycle' artifact
     * @see [https://mvnrepository.com/artifact/androidx.lifecycle/lifecycle-runtime-ktx]
     */
    const val lifecycleKtx = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleKtxVersion}"

    /**
     * Compose integration with Activity
     * @see [https://mvnrepository.com/artifact/androidx.activity/activity-compose]
     */
    const val composeActivity = "androidx.activity:activity-compose:${Versions.composeActivityVersion}"
}