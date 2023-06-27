package com.app.swappy.feature_chat.presentation.rooms

import androidx.annotation.StringRes
import com.app.swappy.feature_chat.domain.model.ChatRoom

data class ChatRoomState(
    val isLoading: Boolean = false,
    @StringRes val errorMessageId: Int? = null,
    val chatRooms: List<ChatRoom> = emptyList(),
    val isAuthorized: Boolean = false,
)
