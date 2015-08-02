package com.twu.biblioteca;


public class CheckOut implements LibraryOperation {

    @Override
    public boolean execute(Library library, String bookName){
        return library.checkoutBook(bookName);
    }
}
