package com.sda;

public class SwitchMonth {
    public static void main(String[] args){
        int month=2;
        String monthstring="";
        switch(month){
            case  1: monthstring="1 - January";
            break;
            case  2: monthstring="2 - February";
                break;
            case  3: monthstring="3 - March";
                break;
            case  4: monthstring="4 - April";
                break;
            case  5: monthstring="5 - May";
                break;
            case  6: monthstring="6 - Jun";
                break;
            case  7: monthstring="7 - Jul";
                break;
            case  8: monthstring="8 - Avgust";
                break;
            case  9: monthstring="9 - September";
                break;
            case  10: monthstring="10 - October";
                break;
            case  11: monthstring="11 - November";
                break;
            case  12: monthstring="12 - December";
            default:
                System.out.println("Invalid month " );

        }
        System.out.println(monthstring);

    }
}
