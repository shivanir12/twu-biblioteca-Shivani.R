package com.twu.biblioteca.newview;

import com.twu.biblioteca.InputOutput;
import com.twu.biblioteca.view.UserMenuView;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class UserMenuViewTest {
    @Test
    public void displayTheMainMenu(){
        InputOutput inputOutput = mock(InputOutput.class);
        String menu ="" + "--*Main Menu*--\n" +
                "================================\n" +
                "Enter 1 to Display list of books\n" +
                "Enter 2 to Checkout book\n" +
                "Enter 3 to Return book\n" +
                "Enter 4 to Display list of movies\n" +
                "Enter 5 to Checkout movies\n" +
                "Enter 6 to Return movies\n" +
                "Enter 7 to Log out\n" +
                "Enter 8 to View my profile\n";
        UserMenuView userMenuView = new UserMenuView(inputOutput);
        userMenuView.showUserMenu();
        verify(inputOutput).show(menu);
    }
}
