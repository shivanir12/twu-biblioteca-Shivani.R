package com.twu.biblioteca;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        View view = new View();

        Application application = new Application(view);
        application.showWelcomeMessage();
        application.displayMainMenu();

        Book book1 = new Book("1","Head First Java", "sierra", "1950", "Accessible");
        Book book2 = new Book("2","WWW", "robert", "1950", "Accessible");
        Book book3 = new Book("3","DS", "sahani", "1956", "Accessible");
        ArrayList<Book> bookList = new ArrayList<Book>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);

        Library library = new Library(view, bookList);
        Dispatcher dispatcher = new Dispatcher(view,library);
        dispatcher.dispatch();

    }
}