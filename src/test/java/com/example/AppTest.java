package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void testAddition() {
        assertEquals(4, App.add(2, 2));
    }

    @Test
    void testApplicationName() {
        assertEquals("Online Shopping Website", App.getApplicationName());
    }
}
