package com.twu.biblioteca;

import java.util.ArrayList;


//This Class is the entry point for the application.
public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("Head First Java", "sierra", "1950");
        Book book2 = new Book("WWW", "robert", "1950");
        Book book3 = new Book("DS", "sahani", "1956");
        ArrayList<Book> availableBookList = new ArrayList<Book>();
        availableBookList.add(book1);
        availableBookList.add(book2);
        availableBookList.add(book3);
        InputOutput view = new InputOutput();
        Library library = new Library(view, availableBookList);
        Application application = new Application(view);
        application.showWelcomeMessage();
        Dispatcher dispatcher = new Dispatcher(view, library, application);
        dispatcher.dispatch();

    }
}