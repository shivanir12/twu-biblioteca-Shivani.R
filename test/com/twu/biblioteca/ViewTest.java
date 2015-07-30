package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;


public class ViewTest {

    private final ByteArrayOutputStream outputContent = new ByteArrayOutputStream();
    private PrintStream original;


    @Test
    public void showMessage() {
        original = System.out;
        System.setOut(new PrintStream(outputContent));

        View view = new View();
        String message = "Welcome";
        view.show(message);
        assertEquals("Welcome\n", outputContent.toString());

        System.setOut(original);
    }

    @Test
    public void toGetTheIntegerInput() {
        System.setIn(new ByteArrayInputStream("1".getBytes()));
        View view = new View();
        assertEquals(1, view.getIntegerInput());
        System.setIn(System.in);
    }

    @Test
    public void toGetTheStringInput() {
        System.setIn(new ByteArrayInputStream("java".getBytes()));
        View view = new View();
        assertEquals("java", view.getStringInput());
        System.setIn(System.in);
    }

}


