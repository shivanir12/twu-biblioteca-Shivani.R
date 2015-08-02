package com.twu.biblioteca;


import java.util.Scanner;

//Accepts the choice and calls the associated methods
public class Controller {

    private InputOutput view;
    private Library library;
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
            String choice = view.getStringInput();
            switch (choice) {
                case "1":
                    String list = library.getListFromLibrary();
                    view.displayBookList(list);
                    break;
                case "2":
                    LibraryOperation libraryOperation = parser.parse(choice);
                    view.show("Enter the name of the book to checkout");
                    String bookName = view.getStringInput();
                    boolean isAvailable = libraryOperation.execute(library,bookName);
                    if(isAvailable)
                        view.show("Thank you!! Enjoy the book");
                    else
                        view.show("Book is not available");
                    break;
                case "3":
                    LibraryOperation libraryOperation = parser.parse(choice);
                    view.show("Enter the name of the book to checkout");
                    String bookName = view.getStringInput();
                    boolean isAvailable = libraryOperation.execute(library,bookName);
                    if(isAvailable)
                        view.show("Thank you!! Enjoy the book");
                    else
                        view.show("Book is not available");
                    break;
                case "4":
                    System.exit(0);
                    break;
                default:
                    view.show("Enter a valid option");
            }
        }
    }
}

