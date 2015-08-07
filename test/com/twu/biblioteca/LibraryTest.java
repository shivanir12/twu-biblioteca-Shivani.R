package com.twu.biblioteca;

import org.junit.Test;
import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;


public class LibraryTest {

    @Test
    public void toGetTheListFromLibrary() {
        Book book1 = new Book("WWW", "robert", "1950");
        ArrayList<Book> availableBookList = new ArrayList<>();
        availableBookList.add(book1);
        ArrayList<Movie> movieList = new ArrayList<>();
        HashMap<Book, String> checkOutBookDetails = new HashMap<>();
        HashMap<Movie, String> checkOutMovieDetails = new HashMap<>();
        Library library = new Library(availableBookList, movieList, checkOutBookDetails, checkOutMovieDetails);
        String expectedResult = ""+String.format("%-20s%-20s%s\n","WWW","robert","1950");
        assertEquals(expectedResult,library.getBookListFromLibrary());
    }

    @Test
    public void returnsTrueIfTheBookIsAvailableInTheBookList() {
        Book book1 = new Book("WWW", "robert", "1950");
        ArrayList<Book> availableBookList = new ArrayList<>();
        availableBookList.add(book1);
        User user1 = new User("123-1000", "shivani","Shivani R","shivanir@gmail.com","9481816385","customer");
        ArrayList<Movie> movieList = new ArrayList<>();
        HashMap<Movie, String> checkOutMovieDetails = new HashMap<>();
        HashMap<Book, String> checkOutBookDetails = new HashMap<>();
        Library library = new Library(availableBookList, movieList, checkOutBookDetails, checkOutMovieDetails);
        assertEquals(true,library.checkoutBook("WWW",user1));
    }

    @Test
    public void returnsFalseIfTheBookIsNotAvailableInTheBookList() {
        Book book1 = new Book("WWW", "robert", "1950");
        ArrayList<Book> availableBookList = new ArrayList<>();
        availableBookList.add(book1);
        User user1 = new User("123-1000", "shivani","Shivani R","shivanir@gmail.com","9481816385","customer");
        ArrayList<Movie> movieList = new ArrayList<>();
        HashMap<Movie, String> checkOutMovieDetails = new HashMap<>();
        HashMap<Book, String> checkOutBookDetails = new HashMap<>();
        Library library = new Library(availableBookList, movieList, checkOutBookDetails, checkOutMovieDetails);
        assertEquals(false,library.checkoutBook("Head First Java",user1));
    }

    @Test
    public void returnsTrueIfTheBookIsAvailableInTheCheckOutBookList() {
        Book book1 = new Book("WWW", "robert", "1950");
        ArrayList<Book> availableBookList = new ArrayList<>();
        User user1 = new User("123-1000", "shivani","Shivani R","shivanir@gmail.com","9481816385","customer");
        ArrayList<Movie> movieList = new ArrayList<>();
        HashMap<Movie, String> checkOutMovieDetails = new HashMap<>();
        HashMap<Book, String> checkOutBookDetails = new HashMap<>();
        checkOutBookDetails.put(book1,user1.getUserId());
        Library library = new Library(availableBookList, movieList, checkOutBookDetails, checkOutMovieDetails);
        assertEquals(true,library.checkInBook("WWW", user1));
    }

    @Test
    public void returnsFalseIfTheBookIsNotAvailableInTheCheckOutBookList() {
        Book book1 = new Book("WWW", "robert", "1950");
        ArrayList<Book> availableBookList = new ArrayList<>();
        User user1 = new User("123-1000", "shivani","Shivani R","shivanir@gmail.com","9481816385","customer");
        ArrayList<Movie> movieList = new ArrayList<>();HashMap<Movie, String> checkOutMovieDetails = new HashMap<>();
        HashMap<Book, String> checkOutBookDetails = new HashMap<>();
        checkOutBookDetails.put(book1,"123-1000");
        Library library = new Library(availableBookList, movieList, checkOutBookDetails, checkOutMovieDetails);
        assertEquals(false,library.checkInBook("java", user1));
    }
    @Test
    public void toGetTheMovieListFromLibrary() {
        ArrayList<Book> availableBookList = new ArrayList<>();
        ArrayList<Movie> movieList = new ArrayList<>();
        Movie movie1 = new Movie("manam","1960","anup","9");
        movieList.add(movie1);
        String expectedResult = ""+String.format("%-20s%-20s%-20s%-20s\n","manam","1960","anup", "9");
        HashMap<Movie, String> checkOutMovieDetails = new HashMap<>();
        HashMap<Book, String> checkOutBookDetails = new HashMap<>();
        Library library = new Library(availableBookList, movieList, checkOutBookDetails, checkOutMovieDetails);
        assertEquals(expectedResult,library.getMovieListFromLibrary());
    }
    @Test
    public void toGetTheCheckedOutMovieListFromLibrary() {
        ArrayList<Book> availableBookList = new ArrayList<>();
        ArrayList<Movie> movieList = new ArrayList<>();
        Movie movie1 = new Movie("manam","1960","anup","9");
        HashMap<Movie, String> checkOutMovieDetails = new HashMap<>();
        HashMap<Book, String> checkOutBookDetails = new HashMap<>();
        checkOutMovieDetails.put(movie1,"123-1000");
        Library library = new Library(availableBookList, movieList, checkOutBookDetails, checkOutMovieDetails);
        String expectedResult = ""+String.format("%-20s%-20s\n", "manam", "123-1000");
        assertEquals(expectedResult,library.getCheckOutMovieListFromLibrary());
    }
    @Test
    public void toGetTheCheckedOutBookListFromLibrary() {
        ArrayList<Book> availableBookList = new ArrayList<>();
        ArrayList<Movie> movieList = new ArrayList<>();
        Book book1 = new Book("WWW", "robert", "1950");
        HashMap<Movie, String> checkOutMovieDetails = new HashMap<>();
        HashMap<Book, String> checkOutBookDetails = new HashMap<>();
        checkOutBookDetails.put(book1,"123-1000");
        Library library = new Library(availableBookList, movieList, checkOutBookDetails, checkOutMovieDetails);
        String expectedResult = ""+String.format("%-20s%-20s\n", "WWW", "123-1000");
        assertEquals(expectedResult,library.getCheckOutBookListFromLibrary());
    }
    @Test
    public void returnsTrueIfMovieIsAvailableInMovieList() {
        ArrayList<Book> availableBookList = new ArrayList<>();
        ArrayList<Movie> movieList = new ArrayList<>();
        Movie movie1 = new Movie("manam","1960","anup","9");
        movieList.add(movie1);
        HashMap<Movie, String> checkOutMovieDetails = new HashMap<>();
        HashMap<Book, String> checkOutBookDetails = new HashMap<>();
        Library library = new Library(availableBookList, movieList, checkOutBookDetails, checkOutMovieDetails);
        User user1 = new User("123-1000", "shivani","Shivani R","shivanir@gmail.com","9481816385","customer");
        assertEquals(true,library.checkoutMovie("manam",user1));
    }

    @Test
    public void returnsFalseIfMovieIsNotAvailableInMovieList() {
        ArrayList<Book> availableBookList = new ArrayList<>();
        ArrayList<Movie> movieList = new ArrayList<>();
        Movie movie1 = new Movie("manam","1960","anup","9");
        movieList.add(movie1);
        HashMap<Movie, String> checkOutMovieDetails = new HashMap<>();
        HashMap<Book, String> checkOutBookDetails = new HashMap<>();
        Library library = new Library(availableBookList, movieList, checkOutBookDetails, checkOutMovieDetails);
        User user1 = new User("123-1000", "shivani","Shivani R","shivanir@gmail.com","9481816385","customer");
        assertEquals(false,library.checkoutMovie("neninte",user1));
    }
    @Test
    public void returnsTrueIfMovieIsAvailableInCheckOutMovieList() {
        ArrayList<Book> availableBookList = new ArrayList<>();
        ArrayList<Movie> movieList = new ArrayList<>();
        Movie movie1 = new Movie("manam","1960","anup","9");
        HashMap<Movie, String> checkOutMovieDetails = new HashMap<>();
        HashMap<Book, String> checkOutBookDetails = new HashMap<>();
        checkOutMovieDetails.put(movie1, "123-1000");
        Library library = new Library(availableBookList, movieList, checkOutBookDetails, checkOutMovieDetails);
        User user1 = new User("123-1000", "shivani","Shivani R","shivanir@gmail.com","9481816385","customer");
        assertEquals(true,library.checkInMovie("manam", user1));
    }

    @Test
    public void returnsFalseIfMovieIsNotAvailableInCheckOutMovieList() {
        ArrayList<Book> availableBookList = new ArrayList<>();
        ArrayList<Movie> movieList = new ArrayList<>();
        Movie movie1 = new Movie("manam","1960","anup","9");
        User user1 = new User("123-1000", "shivani","Shivani R","shivanir@gmail.com","9481816385","customer");
        HashMap<Movie, String> checkOutMovieDetails = new HashMap<>();
        HashMap<Book, String> checkOutBookDetails = new HashMap<>();
        checkOutMovieDetails.put(movie1, "123-1001");
        Library library = new Library(availableBookList, movieList, checkOutBookDetails, checkOutMovieDetails);
        assertEquals(false,library.checkInMovie("appu", user1));
    }
}
