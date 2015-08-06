package com.twu.biblioteca.newview;

import com.twu.biblioteca.InputOutput;
import com.twu.biblioteca.User;
import com.twu.biblioteca.view.DisplayUserProfile;

import static javafx.beans.binding.Bindings.when;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;

public class DisplayUserProfileViewTest {
    public void returnsTheProfile() {
        InputOutput inputOutput = mock(InputOutput.class);
        User user1 = mock(User.class);
        DisplayUserProfile displayUserProfile = new DisplayUserProfile(inputOutput, user1);
        //when(user1).thenReturn(anyString());

    }
}
