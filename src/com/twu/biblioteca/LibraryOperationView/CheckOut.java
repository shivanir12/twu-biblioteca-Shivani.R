package com.twu.biblioteca.LibraryOperationView;


import com.twu.biblioteca.Model.Library;
import com.twu.biblioteca.Model.User;

public class CheckOut implements LibraryOperation {

    private Library library;
    private User user;

    public CheckOut(Library library, User user) {

        this.library = library;
        this.user = user;
    }

    @Override
    public boolean execute(String bookName){
        return library.checkoutBook(bookName, user);
    }
}
