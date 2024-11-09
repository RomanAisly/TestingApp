package com.testingapp.domain.repository

import com.testingapp.data.remote.response.Offer
import kotlinx.coroutines.flow.Flow

interface MockRepository {
    suspend fun getMockResponse(): Flow<List<Offer>>
}