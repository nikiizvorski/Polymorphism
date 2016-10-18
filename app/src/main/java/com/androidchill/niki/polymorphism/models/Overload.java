package com.androidchill.niki.polymorphism.models;

/**
 * Created by NIKI on 10/18/2016.
 */

public class Overload {

    //Example of Method Overloading have 4 methods with the same name
    //but provided that there argument list or parameters are different.

    //Example 1
    public int demo (int a)
    {
        return a;
    }

    //Example 2
    public int demo (int a, int b)
    {
        return a + b;
    }

    //Example 3
    public int demo (int a, int b, int c){
        return a + b + c;
    }

    //Example 4
    public double demo(double a) {
        return a*a;
    }

}
