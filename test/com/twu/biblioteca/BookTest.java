package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    @Test
    public void toCheckIfBookIsAvailable(){
        Book book1 = new Book("1","Head First Java", "sierra", "1950", "accessibility");
        //String accessibility = book1.getAccessibility();
        assertEquals(true, book1.checkIfBookIsAvailable("1"));
    }
}
