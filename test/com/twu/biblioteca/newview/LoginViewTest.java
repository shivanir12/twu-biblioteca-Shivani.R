package com.twu.biblioteca.newview;

import com.twu.biblioteca.Controller.Controller;
import com.twu.biblioteca.User;
import com.twu.biblioteca.InputOutput;
import com.twu.biblioteca.view.LoginView;
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

        verify(controller, atLeast(1)).dispatcher(user1);

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
