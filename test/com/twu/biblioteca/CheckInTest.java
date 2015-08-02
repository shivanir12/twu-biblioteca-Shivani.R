package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CheckInTest {
    @Test
    public void returnsTrueIfTheBookIsAvailableInTheCheckOutList() {
        Book book1 = new Book("Head First Java", "sierra", "1950");
        ArrayList<Book> bookList = new ArrayList<>();
        ArrayList<Book> checkoutBookList = new ArrayList<>();
        checkoutBookList.add(book1);
        ArrayList<Movie> checkOutMovieList = new ArrayList<>();
        ArrayList<Movie> movieList = new ArrayList<>();
        Library library = new Library(bookList, checkoutBookList, movieList, checkOutMovieList);
        CheckIn checkIn = new CheckIn();
        assertEquals(true, checkIn.execute(library, "Head First Java"));
    }

    @Test
    public void returnsFalseIfTheBookIsAvailableInTheCheckOutList() {
        Book book1 = new Book("Head First Java", "sierra", "1950");
        ArrayList<Book> bookList = new ArrayList<>();
        ArrayList<Book> checkoutBookList = new ArrayList<>();
        checkoutBookList.add(book1);
        ArrayList<Movie> checkOutMovieList = new ArrayList<>();
        ArrayList<Movie> movieList = new ArrayList<>();
        Library library = new Library(bookList, checkoutBookList, movieList, checkOutMovieList);
        CheckIn checkIn = new CheckIn();
        assertEquals(false, checkIn.execute(library, "www"));
    }
}
