package com.twu.biblioteca;


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
            LibraryOperation libraryOperation;
            String bookName = "";
            application.displayMainMenu();
            String choice = view.getStringInput();
            switch (choice) {
                case "1":
                    libraryOperation = parser.parse(choice);
                    String list = libraryOperation.display(library);
                    view.displayBookList(list);
                    break;
                case "2":
                    libraryOperation = parser.parse(choice);
                    view.show("Enter the name of the book to checkout");
                    bookName = view.getStringInput();
                    if(libraryOperation.execute(library,bookName))
                        view.show("Thank you!! Enjoy the book");
                    else
                        view.show("Book is not available");
                    break;
                case "3":
                    libraryOperation = parser.parse(choice);
                    view.show("Enter the name of the book to return");
                    bookName = view.getStringInput();
                    if(libraryOperation.execute(library,bookName))
                        view.show("Thank you for returning the book");
                    else
                        view.show("This is not a valid book to return");
                    break;
                case "4":
                    libraryOperation = parser.parse(choice);
                    libraryOperation.execute(library,bookName);
                default:
                    view.show("Enter a valid option");
            }
        }
    }
}

