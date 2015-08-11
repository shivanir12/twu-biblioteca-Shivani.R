package com.twu.biblioteca.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MovieTest {
    @Test
    public void toCheckIfMovieIsAvailable() {
        Movie movie = new Movie("manam", "2014", "anup", "8");
        assertEquals(true, movie.hasTitle("manam"));
    }

    @Test
    public void toCheckIfMovieIsNotAvailable() {
        Movie movie = new Movie("manam", "2014", "anup", "8");
        assertEquals(false, movie.hasTitle("abcd2"));
    }
}
