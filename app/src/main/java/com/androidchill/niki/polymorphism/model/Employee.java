package com.androidchill.niki.polymorphism.model;

/**
 * Created by NIKI on 10/18/2016.
 */

public class Employee {
    private String name;
    private String mail;
    private String address;
    private int number;

    //Base Class
    public Employee(String name, String address, int number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }

    //Method First Employee
    public String mailCheck() {
        return mail = "Mailing a check to " + name + " " + address;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String toString() {
        return name + " " + address + " " + number;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String newAddress) {
        address = newAddress;
    }

    public int getNumber() {
        return number;
    }
}
