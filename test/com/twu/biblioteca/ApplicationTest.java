package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class ApplicationTest {
    @Test
    public void showTheWelcomeMessage() {
        View view = mock(View.class);
        Application application = new Application(view);

        application.showWelcomeMessage();

        verify(view).show("WELCOME TO BIBLIOTECA");
    }

    @Test
    public void showListOfBooks() {
        View view = mock(View.class);
        Application application = new Application(view);

        HashMap<String, String> book1 = new HashMap<>();
        book1.put("Name Of Book", "Head First Java");
        book1.put("Author", "Sierra");
        book1.put("Year Published", "1950");

        HashMap<String, String> book2 = new HashMap<>();
        book2.put("Name Of Book", "WWW");
        book2.put("Author", "Robert");
        book2.put("Year Published", "1947");

        ArrayList<HashMap<String, String>> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);


        application.displayList(bookList);

        verify(view).show("Head First Java\tSierra\t1950");
        verify(view).show("WWW\tRobert\t1947");
    }

}