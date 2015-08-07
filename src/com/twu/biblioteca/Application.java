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

}
