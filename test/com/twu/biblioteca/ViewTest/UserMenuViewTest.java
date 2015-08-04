package com.twu.biblioteca.ViewTest;

import com.twu.biblioteca.View.InputOutput;
import com.twu.biblioteca.View.UserMenuView;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class UserMenuViewTest {
    @Test
    public void diaplayTheMainMenu(){
        InputOutput inputOutput = mock(InputOutput.class);
        String menu =""+"--*Main Menu*--\n" +
                "================================\n"+
                "Enter 1 to display list of books\n" +
                "Enter 2 to checkout book\n" +
                "Enter 3 to return book\n" +
                "Enter 4 to quit\n" +
                "Enter 5 to display list of movies\n" +
                "Enter 6 to to checkout movies\n" +
                "Enter 7 to to return movies\n" +
                "Enter 8 to display Checked out movie list\n" +
                "Enter 9 to display checked out book list\n";
        UserMenuView userMenuView = new UserMenuView();
        userMenuView.showUserMenu(inputOutput);
        verify(inputOutput).show(menu);
    }
}
