package com.testingapp.domain.navigation

import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.testingapp.ui.screens.FavoritesScreen
import com.testingapp.ui.screens.HomeScreen
import com.testingapp.ui.screens.MessengersScreen
import com.testingapp.ui.screens.ProfileScreen
import com.testingapp.ui.screens.ResponsesScreen

@Composable
fun NavGraph(modifier: Modifier = Modifier, navHostController: NavHostController) {
    Scaffold(
        bottomBar = { BottomNavBar(navController = navHostController) },
        containerColor = MaterialTheme.colorScheme.background
    ) { innerPadding ->
        NavHost(
            modifier = modifier
                .padding(innerPadding)
                .background(MaterialTheme.colorScheme.background),
            navController = navHostController,
            startDestination = HomeNavScreen,
            enterTransition = {
                slideInHorizontally(
                    initialOffsetX = { 900 },
                    animationSpec = tween(
                        durationMillis = 1200,
                        easing = FastOutSlowInEasing
                    )
                )
            },
            exitTransition = {
                slideOutHorizontally(
                    targetOffsetX = { 900 },
                    animationSpec = tween(
                        durationMillis = 1200,
                        easing = FastOutSlowInEasing
                    )
                )
            }

        ) {
            composable<HomeNavScreen> {
                HomeScreen()
            }
            composable<FavouritesNavScreen> {
                FavoritesScreen()
            }
            composable<ResponsesNavScreen> {
                ResponsesScreen()
            }
            composable<MessengersNavScreen> {
                MessengersScreen()
            }
            composable<ProfileScreen> {
                ProfileScreen()
            }
        }
    }
}