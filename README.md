# Polymorphism
Method Overloading, Method Overriding in Java, Android Example Project

In this project you will see how to use and when you use polymorphism in Android

# What is Polymorphism

Polymorphism is the capability of a method to do different things based on the object that it is acting upon. 
In other words, polymorphism allows you define one interface and have multiple implementations.

A method is a set of code which is referred to by name and can be called (invoked) at any point in a program simply by utilizing the method’s name.

First Type of Polymorphism in Java is: Compile time polymorphism also called Method Overloading

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

Second Type of Polymorphism in Java is: Runtime polymorphism also called Method Overriding

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
#Encapsulation Employee Class

Encapsulation is one of the four fundamental OOP concepts. The other three are inheritance, polymorphism, and abstraction.

Encapsulation in Java is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit. 

In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class. Therefore, it is also known as data hiding.

How can you achieve that well you have to:
- You have to declare variables of a class private
- provide public setter and getter methods to modify and view the variables values.

Here it is an example we achieved that:

```java
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
