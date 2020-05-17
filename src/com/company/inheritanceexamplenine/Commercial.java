package com.company.inheritanceexamplenine;

public class Commercial {


    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void calculateBill(int unit){
        System.out.println("Customer name: " + getName());
        System.out.println("Electricity bill: " + unit * 5);
    }

}
