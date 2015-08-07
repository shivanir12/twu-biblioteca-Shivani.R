package com.twu.biblioteca;

import com.twu.biblioteca.LibraryOperationView.Iview;

public class DisplayList implements Iview {

    private Library library;
    private InputOutput inputOutput;

    public DisplayList(Library library, InputOutput inputOutput) {

        this.library = library;
        this.inputOutput = inputOutput;
    }

    @Override
    public void show() {
        String list = library.getBookListFromLibrary();
        inputOutput.show(list);
    }
}
