package com.unfixedbo1t.imagerecognition.utils

import androidx.lifecycle.ViewModel
import com.unfixedbo1t.imagerecognition.data.ui.Toast
import com.unfixedbo1t.imagerecognition.data.ui.scan.Action
import com.unfixedbo1t.imagerecognition.data.ui.scan.UiState
import kotlinx.coroutines.flow.MutableStateFlow

class ScanScreenViewModel : BaseViewModel<UiState, Action, Toast>() {
    override val uiState: MutableStateFlow<UiState>
        get() = MutableStateFlow(UiState.Idle)

    override fun onAction(action: Action) = when (action) {
        else -> {}
    }
}