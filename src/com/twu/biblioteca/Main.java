package com.twu.biblioteca;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        Application application = new Application(view);
        application.showWelcomeMessage();
    }
}