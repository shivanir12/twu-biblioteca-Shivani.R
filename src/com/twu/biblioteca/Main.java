package com.twu.biblioteca;

import java.util.ArrayList;


//This Class is the entry point for the application.
public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("Head First Java", "sierra", "1950");
        Book book2 = new Book("WWW", "robert", "1950");
        Book book3 = new Book("DS", "sahani", "1956");
        ArrayList<Book> availableBookList = new ArrayList<>();
        availableBookList.add(book1);
        availableBookList.add(book2);
        availableBookList.add(book3);

        InputOutput view = new InputOutput();
        ArrayList<Book> checkoutBookList = new ArrayList<>();
        Library library = new Library(availableBookList, checkoutBookList);

        Application application = new Application(view);
        application.showWelcomeMessage();

        Parser parser = new Parser(availableBookList,library);
        Controller controller = new Controller(view, library, application, parser);
        controller.dispatch();
    }
}