package com.cydeo.my_solution.loosely;

import java.math.BigDecimal;

public class BalanceServiceImpl implements BalanceService{

    @Override
    public boolean checkout(Balance balance, BigDecimal amount) {
        BigDecimal balanceAmount = balance.getAmount();
        if (balanceAmount.subtract(amount).compareTo(BigDecimal.ZERO) >= 0){
            balance.setAmount(balanceAmount.subtract(amount));
            return true;
        }
        return false;
    }
}
