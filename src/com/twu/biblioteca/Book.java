package com.twu.biblioteca;

public class Book {

    private final String bookNo;
    private final String bookName;
    private final String author;
    private final String yearOfPublication;
    private String accessibility;

    public Book(String bookNo, String bookName, String author, String yearOfPublication, String accessibility){

        this.bookNo = bookNo;
        this.bookName = bookName;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.accessibility = accessibility;
    }

    public String getAccessibility() {
        return accessibility;
    }

    public String getYearOfPublication() {

        return yearOfPublication;
    }

    public String getAuthor() {

        return author;
    }

    public String getBookName() {

        return bookName;
    }

    public String getBookNo() {

        return bookNo;
    }
    boolean checkIfBookIsAvailable(String input) {
        if(bookNo.equals(input) && accessibility == "accessibility") {
            accessibility = "not accessible";
            return true;
        }
        else
            return false;
    }

    boolean returnBook(String input) {
        if(bookNo.equals(input) && accessibility == "not accessible") {
            accessibility = "accessibility";
            return true;
        }
        else
            return false;
    }
}
