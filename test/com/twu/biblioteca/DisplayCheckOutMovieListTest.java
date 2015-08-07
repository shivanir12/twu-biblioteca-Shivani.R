package com.twu.biblioteca;


import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class DisplayCheckOutMovieListTest {
    @Test
    public void returnsTheListOfCheckedOutMovies() {
        Library library = mock(Library.class);
        InputOutput inputOutput = mock(InputOutput.class);
        User user = mock(User.class);
        DisplayCheckedOutMovieList displayCheckedOutMovieList = new DisplayCheckedOutMovieList(library,inputOutput);

        when(library.getCheckOutMovieListFromLibrary()).thenReturn("manam   1960   anup   9\n");

        displayCheckedOutMovieList.show();
        verify(inputOutput).show("manam   1960   anup   9\n");
    }

}
