package com.twu.biblioteca.LibraryOperationView;

import com.twu.biblioteca.InputOutput;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class CheckOutBookViewTest {
    @Test
    public void callsTheCheckOutOperationAndDisplaysThankYouMessage() {

        InputOutput inputOutput = mock(InputOutput.class);
        CheckOutBookView checkOutBookView = new CheckOutBookView(true, inputOutput);

        checkOutBookView.display();

        verify(inputOutput).show("Thank you!! Enjoy the book");
    }

    @Test
    public void callsTheCheckOutOperationAndDisplaysInvalidMessageIfBookIsNotAvailable() {

        InputOutput inputOutput = mock(InputOutput.class);
        CheckOutBookView checkOutBookView = new CheckOutBookView(false, inputOutput);

        checkOutBookView.display();

        verify(inputOutput).show("That Book is not available");
    }
}

