package com.twu.biblioteca.LibraryOperationView;

import com.twu.biblioteca.Model.Library;
import com.twu.biblioteca.Model.User;


public class CheckInBook implements LibraryOperation {
    private Library library;
    private User user;

    public CheckInBook(Library library, User user){

        this.library = library;
        this.user = user;
    }

    @Override
    public boolean execute(String bookName) {
        return library.checkInBook(bookName,user);
    }

}
