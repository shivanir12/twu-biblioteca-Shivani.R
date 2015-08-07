package com.twu.biblioteca.view;

import com.twu.biblioteca.Controller.Controller;
import com.twu.biblioteca.InputOutput;
import com.twu.biblioteca.User;

import java.util.ArrayList;

public class InitialView {
    private final InputOutput inputOutput;
    private final ArrayList<User> users;
    private final LoginView loginView;
    private final UserMenuView userMenuView;
    private Controller controller;

    public InitialView(InputOutput inputOutput, ArrayList<User> users, LoginView loginView,UserMenuView userMenuView, Controller controller){

        this.inputOutput = inputOutput;
        this.users = users;
        this.loginView = loginView;
        this.userMenuView = userMenuView;
        this.controller = controller;
    }

    public void showInitialMenu(){
        while (true) {
            inputOutput.show("1.Login\n2.Quit\n");
            String option = inputOutput.getStringInput();
            switch (option) {
                case "1":
                    loginView.validateUserLoginDetails(inputOutput, users, controller);
                    break;
                case "2":
                    System.exit(0);
                default:
                    inputOutput.show("Enter a valid option");
                    break;
            }
        }
    }
}
