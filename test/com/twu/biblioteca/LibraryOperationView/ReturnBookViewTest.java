package com.twu.biblioteca.LibraryOperationView;

import com.twu.biblioteca.InputOutput;
import org.junit.Test;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class ReturnBookViewTest {
    @Test
    public void callsTheCheckOutOperationAndDisplaysThankYouMessage() {

        InputOutput inputOutput = mock(InputOutput.class);
        LibraryOperation libraryOperation = mock(CheckOut.class);

        ReturnBookView returnBookView = new ReturnBookView(libraryOperation, inputOutput);

        when(libraryOperation.execute(anyString())).thenReturn(true);

        returnBookView.show();

        verify(inputOutput, atLeast(1)).show("Thank you for returning the book");
    }

    @Test
    public void callsTheCheckOutOperationAndDisplays() {

        InputOutput inputOutput = mock(InputOutput.class);
        LibraryOperation libraryOperation = mock(CheckOut.class);

        ReturnBookView returnBookView = new ReturnBookView(libraryOperation, inputOutput);
        when(libraryOperation.execute(anyString())).thenReturn(false);

        returnBookView.show();
        verify(inputOutput).show("That is not a valid book to return");
    }

}
