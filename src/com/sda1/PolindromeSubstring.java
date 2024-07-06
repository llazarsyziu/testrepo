package com.sda1;

import java.util.Scanner;

public class PolindromeSubstring {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ju lutem shkruani nje fjale:");
        String fjala = scanner.nextLine();
        String palindromiMeIGjate = "";
        int gjatesia = fjala.length();
        for (int i = 0; i < gjatesia; i++){
            for (int j = i + 1; j <= gjatesia; j++){
                String nënfjala = fjala.substring(i, j);
                if (PolindromeSubstring(nënfjala)){
                    if (nënfjala.length() > palindromiMeIGjate.length()){
                        palindromiMeIGjate = nënfjala;
                    }
                }
            }
        }
        System.out.println("Nënfjala më e gjatë që është palindrom është: " + palindromiMeIGjate);
    }
    public static boolean PolindromeSubstring(String fjala) {
        int fillimi = 0;
        int fundi = fjala.length() - 1;
        while (fillimi < fundi) {
            if (fjala.charAt(fillimi) != fjala.charAt(fundi)) {
                return false;
            }
            fillimi++;
        fundi--;
        }
        return true;
    }
}
