package com.twu.biblioteca.view;


import com.twu.biblioteca.InputOutput;

public class UserMenuView {
    private InputOutput inputOutput;

    public UserMenuView(InputOutput inputOutput) {

        this.inputOutput = inputOutput;
    }

    public void showUserMenu() {
        String menu = "";
        menu += "--*Main Menu*--\n" +
                "================================\n"+
                "Enter 1 to Display list of books\n" +
                "Enter 2 to Checkout book\n" +
                "Enter 3 to Return book\n" +
                "Enter 4 to Display list of movies\n" +
                "Enter 5 to Checkout movies\n" +
                "Enter 6 to Return movies\n" +
                "Enter 7 to Log out\n" +
                "Enter 8 to View my profile\n";
        inputOutput.show(menu);
        inputOutput.show("Enter the choice");
    }
    public void showAdminMenu(){
        String menu = "";
        menu += "--*Main Menu*--\n" +
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
                "Enter 10 to Display Checked out movies";
        inputOutput.show(menu);
        inputOutput.show("Enter the choice");


    }
}
