package com.conductor.conductorproject.order.repository;

import com.conductor.conductorproject.order.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface OrderRepository extends JpaRepository<Orders, Long> {

    Orders findOrderById(Long id);

    @Query(" update Orders " +
            " set total = ?1 " +
            " where id = ?2 ")
    Orders updateOrders(double total, Long id);

}
