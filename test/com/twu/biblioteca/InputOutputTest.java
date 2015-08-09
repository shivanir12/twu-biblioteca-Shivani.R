package com.twu.biblioteca;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;


public class InputOutputTest {
    private final ByteArrayOutputStream outputContent = new ByteArrayOutputStream();
    private PrintStream original;

    @Test
    public void showMessage() {
        original = System.out;
        System.setOut(new PrintStream(outputContent));
        InputOutput view = new InputOutput();
        String message = "Welcome";
        view.show(message);
        assertEquals("Welcome\n", outputContent.toString());
        System.setOut(original);
    }

    @Test
    public void toGetTheIntegerInput() {
        System.setIn(new ByteArrayInputStream("1".getBytes()));
        InputOutput view = new InputOutput();
        assertEquals(1, view.getIntegerInput());
        System.setIn(System.in);
    }

    @Test
    public void toGetTheStringInput() {
        System.setIn(new ByteArrayInputStream("java".getBytes()));
        InputOutput view = new InputOutput();
        assertEquals("java", view.getStringInput());
        System.setIn(System.in);
    }

    @Test
    public void toDisplayListOfBooks() {
        original = System.out;
        System.setOut(new PrintStream(outputContent));
        InputOutput view = new InputOutput();
        String list = "Head First Java     sierra              1950\n" +
                "WWW                 robert              1950\n" +
                "DS                  sahani              1956\n";
        view.displayBookList(list);
        assertEquals("\n\nName Of Book        Author              Year Published      \n" +
                "=========================================================================================\n" + list + "\n", outputContent.toString());
        System.setOut(original);
    }

    @Test
    public void toDisplayListOfMovies() {
        original = System.out;
        System.setOut(new PrintStream(outputContent));
        InputOutput view = new InputOutput();
        String list = String.format("%-20s%-20s%-20s%-20s\n", "krish", "2014", "rakesh roshan", "7");
        view.displayMovieList(list);
        String expectedResult = String.format("\n\n%-20s%-20s%-20s%-20s\n",
                "Name Of Movie", "Year", "Director", "Rating");
        assertEquals(expectedResult + "=========================================================================================\n" +
                list + "\n", outputContent.toString());
        System.setOut(original);
    }
}


