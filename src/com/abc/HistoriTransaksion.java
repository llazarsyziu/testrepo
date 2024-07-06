package com.abc;

import java.util.ArrayList;

public class HistoriTransaksion {
    private double balance;
    private ArrayList<String> transactions;
    public HistoriTransaksion(double initialBalance){
        this.balance = initialBalance;
        this.transactions = new ArrayList<>();
        transactions.add("Hapja e llogarisë: " + initialBalance);
    }
    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            transactions.add("Depozitim: " + amount);
        }
    }
    public void withdraw(double amount){
        if (amount > 0 && amount <= balance){
            balance -= amount;
            transactions.add("Tërheqje: " + amount);
        }
    }
    public double getBalance(){
        return balance;
    }
    public void printTransactions(){
        for (String transaction : transactions){
            System.out.println(transaction);
        }
    }
    public static void main(String[] args){
        HistoriTransaksion account = new HistoriTransaksion(1000.00);
        account.deposit(200.00);
        account.withdraw(150.00);

        System.out.println("Bilanci aktual: " + account.getBalance());
        System.out.println("Historia e transaksioneve:");
        account.printTransactions();
    }
}
