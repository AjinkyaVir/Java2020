package com.company.polymorphismexmplefour;

public class Sample {
    //Method signature represents the method name along with method parameter.
    /*Write a program to create sample class which contain two methods with the same name but different signatures*/

    void add(int a){
        System.out.println("Sum of numbers : " + (a+a));
    }

    void add(int a, int b)
    {
        System.out.println("Sum of numbers : " + (a + b));
    }
}
