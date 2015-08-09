package com.twu.biblioteca.LibraryOperationView;

import com.twu.biblioteca.Model.Library;
import com.twu.biblioteca.Model.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class CheckInTest {
    @Test
    public void returnsTrueIfTheBookIsAvailableInTheCheckedOutBookList() {
        Library library = mock(Library.class);
        User user = mock(User.class);
        CheckIn checkIn = new CheckIn(library, user);

        when(library.checkInBook("www", user)).thenReturn(true);

        assertEquals(true, checkIn.execute("www"));
    }
    @Test
    public void returnsFalseIfTheBookIsNotAvailableInTheCheckedOutBookList() {
        Library library = mock(Library.class);
        User user = mock(User.class);
        CheckIn checkIn = new CheckIn(library, user);

        when(library.checkInBook("www", user)).thenReturn(false);

        assertEquals(false, checkIn.execute("www"));
    }
}
