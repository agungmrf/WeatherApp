package com.example.weatherapp.api

import com.example.weatherapp.model.Weather
import retrofit2.Response
import retrofit2.http.GET

/**
 * Created by Agung Ma'ruf on 03/09/2021.
 */
interface ApiService {

    @GET("weather/Bandung")
    suspend fun getWeather(): Response<Weather>

}