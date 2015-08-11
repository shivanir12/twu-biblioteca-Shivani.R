package com.twu.biblioteca.controller;


import com.twu.biblioteca.io.InputOutput;
import com.twu.biblioteca.libraryOperation.*;
import com.twu.biblioteca.libraryOperationView.*;
import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.model.User;
import com.twu.biblioteca.view.UserMenuView;

//Accepts the choice and calls the associated methods
public class Controller {

    private InputOutput inputOutput;
    private Library library;
    private UserMenuView userMenuView;

    public Controller(InputOutput inputOutput, Library library, UserMenuView userMenuView) {

        this.inputOutput = inputOutput;
        this.library = library;
        this.userMenuView = userMenuView;
    }

    public void dispatcher(User user) {
        while (true) {
            if (user.isLibrarian())
                userMenuView.showLibrarianMenu();
            else
                userMenuView.showCustomerMenu();
            String choice = inputOutput.getStringInput();
            LibraryOperation libraryOperation;
            LibraryOperationView libraryOperationView;

            if (choice.equals("1")) {
                libraryOperationView = new DisplayBookList(library, inputOutput);
                libraryOperationView.display();


            } else if (choice.equals("2")) {
                libraryOperation = new CheckOutBook(library, user);
                boolean result = libraryOperation.execute(inputOutput.getStringInput());
                libraryOperationView = new CheckOutBookView(result, inputOutput);
                libraryOperationView.display();


            } else if (choice.equals("3")) {
                libraryOperation = new CheckInBook(library, user);
                boolean result = libraryOperation.execute(inputOutput.getStringInput());
                libraryOperationView = new ReturnBookView(result, inputOutput);
                libraryOperationView.display();


            } else if (choice.equals("4")) {
                libraryOperationView = new DisplayMovieList(library, inputOutput);
                libraryOperationView.display();


            } else if (choice.equals("5")) {
                libraryOperation = new CheckOutMovie(library, user);
                boolean result = libraryOperation.execute(inputOutput.getStringInput());
                libraryOperationView = new CheckOutMovieView(result, inputOutput);
                libraryOperationView.display();


            } else if (choice.equals("6")) {
                libraryOperation = new CheckInMovie(library, user);
                boolean result = libraryOperation.execute(inputOutput.getStringInput());
                libraryOperationView = new ReturnMovieView(result, inputOutput);
                libraryOperationView.display();


            } else if (choice.equals("7")) {
                break;
            } else if (choice.equals("8")) {
                libraryOperationView = new DisplayUserProfile(inputOutput, user);
                libraryOperationView.display();

            } else if (choice.equals("9")) {
                if (user.isLibrarian()) {
                    libraryOperationView = new DisplayCheckedOutBookList(library, inputOutput);
                    libraryOperationView.display();
                } else
                    inputOutput.show("invalid option");


            } else if (choice.equals("10")) {
                if (user.isLibrarian()) {
                    libraryOperationView = new DisplayCheckedOutMovieList(library, inputOutput);
                    libraryOperationView.display();
                } else {
                    inputOutput.show("invalid option");
                }
            } else {
                inputOutput.show("invalid option");
            }
        }
    }
}


