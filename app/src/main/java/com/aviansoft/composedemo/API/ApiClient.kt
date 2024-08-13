package com.aviansoft.composedemo.API

import com.aviansoft.composedemo.Utils.Util
import com.aviansoft.composedemo.Utils.Util.Companion.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
public class ApiClient {


    @Provides
    @Singleton
    fun getApiClient(): Retrofit {

        val client: OkHttpClient =
            OkHttpClient.Builder().connectTimeout(60, TimeUnit.SECONDS) // Adjust as needed
                .readTimeout(60, TimeUnit.SECONDS) // Adjust as needed
                .writeTimeout(60, TimeUnit.SECONDS) // Adjust as needed
                .build()

        var retrofit = Retrofit.Builder().baseUrl(Util.decodeFromBase64(BASE_URL)).client(client)
            .addConverterFactory(GsonConverterFactory.create()).build()

        return retrofit
    }

    @Provides
    @Singleton
    fun provideApi(retrofit: Retrofit): ApiInterface {
        return retrofit.create(ApiInterface::class.java)
    }

}