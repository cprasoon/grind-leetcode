package org.example.shell;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testApp(){
        Assertions.assertTrue(new App().someLibraryMethod());
    }
}