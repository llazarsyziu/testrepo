package com.sda1;

import java.util.Scanner;


public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Shkruani një numër: ");
        int numri = scanner.nextInt();
        if (numri > 0) {
            System.out.println("Numri është pozitiv.");
        } else if (numri < 0) {
            System.out.println("Numri është negativ.");
        } else {
            System.out.println("Numri është zero.");
        }
        if (numri % 2 == 0) {
            System.out.println("Numri është çift.");
        } else {
            System.out.println("Numri është tek.");
        }

    }
}


