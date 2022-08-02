package com.unfixedbo1t.imagerecognition.data.ui

data class Toast(val message: Message)

sealed class Message {
    data class Text(val message: String)
    data class Resource(val resource: Int)
}