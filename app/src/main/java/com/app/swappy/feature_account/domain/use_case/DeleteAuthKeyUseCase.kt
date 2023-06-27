package com.app.swappy.feature_account.domain.use_case

import android.content.Context
import androidx.datastore.preferences.core.edit
import com.app.swappy.core.Resource
import com.app.swappy.feature_account.data.local.authDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class DeleteAuthKeyUseCase(private val context: Context) {
    operator fun invoke(): Flow<Resource<Unit>> = flow {
        emit(Resource.Loading())
        context.authDataStore.edit { preferences ->
            preferences.clear()
        }
        emit(Resource.Success(Unit))
    }
}