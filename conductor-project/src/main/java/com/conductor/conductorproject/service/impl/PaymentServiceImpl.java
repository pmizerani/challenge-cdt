package com.conductor.conductorproject.service.impl;

import com.conductor.conductorproject.models.Payment;
import com.conductor.conductorproject.repository.impl.PaymentRepositoryImpl;
import com.conductor.conductorproject.service.api.PaymentService;
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
