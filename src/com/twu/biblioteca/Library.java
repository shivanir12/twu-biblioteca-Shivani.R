package com.twu.biblioteca;

import java.util.ArrayList;


//Library class can display list of books, checkin and checkout books
public class Library {
    ArrayList<Book> availableBookList;
    private ArrayList<Book> checkOutBookList;
    private final ArrayList<Movie> movieList;
    private final ArrayList<Movie> checkOutMovieList;

    public Library(ArrayList<Book> bookList, ArrayList<Book> checkOutBookList, ArrayList<Movie> movieList, ArrayList<Movie> checkOutMovieList) {
        this.availableBookList = bookList;
        this.checkOutBookList = checkOutBookList;
        this.movieList = movieList;
        this.checkOutMovieList = checkOutMovieList;
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
        for (Movie movie: movieList) {
            movieDetails += movie.toString();
        }
        return movieDetails;
    }

    private Book searchForBookInTheList(String name,ArrayList<Book> bookList){
        for(Book book : bookList){
            if(book.hasTitle(name))
                return book;
        }
        return null;
    }

    public boolean checkoutBook(String bookName) {
        Book book = searchForBookInTheList(bookName, availableBookList);
        if ((book == null)) {
            return false;
        } else {
            updateBookListAfterCheckOut(book);
            return true;
        }
    }

    private void updateBookListAfterCheckOut(Book book) {
        checkOutBookList.add(book);
        availableBookList.remove(book);
    }

    public boolean checkInBook(String bookName) {
        Book book = searchForBookInTheList(bookName, checkOutBookList);
        if(!(book == null)){
            updateBookListAfterCheckIn(book);
            return true;
        }
        return false;
    }

    private void updateBookListAfterCheckIn(Book book) {
        availableBookList.add(book);
        checkOutBookList.remove(book);
    }

    private Movie searchForMovieInTheList(String name,ArrayList<Movie> movieList){
        for(Movie movie : movieList){
            if(movie.hasTitle(name))
                return movie;
        }
        return null;
    }

    public boolean checkoutMovie(String movieName) {
        Movie movie = searchForMovieInTheList(movieName, movieList);
        if ((movie == null)) {
            return false;
        } else {
            updateMovieListAfterCheckOut(movie);
            return true;
        }
    }

    private void updateMovieListAfterCheckOut(Movie movie) {
        checkOutMovieList.add(movie);
        movieList.remove(movie);
    }

    public boolean checkInMovie(String movieName) {
        Movie movie = searchForMovieInTheList(movieName, checkOutMovieList);
        if ((movie == null)) {
            return false;
        } else {
            updateMovieListAfterCheckIn(movie);
            return true;
        }
    }

    private void updateMovieListAfterCheckIn(Movie movie) {
        movieList.add(movie);
        checkOutMovieList.remove(movie);
    }
}
