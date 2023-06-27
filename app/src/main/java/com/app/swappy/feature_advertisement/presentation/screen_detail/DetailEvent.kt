package com.app.swappy.feature_advertisement.presentation.screen_detail

import com.app.swappy.feature_account.domain.model.UserProfile

sealed interface DetailEvent {
    object ToggleMorePricesVisibility : DetailEvent
    class ToChat(val profile: UserProfile): DetailEvent

    object DismissError: DetailEvent
}

sealed interface DetailViewModelEvent {
    class Navigate(val route: String) : DetailViewModelEvent
}