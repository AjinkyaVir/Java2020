package com.company.inheritanceexamplenine;

public class ElectricityBill {
    public static void main(String[] args) {
        Commercial commercial = new Commercial();
        commercial.setName("Ajinkya");
        commercial.calculateBill(100);

        Domestic domestic = new Domestic();
        domestic.setName("Sayali");
        domestic.calculateBill(150);
    }
}
