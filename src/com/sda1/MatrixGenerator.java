package com.sda1;

import java.util.Random;

public class MatrixGenerator {
    public static void main(String[] args){
        int rows = 5;
        int cols = 5;
        int[][] matrix = new int[rows][cols];
        Random rand = new Random();

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                matrix[i][j] = rand.nextInt(100) + 1;
            }
        }
        System.out.println("Matrica e rastësishme është: ");
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
