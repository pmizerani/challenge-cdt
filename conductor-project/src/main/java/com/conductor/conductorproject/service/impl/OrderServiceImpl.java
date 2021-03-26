package com.conductor.conductorproject.service.impl;

import com.conductor.conductorproject.models.Order;
import com.conductor.conductorproject.repository.api.OrderRepository;
import com.conductor.conductorproject.service.api.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository repository;

    @Override
    public Order getOrder(Integer orderId) {
        return repository.findOrderById(orderId);
    }

    @Override
    public Order postOrder(Order body) {
        return repository.save(body);
    }
}
