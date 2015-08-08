package com.twu.biblioteca.LibraryOperationView;

import com.twu.biblioteca.InputOutput;
import com.twu.biblioteca.Model.User;

public class DisplayUserProfile implements LibraryOperationView {

    private final InputOutput inputOutput;
    private final User user;

    public DisplayUserProfile(InputOutput inputOutput, User user) {

        this.inputOutput = inputOutput;
        this.user = user;
    }
    @Override
    public void show(){
        inputOutput.show(user.toString());
    }
}
