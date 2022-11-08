package com.movie.movieapi;


import java.util.ArrayList;
import java.util.List;

public class Movies {

    private List<Movie> movieList;

    // Constructor with no parameters
    public Movies() {
        // Check if the movie list is null before returning
        if (movieList == null) {
            movieList = new ArrayList<>();
        }
    }

    // Get the movie list
    public List<Movie> getMovieList() { return this.movieList; }

    // Set the movie list
    public void setMovieList(List<Movie> movieList) {
        this.movieList = movieList;
    }

    // Add a movie to the list
    public void addMovie(Movie newMovie) {
        this.movieList.add(newMovie);
    }

    // Remove a movie from the list
    public void removeMovie(Movie oldMovie) {
        this.movieList.remove(oldMovie);
    }

}
