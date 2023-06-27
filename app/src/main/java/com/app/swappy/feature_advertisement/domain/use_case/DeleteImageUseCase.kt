package com.app.swappy.feature_advertisement.domain.use_case

import com.app.swappy.core.Resource
import com.app.swappy.feature_advertisement.domain.model.ImageModel
import com.app.swappy.feature_advertisement.domain.repository.AdvertisementRepository
import kotlinx.coroutines.flow.Flow

class DeleteImageUseCase(
    private val repository: AdvertisementRepository,
) {
    operator fun invoke(
        image: ImageModel,
    ): Flow<Resource<Unit>> {
        return Resource.defaultHandleApiResource { repository.deleteImage(image) }
    }
}