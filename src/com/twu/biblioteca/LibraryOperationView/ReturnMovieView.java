package com.twu.biblioteca.LibraryOperationView;

import com.twu.biblioteca.InputOutput;

public class ReturnMovieView implements LibraryOperationView {
    private LibraryOperation libraryOperation;
    private final InputOutput inputOutput;

    public ReturnMovieView(LibraryOperation libraryOperation, InputOutput inputOutput) {

        this.libraryOperation = libraryOperation;
        this.inputOutput = inputOutput;
    }

    @Override
    public void show(){
        inputOutput.show("Enter the name of the movie to return");
        String bookName = inputOutput.getStringInput();
        if (libraryOperation.execute(bookName))
            inputOutput.show("Thank you for returning the movie");
        else
            inputOutput.show("That is not a valid movie to return");
    }

}
