package com.ayesha.instagramreelsdemoapp.data.remote.dto

import com.ayesha.instagramreelsdemoapp.domain.model.VideoModel

data class VideoDto(
    val video_id: Int,
    val title: String,
    val video: String,
    val thumbnail: String,
    val views: Int,
    val likes: Int,
    val downloads: Int,
    val category: String,
)

fun VideoDto.toVideoModel(): VideoModel {
    return VideoModel(
        title = title,
        thumbnail = thumbnail,
        videoUrl = video,
    )
}
