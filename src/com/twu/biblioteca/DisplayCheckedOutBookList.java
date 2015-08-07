package com.twu.biblioteca;

import com.twu.biblioteca.view.Iview;

public class DisplayCheckedOutBookList implements Iview {


    private Library library;
    private InputOutput inputOutput;
    private User user;

    public DisplayCheckedOutBookList(Library library, InputOutput inputOutput, User user) {

        this.library = library;
        this.inputOutput = inputOutput;
        this.user = user;
    }

    @Override
    public void show() {
        String list = library.getCheckOutBookListFromLibrary(user);
        inputOutput.show(list);
    }
}
