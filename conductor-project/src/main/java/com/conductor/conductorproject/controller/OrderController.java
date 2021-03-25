package com.conductor.conductorproject.controller;

import com.conductor.conductorproject.api.OrderApi;
import com.conductor.conductorproject.models.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class OrderController implements OrderApi {

    @Override
    public ResponseEntity<Order> getOrder(@Valid Order body) {
        return null;
    }

    @Override
    public ResponseEntity<Order> postOrder(@Valid Order body) {
        return null;
    }
}
