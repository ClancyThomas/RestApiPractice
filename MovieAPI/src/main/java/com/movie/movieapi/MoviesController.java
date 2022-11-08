package com.movie.movieapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

// Creating the REST controller
@RestController
@RequestMapping(path="/movies")
public class MoviesController {

    @Autowired
    private MoviesDAO moviesDAO;

    // Create a GET method that returns all the movies from the list
    @GetMapping(path="/",
            produces="application/json")
    public Movies getMovies() {

        return moviesDAO.getAllMovies();

    }

    // Create a POST method to add a movie to the list
    @PostMapping(path="/",
            consumes="application/json",
            produces="application/json")
    public ResponseEntity<Object> addMovie(@RequestBody Movie movie) {

        moviesDAO.addMovie(movie);

        URI location = ServletUriComponenetsBuilder
                        .fromCurrentRequest()
                        .path("/{title}")
                        .buildAndExpand(movie.getTitle())
                        .toUri();

        return ResponseEntity.created(location).build();
    }

}
