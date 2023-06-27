package com.app.swappy.feature_chat.domain.use_case

import android.content.Context
import com.app.swappy.core.Resource
import com.app.swappy.feature_account.data.local.toAuthKey
import com.app.swappy.feature_chat.domain.model.ChatRoom
import com.app.swappy.feature_chat.domain.repository.ChatRepository
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.Flow

class GetMyRooms(
    private val repository: ChatRepository,
    @ApplicationContext private val context: Context
) {
    operator fun invoke(authKey: String): Flow<Resource<List<ChatRoom>>> =
        Resource.defaultHandleApiResource {
            repository.getMyRooms(
                authKey = authKey.toAuthKey(),
            )
        }
}