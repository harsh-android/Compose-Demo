package com.aviansoft.composedemo.API

import android.content.Context
import com.aviansoft.composedemo.Utils.Util
import com.aviansoft.composedemo.Utils.Util.Companion.BASE_URL
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit


public class ApiClient {

    companion object {

        lateinit var retrofit: Retrofit


        public fun getApiClient(): Retrofit {

//            val client = MTLSHelper.createMTLSClient(context)


            // Create OkHttpClient with the configured SSLContext
            val client: OkHttpClient =
                OkHttpClient.Builder().connectTimeout(60, TimeUnit.SECONDS) // Adjust as needed
                    .readTimeout(60, TimeUnit.SECONDS) // Adjust as needed
                    .writeTimeout(60, TimeUnit.SECONDS) // Adjust as needed
                    .build()

            retrofit = Retrofit.Builder().baseUrl(Util.decodeFromBase64(BASE_URL)).client(client)
                .addConverterFactory(GsonConverterFactory.create()).build()

            return retrofit
        }


    }

}