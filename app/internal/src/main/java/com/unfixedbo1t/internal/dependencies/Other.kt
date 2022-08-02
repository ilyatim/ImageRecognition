@file:Suppress("unused")

package com.unfixedbo1t.internal.dependencies

object Other {
    /**
     * ONNX Runtime is a performance-focused inference engine
     * for ONNX (Open Neural Network Exchange) models.
     * @see [https://mvnrepository.com/artifact/com.microsoft.onnxruntime/onnxruntime-mobile]
     */
    const val onnxRuntime = "com.microsoft.onnxruntime:onnxruntime:${Versions.onnxRuntimeVersion}"

    /**
     * Core components for the Jetpack Camera Library,
     * a library providing a consistent and reliable camera foundation that enables
     * great camera driven experiences across all of Android.
     * @see [https://mvnrepository.com/artifact/androidx.camera/camera-core]
     */
    const val cameraCore = "androidx.camera:camera-core:${Versions.cameraxVersion}"

    /**
     * Camera2 implementation and extensions for the Jetpack Camera Library,
     * a library providing a consistent and reliable camera foundation that enables great
     * camera driven experiences across all of Android.
     * @see [https://mvnrepository.com/artifact/androidx.camera/camera-camera2]
     */
    const val camera2 = "androidx.camera:camera-camera2:${Versions.cameraxVersion}"

    /**
     * Lifecycle components for the Jetpack Camera Library, a library providing a
     * consistent and reliable camera foundation that enables great camera driven
     * experiences across all of Android.
     * @see [https://mvnrepository.com/artifact/androidx.camera/camera-lifecycle]
     */
    const val cameraLifecycle = "androidx.camera:camera-lifecycle:${Versions.cameraxVersion}"

    /**
     * UI tools for the Jetpack Camera Library, a library providing a consistent and reliable
     * camera foundation that enables great camera driven experiences across all of Android.
     * @see [https://mvnrepository.com/artifact/androidx.camera/camera-view]
     */
    const val cameraView = "androidx.camera:camera-view:${Versions.cameraViewVersion}"

    /**
     * Utilities for Jetpack Compose
     * @see [https://mvnrepository.com/artifact/com.google.accompanist/accompanist-permissions]
     */
    const val accompanistPermission = "com.google.accompanist:accompanist-permissions:${Versions.permissionVersion}"
}