package com.sda;

public class Condition {
    public static void main(String[] args){
        float temperature = 36.4f;
        if (temperature >= 37.0f) {
            System.out.print("You have a fever!");
        } else if (temperature >= 36.6f && temperature < 37.0f) {
            System.out.print("You are healthy!");
        } else{
            System.out.print("You are weakened!");

        }
    }
}
