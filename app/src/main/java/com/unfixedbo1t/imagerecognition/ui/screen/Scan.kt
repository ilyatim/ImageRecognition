package com.unfixedbo1t.imagerecognition.ui.screen

import androidx.compose.runtime.Composable
import androidx.lifecycle.LifecycleOwner
import com.unfixedbo1t.ui.CameraView

@Composable
fun ScreenScan(
    lifecycleOwner: LifecycleOwner
) {
    CameraView(lifecycleOwner)
}