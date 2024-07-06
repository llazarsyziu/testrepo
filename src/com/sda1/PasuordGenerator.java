package com.sda1;

import java.util.Random;

public class PasuordGenerator {
    public static void main(String[] args) {
        int length = 12;
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+";
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = rand.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }
        System.out.println("Password-i i sigurt është: " + sb.toString());
    }
}
