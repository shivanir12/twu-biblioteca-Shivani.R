package com.twu.biblioteca;

import java.util.ArrayList;


//Library class can display list of books, checkin and checkout books
public class Library implements LibraryOperation {
    private final InputOutput view;
    ArrayList<Book> availableBookList;

    public Library(InputOutput view, ArrayList<Book> bookList) {
        this.view = view;
        this.availableBookList = bookList;
    }
    public void execute(){
        displayHeader();
        displayListOf();
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


