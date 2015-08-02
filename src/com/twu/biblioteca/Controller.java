package com.twu.biblioteca;


//Accepts the choice and calls the associated methods
public class Controller {

    private final InputOutput view;
    private final Library library;
    private Application application;
    private Parser parser;

    public Controller(InputOutput view, Library library, Application application, Parser parser) {

        this.view = view;
        this.library = library;
        this.application = application;
        this.parser = parser;
    }

    public void dispatch() {
        while (true) {
            application.displayMainMenu();
            int choice = view.getIntegerInput();
            switch (choice) {
                case 1:
                    String list = library.getListFromLibrary();
                    view.displayBookList(list);
                    break;
                case 2:
                    LibraryOperation libraryOperation = parser.parse(choice);
                    view.show("Enter the name of the book to checkout");
                    String bookName = view.getStringInput();
                    libraryOperation.execute(library,bookName);
                case 4:
                    System.exit(0);
                default:
                    view.show("Enter a valid option");
            }
        }
    }
}

