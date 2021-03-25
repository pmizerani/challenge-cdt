package com.conductor.conductorproject.controller;

import com.conductor.conductorproject.api.PaymentApi;
import com.conductor.conductorproject.models.Payment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@RestController
public class PaymentController implements PaymentApi {
    @Override
    public ResponseEntity<Void> paymentPost(@Valid Payment body, @NotNull @Valid String orderId) {
        return null;
    }
}
