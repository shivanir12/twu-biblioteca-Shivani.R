package com.twu.biblioteca;

import com.twu.biblioteca.View.InputOutput;
import com.twu.biblioteca.View.UserMenuView;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ControllerTest {

    @Test
    public void foo() {
        InputOutput inputOutput = mock(InputOutput.class);
        Library library = mock(Library.class);
        DisplayList displayList = mock(DisplayList.class);
        UserMenuView userMenuView = new UserMenuView();
        Controller controller = new Controller(inputOutput, library, userMenuView);

        controller.dispatch("1");

        verify(displayList).show(library, inputOutput,userMenuView);
    }
}
