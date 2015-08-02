package com.twu.biblioteca;

public class Quit implements LibraryOperation {

    @Override
    public boolean execute(Library library,String name){
        System.exit(0);
        return true;
    }

    @Override
    public String display(Library library){
        return "";
    }
}
