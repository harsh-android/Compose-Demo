package com.aviansoft.composedemo.API.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
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
class MainViewModel @Inject constructor() : ViewModel() {

    private val repository = Repository()

    private val _data = MutableLiveData<HeadBannerModel>()
    val data: LiveData<HeadBannerModel> get() = _data


    fun getHeader(type:String) {
        viewModelScope.launch {
            _data.value = repository.getBanner(type).value
        }
    }
}