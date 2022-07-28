@file:Suppress("unused")

package com.unfixedbo1t.internal.dependencies

object Other {
    /**
     * ONNX Runtime is a performance-focused inference engine
     * for ONNX (Open Neural Network Exchange) models.
     * @see [https://mvnrepository.com/artifact/com.microsoft.onnxruntime/onnxruntime-mobile]
     */
    const val onnxRuntime = "com.microsoft.onnxruntime:onnxruntime:${Versions.onnxRuntimeVersion}"
}