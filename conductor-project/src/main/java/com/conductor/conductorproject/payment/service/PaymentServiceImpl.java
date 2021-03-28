package com.conductor.conductorproject.payment.service;

import com.conductor.conductorproject.payment.model.Payment;
import com.conductor.conductorproject.payment.repository.PaymentRepositoryImpl;
import com.conductor.conductorproject.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    PaymentRepositoryImpl repository;

    @Override
    public void postPayment(Payment body, Long orderId) {
        String creditCardNum = body.getCreditCardNum();
        repository.postPayment(creditCardNum,orderId);

    }
}
