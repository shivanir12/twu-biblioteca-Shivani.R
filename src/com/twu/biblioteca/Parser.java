package com.twu.biblioteca;

import java.util.ArrayList;

public class Parser {

    private final ArrayList<Book> bookList;
    private Library library;

    public Parser(ArrayList<Book> bookList,Library library){

        this.bookList = bookList;
        this.library = library;
    }

    public LibraryOperation parse(int input) {
        if(input == 2)
            return new CheckOut(library);
        return  null;
    }

}
