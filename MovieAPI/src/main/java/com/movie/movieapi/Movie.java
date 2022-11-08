package com.movie.movieapi;

public class Movie {

    private String title;
    private String genre;
    private Integer releaseYear;

    // Constructor with no parameters
    public Movie() {}

    // Constructor with parameters for each property
    public Movie(String title, String genre, Integer releaseYear) {
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
    }

    // Getters for the properties
    public String getTitle() {
        return this.title;
    }

    public String getGenre() {
        return this.genre;
    }

    public Integer getReleaseYear() {
        return this.releaseYear;
    }

    // Setters for the properties
    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    // Override the toString for easy printing of the movie object
    @Override
    public String toString() {
        return "Movie Title: " + this.title +
                "\nGenre: " + this.genre +
                "\nRelease Year: " + this.releaseYear;
    }

}
