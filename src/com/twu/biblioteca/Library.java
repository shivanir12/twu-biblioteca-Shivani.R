package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;


//Library class can display list of books, checkin and checkout books
public class Library {
    ArrayList<Book> availableBookList;
    private final ArrayList<Movie> movieList;
    private final HashMap<Book, String> checkOutBookDetails;
    private final HashMap<Movie, String> checkOutMovieDetails;

    public Library(ArrayList<Book> bookList, ArrayList<Movie> movieList,
                    HashMap<Book, String> checkOutBookDetails, HashMap<Movie, String> checkOutMovieDetails) {
        this.availableBookList = bookList;
        this.movieList = movieList;
        this.checkOutBookDetails = checkOutBookDetails;
        this.checkOutMovieDetails = checkOutMovieDetails;
    }


    public String getBookListFromLibrary() {
        String bookDetails = "";
        for (Book book : availableBookList) {
            bookDetails += String.format("%-20s%-20s%s\n", book.getBookName(),
                    book.getAuthor(), book.getYearOfPublication());
        }
        return bookDetails;
    }

    public String getMovieListFromLibrary() {
        String movieDetails = "";
        for (Movie movie : movieList) {
            movieDetails += movie.toString();
        }
        return movieDetails;
    }

    public String getCheckOutMovieListFromLibrary() {
        String movieDetails = "";
        for (Movie movie : checkOutMovieDetails.keySet()) {
            movieDetails += movie.toString();
        }
        return movieDetails;
    }
    public String getCheckOutBookListFromLibrary(User user) {
        String bookDetails = "";
        for (Book book : checkOutBookDetails.keySet()) {
            bookDetails += String.format("%-20s%-20s%-20s%-20s\n", book.getBookName(), user.getUserId(),user.getName(),user.getPhNo());
        }
        return bookDetails;
    }

    public boolean checkoutBook(String bookName, User user) {
        for (Book book : availableBookList) {
            if (book.hasTitle(bookName)) {
                checkOutBookDetails.put(book, user.getUserId());
                availableBookList.remove(book);
                return true;
            }
        }
        return false;
    }

    public boolean checkInBook(String bookName, User user) {
        for(Book book : checkOutBookDetails.keySet()){
            String thatUserId = checkOutBookDetails.get(book);
            if(book.hasTitle(bookName) && thatUserId.equals(user.getUserId()))
            {
                availableBookList.add(book);
                checkOutBookDetails.remove(book);
                return true;
            }
        }
        return false;
    }

    public boolean checkoutMovie(String movieName, User user) {
        for (Movie movie : movieList) {
            if (movie.hasTitle(movieName)) {
                checkOutMovieDetails.put(movie, user.getUserId());
                movieList.remove(movie);
                return true;
            }
        }
        return false;
    }

    public boolean checkInMovie(String movieName, User user) {
        for(Movie movie : checkOutMovieDetails.keySet()){
            String thatUserId = checkOutMovieDetails.get(movie);
            if(movie.hasTitle(movieName) && thatUserId.equals(user.getUserId()))
            {
                movieList.add(movie);
                checkOutMovieDetails.remove(movie);
                return true;
            }
        }
        return false;
    }
}
