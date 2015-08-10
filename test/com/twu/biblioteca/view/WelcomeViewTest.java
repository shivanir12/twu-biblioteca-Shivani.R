package com.twu.biblioteca.view;

import com.twu.biblioteca.io.InputOutput;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class WelcomeViewTest {
    @Test
    public void showTheWelcomeMessage() {
        InputOutput view = mock(InputOutput.class);
        WelcomeView welcomeView = new WelcomeView(view);
        welcomeView.showWelcomeMessage();
        verify(view).show("WELCOME TO BIBLIOTECA");
    }
}
