package com.testingapp.domain.navigation

import androidx.annotation.StringRes
import com.testingapp.R
import kotlinx.serialization.Serializable

@Serializable
sealed class BottomScreens<T>(@StringRes val label: Int, val icon: Int, val route: T) {
    @Serializable
    data object Home : BottomScreens<HomeNavScreen>(
        label = R.string.nav_item_home,
        icon = R.drawable.ic_search,
        route = HomeNavScreen
    )

    @Serializable
    data object Favourites : BottomScreens<FavouritesNavScreen>(
        label = R.string.nav_item_favourites,
        icon = R.drawable.ic_favorite,
        route = FavouritesNavScreen
    )

    @Serializable
    data object Responses :
        BottomScreens<ResponsesNavScreen>(
            label = R.string.nav_item_responses,
            icon = R.drawable.ic_email,
            route = ResponsesNavScreen
        )

    @Serializable
    data object Messengers :
        BottomScreens<MessengersNavScreen>(
            label = R.string.nav_item_messages,
            icon = R.drawable.ic_message,
            route = MessengersNavScreen
        )

    @Serializable
    data object Profile :
        BottomScreens<ProfileScreen>(
            label = R.string.nav_item_profile,
            icon = R.drawable.ic_profile,
            route = ProfileScreen
        )
}