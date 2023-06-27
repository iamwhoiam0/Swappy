package com.app.swappy.feature_chat.presentation.rooms

import com.app.swappy.feature_account.domain.model.UserProfile
import com.app.swappy.feature_chat.domain.model.ChatRoom

sealed interface ChatRoomEvent{
    object DismissError: ChatRoomEvent
    class ToPrivateChat(val profile: UserProfile, val room: ChatRoom): ChatRoomEvent
}

sealed interface ChatRoomViewModelEvent {
    class Navigate(val route: String): ChatRoomViewModelEvent
}