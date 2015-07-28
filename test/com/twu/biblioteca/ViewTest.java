package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

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
    public void displayTheWelcomeMessage(){

        View view = new View();
        view.show("WELCOME TO BIBLIOTECA");
        assertEquals("WELCOME TO BIBLIOTECA", outputContent.toString());
    }
}


