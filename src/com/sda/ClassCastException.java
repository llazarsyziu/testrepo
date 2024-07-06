package com.sda;

public class ClassCastException {
    public static void main(String[] args) {
        Object obj = new Integer(1);
        String str = (String) obj;
        System.out.println(str);
    }
}
