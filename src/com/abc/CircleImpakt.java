package com.abc;

import java.util.Scanner;

public class CircleImpakt {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {
        System.out.print("Vendos rrezen: ");
        double rreze = sc.nextDouble();
        double siperfaqja = Math.PI * (rreze * rreze);
        System.out.println("Sipërfaqja e rrethit: " + siperfaqja);
        double perimetri = Math.PI * 2 * rreze;
        System.out.println("Perimetri është: " + perimetri);
    }
}

