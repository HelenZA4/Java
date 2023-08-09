package ru.academits.java.lesson1.OOP;

import java.util.Calendar;

public class Person {
    private String name;
    private String middleName;
    private String familyName;
    private int age;

    public Person(String name, String middleName, String familyName, int age) {
        this.name = name;
        this.middleName = middleName;
        this.familyName = familyName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSecondName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getYearBirth(int age) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int yearBirth = currentYear - age;
        return yearBirth;
    }

    @Override
    public String toString() {
        return "{" + familyName + " " + name + " " + middleName + "}";
    }
}