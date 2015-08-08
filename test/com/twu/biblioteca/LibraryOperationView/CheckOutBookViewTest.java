package com.twu.biblioteca.LibraryOperationView;

import com.twu.biblioteca.InputOutput;
import org.junit.Test;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class CheckOutBookViewTest {
    @Test
    public void callsTheCheckOutOperationAndDisplaysThankYouMessage() {

        InputOutput inputOutput = mock(InputOutput.class);
        LibraryOperation libraryOperation = mock(CheckOut.class);

        CheckOutBookView checkOutBookView = new CheckOutBookView(libraryOperation, inputOutput);

        when(libraryOperation.execute(anyString())).thenReturn(true);

        checkOutBookView.show();

        verify(inputOutput, atLeast(1)).show("Thank you!! Enjoy the book");
    }

    @Test
    public void callsTheCheckOutOperationAndDisplaysInvalidMessageIfBookIsNotAvailable() {

        InputOutput inputOutput = mock(InputOutput.class);
        LibraryOperation libraryOperation = mock(CheckOut.class);

        CheckOutBookView checkOutBookView = new CheckOutBookView(libraryOperation, inputOutput);

        when(libraryOperation.execute(anyString())).thenReturn(false);

        checkOutBookView.show();
        verify(inputOutput).show("That Book is not available");
    }
}

