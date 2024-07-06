package com.sda;

public class Dog
{

    private  String Bred;
    private  String lsize;
    private int age;
  private String color;

    public Dog(String bred, String color, int age, String lsize) {
        Bred = bred;
        this.color = color;
        this.age = age;
        this.lsize = lsize;
    }

    public String getBred() {
        return Bred;
    }

    public void setBred(String bred) {
        Bred = bred;
    }

    public String getLsize() {
        return lsize;
    }

    public void setLsize(String lsize) {
        this.lsize = lsize;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "Bred='" + Bred + '\'' +
                ", lsize='" + lsize + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args)
    {
      Dog tuffy = new Dog( "papillon", "tuffy", 5, "white");
      System.out.println(tuffy.toString());
      String color = tuffy.color;
      System.out.println("Ngjyra eshte :" + color);
              int age = 5;
              System.out.println("Age is :" + age);
              String bred =  tuffy.Bred;
              System.out.println("Bred eshte");
    }
}
