package com.abc;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ju lutem fusni nje varg: ");
        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder(input);
        String reversed = sb.reverse().toString();
        System.out.println("Vargu i kundert eshte: " + reversed);
        scanner.close();
    }
}
