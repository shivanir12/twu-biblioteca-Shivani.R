package com.twu.biblioteca.LibraryOperationView;

import com.twu.biblioteca.Model.Library;
import com.twu.biblioteca.Model.User;


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
