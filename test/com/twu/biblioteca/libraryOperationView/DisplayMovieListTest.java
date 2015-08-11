package com.twu.biblioteca.libraryOperationView;

import com.twu.biblioteca.io.InputOutput;
import com.twu.biblioteca.model.Library;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


public class DisplayMovieListTest {
    @Test
    public void displaysTheListOfAvailableMovies() {
        Library library = mock(Library.class);
        InputOutput inputOutput = mock(InputOutput.class);
        DisplayMovieList displayMovieList = new DisplayMovieList(library, inputOutput);

        when(library.getMovieListFromLibrary()).thenReturn("manam   1960   anup   9\n");

        displayMovieList.display();
        verify(inputOutput).show("manam   1960   anup   9\n");
    }
}
