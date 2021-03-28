package com.conductor.conductorproject.order.service;

import com.conductor.conductorproject.order.model.CompleOrder;
import com.conductor.conductorproject.order.model.Orders;

public interface OrderService {

    Orders getOrder(Long orderId);

    Orders postOrder(CompleOrder body);
}
