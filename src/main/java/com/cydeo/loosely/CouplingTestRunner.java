package com.cydeo.loosely;

import java.math.BigDecimal;
import java.util.UUID;

public class CouplingTestRunner {
    public static void main(String[] args) {

        UUID userId = UUID.randomUUID();

        Balance customerBalance = new CustomerBalance(userId, BigDecimal.ZERO);
        Balance giftCardBalance = new GiftCardBalance(userId, BigDecimal.ZERO);

        BalanceService balanceService = new BalanceServiceImpl();

        customerBalance.addBalance(new BigDecimal(100));
        giftCardBalance.addBalance(new BigDecimal(100));


        System.out.println("-----------Customer Balance-----------");
        System.out.println("customerBalance = " + customerBalance.getAmount());
        System.out.println(balanceService.checkout(customerBalance, BigDecimal.valueOf(100)));
        System.out.println("customerBalance = " + customerBalance.getAmount());

        System.out.println("-----------Gift Card Balance-----------");
        System.out.println("giftCardBalance = " + giftCardBalance.getAmount());
        System.out.println(balanceService.checkout(giftCardBalance, BigDecimal.valueOf(150)));
        System.out.println("giftCardBalance = " + giftCardBalance.getAmount());

    }
}
