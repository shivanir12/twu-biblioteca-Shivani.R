package com.twu.biblioteca;

import com.twu.biblioteca.View.InputOutput;
import com.twu.biblioteca.View.Iview;
import com.twu.biblioteca.View.UserMenuView;

public class DisplayCheckedOutBookList implements Iview{


    private Library library;
    private InputOutput inputOutput;
    private UserMenuView userMenuView;

    public DisplayCheckedOutBookList(Library library, InputOutput inputOutput, UserMenuView userMenuView) {

        this.library = library;
        this.inputOutput = inputOutput;
        this.userMenuView = userMenuView;
    }

    @Override
    public void show() {
        String list = library.getCheckOutBookListFromLibrary();
        inputOutput.show(list);
        userMenuView.showUserMenu();
    }
}
