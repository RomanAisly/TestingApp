package com.testingapp.domain.navigation

import com.testingapp.R
import kotlinx.serialization.Serializable

@Serializable
object HomeNavScreen

@Serializable
object FavouritesNavScreen

@Serializable
object ResponsesNavScreen

@Serializable
object MessengersNavScreen

@Serializable
object ProfileNavScreen

@Serializable
sealed class BottomScreens<T>(val name: String, val icon: Int, val route: T) {
    @Serializable
    data object Home : BottomScreens<HomeNavScreen>("Home", R.drawable.ic_search, HomeNavScreen)

    @Serializable
    data object Favourites : BottomScreens<FavouritesNavScreen>("Favourites", R.drawable.ic_favorite, FavouritesNavScreen)

    @Serializable
    data object Responses : BottomScreens<ResponsesNavScreen>("Responses", R.drawable.ic_email, ResponsesNavScreen)

    @Serializable
    data object Messengers : BottomScreens<MessengersNavScreen>("Messengers", R.drawable.ic_message, MessengersNavScreen)

    @Serializable
    data object Profile : BottomScreens<ProfileNavScreen>("Profile", R.drawable.ic_profile, ProfileNavScreen)
}