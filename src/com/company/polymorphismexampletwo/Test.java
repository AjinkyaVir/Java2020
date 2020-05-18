package com.company.polymorphismexampletwo;

public class Test {

    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.m1(10,20);
        parent.m1(10,20L);
        parent.m1('a','b');
        parent.m1((byte)10,(short)20);

    }

}
