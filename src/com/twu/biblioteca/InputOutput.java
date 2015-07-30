package com.twu.biblioteca;


import java.util.Scanner;

public class InputOutput {

    Scanner input = new Scanner(System.in);

    public void show(String message) {
        System.out.println(message);
    }

    public int getIntegerInput(){
        int integerInput = input.nextInt();
        return integerInput;
    }

    public String getStringInput(){
        String stringInput = input.next();
        return stringInput;
    }
}
