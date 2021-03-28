package com.conductor.conductorproject.payment.controller;

import com.conductor.conductorproject.payment.api.PaymentApi;
import com.conductor.conductorproject.payment.model.Payment;
import com.conductor.conductorproject.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Controller
public class PaymentController implements PaymentApi {

    @Autowired
    PaymentService service;

    @Override
    public ResponseEntity<Void> postPayment(@Valid Payment body, @NotNull @Valid Long orderId) throws Exception {
        try {
            service.postPayment(body, orderId);
            return new ResponseEntity<Void>(HttpStatus.CREATED);
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
