package com.sda1;

public class Person {
    private String name;
    private int age;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Mosha duhet të jetë pozitive.");
        }
    }
    public int getAge() {
        return this.age;
    }
    public Person() {}
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
