package com.conductor.conductorproject.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class CompleOrder {

    Orders orders;
    List<OrderItem> orderItem;
}
