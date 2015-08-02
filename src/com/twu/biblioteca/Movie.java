package com.twu.biblioteca;

public class Movie {
    private final String name;
    private final String year;
    private final String director;
    private final String movieRating;

    @Override
    public String toString() {
        return String.format("%-20s%-20s%-20s%s\n",name, year, director, movieRating);
    }

    public Movie(String name, String year, String director, String movieRating) {
        this.name = name;
        this.year = year;
        this.director = director;
        this.movieRating = movieRating;
    }

}
