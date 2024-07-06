package com.sda;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr1 = new int[] {10,15,20};
        int[] arr2 = new int[] {12,18,20};
        int[] arr3 = new int[] {10,15,20};
        boolean retval = Arrays.equals(arr1, arr2);
        boolean retval2 = Arrays.equals(arr1, arr3);
        System.out.println("arr1, and arr3 equal: " + retval2);
    }
}
