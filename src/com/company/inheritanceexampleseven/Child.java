package com.company.inheritanceexampleseven;

public class Child extends Parent{
    {
        System.out.println("Child class instance block"); //instance block runs on object creation
    }
    static {
        System.out.println("Child class static block"); //static block runs on class loading
    }
}
