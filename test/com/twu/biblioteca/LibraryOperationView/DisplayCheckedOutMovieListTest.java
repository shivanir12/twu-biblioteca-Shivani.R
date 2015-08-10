package com.twu.biblioteca.LibraryOperationView;

import com.twu.biblioteca.io.InputOutput;
import com.twu.biblioteca.Model.Library;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


public class DisplayCheckedOutMovieListTest {
    @Test
    public void displaysTheListOfCheckedOutMovies() {
        Library library = mock(Library.class);
        InputOutput inputOutput = mock(InputOutput.class);
        DisplayCheckedOutMovieList displayCheckedOutMovieList = new DisplayCheckedOutMovieList(library, inputOutput);

        when(library.getCheckOutMovieListFromLibrary()).thenReturn("manam   1960   anup   9\n");

        displayCheckedOutMovieList.display();
        verify(inputOutput).show("manam   1960   anup   9\n");
    }
}
