package Lecture08.Examples.Encapsulation;

import java.util.*;

public class BankAccount {
    private String ownerName;
    private double accountBalance = 0;
    private String accountNumber;

    BankAccount(String name) {
        this.ownerName = name;
        name = name.replace(" ", "");
        setAccountNumber(name);
    }

    BankAccount(String name, double transaction) {
        this(name);
        this.accountBalance = this.accountBalance + transaction;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public void setOwnerName(String ownerName) {
        if (this.ownerName == null)
            this.ownerName = ownerName;
    }

    public double getAccountBalance() {
        return this.accountBalance;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    private void setAccountNumber(String name) {
        Date date = new Date();
        Random randomNumber = new Random();
        this.accountNumber = name + "_" + date.getTime() + "_" + randomNumber.nextInt();
    }

    public void makeTransaction(double transaction) {
        this.accountBalance = this.accountBalance + transaction;
    }
}

