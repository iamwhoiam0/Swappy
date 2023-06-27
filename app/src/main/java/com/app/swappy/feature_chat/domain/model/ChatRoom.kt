package com.app.swappy.feature_chat.domain.model

data class ChatRoom(
    val id: Int,
    val lastMessage: Message?,
    val name: String?,
    val participants: List<Participant>,
    val type: String
) {
    companion object {
        val PRIVATE_TYPE = "private"
        val GROUP_TYPE = "group"
    }
}