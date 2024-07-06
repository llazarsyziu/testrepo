package com.sda;

import java.util.Scanner;

public class ScannerNumber {
    public static void main(String[] args){
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter number");
        int number=myobj.nextInt();
        System.out.println("Numri eshte:" +number);
        if (number==0){
            System.out.println("nr eshte: 0 " );
        }
        else if (number%2==0){
            System.out.println("numri eshte cift " );
        }
        else {
            System.out.println("numri eshte tek");
        }
    }

}
