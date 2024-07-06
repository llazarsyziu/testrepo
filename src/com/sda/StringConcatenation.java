package com.sda;

public class StringConcatenation {
    public static void main(String[]args) {
String str1 = "First string";
String str2 = "Second string";
String str3 = "Third string";
String sum = str1 + str2 + str3;
String sum_2 = str1.concat(str2).concat(str3);
System.out.println(sum);
System.out.println(sum_2);
System.out.println(str1.equals(str2));
boolean str=(str1.equals(str2));
System.out.println(str);
if(str){
    System.out.println("str1 is notequals to str2");

}
else {
    System.out.println("str1 is not equals to str2");
}
   }
}
