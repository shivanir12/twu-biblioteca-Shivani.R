package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ParserTest {
    @Test
    public void createsLibraryObjectIfTheInputIsOne(){
        InputOutput view = new InputOutput();
        ArrayList<Book> bookList = new ArrayList<>();
        Library library = new Library(view, bookList);
        Parser parser = new Parser(view, bookList);
        assertEquals(library.getClass(), parser.parse("1").getClass());
    }

}
