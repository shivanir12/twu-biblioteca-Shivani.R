package com.twu.biblioteca;


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

    /*public boolean hasTitle(){
        return bookName.equals();
    }

    /*boolean checkIfBookIsAvailable(String input) {
        if (bookName.equals(input)) {
            return true;
        } else
            return false;
    }*/

    /*boolean returnBook(String input) {
        if (bookNo.equals(input) && accessibility == "not accessible") {
            accessibility = "accessible";
            return true;
        } else
            return false;
    }*/
}
