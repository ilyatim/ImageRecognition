package com.unfixedbo1t.imagerecognition.utils

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch

abstract class BaseViewModel<S, A, E>(
    private val scope: CoroutineScope = CoroutineScope(Dispatchers.Main + Job())
) : CoroutineScope by scope,
    EventBehaviour<E>,
    ActionBehaviour<A>,
    ViewModel() {

    protected abstract val uiState: MutableStateFlow<S>
    val state: StateFlow<S>
        get() = uiState.asStateFlow()

    private val _actions: MutableSharedFlow<A> = MutableSharedFlow()
    val actions: SharedFlow<A>
        get() = _actions.asSharedFlow()

    private val _events: MutableSharedFlow<E> = MutableSharedFlow()
    val events: SharedFlow<E>
        get() = _events.asSharedFlow()

    init {
        launch { subscribeActions() }
        //launch { subscribeEvents() }
    }

    protected abstract fun onAction(action: A)

    /*private suspend fun subscribeEvents() {
        _events.collect(this::onEvent)
    }*/

    private suspend fun subscribeActions() {
        _actions.collect(::onAction)
    }

    override fun sendEvent(event: E) {
        launch { _events.emit(event) }
    }

    override fun sendAction(action: A) {
        launch { _actions.emit(action) }
    }
}

interface ActionBehaviour<A> {
    fun sendAction(action: A)
}

interface EventBehaviour<E> {
    //fun onEvent(event: E)
    fun sendEvent(event: E)
}