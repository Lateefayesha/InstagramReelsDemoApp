package com.ayesha.instagramreelsdemoapp.di

import com.ayesha.instagramreelsdemoapp.data.remote.dto.VideoRepositoryImpl
import com.ayesha.instagramreelsdemoapp.domain.repository.VideoRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindVideoRepository(videoRepositoryImpl: VideoRepositoryImpl): VideoRepository
}
