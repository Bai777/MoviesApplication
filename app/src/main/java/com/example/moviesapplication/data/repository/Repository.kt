package com.example.moviesapplication.data.repository

import com.example.moviesapplication.domain.Film
import io.reactivex.rxjava3.core.Single

interface Repository {

    fun getFilms(): Single<List<Film>>
}