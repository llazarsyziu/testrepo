package com.abc;

import java.util.Scanner;

public class Impakt {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Vendos një numer: ");
        int num = scan.nextInt();
        scan.close();
        System.out.println("Numri që ju vendosët është: " + num);
    }
}
