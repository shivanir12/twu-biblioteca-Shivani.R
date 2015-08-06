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

    public void dispatcher(User user) {
        while (true) {
            if (user.isLibrarian())
                userMenuView.showCustomerMenu();
            else
                userMenuView.showLibrarianMenu();
            String choice = inputOutput.getStringInput();
            LibraryOperation libraryOperation;
            Iview iview;
            switch (choice) {
                case "1":
                    iview = new DisplayList(library, inputOutput);
                    iview.show();
                    break;
                case "2":
                    libraryOperation = new CheckOut(library);
                    iview = new CheckOutBookView(libraryOperation, inputOutput);
                    iview.show();
                    break;
                case "3":
                    libraryOperation = new CheckIn(library);
                    iview = new ReturnBookView(libraryOperation, inputOutput);
                    iview.show();
                    break;
                case "4":
                    iview = new DisplayMovieList(library, inputOutput);
                    iview.show();
                    break;
                case "5":
                    libraryOperation = new CheckOutMovie(library);
                    iview = new CheckOutMovieView(libraryOperation, inputOutput);
                    iview.show();
                    break;
                case "6":
                    libraryOperation = new CheckInMovie(library);
                    iview = new ReturnMovieView(libraryOperation, inputOutput);
                    iview.show();
                    break;
                case "7":
                    if (user.isLibrarian()) {
                        iview = new DisplayUserProfile(inputOutput,user);
                        iview.show();
                    } else
                        inputOutput.show("invalid option");
                    break;
                case "8":
                    //iview = new LogOut();
                    //iview.show();
                    break;
                case "9":
                    if (user.isLibrarian()) {
                        iview = new DisplayCheckedOutBookList(library, inputOutput);
                        iview.show();
                    } else
                        inputOutput.show("invalid option");
                    break;
                case "10":
                    if (user.isLibrarian()) {
                        iview = new DisplayCheckedOutMovieList(library, inputOutput);
                        iview.show();
                    } else
                        inputOutput.show("invalid option");
                    break;
                default:
                    inputOutput.show("invalid option");
                    break;
            }
        }
    }
}


