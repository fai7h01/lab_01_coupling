package com.cydeo.review.loosely;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.UUID;


public class GiftCardBalance extends Balance{

    public GiftCardBalance(UUID userId, BigDecimal amount) {
        super(userId, amount);
    }

    @Override
    public void addBalance(BigDecimal amount) {
        BigDecimal bonusAmount = amount.multiply(new BigDecimal("0.1"), MathContext.DECIMAL64);
        setAmount(getAmount().add(amount).add(bonusAmount));
    }
}
