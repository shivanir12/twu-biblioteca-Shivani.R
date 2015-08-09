package com.twu.biblioteca.Model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BookTest {
    @Test
    public void toCheckIfBookIsAvailable() {
        Book book1 = new Book("Head First Java", "sierra", "1950");
        assertEquals(true, book1.hasTitle("Head First Java"));
    }

    @Test
    public void toCheckIfBookIsNotAvailable() {
        Book book1 = new Book("Head First Java", "sierra", "1950");
        assertEquals(false, book1.hasTitle("java"));
    }
}
