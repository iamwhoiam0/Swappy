package com.app.swappy.feature_advertisement.domain.use_case

import com.app.swappy.core.Resource
import com.app.swappy.feature_advertisement.domain.model.Advertisement
import com.app.swappy.feature_advertisement.domain.repository.AdvertisementRepository
import com.app.swappy.feature_advertisement.domain.util.AdvertisementSortVariant
import kotlinx.coroutines.flow.Flow

class SearchAdvertisementsUseCase(
    val repository: AdvertisementRepository,
) {
    operator fun invoke(
        searchValue: String,
        advertisementSortVariant: AdvertisementSortVariant = AdvertisementSortVariant.Date,
        isSortAscending: Boolean = false,
    ): Flow<Resource<List<Advertisement>>> {
        return Resource.defaultHandleApiResource {
            repository.searchAdvertisements(
                searchValue = searchValue,
                sortBy = advertisementSortVariant,
                isAscending = isSortAscending
            )
        }
    }
}