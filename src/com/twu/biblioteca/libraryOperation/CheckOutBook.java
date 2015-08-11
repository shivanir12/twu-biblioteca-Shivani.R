package com.twu.biblioteca.libraryOperation;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.model.User;


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
