package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CheckInMovieTest {


    @Test
    public void returnsTrueIfTheMovieIsAvailableInTheCheckOutMovieList() {
        ArrayList<Book> bookList = new ArrayList<>();
        ArrayList<Book> checkoutBookList = new ArrayList<>();
        ArrayList<Movie> checkOutMovieList = new ArrayList<>();
        ArrayList<Movie> movieList = new ArrayList<>();
        Movie movie1 = new Movie("manam","1960","anup","9");
        checkOutMovieList.add(movie1);
        Library library = new Library(bookList, checkoutBookList, movieList, checkOutMovieList);
        CheckInMovie checkInMovie = new CheckInMovie();
        boolean isAvailable = checkInMovie.execute(library, "manam");
        assertEquals(true, isAvailable);
    }
    @Test
    public void returnsFalseIfTheMovieIsNotAvailable() {
        ArrayList<Book> bookList = new ArrayList<>();
        ArrayList<Book> checkoutBookList = new ArrayList<>();
        ArrayList<Movie> checkOutMovieList = new ArrayList<>();
        ArrayList<Movie> movieList = new ArrayList<>();
        Movie movie1 = new Movie("manam","1960","anup","9");
        checkOutMovieList.add(movie1);
        Library library = new Library(bookList, checkoutBookList, movieList, checkOutMovieList);
        CheckInMovie checkInMovie = new CheckInMovie();
        boolean isAvailable = checkInMovie.execute(library, "krish");
        assertEquals(false, isAvailable);
    }
}
