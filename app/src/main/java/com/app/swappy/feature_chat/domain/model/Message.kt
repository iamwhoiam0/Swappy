package com.app.swappy.feature_chat.domain.model

import com.app.swappy.feature_account.domain.model.UserProfile
import java.time.LocalDateTime

data class Message(
    val id: Int,
    val room: Int,
    val sentDateTime: LocalDateTime,
    val text: String,
    val toUser: UserProfile,
    val fromUser: UserProfile
)