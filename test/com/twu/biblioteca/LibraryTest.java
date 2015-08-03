package com.twu.biblioteca;

import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class LibraryTest {

    @Test
    public void toGetTheListFromLibrary() {
        Book book1 = new Book("WWW", "robert", "1950");
        ArrayList<Book> availableBookList = new ArrayList<>();
        ArrayList<Book> checkoutBookList = new ArrayList<>();
        availableBookList.add(book1);
        ArrayList<Movie> movieList = new ArrayList<>();
        ArrayList<Movie> checkOutMovieList = new ArrayList<>();
        Library library = new Library(availableBookList, checkoutBookList, movieList, checkOutMovieList);
        String expectedResult = ""+String.format("%-20s%-20s%s\n","WWW","robert","1950");
        assertEquals(expectedResult,library.getBookListFromLibrary());
    }

    @Test
    public void returnsTrueIfTheBookIsAvailableInTheBookList() {
        Book book1 = new Book("WWW", "robert", "1950");
        ArrayList<Book> availableBookList = new ArrayList<>();
        availableBookList.add(book1);
        ArrayList<Book> checkoutBookList = new ArrayList<>();
        ArrayList<Movie> movieList = new ArrayList<>();
        ArrayList<Movie> checkOutMovieList = new ArrayList<>();
        Library library = new Library(availableBookList, checkoutBookList, movieList, checkOutMovieList);
        assertEquals(true,library.checkoutBook("WWW"));
    }

    @Test
    public void returnsFalseIfTheBookIsNotAvailableInTheBookList() {
        Book book1 = new Book("WWW", "robert", "1950");
        ArrayList<Book> availableBookList = new ArrayList<>();
        availableBookList.add(book1);
        ArrayList<Book> checkoutBookList = new ArrayList<>();
        ArrayList<Movie> checkOutMovieList = new ArrayList<>();
        ArrayList<Movie> movieList = new ArrayList<>();
        Library library = new Library(availableBookList, checkoutBookList, movieList, checkOutMovieList);
        assertEquals(false,library.checkoutBook("Head First Java"));
    }

    @Test
    public void returnsTrueIfTheBookIsAvailableInTheCheckOutBookList() {
        Book book1 = new Book("WWW", "robert", "1950");
        ArrayList<Book> checkOutBookList = new ArrayList<>();
        ArrayList<Book> availableBookList = new ArrayList<>();
        checkOutBookList.add(book1);
        ArrayList<Movie> checkOutMovieList = new ArrayList<>();
        ArrayList<Movie> movieList = new ArrayList<>();
        Library library = new Library(availableBookList, checkOutBookList, movieList, checkOutMovieList);
        assertEquals(true,library.checkInBook("WWW"));
    }

    @Test
    public void returnsFalseIfTheBookIsNotAvailableInTheCheckOutBookList() {
        Book book1 = new Book("WWW", "robert", "1950");
        ArrayList<Book> checkOutBookList = new ArrayList<>();
        ArrayList<Book> availableBookList = new ArrayList<>();
        checkOutBookList.add(book1);
        ArrayList<Movie> checkOutMovieList = new ArrayList<>();
        ArrayList<Movie> movieList = new ArrayList<>();
        Library library = new Library(availableBookList, checkOutBookList, movieList, checkOutMovieList);
        assertEquals(false,library.checkInBook("java"));
    }
    @Test
    public void toGetTheMovieListFromLibrary() {
        ArrayList<Book> availableBookList = new ArrayList<>();
        ArrayList<Book> checkoutBookList = new ArrayList<>();
        ArrayList<Movie> movieList = new ArrayList<>();
        ArrayList<Movie> checkOutMovieList = new ArrayList<>();
        Movie movie1 = new Movie("manam","1960","anup","9");
        movieList.add(movie1);
        Library library = new Library(availableBookList, checkoutBookList, movieList, checkOutMovieList);
        String expectedResult = ""+String.format("%-20s%-20s%-20s%-20s\n","manam","1960","anup", "9");
        assertEquals(expectedResult,library.getMovieListFromLibrary());
    }
    @Test
    public void returnsTrueIfMovieIsAvailableInMovieList() {
        ArrayList<Book> availableBookList = new ArrayList<>();
        ArrayList<Book> checkoutBookList = new ArrayList<>();
        ArrayList<Movie> movieList = new ArrayList<>();
        ArrayList<Movie> checkOutMovieList = new ArrayList<>();
        Movie movie1 = new Movie("manam","1960","anup","9");
        movieList.add(movie1);
        Library library = new Library(availableBookList, checkoutBookList, movieList, checkOutMovieList);
        assertEquals(true,library.checkoutMovie("manam"));
    }

    @Test
    public void returnsFalseIfMovieIsNotAvailableInMovieList() {
        ArrayList<Book> availableBookList = new ArrayList<>();
        ArrayList<Book> checkoutBookList = new ArrayList<>();
        ArrayList<Movie> movieList = new ArrayList<>();
        ArrayList<Movie> checkOutMovieList = new ArrayList<>();
        Movie movie1 = new Movie("manam","1960","anup","9");
        movieList.add(movie1);
        Library library = new Library(availableBookList, checkoutBookList, movieList, checkOutMovieList);
        assertEquals(false,library.checkoutMovie("neninte"));
    }
    @Test
    public void returnsTrueIfMovieIsAvailableInCheckOutMovieList() {
        ArrayList<Book> availableBookList = new ArrayList<>();
        ArrayList<Book> checkoutBookList = new ArrayList<>();
        ArrayList<Movie> movieList = new ArrayList<>();
        ArrayList<Movie> checkOutMovieList = new ArrayList<>();
        Movie movie1 = new Movie("manam","1960","anup","9");
        checkOutMovieList.add(movie1);
        Library library = new Library(availableBookList, checkoutBookList, movieList, checkOutMovieList);
        assertEquals(true,library.checkInMovie("manam"));
    }

    @Test
    public void returnsFalseIfMovieIsAvailableInCheckOutMovieList() {
        ArrayList<Book> availableBookList = new ArrayList<>();
        ArrayList<Book> checkoutBookList = new ArrayList<>();
        ArrayList<Movie> movieList = new ArrayList<>();
        ArrayList<Movie> checkOutMovieList = new ArrayList<>();
        Movie movie1 = new Movie("manam","1960","anup","9");
        checkOutMovieList.add(movie1);
        Library library = new Library(availableBookList, checkoutBookList, movieList, checkOutMovieList);
        assertEquals(false,library.checkInMovie("neninte"));
    }
}
