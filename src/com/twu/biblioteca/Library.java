package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private final View view;

    public Library(View view) {
        this.view = view;
    }

    public ArrayList<HashMap<String, String>> loadBooksToLibrary() {
        HashMap<String, String> book1 = new HashMap<>();
        book1.put("Book No", "1");
        book1.put("Name Of Book", "Head First Java");
        book1.put("Author", "Sierra");
        book1.put("Year Published", "1950");
        book1.put("Accessibility", "Accessible");

        HashMap<String, String> book2 = new HashMap<>();
        book2.put("Book No", "2");
        book2.put("Name Of Book", "WWW");
        book2.put("Author", "Robert");
        book2.put("Year Published", "1947");
        book2.put("Accessibility", "Accessible");

        ArrayList<HashMap<String, String>> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        return bookList;
    }

    public void displayListOf(ArrayList<HashMap<String, String>> bookList) {
        String headerOfBookList = String.format("%-20s%-20s%-20s%-20s%-20s", "Book No", "Name Of Book", "Author", "Year Published", "Accessibility");
        view.show(headerOfBookList);
        view.show("============================================================================================================");

        for (HashMap<String, String> book : bookList) {
            String bookDetails = String.format("%-20s%-20s%-20s%-20s%-20s", book.get("Book No"),
                    book.get("Name Of Book"), book.get("Author"), book.get("Year Published"), book.get("Accessibility"));
            view.show(bookDetails);
        }

    }
}
