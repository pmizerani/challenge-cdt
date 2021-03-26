package com.conductor.conductorproject.service.api;

import com.conductor.conductorproject.models.Payment;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public interface PaymentService {

    void postPayment(Payment body, String orderId);

}
