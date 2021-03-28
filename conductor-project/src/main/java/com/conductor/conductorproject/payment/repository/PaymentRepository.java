package com.conductor.conductorproject.payment.repository;

public interface PaymentRepository {

//    @Procedure
//    String sp_payment(String creditCardNum, Long orderId, String output);

    String postPayment(String creditCardNum, Long orderId);

}
