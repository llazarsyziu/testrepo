package com.sda;

import java.util.Scanner;

public class Vitibrishte {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Shkruani vitin: ");
        int vit = input.nextInt();
        boolean eshteIBrishte = (vit % 4 == 0 && vit % 100 != 0) || (vit % 400 == 0);
        if (eshteIBrishte) {
            System.out.println(vit + " është vit i brishtë.");
        } else {
            System.out.println(vit + " nuk është vit i brishtë.");
        }input.close();

    }
}
