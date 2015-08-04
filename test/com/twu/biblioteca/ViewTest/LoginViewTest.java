package com.twu.biblioteca.ViewTest;

import com.twu.biblioteca.View.InputOutput;
import com.twu.biblioteca.View.LoginView;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class LoginViewTest {
    private final ByteArrayOutputStream outputContent = new ByteArrayOutputStream();

    @Test
    public void toGetTheUserIdAndPassword(){
        System.setOut(new PrintStream(outputContent));

        InputOutput inputOutput = mock(InputOutput.class);
        LoginView loginView = new LoginView();

        loginView.getLoginDetails(inputOutput);

        verify(inputOutput).show("Enter the user Name");
        verify(inputOutput).show("Enter the Password");

        System.setOut(System.out);

    }
}