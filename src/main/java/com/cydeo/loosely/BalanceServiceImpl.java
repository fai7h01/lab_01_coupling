package com.cydeo.loosely;

import java.math.BigDecimal;

public class BalanceServiceImpl implements BalanceService{

    @Override
    public boolean checkout(Balance balance, BigDecimal amount) {
        BigDecimal cBalanceAmount = balance.getAmount();
        if (cBalanceAmount.subtract(amount).compareTo(BigDecimal.ZERO) >= 0){
            balance.setAmount(cBalanceAmount.subtract(amount));
            return true;
        }
        return false;
    }
}
