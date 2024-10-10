package com.example.weatherproject.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.weatherproject.screens.main.MainScreen
import com.example.weatherproject.ui.theme.WeatherProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WeatherProjectTheme {
                MainScreen()
            }
        }
    }
}
