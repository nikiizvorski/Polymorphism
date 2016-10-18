# Polymorphism
Method Overloading, Method Overriding in Java, Android Example Project

In this project you will see how to use and when you use polymorphism in Android

# What is Polymorphism

Polymorphism is the capability of a method to do different things based on the object that it is acting upon. 
In other words, polymorphism allows you define one interface and have multiple implementations.

A method is a set of code which is referred to by name and can be called (invoked) at any point in a program simply by utilizing the method’s name.

First Type of Polymorphism in Java is: Method Overloading

In Java, it is possible to define two or more methods of same name in a class, provided that there argument list or parameters are different.

```java
class Polymorphism
{
    void demo (int a)
    {
       System.out.println ("a: " + a);
    }
    void demo (int a, int b)
    {
       System.out.println ("a and b: " + a + "," + b);
    }
    double demo(double a) {
       System.out.println("double a: " + a);
       return a*a;
    }
}
```

Second Type of Polymorphism in Java is: Method Overriding

```java
public class FirstClass
{
    public void firstmethod() //FirstClass Base class method
    {
         System.out.println ("First One in Base");
    }
}
public class SecondClass extends FirstClass
{
    public void firstmethod() //Second CLass
    {
         System.out.println ("First One in Second");
    }
}

public class Main
{
     public static void main (String args []) {
     
        // FirstClass object
        FirstClass obj1 = new FirstClass(); 
        
        // FirstClass object with reference from SecondClass object
        FirstClass obj2 = new SecondClass(); 
        
        // Calls the method from SecondClass class
        obj1.firstmethod(); 
        
        //Calls the method from SecondClass class
        obj2.firstmethod(); 
     }
}
```

## Getting Started

You will have to download the project and run it on your local machine.

### Prerequisities

Everything you need in order to use this code is inside the project you may only need to update the gradle plugin and the libs.

## Built With

Android Studio 2.2

## More Info

More info about Polymorphism -> https://www.tutorialspoint.com/java/java_polymorphism.htm

## Authors

* **Niki Izvorski ** - *Initial work*
