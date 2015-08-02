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

        Movie movie1 = new Movie("manam","1960","anup","9");
        Movie movie2 = new Movie("akash","2000","puneeth","8");
        Movie movie3 = new Movie("appu","1960","srk","9");
        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.add(movie1);
        movieList.add(movie2);
        movieList.add(movie3);

        InputOutput view = new InputOutput();
        ArrayList<Book> checkoutBookList = new ArrayList<>();
        ArrayList<Movie> checkOutMovieList = new ArrayList<>();
        Library library = new Library(availableBookList, checkoutBookList, movieList, checkOutMovieList);

        Application application = new Application(view);
        application.showWelcomeMessage();

        Parser parser = new Parser(availableBookList, library);
        Controller controller = new Controller(view, library, application, parser);
        controller.dispatch();
    }
}