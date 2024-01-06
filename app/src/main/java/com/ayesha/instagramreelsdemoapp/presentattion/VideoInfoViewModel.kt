package com.ayesha.instagramreelsdemoapp.presentattion

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ayesha.instagramreelsdemoapp.domain.repository.VideoRepository
import com.ayesha.instagramreelsdemoapp.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class VideoInfoViewModel @Inject constructor(private  val repository: VideoRepository):ViewModel() {
    var state  by mutableStateOf(VideoListState())

    init{
        getVideoList()
    }

    private fun getVideoList() {
        viewModelScope.launch {
            repository.getVideoList()
                .collect{ result->
                    when(result){
                        is Resource.Success ->{
                            result.data?.let { list ->
                                state = state.copy(videos = list)
                            }
                        }
                        is Resource.Error->{
                          state = result.message?.let { state.copy(error_msg = it) }!!
                        }
                        is Resource.Loading->{
                            state = state.copy(isLoading =  result.isLoading)
                        }
                    }

                }
        }

    }
}