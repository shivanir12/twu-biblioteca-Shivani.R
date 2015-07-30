package com.twu.biblioteca;

public class Dispatcher {

    private final View view;
    private final Library library;

    public Dispatcher(View view, Library library) {

        this.view = view;
        this.library = library;
    }

    public void dispatch() {
        while (true) {
            int choice = view.getIntegerInput();
            switch (choice) {
                case 1:
                    library.displayListOf();
                    break;
                case 2:
                    view.show("Enter the book number to checkout");
                    String input = view.getStringInput();
                    library.checkoutBook(input);
                    break;
                case 3:
                    view.show("Enter the book number to return");
                    input = view.getStringInput();
                    library.checkInBook(input);
                    break;

                case 4:
                    System.exit(0);
                default:
                    view.show("Enter a valid option");
            }
        }
    }
}

