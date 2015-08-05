package com.twu.biblioteca;

public class User {

    private String userName;
    private String password;

    public User(String name, String shivani, String s1, String s, String userName, String password) {

        this.userName = userName;
        this.password = password;
    }


    public boolean checkValidity(String thatUserName,String thatPassword) {

        if (userName.equals(thatUserName) && password.equals(thatPassword)) {
            return true;
        } else {
            return false;
        }
    }
}
