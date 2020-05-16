package com.company.examplefourinterface;

public interface CustomInterface {

    /*JAVA 8 feature default and static method in interface*/

    void m1();
    default void m2(){
        System.out.println("Method M2");
    }

    public static void m3(){
        System.out.println("Method M3");
    }

}
