package com.conductor.conductorproject.service.impl;

import com.conductor.conductorproject.models.Payment;
import com.conductor.conductorproject.repository.api.PaymentRepository;
import com.conductor.conductorproject.service.api.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    PaymentRepository repository;

    @Override
    public void postPayment(Payment body, String orderId) {

    }
}
