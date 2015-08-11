package com.twu.biblioteca.model;


//represents the book entity and checks for the availability of book.
public class Book {

    private final String bookName;
    private final String author;
    private final String yearOfPublication;

    public Book(String bookName, String author, String yearOfPublication) {

        this.bookName = bookName;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
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

    public boolean hasTitle(String name) {
        return bookName.equalsIgnoreCase(name);
    }
}
