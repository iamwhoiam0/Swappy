package com.app.swappy.feature_account.domain.use_case

import com.app.swappy.R
import com.app.swappy.core.Resource
import com.app.swappy.feature_account.data.remote.dto.SignUpResponse
import com.app.swappy.feature_account.domain.model.User
import com.app.swappy.feature_account.domain.repository.AccountRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.net.ConnectException
import java.net.SocketTimeoutException

class SignUpUseCase(private val accountRepository: AccountRepository) {
    /**
     * @return Auth token if registration is successful*/
    operator fun invoke(user: User): Flow<Resource<SignUpResponse>> =
        flow {
            try {
                emit(Resource.Loading())
                val result = accountRepository.registerUser(user)
                emit(Resource.Success(result))
            } catch (connectException: ConnectException) {
                emit(Resource.Error(R.string.server_refused_message))
            } catch (e: SocketTimeoutException) {
                emit(Resource.Error(R.string.server_timeout_message))
            } catch (e: HttpException) {
                emit(Resource.Error(R.string.username_already_exists))
            }
        }
}