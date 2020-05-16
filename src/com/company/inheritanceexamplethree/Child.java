package com.company.inheritanceexamplethree;

public class Child extends Parent {
    int a=100, b=200;
    void m1(int a, int b){
        System.out.println(a+b);
        System.out.println(this.a+this.b);
        System.out.println(super.a+super.b);
    }
}
