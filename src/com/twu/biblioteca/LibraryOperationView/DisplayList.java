package com.twu.biblioteca.LibraryOperationView;

import com.twu.biblioteca.InputOutput;
import com.twu.biblioteca.Model.Library;

public class DisplayList implements LibraryOperationView {

    private Library library;
    private InputOutput inputOutput;

    public DisplayList(Library library, InputOutput inputOutput) {

        this.library = library;
        this.inputOutput = inputOutput;
    }

    @Override
    public void display() {
        String list = library.getBookListFromLibrary();
        inputOutput.show(list);
    }
}
