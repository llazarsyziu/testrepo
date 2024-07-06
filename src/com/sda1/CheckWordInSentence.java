package com.sda1;

import java.util.Scanner;

public class CheckWordInSentence {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Shkruani një fjali: ");
        String sentence = scanner.nextLine();
        System.out.print("Shkruani një fjalë: ");
        String word = scanner.nextLine();
        boolean containsWord = sentence.contains(word);
        if (containsWord){
            System.out.println("Fjala \"" + word + "\" është pjesë e fjalisë.");

        }else{
            System.out.println("Fjala \"" + word + "\" nuk është pjesë e fjalisë.");
        }
        scanner.close();
    }
    }

