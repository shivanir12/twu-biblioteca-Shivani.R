package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    ArrayList<HashMap<String, String>> bookList;

    public static void main(String[] args) {
        View view = new View();
        Application application = new Application(view);
        application.showWelcomeMessage();
        //ArrayList<HashMap<String, String>> bookList = application.listOfBooks();
       // application.displayList(bookList);
        application.displayMainMenu();
    }
}