package com.twu.biblioteca;

public class User {

    private final String userName;
    private final String password;

    public User(String userName, String password) {

        this.userName = userName;
        this.password = password;
    }


    public boolean checkValidity(String userCredentials) {
        String thatUserName = userCredentials.split(" ")[0];
        String thatPassword = userCredentials.split(" ")[1];

        if (this.userName.equals(thatUserName) && this.password.equals(thatPassword)) {
            return true;
        } else {
            return false;
        }
    }
}
