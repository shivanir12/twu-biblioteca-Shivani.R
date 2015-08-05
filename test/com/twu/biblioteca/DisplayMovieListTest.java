package com.twu.biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class DisplayMovieListTest {

    @Test
    public void returnsTheListOfMovies() {
        Library library = mock(Library.class);
        InputOutput inputOutput = mock(InputOutput.class);
        DisplayMovieList displayMovieList = new DisplayMovieList(library,inputOutput);

        when(library.getMovieListFromLibrary()).thenReturn("manam   1960   anup   9\n");

        displayMovieList.show();
        verify(inputOutput).show("manam   1960   anup   9\n");
    }
}
