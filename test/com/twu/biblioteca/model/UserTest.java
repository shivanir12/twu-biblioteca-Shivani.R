package com.twu.biblioteca.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class UserTest {
    @Test
    public void returnsTrueForValidUser() {
        User user1 = new User("#12-1000", "shivani", "Shivani R", "shivanir@gmail.com", "9481816385", "customer");
        boolean validUser = user1.checkValidity("#12-1000", "shivani");
        assertEquals(true, validUser);
    }

    @Test
    public void returnsFalseForInvalidUser() {
        User user1 = new User("#12-1000", "shivani", "Shivani R", "shivanir@gmail.com", "9481816385", "customer");
        boolean validUser = user1.checkValidity("#12-2000", "shivani");
        assertEquals(false, validUser);
    }

    @Test
    public void returnsTheUserDetails() {
        User user1 = new User("#12-1000", "shivani", "Shivani R", "shivanir@gmail.com", "9481816385", "customer");
        String result = user1.toString();
        assertEquals(result, "#12-1000            Shivani R           shivanir@gmail.com  9481816385          \n");
    }

    @Test
    public void returnsTrueIfTheUserIsLibrarian() {
        User user1 = new User("#12-1000", "shivani", "Shivani R", "shivanir@gmail.com", "9481816385", "librarian");
        assertEquals(true, user1.isLibrarian());

    }

    @Test
    public void returnsFalseIfTheUserIsLibrarian() {
        User user1 = new User("#12-1000", "shivani", "Shivani R", "shivanir@gmail.com", "9481816385", "customer");
        assertEquals(false, user1.isLibrarian());
    }
}
