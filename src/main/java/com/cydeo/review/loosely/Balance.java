package com.cydeo.review.loosely;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@AllArgsConstructor
public abstract class Balance {

    private UUID userId;
    private BigDecimal amount;

    public abstract void addBalance(BigDecimal amount);
}
