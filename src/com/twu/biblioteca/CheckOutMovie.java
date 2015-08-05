package com.twu.biblioteca;

public class CheckOutMovie implements LibraryOperation {

    private Library library;

    public CheckOutMovie(Library library){

        this.library = library;
    }
    @Override
    public boolean execute(String movieName){
        return library.checkoutMovie(movieName);
    }

}
