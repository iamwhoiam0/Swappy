package com.app.swappy.feature_account.data.remote.dto

import com.app.swappy.feature_account.domain.model.User
import com.app.swappy.feature_account.domain.model.UserProfile

data class SignUpResponse(
    val token: String,
    val user: User,
    val profile: UserProfile
)