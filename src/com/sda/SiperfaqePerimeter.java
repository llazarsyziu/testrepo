package com.sda;

public class SiperfaqePerimeter {
    public static void main(String[] args) {
        siperfaqePerimeter(4);
    }

    public static void siperfaqePerimeter(double r) {
        double p = 3.14;
        double perimeter = 2 * p * r;
        double siperfaqe = p * r * r;
        System.out.println("Perimetri eshte" + perimeter);
        System.out.println("Siperfaqja eshte" + siperfaqe);
    }
}
