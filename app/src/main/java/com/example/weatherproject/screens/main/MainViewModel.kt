package com.example.weatherproject.screens.main

import androidx.lifecycle.ViewModel
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainViewModel() : ViewModel() {
    private lateinit var retrofitClient: Retrofit
    init {
        createRetrofitClient()
    }

    private fun createRetrofitClient() {
        retrofitClient = Retrofit.Builder()
            .baseUrl("https://api.openweathermap.org/data/2.5/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}

sealed interface UiState {
    data class Success(val objects: Any) : UiState
    data object Error : UiState
    data object Loading : UiState
}