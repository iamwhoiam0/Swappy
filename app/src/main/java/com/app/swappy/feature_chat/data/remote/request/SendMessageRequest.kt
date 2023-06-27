package com.app.swappy.feature_chat.data.remote.request

data class SendMessageRequest(
    val text: String,
    val room: Int,
)