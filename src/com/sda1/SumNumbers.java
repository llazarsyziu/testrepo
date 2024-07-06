package com.sda1;

public class SumNumbers {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println("Shuma e numrave nga 1 deri në 100 është: " + sum);
    }
}
