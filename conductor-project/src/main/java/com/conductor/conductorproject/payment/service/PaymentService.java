package com.conductor.conductorproject.payment.service;

import com.conductor.conductorproject.payment.model.Payment;

public interface PaymentService {

    void postPayment(Payment body, Long orderId);

}
