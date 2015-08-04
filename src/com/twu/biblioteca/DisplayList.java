package com.twu.biblioteca;

import com.twu.biblioteca.View.InputOutput;
import com.twu.biblioteca.View.Iview;
import com.twu.biblioteca.View.UserMenuView;

public class DisplayList implements Iview {

    @Override
    public void show(Library library, InputOutput inputOutput, UserMenuView userMenuView) {
        String list = library.getBookListFromLibrary();
        inputOutput.show(list);
        userMenuView.showUserMenu(inputOutput);
    }
}
