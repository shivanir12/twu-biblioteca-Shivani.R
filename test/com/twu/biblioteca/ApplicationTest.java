package com.twu.biblioteca;

import org.junit.Test;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


public class ApplicationTest {
    @Test
    public void testName(){
        View view = mock(View.class);
        Application application = new Application(view);

        application.showWelcomeMessage();

        verify(view).show("WELCOME TO BIBLIOTECA");
    }
}