package com.example.weatherproject.screens.main

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor() : ViewModel() {
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