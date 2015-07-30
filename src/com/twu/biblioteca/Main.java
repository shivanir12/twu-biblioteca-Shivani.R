package com.twu.biblioteca;


public class Main {

    public static void main(String[] args) {
        View view = new View();
        Library library = new Library(view);
        Application application = new Application(view);
        application.showWelcomeMessage();
        application.displayMainMenu();
        //library.loadBooksToLibrary();
        Dispatcher dispatcher = new Dispatcher(view,library);


    }
}