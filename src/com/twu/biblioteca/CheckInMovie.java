package com.twu.biblioteca;

public class CheckInMovie implements LibraryOperation {

    private Library library;

    public CheckInMovie(Library library){

        this.library = library;
    }
    @Override
    public boolean execute(String movieName) {
        return library.checkInMovie(movieName);
    }

}
