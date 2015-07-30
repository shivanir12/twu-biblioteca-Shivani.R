package com.twu.biblioteca;

import org.junit.Test;

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
    public void showTheMainMenu() {
        View view = mock(View.class);
        Application application = new Application(view);

        application.displayMainMenu();

        verify(view).show("--*Main Menu*--");
        verify(view).show("================================");
        verify(view).show("Enter 1 to display list of books");
        verify(view).show("Enter 2 to checkout book");
        verify(view).show("Enter 3 to exit");
    }

}
