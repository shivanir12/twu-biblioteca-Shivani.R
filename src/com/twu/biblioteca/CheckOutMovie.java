package com.twu.biblioteca;

public class CheckOutMovie implements LibraryOperation {

    @Override
    public boolean execute(Library library, String movieName){
        return library.checkoutMovie(movieName);
    }

    @Override
    public String display(Library library){
        return "";
    }
}
