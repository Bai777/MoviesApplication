package com.example.moviesapplication.ui

import com.example.moviesapplication.domain.Film

sealed class MainAppState {
    data class Success(val dataList: List<Film>) : MainAppState()
    class Error(val error: Throwable) : MainAppState()
    object Loading : MainAppState()
}