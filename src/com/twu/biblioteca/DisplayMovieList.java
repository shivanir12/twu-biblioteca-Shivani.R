package com.twu.biblioteca;

import com.twu.biblioteca.LibraryOperationView.Iview;

public class DisplayMovieList implements Iview {

    private Library library;
    private InputOutput inputOutput;

    public DisplayMovieList(Library library, InputOutput inputOutput) {

        this.library = library;
        this.inputOutput = inputOutput;
    }

    @Override
    public void show() {
        String list = library.getMovieListFromLibrary();
        inputOutput.show(list);
    }

}
