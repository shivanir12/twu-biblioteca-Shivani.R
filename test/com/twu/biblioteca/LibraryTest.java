package com.twu.biblioteca;

import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class LibraryTest {

    @Test
    public void toGetTheListFromLibrary() {
        Book book1 = new Book("WWW", "robert", "1950");
        ArrayList<Book> availableBookList = new ArrayList<>();
        availableBookList.add(book1);
        ArrayList<Book> checkoutBookList = new ArrayList<>();
        Library library = new Library(availableBookList, checkoutBookList);
        String expectedResult = ""+String.format("%-20s%-20s%s\n","WWW","robert","1950");
        assertEquals(expectedResult,library.getListFromLibrary());
    }

    @Test
    public void returnsTrueIfTheBookIsAvailableInTheBookList() {
        Book book1 = new Book("WWW", "robert", "1950");
        ArrayList<Book> availableBookList = new ArrayList<>();
        availableBookList.add(book1);
        ArrayList<Book> checkoutBookList = new ArrayList<>();
        Library library = new Library(availableBookList, checkoutBookList);
        assertEquals(true,library.checkoutBook("WWW"));
    }

    @Test
    public void returnsFalseIfTheBookIsAvailableInTheBookList() {
        Book book1 = new Book("WWW", "robert", "1950");
        ArrayList<Book> availableBookList = new ArrayList<>();
        availableBookList.add(book1);
        ArrayList<Book> checkoutBookList = new ArrayList<>();
        Library library = new Library(availableBookList, checkoutBookList);
        assertEquals(false,library.checkoutBook("Head First Java"));
    }
}
