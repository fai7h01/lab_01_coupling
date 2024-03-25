package com.cydeo.loosely;

import java.math.BigDecimal;

public interface BalanceService {

    boolean checkout(Balance balance, BigDecimal amount);

}
