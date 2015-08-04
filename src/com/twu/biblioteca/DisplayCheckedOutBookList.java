package com.twu.biblioteca;

public class DisplayCheckedOutBookList implements LibraryOperation{
    @Override
    public boolean execute(Library library, String bookName) {
        return false;
    }

    @Override
    public String display(Library library) {
        return library.getCheckOutBookListFromLibrary();
    }


}
