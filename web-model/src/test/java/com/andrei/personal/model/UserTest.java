package com.andrei.personal.model;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserTest {

    @Test
    void getFirstName() {
        User user = new User();
        user.setFirstName("james");

        assertEquals("james", user.getFirstName());
    }

}