package com.twu.biblioteca;

import com.twu.biblioteca.LibraryOperationView.Iview;

public class DisplayCheckedOutMovieList implements Iview {

    private Library library;
    private InputOutput inputOutput;

    public DisplayCheckedOutMovieList(Library library, InputOutput inputOutput) {

        this.library = library;
        this.inputOutput = inputOutput;
    }

    @Override
    public void show() {
        String list = library.getCheckOutMovieListFromLibrary();
        inputOutput.show(list);
    }
}
