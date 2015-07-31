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
                    library.displayHeader();
                    library.displayListOf();
                    break;
                case 2:
                    view.show("Enter the book number to checkout");
                    String input = view.getStringInput();
                    //library.checkoutBook(input);
                    break;
                case 3:
                    view.show("Enter the book number to return");
                    input = view.getStringInput();
                    //library.checkInBook(input);
                    break;
                case 4:
                    System.exit(0);
                default:
                    view.show("Enter a valid option");
            }
        }
    }
}

