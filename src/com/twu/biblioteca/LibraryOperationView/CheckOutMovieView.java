package com.twu.biblioteca.LibraryOperationView;

import com.twu.biblioteca.InputOutput;
import com.twu.biblioteca.LibraryOperation.LibraryOperation;

public class CheckOutMovieView implements Iview {
    private LibraryOperation libraryOperation;
    private final InputOutput inputOutput;

    public CheckOutMovieView(LibraryOperation libraryOperation, InputOutput inputOutput) {

        this.libraryOperation = libraryOperation;
        this.inputOutput = inputOutput;
    }

    @Override
    public void show(){
        inputOutput.show("Enter the name of the movie to checkout");
        String bookName = inputOutput.getStringInput();
        if (libraryOperation.execute(bookName))
            inputOutput.show("Thank you!! Enjoy the movie");
        else
            inputOutput.show("That movie is not available");
    }

}
