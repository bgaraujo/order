package com.home.order.controller.cart;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Cart implements CartEndpoint{
    @Override
    public ResponseEntity createCard() {
        return null;
    }
}
