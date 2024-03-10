package com.andrei.personal.mavenproject.controllers;

import com.andrei.personal.model.User;
import org.springframework.web.bind.annotation.RestController;
import com.andrei.personal.json.model.ShippingAddress;
@RestController
public class ExampleController {

    public ShippingAddress getShippingAddress() {

        return new ShippingAddress();
    }

    public User getUser() {
        return new User();
    }
}
