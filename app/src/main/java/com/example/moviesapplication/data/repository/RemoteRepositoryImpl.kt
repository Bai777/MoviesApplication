package com.example.moviesapplication.data.repository

import com.example.moviesapplication.data.network.ApiService
import com.example.moviesapplication.domain.Converter
import com.example.moviesapplication.domain.Film
import io.reactivex.rxjava3.core.Single

class RemoteRepositoryImpl(private val repo: ApiService) : Repository {
    override fun getFilms(): Single<List<Film>> {
        return repo.getFilms().map {
            Converter.convertResponseToFilms(it.results)
        }
    }
}