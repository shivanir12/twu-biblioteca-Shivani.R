package com.twu.biblioteca.LibraryOperation;

import com.twu.biblioteca.Model.Library;
import com.twu.biblioteca.Model.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class CheckInMovieTest {
    @Test
    public void returnsTrueIfTheMovieIsAvailableInTheCheckedOutMovieList() {
        Library library = mock(Library.class);
        User user = mock(User.class);
        CheckInMovie checkInMovie = new CheckInMovie(library, user);

        when(library.checkInMovie("manam", user)).thenReturn(true);

        assertEquals(true, checkInMovie.execute("manam"));
    }

    @Test
    public void returnsFalseIfTheMovieIsNotAvailableInTheCheckedOutMovieList() {
        Library library = mock(Library.class);
        User user = mock(User.class);
        CheckInMovie checkInMovie = new CheckInMovie(library, user);

        when(library.checkInMovie("manam", user)).thenReturn(false);

        assertEquals(false, checkInMovie.execute("manam"));
    }

    public static class CheckOutBookTest {
        @Test
        public void returnsTrueIfTheBookIsAvailableInTheAvailableBookList() {
            Library library = mock(Library.class);
            User user = mock(User.class);
            CheckOutBook checkOutBook = new CheckOutBook(library, user);

            when(library.checkoutBook("www", user)).thenReturn(true);

            assertEquals(true, checkOutBook.execute("www"));
        }

        @Test
        public void returnsFalseIfTheBookIsNotAvailableInTheAvailableBookList() {
            Library library = mock(Library.class);
            User user = mock(User.class);
            CheckOutBook checkOutBook = new CheckOutBook(library, user);

            when(library.checkoutBook("www", user)).thenReturn(false);

            assertEquals(false, checkOutBook.execute("ds"));
        }
    }
}
