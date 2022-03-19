package com.example.JavaTesting.util.movies.data;

import com.example.JavaTesting.util.movies.model.Movie;

import java.util.Collection;

public interface MovieRepository {
    Movie findById(long id);
    Collection<Movie> findAll();
    void saveOrUpdate(Movie movie);
}
