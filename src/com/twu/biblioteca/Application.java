package com.twu.biblioteca;

import java.util.ArrayList;

public class Application {

    private final View view;

    public Application(View view) {
        this.view = view;
    }

    public void showWelcomeMessage(){
        view.show("WELCOME TO BIBLIOTECA");
    }


}
