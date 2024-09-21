package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testGetGreeting() {
        App app = new App();
        String expected = "Hello World!";
        String actual = app.getGreeting();
        assertEquals(expected, actual, "The greeting message should be 'Hello World!'");
    }

    @Test
    void testRemindPersonalDeadlines() {
        App app = new App();
        String name = "John";
        String expected = "1 saata deadlinedir, John!";
        String actual = app.remindPersonalDeadlines(name);
        assertEquals(expected, actual, "The personal deadline reminder should include the correct name and message.");
    }
}
