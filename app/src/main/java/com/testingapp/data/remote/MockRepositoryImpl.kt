package com.testingapp.data.remote

import com.testingapp.data.remote.response.Offer
import com.testingapp.domain.repository.MockRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import okio.IOException
import retrofit2.HttpException
import javax.inject.Inject

class MockRepositoryImpl @Inject constructor(private val api: MockApi) : MockRepository {
    override suspend fun getMockResponse(): Flow<List<Offer>> {
        return flow {
            val mocks = try {
                api.getMockResponse()
            } catch (e: IOException) {
                e.printStackTrace()
                emit(emptyList())
                return@flow
            } catch (e: HttpException){
                e.printStackTrace()
                emit(emptyList())
                return@flow
            } catch (e: Exception){
                e.printStackTrace()
                emit(emptyList())
                return@flow
            }
            emit(mocks.offers)
        }
    }
}