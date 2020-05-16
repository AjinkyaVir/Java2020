package com.company.inhertanceexampleone;

public class Test {

    public static void main(String[] args) {
        Parent parent = new Parent();
        System.out.println("Parent Class method called");
        parent.properties();

        Child child = new Child();
        System.out.println("Child class methods call");
        child.properties();
        child.enjoy();
    }

}
