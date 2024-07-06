package com.abc;

import java.util.Scanner;

public class KontrolloCiftTek {
    public static void main(String args[]) {
        int num;
        System.out.println("Vendos një numër të plotë:");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        if (num % 2 == 0)
            System.out.println("Numri i vendosur është çift.");
        else
            System.out.println("Numri i vendosur është tek.");
    }
}
