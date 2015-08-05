package com.twu.biblioteca;

public class Quit implements LibraryOperation {

    @Override
    public boolean execute(String name){
        System.exit(0);
        return true;
    }

}
