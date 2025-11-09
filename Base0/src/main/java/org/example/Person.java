package org.example;

public class Person {

    private String surname;
    private String GivenName;
    private Gender gender;
    private int age;
    private boolean isVendor;

    public Person() {
    }

    public Person(String surname, String givenName, Gender gender, int age, boolean isVendor) {
        this.surname = surname;
        GivenName = givenName;
        this.gender = gender;
        this.age = age;
        this.isVendor = isVendor;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGivenName() {
        return GivenName;
    }

    public void setGivenName(String givenName) {
        GivenName = givenName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isVendor() {
        return isVendor;
    }

    public void setVendor(boolean vendor) {
        isVendor = vendor;
    }

    @Override
    public String toString() {
        return "Person{" +
                "surname='" + surname + '\'' +
                ", GivenName='" + GivenName + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", isVendor=" + isVendor +
                '}';
    }
}
