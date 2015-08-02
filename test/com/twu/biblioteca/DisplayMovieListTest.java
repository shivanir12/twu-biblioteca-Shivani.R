package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DisplayMovieListTest {

    @Test
    public void returnsTheListOfMovies(){
        ArrayList<Book> bookList = new ArrayList<>();
        ArrayList<Book> checkoutBookList = new ArrayList<>();
        ArrayList<Movie> movieList = new ArrayList<>();
        ArrayList<Movie> checkOutMovieList = new ArrayList<>();
        Library library = new Library(bookList, checkoutBookList, movieList, checkOutMovieList);
        Movie movie1 = new Movie("manam","1960","anup","9");
        movieList.add(movie1);
        DisplayMovieList displayMovieList = new DisplayMovieList();
        String list =displayMovieList.display(library);
        assertEquals(list,"manam               1960                anup                9\n");
    }
}
