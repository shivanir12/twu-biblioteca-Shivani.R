package com.twu.biblioteca;

public class Movie {
    private final String movieName;
    private final String year;
    private final String director;
    private final String movieRating;

    @Override
    public String toString() {
        return String.format("%-20s%-20s%-20s%-20s\n", movieName, year, director, movieRating);
    }

    public Movie(String movieName, String year, String director, String movieRating) {
        this.movieName = movieName;
        this.year = year;
        this.director = director;
        this.movieRating = movieRating;
    }

    public boolean hasTitle(String movieName){
        return this.movieName.equalsIgnoreCase(movieName);
    }

    public String getMovieName() {
        return movieName;
    }
}
