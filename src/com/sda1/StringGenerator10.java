package com.sda1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StringGenerator10 {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Integer> randomNumbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            randomNumbers.add(rand.nextInt(50) + 1);
        }
        System.out.println("Lista e numrave të rastësishëm: " + randomNumbers);
    }
}