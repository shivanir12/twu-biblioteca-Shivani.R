package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DisplayCheckedOutBookListTest {
    @Test
    public void returnsTheListOfCheckedOutBookList() {
        ArrayList<Book> bookList = new ArrayList<>();
        ArrayList<Book> checkoutBookList = new ArrayList<>();
        ArrayList<Movie> movieList = new ArrayList<>();
        ArrayList<Movie> checkOutMovieList = new ArrayList<>();
        Library library = new Library(bookList, checkoutBookList, movieList, checkOutMovieList);
        Book book1 = new Book("Head First Java", "sierra", "1950");
        checkoutBookList.add(book1);
        DisplayCheckedOutBookList displayCheckedOutBookList = new DisplayCheckedOutBookList();
        String list = displayCheckedOutBookList.display(library);
        assertEquals(list, "Head First Java     sierra              1950\n");
    }
}
