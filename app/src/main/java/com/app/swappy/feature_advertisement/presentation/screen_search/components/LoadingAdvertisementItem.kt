package com.app.swappy.feature_advertisement.presentation.screen_search.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.ElevatedCard
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import com.valentinilk.shimmer.Shimmer
import com.valentinilk.shimmer.shimmer

@Composable
fun LoadingAdvertisementItem(shimmerInstance: Shimmer, height: Dp) {
    ElevatedCard(
        modifier = Modifier
            .shimmer(shimmerInstance)
            .fillMaxWidth()
            .height(height)
    ) {

    }
}