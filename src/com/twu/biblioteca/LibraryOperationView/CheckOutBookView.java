package com.twu.biblioteca.LibraryOperationView;

import com.twu.biblioteca.io.InputOutput;


public class CheckOutBookView implements LibraryOperationView {

    private boolean result;
    private InputOutput inputOutput;

    public CheckOutBookView(boolean result, InputOutput inputOutput) {
        this.result = result;
        this.inputOutput = inputOutput;
    }

    @Override
    public void display() {
        if (result)
            inputOutput.show("Thank you!! Enjoy the book");
        else
            inputOutput.show("That Book is not available");
    }
}
