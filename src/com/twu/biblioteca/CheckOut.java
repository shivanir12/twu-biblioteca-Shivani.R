package com.twu.biblioteca;

public class CheckOut implements LibraryOperation {

    private Library library;

    public CheckOut(Library library) {

        this.library = library;
    }

    @Override
    public boolean execute(Library library, String bookName){
        boolean isAvailable = library.checkoutBook(bookName);
        return isAvailable;
    }

}
