package com.twu.biblioteca.Model;


public class User {

    private String userId;
    private String password;
    private final String name;
    private final String email;
    private final String phNo;
    private final String role;

    public String getUserId() {
        return userId;
    }

    public User(String userId, String password, String name, String email, String phNo, String role) {
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.email = email;

        this.phNo = phNo;
        this.role = role;
    }


    public boolean checkValidity(String thatUserName, String thatPassword) {
        return userId.equals(thatUserName) && password.equals(thatPassword);
    }

    public boolean isLibrarian() {
        return role.equals("librarian");
    }

    @Override
    public String toString() {
        return String.format("%-20s%-20s%-20s%-20s\n", userId, name, email, phNo);
    }
}
