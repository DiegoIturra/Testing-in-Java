package com.example.JavaTesting.util.movies.service;

import com.example.JavaTesting.util.movies.data.MovieRepository;
import com.example.JavaTesting.util.movies.model.Genre;
import com.example.JavaTesting.util.movies.model.Movie;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class MovieServiceTest {

    private MovieService service;

    @Before
    public void setup(){
        MovieRepository repository = Mockito.mock(MovieRepository.class);

        Mockito.when(repository.findAll()).thenReturn(
                Arrays.asList(
                        new Movie(1,"Super Cool",120,Genre.COMEDY),
                        new Movie(2,"Mean girls",200,Genre.COMEDY),
                        new Movie(3,"Citizen Kane",123,Genre.DRAMA),
                        new Movie(4,"Casablanca",100,Genre.DRAMA),
                        new Movie(5,"Intrusion",90,Genre.THRILLER),
                        new Movie(6,"Hypnotic",150,Genre.THRILLER),
                        new Movie(7,"Avengers",130,Genre.ACTION),
                        new Movie(8,"Spiderman", 140, Genre.ACTION),
                        new Movie(9,"Scream",100,Genre.HORROR),
                        new Movie(10,"Chucky",135,Genre.HORROR)
                )
        );

        service = new MovieService(repository);
    }

    @Test
    public void return_movies_by_genre(){
        Collection<Movie> movies = service.findMoviesByGenre(Genre.COMEDY);
        List<Integer> listOfIds = movies.stream().map(Movie::getId).collect(Collectors.toList());
        List<Integer> expectedIds = Arrays.asList(1,2);
        assertEquals(expectedIds, listOfIds);
    }

    @Test
    public void return_movies_by_duration(){
        Collection<Movie> movies = service.findMoviesByDuration(100);
        List<Integer> listOfIds = movies.stream().map(Movie::getId).collect(Collectors.toList());
        List<Integer> expectedIds = Arrays.asList(4,9);
        assertEquals(listOfIds,expectedIds);
    }
}