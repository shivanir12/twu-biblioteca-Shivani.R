package com.twu.biblioteca.Model;

public class User {

    private String userId;
    private String password;
    private final String name;
    private final String email;
    private final String phNo;
    private final String role;

    public String getPhNo() {
        return phNo;
    }

    public String getEmail() {

        return email;
    }

    public String getName() {

        return name;
    }

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


    public boolean checkValidity(String thatUserName,String thatPassword) {

        if (userId.equals(thatUserName) && password.equals(thatPassword)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isLibrarian(){
        if(role.equals("librarian"))
            return true;
        else
        return false;
    }

    @Override
    public String toString() {
        String details = String.format("%-20s%-20s%-20s%-20s\n", userId,name,email,phNo);
        return details;
    }
}
