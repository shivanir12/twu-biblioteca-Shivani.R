package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ParserTest {
    @Test
    public void createsDisplayListObjectIfTheInputIsOne(){
        ArrayList<Book> bookList = new ArrayList<>();
        ArrayList<Book> checkoutBookList = new ArrayList<>();
        Library library = new Library(bookList, checkoutBookList);
        Parser parser = new Parser(bookList, library);
        DisplayList displayList = new DisplayList();
        assertEquals(displayList.getClass(), parser.parse("1").getClass());
    }

    @Test
    public void createsCheckOutObjectIfTheInputIsTwo(){
        ArrayList<Book> bookList = new ArrayList<>();
        ArrayList<Book> checkoutBookList = new ArrayList<>();
        Library library = new Library(bookList, checkoutBookList);
        Parser parser = new Parser(bookList, library);
        CheckOut checkOut = new CheckOut();
        assertEquals(checkOut.getClass(), parser.parse("2").getClass());
    }

    @Test
    public void createsCheckInObjectIfTheInputIsThree(){
        ArrayList<Book> bookList = new ArrayList<>();
        ArrayList<Book> checkoutBookList = new ArrayList<>();
        Library library = new Library(bookList, checkoutBookList);
        Parser parser = new Parser(bookList, library);
        CheckIn checkIn = new CheckIn();
        assertEquals(checkIn.getClass(), parser.parse("3").getClass());
    }
}
