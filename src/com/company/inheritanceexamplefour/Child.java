package com.company.inheritanceexamplefour;

public class Child extends Parent {
    void m1(){
        System.out.println("Child Method M1()");
    }

    void m2(){
        this.m1(); //This is optional
        super.m1();
    }
}
