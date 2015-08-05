package com.twu.biblioteca.newview;

import com.twu.biblioteca.CheckOut;
import com.twu.biblioteca.Library;
import com.twu.biblioteca.LibraryOperation;
import com.twu.biblioteca.InputOutput;
import com.twu.biblioteca.view.ReturnBookView;
import com.twu.biblioteca.view.UserMenuView;
import org.junit.Test;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class ReturnBookViewTest {
    @Test
    public void callsTheCheckOutOperationAndDisplaysThankYouMessage() {

        Library library = mock(Library.class);
        InputOutput inputOutput = mock(InputOutput.class);
        UserMenuView userMenuView = mock(UserMenuView.class);
        LibraryOperation libraryOperation = mock(CheckOut.class);

        ReturnBookView returnBookView = new ReturnBookView(libraryOperation, inputOutput);

        when(libraryOperation.execute(anyString())).thenReturn(true);

        returnBookView.show();

        verify(inputOutput, atLeast(1)).show("Thank you for returning the book");
    }

    @Test
    public void callsTheCheckOutOperationAndDisplays() {

        Library library = mock(Library.class);
        InputOutput inputOutput = mock(InputOutput.class);
        UserMenuView userMenuView = mock(UserMenuView.class);
        LibraryOperation libraryOperation = mock(CheckOut.class);

        ReturnBookView returnBookView = new ReturnBookView(libraryOperation, inputOutput);
        when(libraryOperation.execute(anyString())).thenReturn(false);

        returnBookView.show();
        verify(inputOutput).show("That is not a valid book to return");
    }

}
