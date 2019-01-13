package com.jash.shepard.senddata;

import java.io.Serializable;

public class Person implements Serializable {
    private String fName;
    private String lName;
    private int age;
    private String sex;

    public Person(String fName, String lName, int age, String sex) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.sex = sex;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
