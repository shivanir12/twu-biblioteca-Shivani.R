package com.twu.biblioteca.view;

import com.twu.biblioteca.InputOutput;
import com.twu.biblioteca.LibraryOperation;

public class CheckOutBookView implements Iview {

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
