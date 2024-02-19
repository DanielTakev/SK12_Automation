package Lecture08.Examples.Encapsulation;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class BankAccount {
    private String ownerName;
    private double accountBalance = 0;
    private String accountNumber;

    // Alt + Insert keyboard shortcut to include getters and setters automatically

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
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        currentDate.format(formatter);
        Random randomNumber = new Random();
        this.accountNumber = name + "_" + currentDate + "_" + randomNumber.nextInt();
    }

    public void makeTransaction(double transaction) {
        this.accountBalance = this.accountBalance + transaction;
    }
}

