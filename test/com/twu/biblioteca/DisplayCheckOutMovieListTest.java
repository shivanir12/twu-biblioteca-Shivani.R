package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DisplayCheckOutMovieListTest {
    @Test
    public void returnsTheListOfMovies() {
        ArrayList<Book> bookList = new ArrayList<>();
        ArrayList<Book> checkoutBookList = new ArrayList<>();
        ArrayList<Movie> movieList = new ArrayList<>();
        ArrayList<Movie> checkOutMovieList = new ArrayList<>();
        Library library = new Library(bookList, checkoutBookList, movieList, checkOutMovieList);
        Movie movie1 = new Movie("manam", "1960", "anup", "9");
        checkOutMovieList.add(movie1);
        DisplayCheckedOutMovieList displayCheckedOutMovieList = new DisplayCheckedOutMovieList();
        String list = displayCheckedOutMovieList.display(library);
        assertEquals(list, "manam               1960                anup                9                   \n");
    }
}
