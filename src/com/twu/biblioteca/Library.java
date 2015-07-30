package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private final View view;
    ArrayList<Book> bookList;

    public Library(View view, ArrayList<Book> bookList) {
        this.view = view;
        this.bookList = bookList;
    }


    public void displayListOf() {
        //String headerOfBookList = String.format("%-20s%-20s%-20s%-20s%-20s", "Book No", "Name Of Book", "Author", "Year Published", "Accessibility");
        //view.show(headerOfBookList);
        //view.show("============================================================================================================");

        for (Book book : bookList) {
            String bookDetails = String.format("%-20s%-20s%-20s%-20s%-20s", book.getBookNo(),book.getBookName(),
                    book.getAuthor(),book.getYearOfPublication(),book.getAccessibility());
            view.show(bookDetails);
        }

    }
}
