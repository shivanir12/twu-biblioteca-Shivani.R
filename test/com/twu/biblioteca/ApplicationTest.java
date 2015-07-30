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
        view.show("--*Main Menu*--");
        view.show("================================");
        view.show("Enter 1 to display list of books");
        view.show("Enter 2 to checkout book");
        view.show("Enter 3 to return book");
        view.show("Enter 4 to exit");

    }

}
