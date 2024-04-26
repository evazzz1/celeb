package org.example;

public class Employee {
    private Genders gender;
    private String name;

    public Employee(String name, Genders gender) {
        this.name = name;
        this.gender = gender;
    }

    public Genders getGender() {
        return gender;
    }

    public void setGender(Genders gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }
}
