package com.sda1;

public class CreditAproval {
    public static void main(String[] args){
        int income = 4000;
        boolean goodCreditHistory = true;
        int age = 30;
        boolean incomeCriteria = income > 3000;
        boolean creditHistoryCriteria = goodCreditHistory;
        boolean ageCriteria = age >= 21 && age <= 65;
        boolean isApproved = incomeCriteria && creditHistoryCriteria && ageCriteria;
        if (isApproved) {
            System.out.println("Personi është i aprovuar për kredi.");
    }else{
            System.out.println("Personi nuk është i aprovuar për kredi.");
        }

    }
}
