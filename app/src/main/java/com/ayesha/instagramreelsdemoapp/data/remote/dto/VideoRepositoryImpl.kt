package com.ayesha.instagramreelsdemoapp.data.remote.dto

import com.ayesha.instagramreelsdemoapp.domain.model.VideoModel
import com.ayesha.instagramreelsdemoapp.domain.repository.VideoRepository
import com.ayesha.instagramreelsdemoapp.utils.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class VideoRepositoryImpl @Inject constructor(
    private val api: VideoApi,
) : VideoRepository {

    override suspend fun getVideoList(): Flow<Resource<List<VideoModel>>> {
        // fetch video list from api
        return flow {
            emit(Resource.Loading(true))

            // Get Api response
            val response = try {
                api.getVideoListByCategoryName()
            } catch (e: IOException) {
                e.printStackTrace()
                emit(Resource.Error("Couldn't load data"))
                null
            } catch (e: HttpException) {
                e.printStackTrace()
                emit(Resource.Error("Couldn't load data"))
                null
            }

            // check for response
            response?.let {
                when {
                    it.error -> {
                        emit(Resource.Error(it.error_msg))
                    }

                    else -> {
                        emit(
                            Resource.Success(
                                it.res.map { videoDto ->
                                    videoDto.toVideoModel()
                                },
                            ),
                        )
                    }
                }
            }

            emit(Resource.Loading(false))
        }
    }
}
