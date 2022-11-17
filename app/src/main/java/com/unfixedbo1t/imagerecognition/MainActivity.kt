package com.unfixedbo1t.imagerecognition

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.compose.setContent
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.google.accompanist.permissions.ExperimentalPermissionsApi
import com.google.accompanist.permissions.PermissionState
import com.google.accompanist.permissions.PermissionStatus
import com.google.accompanist.permissions.rememberPermissionState
import com.unfixedbo1t.imagerecognition.ui.screen.ScreenScan
import com.unfixedbo1t.imagerecognition.ui.theme.MainTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalPermissionsApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainTheme {
                val cameraPermissionState = rememberPermissionState(android.Manifest.permission.CAMERA)
                when (val status = cameraPermissionState.status) {
                    PermissionStatus.Granted -> ScreenScan(this)
                    is PermissionStatus.Denied -> {
                        val textToShow = if (status.shouldShowRationale) {
                            // If the user has denied the permission but the rationale can be shown,
                            // then gently explain why the app requires this permission
                            getString(R.string.camera_important_for_app_text)
                        } else {
                            // If it's the first time the user lands on this feature, or the user
                            // doesn't want to be asked again for this permission, explain that the
                            // permission is required
                            getString(R.string.camera_permission_require)
                        }
                        Text(textToShow)
                        val onClick = {
                            cameraPermissionState.launchPermissionRequest()
                        }
                        Button(onClick = onClick) {
                            Text(getString(R.string.request_permission))
                        }
                    }
                }
            }
        }
    }
}