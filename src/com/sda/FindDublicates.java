package com.sda;

import java.util.HashSet;
import java.util.Scanner;

public class FindDublicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Shkruani numrin e elementeve të grupit:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Shkruani elementet e grupit:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        HashSet<Integer> uniqueValues = new HashSet<>();
        HashSet<Integer> duplicateValues = new HashSet<>();
        for (int value : array) {
            if (!uniqueValues.add(value)) {
                duplicateValues.add(value);
            }
        }
        if (duplicateValues.isEmpty()) {
            System.out.println("Nuk ka vlera të dyfishta në grup.");
        } else {
            System.out.println("Vlerat e dyfishta në grup janë:");
            for (int value : duplicateValues) {
                System.out.println(value);
            }
        }

        scanner.close();
    }
}






