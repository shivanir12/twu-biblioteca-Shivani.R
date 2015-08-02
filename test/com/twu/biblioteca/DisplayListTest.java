package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DisplayListTest {
    @Test
    public void returnsTrueIfTheBookIsAvailable() {
        Book book1 = new Book("Head First Java", "sierra", "1950");
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        ArrayList<Book> checkoutBookList = new ArrayList<>();
        Library library = new Library(bookList, checkoutBookList);
        DisplayList displayList = new DisplayList();
        String list =displayList.display(library);
        assertEquals(list,"Head First Java     sierra              1950\n");
    }
}
