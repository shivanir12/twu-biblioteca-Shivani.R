package com.twu.biblioteca.newview;

import com.twu.biblioteca.*;
import com.twu.biblioteca.view.CheckOutBookView;
import com.twu.biblioteca.InputOutput;
import com.twu.biblioteca.view.UserMenuView;
import org.junit.Test;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class CheckOutBookViewTest {
    @Test
    public void callsTheCheckOutOperationAndDisplaysThankYouMessage() {

        Library library = mock(Library.class);
        InputOutput inputOutput = mock(InputOutput.class);
        UserMenuView userMenuView = mock(UserMenuView.class);
        LibraryOperation libraryOperation = mock(CheckOut.class);

        CheckOutBookView checkOutBookView = new CheckOutBookView(libraryOperation, inputOutput);

        when(libraryOperation.execute(anyString())).thenReturn(true);

        checkOutBookView.show();

        verify(inputOutput, atLeast(1)).show("Thank you!! Enjoy the book");
    }

    @Test
    public void callsTheCheckOutOperationAndDisplaysInvalidMessageIfBookIsNotAvailable() {

        Library library = mock(Library.class);
        InputOutput inputOutput = mock(InputOutput.class);
        UserMenuView userMenuView = mock(UserMenuView.class);
        LibraryOperation libraryOperation = mock(CheckOut.class);

        CheckOutBookView checkOutBookView = new CheckOutBookView(libraryOperation, inputOutput);

        when(libraryOperation.execute(anyString())).thenReturn(false);

        checkOutBookView.show();
        verify(inputOutput).show("That Book is not available");
    }
}

