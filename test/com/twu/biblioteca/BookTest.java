package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    @Test
    public void toCheckIfBookIsAvailable(){
        Book book1 = new Book("1","Head First Java", "sierra", "1950", "accessibility");
        assertEquals(true, book1.checkIfBookIsAvailable("1"));
    }

    @Test
    public void toCheckIfBookIsNotAvailable(){
        Book book1 = new Book("1","Head First Java", "sierra", "1950", "accessibility");
        assertEquals(false, book1.checkIfBookIsAvailable("2"));
    }

    @Test
    public void toCheckIfTheBookReturnedIsValid(){
        Book book1 = new Book("1","Head First Java", "sierra", "1950", "not accessible");
        assertEquals(true, book1.returnBook("1"));
    }

    @Test
    public void toCheckIfTheBookReturnedIsInvalid(){
        Book book1 = new Book("1","Head First Java", "sierra", "1950", "accessibility");
        assertEquals(false, book1.returnBook("1"));
    }
}
