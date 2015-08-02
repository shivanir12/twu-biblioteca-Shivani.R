package com.twu.biblioteca;

import java.util.ArrayList;

public class Parser {

    private final ArrayList<Book> bookList;
    private Library library;

    public Parser(ArrayList<Book> bookList,Library library){

        this.bookList = bookList;
        this.library = library;
    }

    public LibraryOperation parse(String input) {
        if(input.equals("2"))
            return new CheckOut();
        else if(input.equals("3"))
            return new CheckIn();
        return null;
    }
}
