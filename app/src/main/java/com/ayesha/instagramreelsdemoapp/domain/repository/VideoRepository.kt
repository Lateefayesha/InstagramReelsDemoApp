package com.ayesha.instagramreelsdemoapp.domain.repository

import com.ayesha.instagramreelsdemoapp.domain.model.VideoModel
import com.ayesha.instagramreelsdemoapp.utils.Resource
import kotlinx.coroutines.flow.Flow

interface VideoRepository {
    suspend fun getVideoList(): Flow<Resource<List<VideoModel>>>

}