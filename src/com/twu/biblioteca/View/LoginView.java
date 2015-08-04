package com.twu.biblioteca.View;

public class LoginView {
    public String userName;
    public String password;
    public void getLoginDetails(InputOutput inputOutput, U){  //user, UserMenuView userMenuView, LibrarianMenuView librarianMenuView) {
        inputOutput.show("Enter the User Name");
        String userName =  inputOutput.getStringInput();
        inputOutput.show("Enter the Password");
        String password = inputOutput.getStringInput();

        if(user.checkUserValidity(userName+" "+password))

    }
}
