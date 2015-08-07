package com.twu.biblioteca;


import com.twu.biblioteca.LibraryOperationView.DisplayCheckedOutBookList;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class DisplayCheckedOutBookListTest {
    @Test
    public void returnsTheListOfCheckedOutBooks() {
        Library library = mock(Library.class);
        InputOutput inputOutput = mock(InputOutput.class);
        User user = mock(User.class);
        DisplayCheckedOutBookList displayCheckedOutBookList = new DisplayCheckedOutBookList(library,inputOutput);

        when(library.getCheckOutBookListFromLibrary()).thenReturn("Head First Java     sierra              1950\n");

        displayCheckedOutBookList.show();
        verify(inputOutput).show("Head First Java     sierra              1950\n");
    }
}
