package com.sda;

import java.util.Scanner;

public class MesatarjaEGrupit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sa elemente ka grupi? ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Grupi nuk ka elemente.");
            return;
    }
        double[] grupi = new double[n];
        double shuma = 0.0;
        for (int i = 0; i < n; i++) {
            System.out.print("Jepni elementin " + (i + 1) + ": ");
            grupi[i] = scanner.nextDouble();
            shuma += grupi[i];
        }
        double mesatarja = shuma / n;
        System.out.println("Vlera mesatare e elementeve të grupit është: " + mesatarja);
        scanner.close();
    }
}





