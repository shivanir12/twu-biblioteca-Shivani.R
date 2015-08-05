package com.twu.biblioteca;

public class CheckIn implements LibraryOperation {
    private Library library;

    public CheckIn(Library library){

        this.library = library;
    }

    @Override
    public boolean execute(String bookName) {
        return library.checkInBook(bookName);
    }

}
