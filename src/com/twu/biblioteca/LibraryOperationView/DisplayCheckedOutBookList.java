package com.twu.biblioteca.LibraryOperationView;

import com.twu.biblioteca.InputOutput;
import com.twu.biblioteca.Library;
import com.twu.biblioteca.LibraryOperationView.Iview;

public class DisplayCheckedOutBookList implements Iview {


    private Library library;
    private InputOutput inputOutput;

    public DisplayCheckedOutBookList(Library library, InputOutput inputOutput) {

        this.library = library;
        this.inputOutput = inputOutput;
    }

    @Override
    public void show() {
        String list = library.getCheckOutBookListFromLibrary();
        inputOutput.show(list);
    }
}
