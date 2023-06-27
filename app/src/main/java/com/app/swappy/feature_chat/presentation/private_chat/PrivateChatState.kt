package com.app.swappy.feature_chat.presentation.private_chat

import com.app.swappy.feature_account.domain.model.UserProfile
import com.app.swappy.feature_chat.domain.model.Message

data class PrivateChatState(
    val isLoading: Boolean = true,
    val errorMessageId: Int? = null,
    val messages: List<Message> = emptyList(),
    val companionUserProfile: UserProfile? = null,
    val newMessage: String = "",
    val isMessageUploading: Boolean = false,
)