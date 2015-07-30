package com.twu.biblioteca;

import java.util.ArrayList;

public class Library {
    private final View view;
    ArrayList<Book> bookList;

    public Library(View view, ArrayList<Book> bookList) {
        this.view = view;
        this.bookList = bookList;
    }


    public void displayListOf() {
        String headerOfBookList = String.format("%-20s%-20s%-20s%-20s%-20s", "Book No", "Name Of Book", "Author", "Year Published", "Accessibility");
        view.show(headerOfBookList);
        view.show("============================================================================================================");

        for (Book book : bookList) {
            String isAccessible = book.getAccessibility();
            if (isAccessible == "accessibility") {
                String bookDetails = String.format("%-20s%-20s%-20s%-20s%-20s", book.getBookNo(), book.getBookName(),
                        book.getAuthor(), book.getYearOfPublication(), book.getAccessibility());
                view.show(bookDetails);
            }
        }

    }

    public void checkoutBook(String input) {
        int flag = 0;
        for (Book book : bookList) {
            if (book.checkIfBookIsAvailable(input)) {
                view.show("Thank U!!! enjoy the book");
                flag = 1;
            }
        }
        if (flag == 0)
            view.show("Book is not available");
    }

    public void checkInBook(String input) {
        int flag = 0;
        for (Book book : bookList) {
            if (book.checkIfBookIsAvailable(input)) {
                view.show("Thank you for returning the book");
                flag = 1;
            }
        }
        if (flag == 0)
            view.show("This is not a valid book to return");
    }
}


