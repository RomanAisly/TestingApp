package com.testingapp.domain.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraph
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
    Scaffold(bottomBar = { BottomNavBar(navController = navHostController) }) { innerPadding ->
        NavHost(
            navController = navHostController,
            startDestination = BottomScreens.Home,
            modifier = modifier.padding(innerPadding)
        ) {
            composable<BottomScreens.Home> {
                HomeScreen()
            }
            composable<BottomScreens.Favourites> {
                FavoritesScreen()
            }
            composable<BottomScreens.Responses> {
                ResponsesScreen()
            }
            composable<BottomScreens.Messengers> {
                MessengersScreen()
            }
            composable<BottomScreens.Profile> {
                ProfileScreen()
            }
        }

    }
}