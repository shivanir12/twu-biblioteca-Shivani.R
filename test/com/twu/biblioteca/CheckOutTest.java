package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CheckOutTest {
    @Test
    public void returnsTrueIfTheBookIsAvailable() {
        Book book1 = new Book("Head First Java", "sierra", "1950");
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        ArrayList<Book> checkoutBookList = new ArrayList<>();
        ArrayList<Movie> checkOutMovieList = new ArrayList<>();
        ArrayList<Movie> movieList = new ArrayList<>();
        Library library = new Library(bookList, checkoutBookList, movieList, checkOutMovieList);
        CheckOut checkOut = new CheckOut();
        boolean isAvailable = checkOut.execute(library, "Head First Java");
        assertEquals(true, isAvailable);
    }

    @Test
    public void returnsFalseIfTheBookIsNotAvailable() {
        Book book1 = new Book("Head First Java", "sierra", "1950");
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        ArrayList<Book> checkoutBookList = new ArrayList<>();
        ArrayList<Movie> checkOutMovieList = new ArrayList<>();
        ArrayList<Movie> movieList = new ArrayList<>();
        Library library = new Library(bookList, checkoutBookList, movieList, checkOutMovieList);
        CheckOut checkOut = new CheckOut();
        boolean isAvailable = checkOut.execute(library, "WWW");
        assertEquals(false, isAvailable);
    }
}
