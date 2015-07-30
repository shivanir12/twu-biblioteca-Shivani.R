package com.twu.biblioteca;


public class Main {

    public static void main(String[] args) {
        View view = new View();
        Book book = new Book();
        Library library = new Library(view, book);
        Application application = new Application(view);
        application.showWelcomeMessage();
        application.displayMainMenu();
        //library.loadBooksToLibrary();
        Dispatcher dispatcher = new Dispatcher(view,library);


    }
}