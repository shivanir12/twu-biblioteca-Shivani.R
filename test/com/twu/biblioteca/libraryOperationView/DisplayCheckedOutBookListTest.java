package com.twu.biblioteca.libraryOperationView;

import com.twu.biblioteca.io.InputOutput;
import com.twu.biblioteca.model.Library;
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
