package com.example.weatherproject.screens.main

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun MainScreen() {
    val viewModel : MainViewModel =
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

    }
}

@Composable
@Preview
fun MainScreenPrev() {
    MainScreen()
}
