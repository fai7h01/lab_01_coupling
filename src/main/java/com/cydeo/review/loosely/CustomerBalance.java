package com.cydeo.review.loosely;

import java.math.BigDecimal;
import java.util.UUID;

public class CustomerBalance extends Balance{

    public CustomerBalance(UUID userId, BigDecimal amount) {
        super(userId, amount);
    }

    @Override
    public void addBalance(BigDecimal amount) {
        setAmount(getAmount().add(amount));
    }
}
