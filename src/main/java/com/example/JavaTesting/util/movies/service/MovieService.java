package com.example.JavaTesting.util.movies.service;

import com.example.JavaTesting.util.movies.data.MovieRepository;
import com.example.JavaTesting.util.movies.model.Genre;
import com.example.JavaTesting.util.movies.model.Movie;
import lombok.AllArgsConstructor;

import java.util.Collection;
import java.util.stream.Collectors;

@AllArgsConstructor
public class MovieService {

    private MovieRepository movieRepository;

    public Collection<Movie> findMoviesByGenre(Genre genre){
        return movieRepository.findAll()
                .stream()
                .filter(movie -> movie.getGenre().equals(genre))
                .collect(Collectors.toList());
    }

    public Collection<Movie> findMoviesByDuration(int duration){
        return movieRepository.findAll()
                .stream()
                .filter(movie -> movie.getMinutes() == duration)
                .collect(Collectors.toList());
    }

}
