package com.twu.biblioteca;


//Accepts the choice and calls the associated methods
public class Dispatcher {

    private final InputOutput view;
    private final Library library;
    private Application application;

    public Dispatcher(InputOutput view, Library library, Application application) {

        this.view = view;
        this.library = library;
        this.application = application;
    }

    public void dispatch() {
        while (true) {
            application.displayMainMenu();
            int choice = view.getIntegerInput();
            switch (choice) {
                case 1:

                    break;

                case 4:
                    System.exit(0);
                default:
                    view.show("Enter a valid option");
            }
        }
    }
}

