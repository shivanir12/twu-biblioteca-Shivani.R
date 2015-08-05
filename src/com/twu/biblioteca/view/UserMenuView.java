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
                "Enter 1 to display list of books\n" +
                "Enter 2 to checkout book\n" +
                "Enter 3 to return book\n" +
                "Enter 4 to quit\n" +
                "Enter 5 to display list of movies\n" +
                "Enter 6 to to checkout movies\n" +
                "Enter 7 to to return movies\n" +
                "Enter 8 to display Checked out movie list\n" +
                "Enter 9 to display checked out book list\n";
        inputOutput.show(menu);
        inputOutput.show("Enter the choice");
    }
}
