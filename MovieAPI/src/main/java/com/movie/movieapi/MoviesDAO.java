package com.movie.movieapi;

import org.springframework.stereotype.Repository;

@Repository
public class MoviesDAO {

    private static Movies list = new Movies();

    // Static block is run once before the class is loaded into memory
    static
    {
        list.addMovie(new Movie(
                "Godzilla",
                "Action",
                1998
        ));

        list.addMovie(new Movie(
                "Benchwarmers",
                "Comedy",
                1980
        ));

        list.addMovie(new Movie(
                "Notebook",
                "Romance",
                1963
        ));
    }

    // Get all the movies
    public Movies getAllMovies() {
        return this.list;
    }

    // Add a movie to the list
    public void addMovie(Movie newMovie) {
        this.list.addMovie(newMovie);
    }


}
