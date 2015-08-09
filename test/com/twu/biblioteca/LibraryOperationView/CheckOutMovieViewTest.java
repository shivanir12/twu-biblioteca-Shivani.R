package com.twu.biblioteca.LibraryOperationView;

import com.twu.biblioteca.InputOutput;
import org.junit.Test;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class CheckOutMovieViewTest {
    @Test
    public void callsTheCheckOutOperationAndDisplaysThankYouMessage() {

        InputOutput inputOutput = mock(InputOutput.class);
        LibraryOperation libraryOperation = mock(CheckOutBook.class);

        CheckOutMovieView checkOutMovieView = new CheckOutMovieView(true, inputOutput);

        when(libraryOperation.execute(anyString())).thenReturn(true);

        checkOutMovieView.display();

        verify(inputOutput, atLeast(1)).show("Thank you!! Enjoy the movie");
    }

    @Test
    public void callsTheCheckOutOperationAndDisplaysInvalidMessageIfBookIsNotAvailable() {

        InputOutput inputOutput = mock(InputOutput.class);
        LibraryOperation libraryOperation = mock(CheckOutBook.class);
        CheckOutMovieView checkOutMovieView = new CheckOutMovieView(false, inputOutput);

        when(libraryOperation.execute(anyString())).thenReturn(false);

        checkOutMovieView.display();
        verify(inputOutput).show("That movie is not available");
    }
}
