package com.twu.biblioteca.View;

import com.twu.biblioteca.Controller;
import com.twu.biblioteca.User;

public class LoginView {
    public String userName;
    public String password;

    private void getLoginDetail(InputOutput inputOutput){
        inputOutput.show("Enter the User Name");
        userName =  inputOutput.getStringInput();
        inputOutput.show("Enter the Password");
        password = inputOutput.getStringInput();

    }
    public void validateUserLoginDetails(InputOutput inputOutput, User user, Controller controller) {
        getLoginDetail(inputOutput);
        if(user.checkValidity("#12-1000","shivani"))
            controller.dispatch();
        else
            inputOutput.show("invalid userName/password");
    }
}
