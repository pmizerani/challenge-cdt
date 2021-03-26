package com.conductor.conductorproject.service.api;

import com.conductor.conductorproject.models.CompleOrder;
import com.conductor.conductorproject.models.Orders;

import java.math.BigDecimal;

public interface OrderService {

    Orders getOrder(Long orderId);

    Orders postOrder(CompleOrder body);

    void updateOrders(double total, Long orderId);
}
