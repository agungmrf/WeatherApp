package com.example.weatherapp.repository

import com.example.weatherapp.api.ApiService
import com.example.weatherapp.model.Weather
import retrofit2.Response
import javax.inject.Inject

/**
 * Created by Agung Ma'ruf on 03/09/2021.
 */
class WeatherRepository
@Inject
constructor(private val apiService: ApiService) {
    suspend fun getWeather(): Response<Weather> {
        return apiService.getWeather()
    }
}