package com.ayesha.instagramreelsdemoapp.presentattion

import com.ayesha.instagramreelsdemoapp.domain.model.VideoModel

data class VideoListState(
    val videos: List<VideoModel> = emptyList(),
    val isLoading: Boolean = false,
    var error_msg: String = "Error",

    )
