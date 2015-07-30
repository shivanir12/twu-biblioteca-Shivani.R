package com.twu.biblioteca;

public class Book {


    private int book_no;
    private String name;
    private String author;
    private String year_published;
    private String accessibility;

    public void Book(int book_no, String name, String author, String year_published, String accessibility){

        this.book_no = book_no;
        this.name = name;
        this.author = author;
        this.year_published = year_published;
        this.accessibility = accessibility;
    }

}
