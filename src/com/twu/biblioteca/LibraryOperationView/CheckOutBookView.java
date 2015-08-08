package com.twu.biblioteca.LibraryOperationView;

import com.twu.biblioteca.InputOutput;

public class CheckOutBookView implements LibraryOperationView {

    private LibraryOperation libraryOperation;
    private final InputOutput inputOutput;

    public CheckOutBookView(LibraryOperation libraryOperation, InputOutput inputOutput) {

        this.libraryOperation = libraryOperation;
        this.inputOutput = inputOutput;
    }

    @Override
    public void show(){
        inputOutput.show("Enter the name of the book to checkout");
        String bookName = inputOutput.getStringInput();
        if (libraryOperation.execute(bookName))
            inputOutput.show("Thank you!! Enjoy the book");
        else
            inputOutput.show("That Book is not available");
    }
}
