package com.andrei.personal.mavenproject.controllers;

import com.andrei.personal.json.model.ShippingAddress;
import com.andrei.personal.model.User;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    public ShippingAddress getShippingAddress() {

        return new ShippingAddress();
    }

    public User getUser() {
        return new User();
    }
}
