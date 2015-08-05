package com.twu.biblioteca;

import com.twu.biblioteca.View.InputOutput;
import com.twu.biblioteca.View.UserMenuView;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class DisplayListTest {
    @Test
    public void returnsTheListOfBooks() {
        Library library = mock(Library.class);
        InputOutput inputOutput = mock(InputOutput.class);
        UserMenuView userMenuView = mock(UserMenuView.class);
        DisplayList displayList = new DisplayList(library,inputOutput,userMenuView);

        when(library.getBookListFromLibrary()).thenReturn("Head First Java     sierra              1950\n");

        displayList.show();
        verify(inputOutput).show("Head First Java     sierra              1950\n");
        verify(userMenuView).showUserMenu();
    }
}
