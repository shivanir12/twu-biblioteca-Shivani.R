package com.twu.biblioteca;

import java.util.ArrayList;

public class Parser {

    private final InputOutput view;
    private final ArrayList<Book> bookList;

    public Parser(InputOutput view, ArrayList<Book> bookList){

        this.view = view;
        this.bookList = bookList;
    }
    public LibraryOperation parse(String input) {
        if(input.equals("1"))
            return new Library(view, bookList);
        return  null;
    }

}
