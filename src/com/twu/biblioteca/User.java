package com.twu.biblioteca;

public class User {

    private String userName;
    private String password;
    private final String name;
    private final String email;
    private final String phNo;
    private final String role;

    public User(String userName, String password, String name, String email, String phNo, String role) {

        this.userName = userName;
        this.password = password;
        this.name = name;
        this.email = email;
        this.phNo = phNo;
        this.role = role;
    }


    public boolean checkValidity(String thatUserName,String thatPassword) {

        if (userName.equals(thatUserName) && password.equals(thatPassword)) {
            return true;
        } else {
            return false;
        }
    }
}
