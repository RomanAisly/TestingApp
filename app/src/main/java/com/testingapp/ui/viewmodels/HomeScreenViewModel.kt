package com.testingapp.ui.viewmodels

import androidx.lifecycle.ViewModel
import com.testingapp.data.remote.response.Offer
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class HomeScreenViewModel : ViewModel() {

    private val _offers = MutableStateFlow<List<Offer>>(emptyList())
    val offers = _offers.asStateFlow()

    fun setOffers() {
        _offers.update {
            it
        }
    }

    init {
        setOffers()
    }
}