package com.sda1;

import java.util.ArrayList;
import java.util.Scanner;

public class McCafe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList orders = new ArrayList<>();
        System.out.println("Welcome to McCafe!");
        while (true) {
            System.out.println("Enter the item name (or type 'done' to finish):");
            String itemName = scanner.nextLine();

            if (itemName.equalsIgnoreCase("done")) {
                break;
            }
            System.out.println("Enter the item price:");
            double price = scanner.nextDouble();
            scanner.nextLine();
            orders.add(new Order(itemName, price));
        }
        System.out.println("\nYour orders:");
        for (Object order : orders) {
            System.out.println(order);

             }

        }
    }
