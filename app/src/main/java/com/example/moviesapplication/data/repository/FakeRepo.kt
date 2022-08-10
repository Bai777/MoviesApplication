package com.example.moviesapplication.data.repository

import com.example.moviesapplication.domain.Film
import io.reactivex.rxjava3.core.Single

class FakeRepo : Repository {
    override fun getFilms(): Single<List<Film>> = Single.just(listOf(
        Film("bai", "image", "Title 1", "5/10", "2017", "Description text of this film", listOf("Comedy", "Action"), listOf("Danila", "Maria", "Svyatoslav")),
        Film("bai", "image", "Title 2", "5/10", "2017", "Description text of this film", listOf("Comedy", "Action"), listOf("Danila", "Maria", "Svyatoslav")),
        Film("bai", "image", "Title 3", "5/10", "2017", "Description text of this film", listOf("Comedy", "Action"), listOf("Danila", "Maria", "Svyatoslav")),
        Film("bai", "image", "Title 4", "5/10", "2017", "Description text of this film", listOf("Comedy", "Action"), listOf("Danila", "Maria", "Svyatoslav")),
        Film("bai", "image", "Title 5", "5/10", "2017", "Description text of this film", listOf("Comedy", "Action"), listOf("Danila", "Maria", "Svyatoslav")),
        Film("bai", "image", "Title 6", "5/10", "2017", "Description text of this film", listOf("Comedy", "Action"), listOf("Danila", "Maria", "Svyatoslav")),
        Film("bai", "image", "Title 7", "5/10", "2017", "Description text of this film", listOf("Comedy", "Action"), listOf("Danila", "Maria", "Svyatoslav")),
        Film("bai", "image", "Title 8", "5/10", "2017", "Description text of this film", listOf("Comedy", "Action"), listOf("Danila", "Maria", "Svyatoslav")),
        Film("bai", "image", "Title 9", "5/10", "2017", "Description text of this film", listOf("Comedy", "Action"), listOf("Danila", "Maria", "Svyatoslav")),
    ))
}