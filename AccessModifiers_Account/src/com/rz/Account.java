package com.rz;

import java.awt.image.PackedColorModel;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Account {

    public String accountName;
    public double balance = 0;
    public ArrayList<Double> transactions = new ArrayList<>();

    public Account(String accountName) {
        this.accountName = accountName;
        this.transactions = new ArrayList<Double>();
    }

    public String getAccountName() {
        return accountName;
    }
    public double getBalance() {
        return balance;
    }

    DecimalFormat decimalFormat2 = new DecimalFormat("##.##");


    public void withdraw(double amount) {
        double withdrawal = -amount;
        if (withdrawal < 0) {
            this.balance += withdrawal;
            this.transactions.add(withdrawal);
            System.out.println("the amount of " + amount + " has been withdrawn!\n" +
                    "Balance is: " + decimalFormat2.format(this.getBalance()));
        } else {
            System.out.println("Negative sum cannot be withdrawn. Please enter an amount more than zero");
        }
    }

    public void deposit(double amount) {
        if(amount > 0) {
            this.balance += amount;
            this.transactions.add(amount);
            System.out.println("the amount deposited: " + amount + " | Balance: " + decimalFormat2.format(this.getBalance()));
        }
    }

    public void calculateBalance() {
        this.balance = 0;
        for(double i : this.transactions) {
            this.balance += i;
        }
        System.out.println("Calculated balance: " + decimalFormat2.format(this.getBalance()));
    }







}
