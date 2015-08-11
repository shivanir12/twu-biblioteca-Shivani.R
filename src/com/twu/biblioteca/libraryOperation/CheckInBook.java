package com.twu.biblioteca.libraryOperation;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.model.User;


public class CheckInBook implements LibraryOperation {
    private Library library;
    private User user;

    public CheckInBook(Library library, User user) {

        this.library = library;
        this.user = user;
    }

    @Override
    public boolean execute(String bookName) {
        return library.checkInBook(bookName, user);
    }

}
