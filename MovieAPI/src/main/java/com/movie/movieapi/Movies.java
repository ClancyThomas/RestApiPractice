package com.movie.movieapi;


import java.util.ArrayList;
import java.util.List;

public class Movies {

    private List<Movie> movieList;

    // Get the movie list
    public List<Movie> getMovieList() {
        // Check if the movie list is null before returning
        if (movieList == null) {
            movieList = new ArrayList<>();
        }

        return this.movieList;
    }

    public void setMovieList(List<Movie> movieList) {
        this.movieList = movieList;
    }

    public void addMovie(Movie newMovie) {
        this.movieList.add(newMovie);
    }

    public void removeMovie(Movie oldMovie) {
        this.movieList.remove(oldMovie);
    }

}
