package com.sda;

import java.time.LocalDate;
import java.util.Date;

public class Ushtrimi {
    public static void main(String[] args){
        int a=30;
        float b=22.3f;
        String s = "Kursi";
        char c = 'a';
        double d = 3.14d;
        LocalDate date = LocalDate.now();
        LocalDate date1= date.minusDays(1);
        LocalDate date2 = date.plusDays(2);


        System.out.println("Variable a eshte : " +a);
        System.out.println("Variable b eshte : " +b);
        System.out.println("Variable s eshte : " +s);
        System.out.println("Variable s eshte : " +c);
        System.out.println("Variable s eshte : " +d);

        System.out.println("Variable date eshte : " +date);
        System.out.println("Today date eshte : " +date);
        System.out.println("Yesterday date eshte : " +date);

        //System.out.print(f);
    }


}
