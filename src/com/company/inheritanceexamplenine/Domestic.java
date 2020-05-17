package com.company.inheritanceexamplenine;

public class Domestic extends Commercial {

    void calculateBill(int unit){
        System.out.println("Customer name: " + getName());
        System.out.println("Electricity bill: " + unit * 2.5);
    }

}
