package com.twu.biblioteca;

public class DisplayMovieList implements LibraryOperation {
    @Override
    public boolean execute(Library library, String bookName) {
        return false;
    }

    @Override
    public String display(Library library) {
        String list = library.getMovieListFromLibrary();
        return list;
    }
}
