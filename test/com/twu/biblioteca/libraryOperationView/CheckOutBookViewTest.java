package com.twu.biblioteca.libraryOperationView;

import com.twu.biblioteca.io.InputOutput;
import org.junit.Test;

import static org.mockito.Mockito.*;


public class CheckOutBookViewTest {
    @Test
    public void displaysAThankYouMessageIfTheBookIsCheckedOutFromAvailableBookList() {
        InputOutput inputOutput = mock(InputOutput.class);
        CheckOutBookView checkOutBookView = new CheckOutBookView(true, inputOutput);

        checkOutBookView.display();

        verify(inputOutput).show("Thank you!! Enjoy the book");
    }

    @Test
    public void displaysInvalidMessageIfTheBookIsNotCheckedOutFromAvailableBookList() {
        InputOutput inputOutput = mock(InputOutput.class);
        CheckOutBookView checkOutBookView = new CheckOutBookView(false, inputOutput);

        checkOutBookView.display();

        verify(inputOutput).show("That Book is not available");
    }
}

