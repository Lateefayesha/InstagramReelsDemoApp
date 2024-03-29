package com.ayesha.instagramreelsdemoapp.data.remote.dto

import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface VideoApi {

    @FormUrlEncoded
    @POST("get_video_list_category_wise.php")
    suspend fun getVideoListByCategoryName(@Field("Category_Name") categoryName: String = "Boys"): VideoResponseDto
}
