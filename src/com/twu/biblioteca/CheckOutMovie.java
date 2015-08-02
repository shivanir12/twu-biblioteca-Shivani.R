package com.twu.biblioteca;

public class CheckOutMovie implements LibraryOperation {
    @Override
    public boolean execute(Library library, String bookName){
        return library.checkoutMovie(bookName);
    }

    @Override
    public String display(Library library){
        return "";
    }

}
