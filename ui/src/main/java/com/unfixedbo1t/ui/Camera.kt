package com.unfixedbo1t.ui

import android.annotation.SuppressLint
import android.content.Context
import androidx.camera.core.*
import androidx.camera.lifecycle.ProcessCameraProvider
import androidx.camera.view.PreviewView
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.viewinterop.AndroidView
import androidx.core.content.ContextCompat
import androidx.lifecycle.LifecycleOwner
import java.util.concurrent.Executor

@Composable
fun CameraView(
    lifecycleOwner: LifecycleOwner,
    context: Context = LocalContext.current,
) {
    var preview by remember { mutableStateOf<Preview?>(null) }
    var imageCapture by remember { mutableStateOf<ImageCapture?>(null) }
    val cameraProviderFuture = remember { ProcessCameraProvider.getInstance(context) }
    val cameraProvider = cameraProviderFuture.get()
    val executor: Executor = ContextCompat.getMainExecutor(context)
    AndroidView(
        modifier = Modifier.fillMaxSize(),
        factory = { ctx ->
            val previewView = PreviewView(ctx)
            cameraProviderFuture.addListener({
                 val imageAnalysis = ImageAnalysis.Builder()
                     .setBackpressureStrategy(ImageAnalysis.STRATEGY_KEEP_ONLY_LATEST)
                     .build()
                     .apply {
                         setAnalyzer(executor, FaceAnalyzer())
                     }
                 imageCapture = ImageCapture.Builder()
                     .setTargetRotation(previewView.display.rotation)
                     .build()

                 val cameraSelector = CameraSelector.Builder()
                     .requireLensFacing(CameraSelector.LENS_FACING_BACK)
                     .build()

                 cameraProvider.unbindAll()
                 cameraProvider.bindToLifecycle(
                     lifecycleOwner,
                     cameraSelector,
                     imageCapture,
                     preview
                 )
             }, executor)

            preview = Preview.Builder().build().also {
                it.setSurfaceProvider(previewView.surfaceProvider)
            }
            previewView
        }
    )
}

private class FaceAnalyzer : ImageAnalysis.Analyzer {
    @SuppressLint("UnsafeOptInUsageError")
    override fun analyze(image: ImageProxy) {
        val imagePic = image.image
        imagePic?.close()
    }
}