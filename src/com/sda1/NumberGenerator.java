package com.sda1;

import java.util.Random;

public class NumberGenerator {
    public static void main(String[] args){
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;
        System.out.println("Numri i rastësishëm është: " + randomNumber);
    }
}
