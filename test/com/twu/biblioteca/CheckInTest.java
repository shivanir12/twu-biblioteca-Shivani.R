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
        Library library = new Library(bookList, checkoutBookList);
        CheckIn checkIn = new CheckIn();
        boolean isAvailable = checkIn.execute(library, "Head First Java");
        assertEquals(true, isAvailable);
    }
}
