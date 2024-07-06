package com.abc;

import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.isEmpty()){
            System.out.println("Vargu eshte i zbrazet.");
            return;
        }
        char lastChar = input.charAt(input.length() - 1);
        int count = 0;
        for (int i = 0; i < input.length(); i++){
            if (input.charAt(i) == lastChar){
                count++;
            }
        }
        System.out.println("Karakteri '" + lastChar + "' shfaqet " + count + " here ne varg.");
        scanner.close();
    }
}
