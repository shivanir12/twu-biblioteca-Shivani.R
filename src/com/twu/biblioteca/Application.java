package com.twu.biblioteca;

import java.util.HashMap;
import java.util.*;

import static java.lang.System.exit;

public class Application {

    private final View view;

    public Application(View view) {
        this.view = view;
    }

    public void showWelcomeMessage() {
        view.show("WELCOME TO BIBLIOTECA");
    }

    public ArrayList<HashMap<String, String>> listOfBooks() {
        HashMap<String, String> book1 = new HashMap<>();
        book1.put("Name Of Book", "Head First Java");
        book1.put("Author", "Sierra");
        book1.put("Year Published", "1950");

        HashMap<String, String> book2 = new HashMap<>();
        book2.put("Name Of Book", "WWW");
        book2.put("Author", "Robert");
        book2.put("Year Published", "1947");

        ArrayList<HashMap<String, String>> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        return bookList;
    }

    public void displayList(ArrayList<HashMap<String, String>> bookList) {

        for (HashMap<String, String> book : bookList) {
            String bookDetail = book.get("Name Of Book") + "\t" + book.get("Author") + "\t" + book.get("Year Published");
            view.show(bookDetail);
        }

    }

    public void displayMainMenu(){
        view.show("Main Menu");
        view.show("Enter 1 to display list of books");
        view.show("Enter 2 to exit");
        Scanner input = new Scanner(System.in);
        while(true) {
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    ArrayList<HashMap<String, String>> bookList = listOfBooks();
                    displayList(bookList);
                    break;
                case 2:
                    System.exit(0);
                default:
                    view.show("Enter a valid option");
            }
        }

    }

}
