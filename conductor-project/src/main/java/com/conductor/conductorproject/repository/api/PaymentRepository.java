package com.conductor.conductorproject.repository.api;

import com.conductor.conductorproject.models.Payment;

public interface PaymentRepository {

    String postPayment(String creditCardNum, Integer orderId);

}
