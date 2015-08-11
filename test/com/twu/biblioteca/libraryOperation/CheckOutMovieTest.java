package com.twu.biblioteca.libraryOperation;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.model.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class CheckOutMovieTest {
    @Test
    public void returnsTrueIfTheMovieIsAvailableInTheAvailableMovieList() {
        Library library = mock(Library.class);
        User user = mock(User.class);
        CheckOutMovie checkOutMovie = new CheckOutMovie(library, user);

        when(library.checkoutMovie("manam", user)).thenReturn(true);

        assertEquals(true, checkOutMovie.execute("manam"));
    }

    @Test
    public void returnsFalseIfTheMovieIsNotAvailableInTheAvailableMovieList() {
        Library library = mock(Library.class);
        User user = mock(User.class);
        CheckOutMovie checkOutMovie = new CheckOutMovie(library, user);

        when(library.checkoutMovie("manam", user)).thenReturn(false);

        assertEquals(false, checkOutMovie.execute("manam"));
    }
}
