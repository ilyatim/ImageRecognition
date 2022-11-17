package com.unfixedbo1t.imagerecognition.ui.screen

import androidx.compose.runtime.Composable
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.lifecycle.LifecycleOwner
import com.unfixedbo1t.ui.CameraView

@Composable
fun ScreenScan(
    lifecycleOwner: LifecycleOwner
) {
    ConstraintLayout {

    }
    //TODO: Add button, info text, padding bottom, and set full screen
    CameraView(lifecycleOwner)
}