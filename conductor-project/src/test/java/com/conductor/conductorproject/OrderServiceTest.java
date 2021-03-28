package com.conductor.conductorproject;

import com.conductor.conductorproject.order.model.Orders;
import com.conductor.conductorproject.order.repository.OrderRepository;
import com.conductor.conductorproject.order.service.OrderServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class OrderServiceTest {

    @Mock
    private OrderRepository repository;

    @InjectMocks
    private OrderServiceImpl service;

    @Test
    public void testGetOrder() {
        mockGetOrder();
        assertEquals(java.util.Optional.of(1L).get(), service.getOrder(1L).getOrderId());
    }

    private void mockGetOrder() {
        Orders order = new Orders();
        order.setOrderId(1L);
        when(this.repository.findOrderById(1L)).thenReturn(order);
    }

}
