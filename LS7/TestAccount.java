package LS7;

import LS7.Account;

public class TestAccount {
    public static void main(String[] args) {
        Account a1 = new Account(1234, 99.99);
        System.out.println(a1);
        Account a2 = new Account(888);
        System.out.println(a2);
        System.out.printf("heeloo %s%n", a1);

        a1.setBalace(88.88);
        System.out.println(a1);
        System.out.println("The account number is : " + a1.getAccountNumber());
        System.out.println("The balance is : " + a1.getBalace());

        a1.credit(10);
        System.out.println(a1);
        a1.debit(5);
        System.out.println(a1);
        a1.debit(500);
        System.out.println(a1);
    }
}
