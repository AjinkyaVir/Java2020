package com.company.inheritanceexampleseven;

public class Parent {
    {
        System.out.println("Parent class instance block"); //instance block runs on object creation
    }
    static {
        System.out.println("Parent class static block"); //static block runs on class loading
    }
}
