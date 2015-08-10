package com.twu.biblioteca.LibraryOperationView;

import com.twu.biblioteca.io.InputOutput;
import org.junit.Test;

import static org.mockito.Mockito.*;


public class CheckOutMovieViewTest {
    @Test
    public void displaysAThankYouMessageIfTheMovieIsCheckedOutFromAvailableMovieList() {
        InputOutput inputOutput = mock(InputOutput.class);
        CheckOutMovieView checkOutMovieView = new CheckOutMovieView(true, inputOutput);

        checkOutMovieView.display();

        verify(inputOutput).show("Thank you!! Enjoy the movie");
    }

    @Test
    public void displaysInvalidMessageIfTheMovieIsNotCheckedOutFromAvailableMovieList() {
        InputOutput inputOutput = mock(InputOutput.class);
        CheckOutMovieView checkOutMovieView = new CheckOutMovieView(false, inputOutput);

        checkOutMovieView.display();

        verify(inputOutput).show("That movie is not available");
    }
}
