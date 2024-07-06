package com.sda1;

import java.util.Random;

public class StringGenerator {
    public static void main(String[] args){
        int length = 10;
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++){
            int index = rand.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }
        System.out.println("Stringu i rastësishëm është: " + sb.toString());
    }
}
