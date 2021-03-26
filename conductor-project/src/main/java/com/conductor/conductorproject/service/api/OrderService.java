package com.conductor.conductorproject.service.api;

import com.conductor.conductorproject.models.Order;

import javax.validation.Valid;

public interface OrderService {

    Order getOrder(Integer orderId);

    Order postOrder(Order body);
}
