package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ParserTest {
    @Test
    public void createsCheckOutObjectIfTheInputIsTwo(){
        ArrayList<Book> bookList = new ArrayList<>();
        ArrayList<Book> checkoutBookList = new ArrayList<>();
        Library library = new Library(bookList, checkoutBookList);
        Parser parser = new Parser(bookList, library);
        CheckOut checkOut = new CheckOut();
        assertEquals(checkOut.getClass(), parser.parse("2").getClass());
    }
}
