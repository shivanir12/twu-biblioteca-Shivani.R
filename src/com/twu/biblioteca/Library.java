package com.twu.biblioteca;

import java.util.ArrayList;


//Library class can display list of books, checkin and checkout books
public class Library {
    ArrayList<Book> availableBookList;
    private ArrayList<Book> checkoutBookList;

    public Library(ArrayList<Book> bookList, ArrayList<Book> checkoutBookList) {
        this.availableBookList = bookList;
        this.checkoutBookList = checkoutBookList;
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

    public boolean checkoutBook(String name) {
        Book book = searchForBookInTheList(name, availableBookList);
        if(!(book == null)){
            updateBookListAfterCheckOut(book);
            return true;
        }
        return false;
    }

    private void updateBookListAfterCheckOut(Book book) {
        checkoutBookList.add(book);
        availableBookList.remove(book);
    }
}


