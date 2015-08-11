package com.twu.biblioteca.libraryOperationView;

import com.twu.biblioteca.io.InputOutput;
import com.twu.biblioteca.model.Library;


public class DisplayCheckedOutBookList implements LibraryOperationView {
    private Library library;
    private InputOutput inputOutput;

    public DisplayCheckedOutBookList(Library library, InputOutput inputOutput) {

        this.library = library;
        this.inputOutput = inputOutput;
    }

    @Override
    public void display() {
        String list = library.getCheckOutBookListFromLibrary();
        inputOutput.show(list);
    }
}
