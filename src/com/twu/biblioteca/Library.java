package com.twu.biblioteca;

import java.util.ArrayList;


//Library class can display list of books, checkin and checkout books
public class Library {
    private final InputOutput view;
    ArrayList<Book> availableBookList;

    public Library(InputOutput view, ArrayList<Book> bookList) {
        this.view = view;
        this.availableBookList = bookList;
    }

    public void displayHeader() {
        String headerOfBookList = String.format("%-20s%-20s%-20s", "Name Of Book", "Author", "Year Published");
        view.show(headerOfBookList);
        view.show("=========================================================================================");

    }

    public void displayListOf() {
        for (Book book : availableBookList) {
                String bookDetails = String.format("%-20s%-20s%s", book.getBookName(),
                        book.getAuthor(), book.getYearOfPublication());
                view.show(bookDetails);
            }
        }

    }

    /*public void checkoutBook(String input) {
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
            if (book.returnBook(input)) {
                view.show("Thank you for returning the book");
                flag = 1;
            }
        }
        if (flag == 0)
            view.show("This is not a valid book to return");
    }*/


