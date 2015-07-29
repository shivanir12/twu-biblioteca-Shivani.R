package com.twu.biblioteca;

import java.util.HashMap;
import java.util.*;


public class Application {

    private final View view;
    private final Library library;

    public Application(View view, Library library) {
        this.view = view;
        this.library = library;
    }

    public void showWelcomeMessage() {
        view.show("WELCOME TO BIBLIOTECA");
    }

    public void displayMainMenu(){
        view.show("--*Main Menu*--");
        view.show("================================");
        view.show("Enter 1 to display list of books");
        view.show("Enter 2 to exit");
        ArrayList<HashMap<String, String>> bookList = library.loadBooksToLibrary();
        try {
            Scanner input = new Scanner(System.in);
            while (true) {
                int choice = input.nextInt();
                switch (choice) {
                    case 1:
                        library.displayListOf(bookList);
                        break;
                    case 2:
                        System.exit(0);
                    default:
                        view.show("Enter a valid option");
                }
            }
        }
        catch(Exception e){
            view.show("error");
        }
    }

}
