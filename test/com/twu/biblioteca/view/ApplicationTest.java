package com.twu.biblioteca.view;

import com.twu.biblioteca.io.InputOutput;
import com.twu.biblioteca.view.Application;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class ApplicationTest {
    @Test
    public void showTheWelcomeMessage() {
        InputOutput view = mock(InputOutput.class);
        Application application = new Application(view);
        application.showWelcomeMessage();
        verify(view).show("WELCOME TO BIBLIOTECA");
    }
}
