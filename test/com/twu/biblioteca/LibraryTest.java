package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class LibraryTest {


    @Test
    public void showListOfBooks() {
        View view = mock(View.class);
        Book book = new Book();
        Library library = new Library(view, book);

        ArrayList<HashMap<String, String>> bookList = library.loadBooksToLibrary();
        library.displayListOf(bookList);

        verify(view).show("1                   Head First Java     Sierra              1950                Accessible          ");
        verify(view).show("2                   WWW                 Robert              1947                Accessible          ");
    }

}
