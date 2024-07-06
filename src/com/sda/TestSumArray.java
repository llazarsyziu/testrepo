package com.sda;

public class TestSumArray {
    public static void main(String[] args){
        int arr[] = {3,10,2,9,8,5,4};
        int sum =0;
        for (int i = 0; i < arr.length; i++)
        sum += arr[i];
        System.out.println("sum of array values :" + sum);
    }

}
