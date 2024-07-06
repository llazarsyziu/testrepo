package com.abc;

public class TransferimParash {
    private double balance;
    public TransferimParash (double initialBalance){
        this.balance = initialBalance;
    }
    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
        }
    }
    public void withdraw(double amount){
        if (amount > 0 && amount <= balance){
            balance -= amount;
        }

    }
    public double getBalance(){
        return balance;

    }
    public void transfer(TransferimParash toParash, double amount){
        if (amount > 0 && amount <= balance){
            this.withdraw(amount);
            toParash.deposit(amount);

        }
    }
    public static void main(String[] args){
        TransferimParash account1 = new TransferimParash(1000.00);
        TransferimParash account2 = new TransferimParash(500.00);

        account1.transfer(account2, 200.00);

        System.out.println("Bilanci i llogarisë 1: " + account1.getBalance());
        System.out.println("Bilanci i llogarisë 2: " + account2.getBalance());
    }
}
