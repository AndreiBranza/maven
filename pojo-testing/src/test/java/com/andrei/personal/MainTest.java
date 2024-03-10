package com.andrei.personal;

public class MainTest {

    public void testGetHello() {
        Main mainClass = new Main();

        assert("Hello world!".equals(mainClass.getHello()));
    }
}