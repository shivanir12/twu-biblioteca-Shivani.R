package com.twu.biblioteca.LibraryOperationView;

import com.twu.biblioteca.Model.Library;
import com.twu.biblioteca.Model.User;


public class CheckOutBook implements LibraryOperation {

    private Library library;
    private User user;

    public CheckOutBook(Library library, User user) {

        this.library = library;
        this.user = user;
    }

    @Override
    public boolean execute(String bookName) {
        return library.checkoutBook(bookName, user);
    }
}
