package com.cydeo.my_solution.loosely;

import java.math.BigDecimal;

public interface BalanceService {

    boolean checkout(Balance balance, BigDecimal amount);

}
