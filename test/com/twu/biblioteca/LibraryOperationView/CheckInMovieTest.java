package com.twu.biblioteca.LibraryOperationView;

import com.twu.biblioteca.Model.Library;
import com.twu.biblioteca.Model.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CheckInMovieTest {
    @Test
    public void returnsTrueIfTheMovieIsAvailableInTheAvailableMovieList() {
        Library library = mock(Library.class);
        User user = mock(User.class);
        CheckInMovie checkInMovie = new CheckInMovie(library, user);

        when(library.checkInMovie("manam", user)).thenReturn(true);

        assertEquals(true, checkInMovie.execute("manam"));
    }


}
