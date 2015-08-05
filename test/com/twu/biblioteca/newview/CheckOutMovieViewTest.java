package com.twu.biblioteca.newview;

import com.twu.biblioteca.CheckOut;
import com.twu.biblioteca.InputOutput;
import com.twu.biblioteca.LibraryOperation;
import com.twu.biblioteca.view.CheckOutBookView;
import com.twu.biblioteca.view.CheckOutMovieView;
import org.junit.Test;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class CheckOutMovieViewTest {
    @Test
    public void callsTheCheckOutOperationAndDisplaysThankYouMessage() {

        InputOutput inputOutput = mock(InputOutput.class);
        LibraryOperation libraryOperation = mock(CheckOut.class);

        CheckOutMovieView checkOutMovieView = new CheckOutMovieView(libraryOperation, inputOutput);

        when(libraryOperation.execute(anyString())).thenReturn(true);

        checkOutMovieView.show();

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
