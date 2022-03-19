package com.example.JavaTesting.util.movies.model;

import com.sun.tools.javah.Gen;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@AllArgsConstructor
@Data
public class Movie {
    private Integer id;
    private String name;
    private int minutes;
    private Genre genre;

    public Movie(String name , int minutes , Genre genre){
        this(null,name,minutes,genre);
    }
}
