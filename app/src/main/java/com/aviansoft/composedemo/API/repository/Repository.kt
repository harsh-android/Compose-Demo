package com.aviansoft.composedemo.API.repository

import com.aviansoft.composedemo.API.ApiInterface
import com.aviansoft.composedemo.Model.HeadBannerModel
import javax.inject.Inject
import javax.inject.Singleton

class Repository @Inject constructor(private val apiService: ApiInterface) {

    suspend fun getHeadBanners(type:String): HeadBannerModel {
        return apiService.getBanner(type)
    }
}