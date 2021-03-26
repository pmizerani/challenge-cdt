package com.conductor.conductorproject.controller;

import com.conductor.conductorproject.api.OrderApi;
import com.conductor.conductorproject.models.Order;
import com.conductor.conductorproject.service.api.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import javax.validation.Valid;

@Controller
public class OrderController implements OrderApi {

    @Autowired
    OrderService service;

    @Override
    public ResponseEntity<Order> getOrder(@Valid Integer orderId) {
        Order result;
        try {
            result = service.getOrder(orderId);
            return new ResponseEntity<Order>(result, HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity(e, HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public ResponseEntity<Order> postOrder(@Valid Order body) {
        Order result;

        try {
            result = service.postOrder(body);
            return new ResponseEntity<Order>(result, HttpStatus.CREATED);
        } catch (Exception e){
            return new ResponseEntity(e, HttpStatus.BAD_REQUEST);
        }
    }
}
