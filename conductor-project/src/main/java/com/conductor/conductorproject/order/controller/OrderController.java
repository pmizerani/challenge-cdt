package com.conductor.conductorproject.order.controller;

import com.conductor.conductorproject.order.api.OrderApi;
import com.conductor.conductorproject.order.model.CompleOrder;
import com.conductor.conductorproject.order.model.Orders;
import com.conductor.conductorproject.order.service.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@RestController
public class OrderController implements OrderApi {

    @Autowired
    private OrderServiceImpl service;

    @Override
    public ResponseEntity<Orders> getOrder(@NotNull @Valid Long orderId) {
        Orders result;
        try {
            result = service.getOrder(orderId);
            return new ResponseEntity<Orders>(result, HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<Orders>(result = null, HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public ResponseEntity<Void> postOrder(@Valid CompleOrder body) {
        try {
            service.postOrder(body);
            return new ResponseEntity<Void>(HttpStatus.CREATED);
        } catch (Exception e){
            return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
        }
    }
}
