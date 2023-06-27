package com.app.swappy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.app.swappy.core.navigation.NavGraph
import com.app.swappy.core.presentation.screen_base.BaseScreen
import com.app.swappy.ui.theme.ThingsCrossingTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()

            ThingsCrossingTheme {
                BaseScreen(
                    navController = navController,
                ) {
                    NavGraph(
                        navController = navController,
                    )
                }
            }
        }
    }
}