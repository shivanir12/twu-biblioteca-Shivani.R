package com.twu.biblioteca;

import com.twu.biblioteca.view.Iview;

public class DisplayCheckedOutMovieList implements Iview {

    private Library library;
    private InputOutput inputOutput;
    private User user;

    public DisplayCheckedOutMovieList(Library library, InputOutput inputOutput, User user) {

        this.library = library;
        this.inputOutput = inputOutput;
        this.user = user;
    }

    @Override
    public void show() {
        String list = library.getCheckOutMovieListFromLibrary(user);
        inputOutput.show(list);
    }
}
