package com.sda;

import java.util.Scanner;

public class ScannerName {
    public static void main(String[] args){
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter username");
        String username = myobj.nextLine();
        System.out.println("Username is:" +username);
        System.out.println("Enter age");
        int age = myobj.nextInt();
        System.out.println("Age is:"+age);
        System.out.println("Enter salary");
        double salary = myobj.nextDouble();
        System.out.println("Salary is:" +salary);
        myobj.nextLine();
        System.out.println("Enter grupi");
        String grupi = myobj.nextLine();
        System.out.println();
        System.out.println("Grupi is:" +grupi);
    }
}