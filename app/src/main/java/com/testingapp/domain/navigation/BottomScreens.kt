package com.testingapp.domain.navigation

import com.testingapp.R
import kotlinx.serialization.Serializable

@Serializable
sealed class BottomScreens<T>(val name: String, val icon: Int, val route: T) {
    @Serializable
    data object Home : BottomScreens<HomeNavScreen>(
        name = "Home",
        icon = R.drawable.ic_search,
        route = HomeNavScreen
    )

    @Serializable
    data object Favourites : BottomScreens<FavouritesNavScreen>(
        name = "Favourites",
        icon = R.drawable.ic_favorite,
        route = FavouritesNavScreen
    )

    @Serializable
    data object Responses :
        BottomScreens<ResponsesNavScreen>(
            name = "Responses",
            icon = R.drawable.ic_email,
            route = ResponsesNavScreen
        )

    @Serializable
    data object Messengers :
        BottomScreens<MessengersNavScreen>(
            name = "Messages",
            icon = R.drawable.ic_message,
            route = MessengersNavScreen
        )

    @Serializable
    data object Profile :
        BottomScreens<ProfileScreen>(
            name = "Profile",
            icon = R.drawable.ic_profile,
            route = ProfileScreen
        )
}