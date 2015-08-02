package com.twu.biblioteca;

import java.util.ArrayList;


//Library class can display list of books, checkin and checkout books
public class Library {
    ArrayList<Book> availableBookList;
    private ArrayList<Book> checkOutBookList;

    public Library(ArrayList<Book> bookList, ArrayList<Book> checkOutBookList) {
        this.availableBookList = bookList;
        this.checkOutBookList = checkOutBookList;
    }


    public String getListFromLibrary() {
        String bookDetails = "";
        for (Book book : availableBookList) {
             bookDetails += String.format("%-20s%-20s%s\n", book.getBookName(),
                    book.getAuthor(), book.getYearOfPublication());
        }
        return bookDetails;
    }

    private Book searchForBookInTheList(String name,ArrayList<Book> bookList){
        for(Book book : bookList){
            if(book.hasTitle(name))
                return book;
        }
        return null;
    }

    public boolean checkoutBook(String bookName) {
        Book book = searchForBookInTheList(bookName, availableBookList);
        if ((book == null)) {
            return false;
        } else {
            updateBookListAfterCheckOut(book);
            return true;
        }
    }

    private void updateBookListAfterCheckOut(Book book) {
        checkOutBookList.add(book);
        availableBookList.remove(book);
    }

    public boolean checkInBook(String bookName) {
        Book book = searchForBookInTheList(bookName, checkOutBookList);
        if(!(book == null)){
            updateBookListAfterCheckIn(book);
            return true;
        }
        return false;
    }

    private void updateBookListAfterCheckIn(Book book) {
        availableBookList.add(book);
        checkOutBookList.remove(book);
    }
}


