package com.sda;

import com.sda.Person;

import java.util.Scanner;
public class PersonApp
{
    public static void printPerson(Person p)
    {
        System.out.println("First name: " + p.getFname());
        System.out.println("Last name: " + p.getLname());
        System.out.println("Age: " + p.getAge());
        System.out.println("Vendlindja: " + p.getVendlindja());

    }

    public static void main(String[] args)
    {
        Person p;
        String fval, lval;
        String vendlindja;
        int a;
        Person p2;
        Scanner infile = new Scanner(System.in);
        System.out.print("First Name: ");
        fval = infile.next();
        System.out.print("Last Name: ");
        lval = infile.next();
        System.out.print("Age: ");
        a = infile.nextInt();
        System.out.print("Vendlindja : ");
        vendlindja =infile.next();
        p = new Person(fval, lval, a);
        p2=new  Person(fval,lval,a,vendlindja);
        System.out.println("\nPerson created:");
        printPerson(p);
    }

}