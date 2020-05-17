package com.company.polumorphismexampleone;

public class Addition {

    // Polymorphism one functionality different types
    // Compile time polymorphism is also called static binding , Early binding
    // Can have same method name but diff. args
    // can have same method name & same args but diff. types

    void sum(int a){
        System.out.println(a+a);
    }
    void sum(int a, int b){
        System.out.println(a + b);
    }
    void sum(double d1,double d2){
        System.out.println(d1 + d2);
    }
}
