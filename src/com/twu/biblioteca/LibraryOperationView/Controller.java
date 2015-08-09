package com.twu.biblioteca.LibraryOperationView;


import com.twu.biblioteca.InputOutput;
import com.twu.biblioteca.Model.Library;
import com.twu.biblioteca.Model.User;
import com.twu.biblioteca.UserMenuView;

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
                libraryOperationView = new DisplayList(library, inputOutput);
                libraryOperationView.display();


            } else if (choice.equals("2")) {
                libraryOperation = new CheckOut(library, user);
                boolean result = libraryOperation.execute(inputOutput.getStringInput());
                libraryOperationView = new CheckOutBookView(result, inputOutput);
                libraryOperationView.display();


            } else if (choice.equals("3")) {
                libraryOperation = new CheckIn(library, user);
                libraryOperationView = new ReturnBookView(true, inputOutput);
                libraryOperationView.display();


            } else if (choice.equals("4")) {
                libraryOperationView = new DisplayMovieList(library, inputOutput);
                libraryOperationView.display();


            } else if (choice.equals("5")) {
                libraryOperation = new CheckOutMovie(library, user);
                libraryOperationView = new CheckOutMovieView(true, inputOutput);
                libraryOperationView.display();


            } else if (choice.equals("6")) {
                libraryOperation = new CheckInMovie(library, user);
                libraryOperationView = new ReturnMovieView(true, inputOutput);
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
                } else
                    inputOutput.show("invalid option");


            } else {
                inputOutput.show("invalid option");


            }
        }
    }
}


