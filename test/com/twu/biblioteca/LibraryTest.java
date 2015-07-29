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
        Library library = new Library(view);

        ArrayList<HashMap<String, String>> bookList = library.loadBooksToLibrary();
        library.displayListOf(bookList);

        verify(view).show("Head First Java     Sierra              1950                ");
        verify(view).show("WWW                 Robert              1947                ");
    }
}
