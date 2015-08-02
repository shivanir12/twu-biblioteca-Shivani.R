package com.twu.biblioteca;

import java.util.Scanner;


//Accepts the input and output
public class InputOutput {

    Scanner input = new Scanner(System.in);

    public void show(String message) {
        System.out.println(message);
    }

    public int getIntegerInput() {
        int integerInput = input.nextInt();
        return integerInput;
    }

    public String getStringInput() {
        String stringInput = input.next();
        return stringInput;
    }

    public void displayBookList(String list){
        System.out.println();
        System.out.println();
        System.out.format("%-20s%-20s%-20s", "Name Of Book", "Author", "Year Published");
        System.out.println();
        System.out.println("=========================================================================================");
        System.out.println(list);
    }
}
