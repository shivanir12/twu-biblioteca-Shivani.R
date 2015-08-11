package com.twu.biblioteca.libraryOperation;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.model.User;


public class CheckOutMovie implements LibraryOperation {

    private Library library;
    private User user;

    public CheckOutMovie(Library library, User user) {

        this.library = library;
        this.user = user;
    }

    @Override
    public boolean execute(String movieName) {
        return library.checkoutMovie(movieName, user);
    }

}
