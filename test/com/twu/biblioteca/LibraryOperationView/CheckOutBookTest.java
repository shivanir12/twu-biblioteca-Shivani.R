package com.twu.biblioteca.LibraryOperationView;

import com.twu.biblioteca.Model.Library;
import com.twu.biblioteca.Model.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;


public class CheckOutBookTest {
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
