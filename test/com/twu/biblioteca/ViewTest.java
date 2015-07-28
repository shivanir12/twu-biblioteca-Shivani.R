package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class ViewTest {

    private final ByteArrayOutputStream outputContent = new ByteArrayOutputStream();
    private PrintStream original;

    @Before
    public void setUp(){
        original = System.out;

        System.setOut(new PrintStream(outputContent));
    }

    @After
    public void cleanUp()
    {
        System.setOut(original);
    }

    @Test
    public void showTheWelcomeMessage(){

        View view = new View();
        view.showTheWelcomeMessage();
        assertEquals("WELCOME TO BIBLIOTECA", outputContent.toString());
    }

}


