package com.abc;

import java.util.Scanner;

public class Impakt2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Vendos numrin e parë: ");
        int num1 = scan.nextInt();
        System.out.print("Vendos numrin e dytë: ");
        int num2 = scan.nextInt();
        scan.close();
        int produkti = num1 * num2;
        System.out.println("Rezultati: " + produkti);
    }
}

