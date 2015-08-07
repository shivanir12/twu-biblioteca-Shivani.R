package com.twu.biblioteca;

public class CheckInMovie implements LibraryOperation {

    private Library library;
    private User user;

    public CheckInMovie(Library library, User user){

        this.library = library;
        this.user = user;
    }
    @Override
    public boolean execute(String movieName) {
        return library.checkInMovie(movieName,user);
    }

}
