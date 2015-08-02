package com.twu.biblioteca;

public class CheckIn implements LibraryOperation {

    @Override
    public boolean execute(Library library, String bookName) {
        return library.checkInBook(bookName);
    }
}
