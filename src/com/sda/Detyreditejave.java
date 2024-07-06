package com.sda;

public class Detyreditejave {
    public static void main(String[] args){
        int dita=2;
        String ditastring="";
        switch(dita){
            case 1: ditastring="1 - E Hënë";
                   break;
            case 2: ditastring="2 - E Martë";
                break;
            case 3: ditastring="3 - E Mërkurë";
                    break;
            case 4: ditastring="4 - E Enjte";
                   break;
            case 5: ditastring="5 - E Premte";
                    break;
            case 6: ditastring="6 - E Shtunë";
                   break;
                case 7: ditastring= "è - E Diel";
            default:
                System.out.println("Invalid dita" );
        }
        System.out.println(ditastring);
    }
}
