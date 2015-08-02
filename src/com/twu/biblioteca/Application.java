package com.twu.biblioteca;


//This class displays the welcome message and main menu.
public class Application {

    private final InputOutput view;

    public Application(InputOutput view) {
        this.view = view;
    }

    public void showWelcomeMessage() {
        view.show("WELCOME TO BIBLIOTECA");
    }

    public void displayMainMenu() {
        view.show("--*Main Menu*--");
        view.show("================================");
        view.show("Enter 1 to display list of books");
        view.show("Enter 2 to checkout book");
        view.show("Enter 3 to return book");
        view.show("Enter 4 to exit");
    }
}
