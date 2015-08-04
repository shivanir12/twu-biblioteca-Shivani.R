package com.twu.biblioteca.ViewTest;

import com.twu.biblioteca.User;
import com.twu.biblioteca.View.InputOutput;
import com.twu.biblioteca.View.LibrarianMenuView;
import com.twu.biblioteca.View.LoginView;
import com.twu.biblioteca.View.UserMenuView;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


public class LoginViewTest {
    private final ByteArrayOutputStream outputContent = new ByteArrayOutputStream();

    @Test
    public void createsUserMenuInstanceIfUserCredentialsAreValid(){

        LoginView loginView = new LoginView();
        UserMenuView userMenuView = mock(UserMenuView.class);
        LibrarianMenuView librarianMenuView = mock(LibrarianMenuView.class);
        User user = mock(User.class);
        InputOutput inputOutput = mock(InputOutput.class);
        when(user.checkValidity(anyString())).thenReturn(true);

        loginView.validateUserLoginDetails(inputOutput, user, userMenuView, librarianMenuView);

        verify(user).checkValidity(loginView.userName +" " +loginView.password);
        verify(userMenuView).showUserMenu();
    }
    @Test
    public void displaysAMessageIfUserCredentialsAreINValid(){

        LoginView loginView = new LoginView();
        UserMenuView userMenuView = mock(UserMenuView.class);
        LibrarianMenuView librarianMenuView = mock(LibrarianMenuView.class);
        User user = mock(User.class);
        InputOutput inputOutput = mock(InputOutput.class);
        when(user.checkValidity(anyString())).thenReturn(false);

        loginView.validateUserLoginDetails(inputOutput, user, userMenuView, librarianMenuView);

        verify(user).checkValidity(loginView.userName + " " + loginView.password);
        verify(inputOutput).show("Enter valid userName/password");
    }
}
