package com.unfixedbo1t.internal.dependencies

object Lifecycle {
    /**
     * Kotlin extensions for 'viewmodel' artifact
     * @see [https://mvnrepository.com/artifact/androidx.lifecycle/lifecycle-viewmodel-ktx]
     */
    const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:$viewModelVersion"

    /**
     * Kotlin extensions for 'lifecycle' artifact
     * @see [https://mvnrepository.com/artifact/androidx.lifecycle/lifecycle-runtime-ktx]
     */
    const val lifecycleRunKtx = "androidx.lifecycle:lifecycle-runtime-ktx:$lifecycleVersion"

    /**
     * Compose integration with Lifecycle
     * @see [https://mvnrepository.com/artifact/androidx.lifecycle/lifecycle-runtime-compose]
     */
    const val composeLifecycleRuntimeExt: String = "androidx.lifecycle:lifecycle-runtime-compose:$composeLifecycleVersion"
}

private const val composeLifecycleVersion = "2.6.0-alpha03"
private const val lifecycleVersion = Versions.lifecycleKtxVersion
private const val viewModelVersion = "2.4.0"