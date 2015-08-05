package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {
    @Test
    public void returnsTrueForValidUser() {
        User user1 = new User("#12-1000", "shivani", "Shivani R", "shivanir@gmail.com", "#12-1000", "shivani");
        boolean validUser = user1.checkValidity("#12-1000","shivani");
        assertEquals(true, validUser);
    }

    @Test
    public void returnsFalseForInvalidUser() {
        User user1 = new User("#12-1000", "shivani", "Shivani R", "shivanir@gmail.com", "#12-1000", "shivani");
        boolean validUser = user1.checkValidity("#12-2000","shivani");
        assertEquals(false, validUser);
    }
}
