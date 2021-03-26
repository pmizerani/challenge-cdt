package com.conductor.conductorproject.repository.api;

import com.conductor.conductorproject.models.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigDecimal;

public interface OrderRepository extends JpaRepository<Orders, Long> {

    Orders findOrderById(Long id);

    @Query(" update Orders " +
            " set total = ?1 " +
            " where id = ?2 ")
    Orders updateOrders(double total, Long id);

}
