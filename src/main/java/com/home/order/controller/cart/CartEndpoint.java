package com.home.order.controller.cart;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/cart")
public interface CartEndpoint {

    @PostMapping
    ResponseEntity createCard();
}
