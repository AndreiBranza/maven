package com.andrei.personal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void getHello() {
        Main main = new Main();

        assertEquals("Hello world!", main.getHello());
    }
}