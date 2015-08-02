package com.twu.biblioteca;

public interface LibraryOperation {
    boolean execute(Library library, String bookName);
    String display(Library library);
}
