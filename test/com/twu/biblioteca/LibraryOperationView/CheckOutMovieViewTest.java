package com.twu.biblioteca.LibraryOperationView;

import com.twu.biblioteca.InputOutput;
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

        verify(inputOutput, atLeast(1)).show("Thank you!! Enjoy the movie");
    }

    @Test
    public void callsTheCheckOutOperationAndDisplaysInvalidMessageIfBookIsNotAvailable() {

        InputOutput inputOutput = mock(InputOutput.class);
        LibraryOperation libraryOperation = mock(CheckOut.class);
        CheckOutMovieView checkOutMovieView = new CheckOutMovieView(libraryOperation, inputOutput);

        when(libraryOperation.execute(anyString())).thenReturn(false);

        checkOutMovieView.show();
        verify(inputOutput).show("That movie is not available");
    }
}
