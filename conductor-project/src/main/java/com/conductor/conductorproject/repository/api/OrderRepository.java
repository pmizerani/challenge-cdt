package com.conductor.conductorproject.repository.api;

import com.conductor.conductorproject.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {

    Order findOrderById(Integer orderId);

    Order save(Order newOrder);

}
