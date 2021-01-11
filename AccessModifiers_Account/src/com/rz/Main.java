package com.rz;

public class Main {

    public static void main(String[] args) {
	    Account myAccount = new Account("My Account");
	    myAccount.deposit(2500.80);
        myAccount.deposit(5.40);
        myAccount.withdraw(450);
        myAccount.calculateBalance();
    }
}
