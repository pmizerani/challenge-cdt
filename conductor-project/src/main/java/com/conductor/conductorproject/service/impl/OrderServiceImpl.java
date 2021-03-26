package com.conductor.conductorproject.service.impl;

import com.conductor.conductorproject.models.CompleOrder;
import com.conductor.conductorproject.models.Orders;
import com.conductor.conductorproject.models.OrderItem;
import com.conductor.conductorproject.repository.api.OrderItemRepository;
import com.conductor.conductorproject.repository.api.OrderRepository;
import com.conductor.conductorproject.service.api.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository repository;

    @Autowired
    OrderItemRepository repository2;

    @Override
    public Orders getOrder(Long orderId) {
        return repository.findOrderById(orderId);
    }

    @Override
    public Orders postOrder(CompleOrder body) {
        Orders newOrder = repository.save(body.getOrders());
        List<OrderItem> itemsList = body.getOrderItem();
        double totalAmountPerItem = 0.0;
        for(OrderItem item : itemsList){
            item.setOrderId(newOrder.getOrderId());
            repository2.save(item);
            totalAmountPerItem += item.getQuantity() * item.getUnitPrice().doubleValue();
        }
        newOrder.setTotal(BigDecimal.valueOf(totalAmountPerItem));
        newOrder = repository.save(newOrder);
        return newOrder;
    }


    @Override
    public void updateOrders(double total, Long orderId) {
        repository.updateOrders(total, orderId);
    }
}
