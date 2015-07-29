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
        Library library = new Library(view);
        Application application = new Application(view, library);

        application.showWelcomeMessage();

        verify(view).show("WELCOME TO BIBLIOTECA");
    }
}
