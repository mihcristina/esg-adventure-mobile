package com.example.esg_adventure.Factory
import com.example.esg_adventure.ApiService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitFactory {

    val URL: String = "https://www.fruityvice.com/api/"

    val retrofitFactory = Retrofit.Builder()
        .baseUrl(URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun retrofitService(): ApiService {
        return retrofitFactory.create(ApiService::class.java)
    }
}