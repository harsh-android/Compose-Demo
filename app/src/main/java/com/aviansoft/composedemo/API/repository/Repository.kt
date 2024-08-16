package com.aviansoft.composedemo.API.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.aviansoft.composedemo.API.ApiInterface
import com.aviansoft.composedemo.API.RetrofitInstance
import com.aviansoft.composedemo.Model.HeadBannerModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject
import javax.inject.Singleton

class Repository @Inject constructor() {
    private val apiService = RetrofitInstance.api

    fun getBanner(type:String): LiveData<HeadBannerModel> {
        val data = MutableLiveData<HeadBannerModel>()

        apiService.getBanner(type).enqueue(object : Callback<HeadBannerModel> {
            override fun onResponse(call: Call<HeadBannerModel>, response: Response<HeadBannerModel>) {
                if (response.isSuccessful) {
                    data.value = response.body()
                }
            }

            override fun onFailure(call: Call<HeadBannerModel>, t: Throwable) {
                // Handle error
            }
        })

        return data
    }
}