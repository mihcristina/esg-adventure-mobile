package com.example.esg_adventure

import android.telecom.Call
import com.example.esg_adventure.model.Fruit
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("fruit/{Fruit}")
    fun getFruit(@Path("Fruit") Fruit : String) : retrofit2.Call<Fruit>
}