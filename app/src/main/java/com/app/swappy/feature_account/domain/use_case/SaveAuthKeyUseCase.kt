package com.app.swappy.feature_account.domain.use_case

import android.content.Context
import androidx.datastore.preferences.core.edit
import com.app.swappy.core.Resource
import com.app.swappy.feature_account.data.local.AUTH_KEY
import com.app.swappy.feature_account.data.local.authDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class SaveAuthKeyUseCase(private val context: Context) {
    operator fun invoke(authKey: String): Flow<Resource<String>> = flow {
        emit(Resource.Loading())
        context.authDataStore.edit {
            it[AUTH_KEY] = authKey
        }
        emit(Resource.Success(data = authKey))
    }
}