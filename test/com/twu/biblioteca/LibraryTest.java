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
        Book book1 = new Book("1","Head First Java", "sierra", "1950", "Accessible");
        Book book2 = new Book("2","WWW", "robert", "1950", "Accessible");
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        Library library = new Library(view, bookList);

        library.displayListOf();

        verify(view).show("1                   Head First Java     sierra              1950                Accessible          ");
        verify(view).show("2                   WWW                 robert              1950                Accessible          ");
    }

}
