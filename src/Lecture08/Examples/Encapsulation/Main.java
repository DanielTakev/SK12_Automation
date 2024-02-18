package Lecture08.Examples.Encapsulation;

public class Main {
    public static void main(String[] args) {
        BankAccount ivanIvanovBankAccount = new BankAccount("Ivan Ivanov");
        ivanIvanovBankAccount.getAccountBalance();
        ivanIvanovBankAccount.getAccountNumber();
        ivanIvanovBankAccount.makeTransaction(5);

        System.out.println("Owner name: " + ivanIvanovBankAccount.getOwnerName());
        System.out.println("Account Balance " + ivanIvanovBankAccount.getAccountBalance());
        System.out.println("Account Number: " + ivanIvanovBankAccount.getAccountNumber());
    }
}
