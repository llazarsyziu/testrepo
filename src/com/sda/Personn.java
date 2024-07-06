package com.sda;

public class Personn {
    private String fname;
    private String lname;
    private int age;
    private String vendlindja;
    public Personn(String fnameVal, String lnameVal, int ageVal){
        fname = fnameVal;
        lname = lnameVal;
        age = ageVal;
    }
    public Personn(String fname, String lname, int age, String vendlindja) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.vendlindja = vendlindja;
    }
    public String getVendlindja() {
        return vendlindja;
    }
    public void setVendlindja(String vendlindja) {
        this.vendlindja = vendlindja;
    }
    /*public Person(String fname, String lname, int age) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
    }*/
    public String getFname()
    {
        return fname;
    }
    public String getLname()
    {
        return lname;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int ageVal)
    {
        age = ageVal;
    }

}
