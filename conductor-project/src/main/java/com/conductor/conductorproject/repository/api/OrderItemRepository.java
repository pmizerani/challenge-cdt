package com.conductor.conductorproject.repository.api;

import com.conductor.conductorproject.models.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {

}
