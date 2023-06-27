package com.app.swappy.feature_advertisement.domain.use_case

import com.app.swappy.core.Resource
import com.app.swappy.feature_advertisement.domain.model.Advertisement
import com.app.swappy.feature_advertisement.domain.repository.AdvertisementRepository
import kotlinx.coroutines.flow.Flow

class GetAdvertisementUseCase(
    private val repository: AdvertisementRepository,
) {
    operator fun invoke(id: Int): Flow<Resource<Advertisement>> {
        return Resource.defaultHandleApiResource { repository.getAdvertisementById(id) }
    }
}