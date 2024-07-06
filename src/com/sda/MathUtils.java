package com.sda;

public class MathUtils {
    public static int power(int a, int b) {
        int out = 1;
        for (int i = 0; i < b; i++) {
            out *= a;
        }
        System.out.println("aurela fuqia e nje numri " + out);
        return out;
    }

    public static int factorial(int n) {
        if (n < 0) {
            return 0;
        } else if (n == 0) {
            return 1;
        } else {
            int out = 1;
            for (int i = 1; i <= n; i++) {
                out = out * i;
            }
            System.out.println("faktoriali " + out);
            return out;
        }
    }


    public static void main(String[] args) {
        int n = 3;
        System.out.println(factorial(n));
        //System.out.println(power(2,3));
        power(2,3);
    }
}





