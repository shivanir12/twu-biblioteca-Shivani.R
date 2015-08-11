package com.twu.biblioteca.libraryOperationView;

import com.twu.biblioteca.io.InputOutput;
import com.twu.biblioteca.libraryOperation.CheckOutBook;
import com.twu.biblioteca.libraryOperation.LibraryOperation;
import org.junit.Test;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;


public class ReturnMovieViewTest {
    @Test
    public void displaysThankYouMessageIfTheReturnedMovieIsValid() {
        InputOutput inputOutput = mock(InputOutput.class);
        LibraryOperation libraryOperation = mock(CheckOutBook.class);
        ReturnMovieView returnMovieView = new ReturnMovieView(true, inputOutput);

        when(libraryOperation.execute(anyString())).thenReturn(true);

        returnMovieView.display();
        verify(inputOutput).show("Thank you for returning the movie");
    }

    @Test
    public void displaysInvalidMessageIfTheReturnedMovieIsNotValid() {
        InputOutput inputOutput = mock(InputOutput.class);
        LibraryOperation libraryOperation = mock(CheckOutBook.class);
        ReturnBookView returnBookView = new ReturnBookView(false, inputOutput);

        when(libraryOperation.execute(anyString())).thenReturn(false);

        returnBookView.display();
        verify(inputOutput).show("That is not a valid book to return");
    }
}
