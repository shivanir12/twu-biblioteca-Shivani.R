package com.twu.biblioteca;


import com.twu.biblioteca.view.*;

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

    public void dispatch() {
        while (true) {
            userMenuView.showUserMenu();
            String choice = inputOutput.getStringInput();
            LibraryOperation libraryOperation;
            Iview iview;
            if (choice.equals("1")) {
                iview = new DisplayList(library, inputOutput);
                iview.show();
            }
            else if (choice.equals("2")) {
                libraryOperation = new CheckOut(library);
                iview = new CheckOutBookView(libraryOperation, inputOutput);
                iview.show();
            }
            else if (choice.equals("3")) {
                libraryOperation = new CheckIn(library);
                iview = new ReturnBookView(libraryOperation, inputOutput);
                iview.show();
            }
            else
                break;
        }
    }
}
