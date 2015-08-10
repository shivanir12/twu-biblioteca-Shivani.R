package com.twu.biblioteca.LibraryOperationView;

import com.twu.biblioteca.io.InputOutput;
import com.twu.biblioteca.Model.User;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class DisplayUserProfileTest {
    @Test
    public void displaysTheUserDetails() {
        InputOutput inputOutput = mock(InputOutput.class);
        User user1 = mock(User.class);
        DisplayUserProfile displayUserProfile = new DisplayUserProfile(inputOutput, user1);

        displayUserProfile.display();
        verify(inputOutput).show(user1.toString());
    }
}
