package com.twu.biblioteca;

public class Dispatcher {

    private final View view;
    private final Library library;

    public Dispatcher(View view, Library library) {

        this.view = view;
        this.library = library;
    }

    public void dispatch() {
        while (true)
        {
            int choice = view.getIntegerInput();
            switch (choice) {
                case 1:
                    //library.displayListOf(bookList);
                    break;
                case 2:
                    view.show("Enter the book number to checkout");
                    break;
                case 3:
                    System.exit(0);
                default:
                    view.show("Enter a valid option");
            }
        }
    }
}

