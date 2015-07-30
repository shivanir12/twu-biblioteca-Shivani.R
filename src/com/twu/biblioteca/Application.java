package com.twu.biblioteca;


public class Application {

    private final View view;

    public Application(View view) {
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
        view.show("Enter 3 to exit");
    }

}
