package com.twu.biblioteca.LibraryOperationView;

import com.twu.biblioteca.InputOutput;
import com.twu.biblioteca.Model.Library;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


public class DisplayCheckedOutBookListTest {
    @Test
    public void displaysTheListOfCheckedOutBooks() {
        Library library = mock(Library.class);
        InputOutput inputOutput = mock(InputOutput.class);
        DisplayCheckedOutBookList displayCheckedOutBookList = new DisplayCheckedOutBookList(library,inputOutput);

        when(library.getCheckOutBookListFromLibrary()).thenReturn("Head First Java     sierra              1950\n");

        displayCheckedOutBookList.display();
        verify(inputOutput).show("Head First Java     sierra              1950\n");
    }
}
