package com.testingapp.ui.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.testingapp.data.remote.MockRepositoryImpl
import com.testingapp.data.remote.response.Offer
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeScreenViewModel @Inject constructor(
    private val repositoryImpl: MockRepositoryImpl
): ViewModel() {

    private val _mockResponse = MutableStateFlow<List<Offer>>(emptyList())
    val mockResponse = _mockResponse.asStateFlow()

    init {
        getMockResponse()
    }

    fun getMockResponse() {
        viewModelScope.launch(Dispatchers.IO) {
            repositoryImpl.getMockResponse().collect {
                _mockResponse.value = it
            }
        }
    }
}