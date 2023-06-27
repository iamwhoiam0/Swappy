package com.app.swappy.feature_chat.domain.repository

import com.app.swappy.feature_chat.domain.model.ChatRoom
import com.app.swappy.feature_chat.domain.model.Message

interface ChatRepository {
    suspend fun getMessagesByRoom(authKey: String, chatRoomId: Int): List<Message>

    suspend fun getMyRooms(authKey: String): List<ChatRoom>

    suspend fun getOrCreatePrivateRoom(
        authKey: String,
        companionId: Int,
    ): ChatRoom

    suspend fun sendMessage(authKey: String, chatRoomId: Int, text: String): Message
}