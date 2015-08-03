package com.twu.biblioteca;

public class CheckInMovie implements LibraryOperation {
    @Override
    public boolean execute(Library library, String movieName) {
        return library.checkInMovie(movieName);
    }

    @Override
    public String display(Library library){
        return "";
    }
}
