package com.androidchill.niki.polymorphism.model;

/**
 * Created by NIKI on 10/18/2016.
 */

public class Salary extends Employee {
    private double salary; // Annual salary
    private String mail;

    //Second Class calling superclass with super()
    public Salary(String name, String address, int number, double salary) {
        //You can see Polymorphism here calling the superclass method
        super(name, address, number);
        setSalary(salary);
    }

    //Method Second Override
    public String mailCheck() {
       return mail = "Mailing check to " + getName() + " with salary " + salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        if(newSalary >= 0.0) {
            salary = newSalary;
        }
    }
}