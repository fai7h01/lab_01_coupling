package com.cydeo.review.loosely;

import java.math.BigDecimal;
import java.util.UUID;

public class CouplingTestRunner {
    public static void main(String[] args) {

        UUID customerID = UUID.randomUUID();

        Balance customerBalance = new CustomerBalance(customerID, BigDecimal.ZERO);
        Balance giftCardBalance = new GiftCardBalance(customerID, BigDecimal.ZERO);

        BalanceService balanceService = new BalanceService();

        customerBalance.addBalance(BigDecimal.valueOf(100));
        giftCardBalance.addBalance(BigDecimal.valueOf(100));

        System.out.println("CUSTOMER BALANCE");
        System.out.println(customerBalance.getAmount());
        System.out.println(balanceService.checkout(customerBalance, BigDecimal.valueOf(150)));
        System.out.println(customerBalance.getAmount());

        System.out.println("GIFT CARD BALANCE");
        System.out.println(giftCardBalance.getAmount());
        System.out.println(balanceService.checkout(giftCardBalance, BigDecimal.valueOf(60)));
        System.out.println(giftCardBalance.getAmount());
    }
}
