package com.aviansoft.composedemo.API

import com.aviansoft.composedemo.Utils.Util
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    private var BASE_URL = Util.decodeFromBase64(Util.BASE_URL)

    val api: ApiInterface by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiInterface::class.java)
    }
}