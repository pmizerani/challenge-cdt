package com.conductor.conductorproject.order.repository;

import com.conductor.conductorproject.order.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {

}
