package com.sda1;

public class BankAccount {
    private double balance;
    public BankAccount(double initialBalance){
        this.balance = initialBalance;
    }
    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
        }
    }
    public double getBalance(){
        return balance;
    }
    public static void main(String[] args){
        BankAccount account = new BankAccount(1000.00);
        account.deposit(200.00);
        account.withdraw(150.00);
        System.out.println("Bilanci aktual: " + account.getBalance());
    }

    private void withdraw(double v) {


    }
}
