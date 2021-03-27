package com.conductor.conductorproject.repository.api;

import com.conductor.conductorproject.models.Payment;
import org.springframework.data.jpa.repository.query.Procedure;

public interface PaymentRepository {

//    @Procedure
//    String sp_payment(String creditCardNum, Long orderId, String output);

    String postPayment(String creditCardNum, Long orderId);

}
