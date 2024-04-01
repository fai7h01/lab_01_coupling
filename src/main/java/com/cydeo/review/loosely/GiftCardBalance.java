package com.cydeo.review.loosely;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.UUID;

@Getter
@Setter
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
