package com.sda1;

public class TestPersonShto {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Arben");
        person1.setAge(25);
        System.out.println("Emri: " + person1.getName());
        System.out.println("Mosha: " + person1.getAge());
        Person person2 = new Person("Blerina", 30);
        System.out.println("Emri: " + person2.getName());
        System.out.println("Mosha: " + person2.getAge());
        Person person3 = new Person("Aurora", 35);
        System.out.println("Emri: " + person3.getName());
        System.out.println("Mosha: " + person3.getAge());
    }
}

