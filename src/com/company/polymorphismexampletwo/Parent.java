package com.company.polymorphismexampletwo;

public class Parent {

    /*Method over loading type promotion
    *
    * implicit type promotion taken by compiler
    * Type promotion always done form left to right
    *
    * byte(1) --> short(2) --> int(4) --> long(8) --> float(4) --> double(8)
    *             char(2) --> int(4)
    *
    *  In Java numeric value by default: int type
    * represent long value use : L (constant)
    * represent byte, short : type casting
    *
    * In Java decimal value by default : double type
    * represent float use : f (constant)
    *
    * */
    //

    void m1(int a, long b){
        System.out.println("Parent int , long method");
    }

    void m1(float a){
        System.out.println("Parent float method");
    }

}
