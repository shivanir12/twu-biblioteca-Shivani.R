package com.twu.biblioteca.view;


import com.twu.biblioteca.io.InputOutput;

//This class displays the welcome message.
public class WelcomeView {

    private final InputOutput view;

    public WelcomeView(InputOutput view) {
        this.view = view;
    }

    public void showWelcomeMessage() {
        view.show("WELCOME TO BIBLIOTECA");
    }

}
