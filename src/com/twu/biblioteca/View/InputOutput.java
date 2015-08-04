package com.twu.biblioteca.View;

import java.util.Scanner;


//Accepts the input and output
public class InputOutput {

    Scanner input = new Scanner(System.in);

    public void show(String message) {
        System.out.println(message);
    }

    public int getIntegerInput() {
        return input.nextInt();
    }

    public String getStringInput() {
        return input.nextLine();
    }

    public void displayBookList(String list){
        System.out.println();
        System.out.println();
        System.out.format("%-20s%-20s%-20s", "Name Of Book", "Author", "Year Published");
        System.out.println();
        System.out.println("=========================================================================================");
        System.out.println(list);
    }
    public void displayMovieList(String list){
        System.out.println();
        System.out.println();
        System.out.format("%-20s%-20s%-20s%-20s", "Name Of Movie", "Year", "Director", "Rating");
        System.out.println();
        System.out.println("=========================================================================================");
        System.out.println(list);
    }
}
