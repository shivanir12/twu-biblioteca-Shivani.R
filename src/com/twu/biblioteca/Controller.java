package com.twu.biblioteca;


//Accepts the choice and calls the associated methods
public class Controller {

    private InputOutput view;
    private Library library;
    private Application application;

    public Controller(InputOutput view, Library library, Application application) {

        this.view = view;
        this.library = library;
        this.application = application;
    }

    public void dispatch() {
        while (true) {
            LibraryOperation libraryOperation;
            String bookName = "";
            application.displayMainMenu();
            String choice = view.getStringInput();
            if (choice.equals("1")) {
                libraryOperation = new DisplayList();
                String list = libraryOperation.display(library);
                view.displayBookList(list);
            }
            else if (choice.equals("2")) {
                libraryOperation = new CheckOut();
                view.show("Enter the name of the book to checkout");
                bookName = view.getStringInput();
                if (libraryOperation.execute(library, bookName))
                    view.show("Thank you!! Enjoy the book");
                else
                    view.show("That Book is not available");
            }
            else if (choice.equals("3")) {

                libraryOperation = new CheckIn();
                view.show("Enter the name of the book to return");
                bookName = view.getStringInput();
                if (libraryOperation.execute(library, bookName))
                    view.show("Thank you for returning the book");
                else
                    view.show("This is not a valid book to return");
            }
            else if (choice.equals("4")) {
                libraryOperation = new Quit();
                libraryOperation.execute(library, bookName);
            }
            else if (choice.equals("5")) {
                libraryOperation = new DisplayMovieList();
                String movieList = libraryOperation.display(library);
                view.displayMovieList(movieList);
            }
            else if (choice.equals("6")) {

                libraryOperation = new CheckOutMovie();
                view.show("Enter the name of the Movie to checkout");
                bookName = view.getStringInput();
                if (libraryOperation.execute(library, bookName))
                    view.show("Thank you!! Enjoy the Movie");
                else
                    view.show("That Movie is not available");
            }
            else if(choice.equals("7")){
                libraryOperation = new CheckInMovie();
                view.show("Enter the name of the Movie to return");
                bookName = view.getStringInput();
                if (libraryOperation.execute(library, bookName))
                    view.show("Thank you for returning the movie");
                else
                    view.show("That is not a valid Movie to return");
            }
            else {
                view.show("Enter a valid option");
            }
        }
    }
}
