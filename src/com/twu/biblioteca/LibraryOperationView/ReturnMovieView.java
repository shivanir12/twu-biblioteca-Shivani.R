package com.twu.biblioteca.LibraryOperationView;

import com.twu.biblioteca.InputOutput;

public class ReturnMovieView implements LibraryOperationView {
    private boolean result;
    private final InputOutput inputOutput;

    public ReturnMovieView(boolean result, InputOutput inputOutput) {
        this.result = result;

        this.inputOutput = inputOutput;
    }

    @Override
    public void display(){
        if (result)
            inputOutput.show("Thank you for returning the movie");
        else
            inputOutput.show("That is not a valid movie to return");
    }

}
