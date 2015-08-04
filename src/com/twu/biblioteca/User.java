package com.twu.biblioteca;

public class User {

    private final String userName;
    private final String password;

    public User(String userName, String password) {

        this.userName = userName;
        this.password = password;
    }


    public boolean checkValidity(String userCredentials) {
        if (this.userName == userName && this.password == password) {
            return true;
        }
        return false;
    }
}
