package com.twu.biblioteca.view;

import com.twu.biblioteca.InputOutput;
import com.twu.biblioteca.User;

public class DisplayUserProfile implements Iview {

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
