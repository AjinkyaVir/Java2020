package com.company.examplefourinterface;

public class Custom implements CustomInterface {

    public void m1(){
        System.out.println("Method M1");
    }

    public static void main(String[] args) {

        Custom c = new Custom();
        c.m1();
        c.m2();
        CustomInterface.m3();

    }

}
