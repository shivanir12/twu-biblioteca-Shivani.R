package com.twu.biblioteca.LibraryOperation;

import com.twu.biblioteca.Library;
import com.twu.biblioteca.User;

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
