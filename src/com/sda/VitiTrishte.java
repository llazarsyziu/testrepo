package com.sda;

import java.util.Scanner;

public class VitiTrishte {
    public static void main (String[]args){
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter viti");
        int viti=myobj.nextInt();
        System.out.println("Viti eshte:" +viti);
        if (viti %4==0){
            System.out.println("Viti eshte i brishte");}
        else {
            System.out.println("Viti nuk eshte i brishte");}
    }
}

