package com.sda;

import java.util.Scanner;

public class CheckValueInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Shkruani numrin e elementeve të grupit:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Shkruani elementet e grupit:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Shkruani vlerën që dëshironi të kontrolloni:");
        int valueToCheck = scanner.nextInt();
        boolean containsValue = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valueToCheck) {
                containsValue = true;
                break;
        }
    }
        if (containsValue) {
        System.out.println("Grupi përmban vlerën " + valueToCheck);
    } else {
        System.out.println("Grupi nuk përmban vlerën " + valueToCheck);
    }

        scanner.close();
}
}

