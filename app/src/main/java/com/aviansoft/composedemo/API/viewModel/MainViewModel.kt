package com.aviansoft.composedemo.API.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.aviansoft.composedemo.API.repository.Repository
import com.aviansoft.composedemo.Model.HeadBannerModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val repository: Repository) : ViewModel() {

    private val _headBanners = MutableStateFlow<HeadBannerModel?>(null)
    val headBanners: StateFlow<HeadBannerModel?> = _headBanners

    fun fetchHeadBanners(type:String) {
        viewModelScope.launch {
            _headBanners.value = repository.getHeadBanners(type)
        }
    }
}