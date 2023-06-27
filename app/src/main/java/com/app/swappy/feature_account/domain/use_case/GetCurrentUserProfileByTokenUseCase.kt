package com.app.swappy.feature_account.domain.use_case

import android.content.Context
import androidx.datastore.preferences.core.edit
import com.app.swappy.R
import com.app.swappy.core.Resource
import com.app.swappy.feature_account.data.local.authDataStore
import com.app.swappy.feature_account.domain.model.Token
import com.app.swappy.feature_account.domain.model.UserProfile
import com.app.swappy.feature_account.domain.repository.AccountRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emitAll
import kotlinx.coroutines.flow.flow

class GetCurrentUserProfileByTokenUseCase(
    private val context: Context,
    private val accountRepository: AccountRepository,
) {
    operator fun invoke(authKey: String): Flow<Resource<UserProfile>> = flow {
        emitAll(
            Resource.defaultHandleApiResource(onHttpException = {
                context.authDataStore.edit { it.clear() }
                emit(Resource.Error(R.string.user_with_this_auth_key_does_not_exist))
            }) {
                accountRepository.getUserProfileByAuthToken(Token(token = authKey))
            }
        )

    }
}
