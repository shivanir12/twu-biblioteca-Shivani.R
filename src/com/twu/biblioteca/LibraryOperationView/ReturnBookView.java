package com.twu.biblioteca.LibraryOperationView;

import com.twu.biblioteca.InputOutput;

public class ReturnBookView implements LibraryOperationView {

    private boolean result;
    private final InputOutput inputOutput;

    public ReturnBookView(boolean result, InputOutput inputOutput) {
        this.result = result;

        this.inputOutput = inputOutput;
    }

    @Override
    public void display(){
        if (result)
            inputOutput.show("Thank you for returning the book");
        else
            inputOutput.show("That is not a valid book to return");
    }
}
