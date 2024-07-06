package com.sda;

public class MathUtilsTest {
    public static void main (String[] args){
        int a = -3;
        int b = 5;
        System.out.println(a + "^" + b + "=" +
                MathUtils.power(a,b));
        int n = 7;
        System.out.println
                (n + "!=" + MathUtils.factorial(n));
    }
}


