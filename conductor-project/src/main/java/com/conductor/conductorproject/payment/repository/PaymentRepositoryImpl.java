package com.conductor.conductorproject.payment.repository;

import com.conductor.conductorproject.payment.repository.PaymentRepository;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Types;
import java.util.Map;

@Repository
public class PaymentRepositoryImpl extends StoredProcedure implements PaymentRepository {

    public static final String PAYMENT = "sp_payment";

    public PaymentRepositoryImpl(DataSource ds){
        super(ds,PAYMENT);
        declareParameter(new SqlParameter("credit_card", Types.NVARCHAR));
        declareParameter(new SqlParameter("order_id", Types.BIGINT));
        declareParameter(new SqlOutParameter("result", Types.NVARCHAR));
        compile();
    }

    @Override
    public String postPayment(String creditCardNum, Long orderId) {
        Map<String, Object> out = super.execute(creditCardNum,orderId);
        return (String) out.get("result");
    }
}
