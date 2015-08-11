package com.twu.biblioteca.libraryOperationView;

import com.twu.biblioteca.io.InputOutput;
import com.twu.biblioteca.model.Library;


public class DisplayMovieList implements LibraryOperationView {
    private Library library;
    private InputOutput inputOutput;

    public DisplayMovieList(Library library, InputOutput inputOutput) {

        this.library = library;
        this.inputOutput = inputOutput;
    }

    @Override
    public void display() {
        String list = library.getMovieListFromLibrary();
        inputOutput.show(list);
    }
}
