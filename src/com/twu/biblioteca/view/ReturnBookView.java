package com.twu.biblioteca.view;

import com.twu.biblioteca.InputOutput;
import com.twu.biblioteca.LibraryOperation;

public class ReturnBookView implements Iview {

    private LibraryOperation libraryOperation;
    private final InputOutput inputOutput;

    public ReturnBookView(LibraryOperation libraryOperation, InputOutput inputOutput) {

        this.libraryOperation = libraryOperation;
        this.inputOutput = inputOutput;
    }

    @Override
    public void show(){
        inputOutput.show("Enter the name of the book to return");
        String bookName = inputOutput.getStringInput();
        if (libraryOperation.execute(bookName))
            inputOutput.show("Thank you for returning the book");
        else
            inputOutput.show("That is not a valid book to return");
    }
}
