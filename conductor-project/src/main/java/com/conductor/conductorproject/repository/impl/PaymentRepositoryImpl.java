package com.conductor.conductorproject.repository.impl;

import com.conductor.conductorproject.repository.api.PaymentRepository;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Map;

public class PaymentRepositoryImpl extends StoredProcedure implements PaymentRepository {

    public static final String PAYMENT = "doPayment";

    public PaymentRepositoryImpl(DataSource ds){
        super(ds,PAYMENT);
        declareParameter(new SqlParameter("credit_card", Types.NVARCHAR));
        declareParameter(new SqlParameter("order_id", Types.INTEGER));
        compile();
    }

    @Override
    public String postPayment(String creditCardNum, Long orderId) {
        Map<String, Object> result = super.execute(creditCardNum,orderId);

        return null;
    }
}
