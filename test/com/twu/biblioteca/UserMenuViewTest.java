package com.twu.biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class UserMenuViewTest {
    @Test
    public void displayTheMainMenuForUser(){
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
        userMenuView.showCustomerMenu();
        verify(inputOutput).show(menu);
    }

    @Test
    public void displayTheMainMenuForLibrarian(){
        InputOutput inputOutput = mock(InputOutput.class);
        String menu = "" + "--*Main Menu*--\n" +
                "================================\n"+
                "Enter 1 to Display list of books\n" +
                "Enter 2 to Checkout book\n" +
                "Enter 3 to Return book\n" +
                "Enter 4 to Display list of movies\n" +
                "Enter 5 to Checkout movies\n" +
                "Enter 6 to Return movies\n" +
                "Enter 7 to Log out\n" +
                "Enter 8 to View my profile\n" +
                "Enter 9 to Display Checked out books\n" +
                "Enter 10 to Display Checked out movies\n";
        UserMenuView userMenuView = new UserMenuView(inputOutput);
        userMenuView.showLibrarianMenu();
        verify(inputOutput).show(menu);
    }
}
