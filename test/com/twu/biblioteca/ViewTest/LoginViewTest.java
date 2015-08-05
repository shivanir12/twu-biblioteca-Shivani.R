package com.twu.biblioteca.ViewTest;

import com.twu.biblioteca.Controller;
import com.twu.biblioteca.Library;
import com.twu.biblioteca.User;
import com.twu.biblioteca.View.InputOutput;
import com.twu.biblioteca.View.LibrarianMenuView;
import com.twu.biblioteca.View.LoginView;
import com.twu.biblioteca.View.UserMenuView;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;


public class LoginViewTest {

    @Test
    public void createsUserMenuInstanceIfUserCredentialsAreValid(){

        LoginView loginView = new LoginView();
        InputOutput inputOutput = mock(InputOutput.class);


        User user1 = mock(User.class);
        ArrayList<User> users = new ArrayList<>();
        users.add(user1);

        when(user1.checkValidity(anyString(),anyString())).thenReturn(true);
        Controller controller = mock(Controller.class);

        loginView.validateUserLoginDetails(inputOutput, users, controller);

        verify(controller).dispatch();

    }
    @Test
    public void displaysAMessageIfUserCredentialsAreINValid(){

        LoginView loginView = new LoginView();
        InputOutput inputOutput = mock(InputOutput.class);
        User user1 = mock(User.class);
        ArrayList<User> users = new ArrayList<>();
        users.add(user1);

        when(user1.checkValidity(anyString(),anyString())).thenReturn(false);

        users.add(user1);

        Controller controller = mock(Controller.class);

        loginView.validateUserLoginDetails(inputOutput, users, controller);
        verify(inputOutput).show("invalid userName/password");
    }
}
