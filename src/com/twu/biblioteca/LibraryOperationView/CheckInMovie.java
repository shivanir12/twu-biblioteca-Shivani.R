package com.twu.biblioteca.LibraryOperationView;

import com.twu.biblioteca.Model.Library;
import com.twu.biblioteca.Model.User;


public class CheckInMovie implements LibraryOperation {

    private Library library;
    private User user;

    public CheckInMovie(Library library, User user) {

        this.library = library;
        this.user = user;
    }

    @Override
    public boolean execute(String movieName) {
        return library.checkInMovie(movieName, user);
    }

}
