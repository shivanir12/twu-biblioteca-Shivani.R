package com.twu.biblioteca.libraryOperationView;

import com.twu.biblioteca.io.InputOutput;
import com.twu.biblioteca.model.Library;


public class DisplayBookList implements LibraryOperationView {

    private Library library;
    private InputOutput inputOutput;

    public DisplayBookList(Library library, InputOutput inputOutput) {

        this.library = library;
        this.inputOutput = inputOutput;
    }

    @Override
    public void display() {
        String list = library.getBookListFromLibrary();
        inputOutput.show(list);
    }
}
