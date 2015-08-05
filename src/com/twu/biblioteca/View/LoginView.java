package com.twu.biblioteca.View;

import com.twu.biblioteca.Controller;
import com.twu.biblioteca.User;

import java.util.ArrayList;

public class LoginView {
    public String userName;
    public String password;

    private void getLoginDetail(InputOutput inputOutput){
        inputOutput.show("Enter the User Name");
        userName =  inputOutput.getStringInput();
        inputOutput.show("Enter the Password");
        password = inputOutput.getStringInput();

    }
    public void validateUserLoginDetails(InputOutput inputOutput, ArrayList<User> users, Controller controller) {
        getLoginDetail(inputOutput);
        for (User user : users) {
            if (user.checkValidity(userName,password))
                controller.dispatch();
        }
        inputOutput.show("invalid userName/password");
    }
}
