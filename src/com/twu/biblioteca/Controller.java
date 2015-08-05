package com.twu.biblioteca;


import com.twu.biblioteca.View.CheckOutBookView;
import com.twu.biblioteca.View.InputOutput;
import com.twu.biblioteca.View.Iview;
import com.twu.biblioteca.View.UserMenuView;

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
                iview = new DisplayList(library, inputOutput, userMenuView);
                iview.show();

            } else if (choice.equals("2")) {
                libraryOperation = new CheckOut(library);
                iview = new CheckOutBookView(libraryOperation, inputOutput);
                iview.show();

            }
            else if (choice.equals("4"))
                break;
        }
    }
}
