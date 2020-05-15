package com.company.exampletwointerface;

public class Details implements PersonalDetails{

    @Override
    public void name() {
        System.out.println("Ajinkya");
    }

    @Override
    public void RollNumber() {
        System.out.println("1001");
    }

    public static void main(String[] args) {
        Details details = new Details();
        System.out.println("Name: ");
        details.name();
        System.out.println("Roll Number: ");
        details.RollNumber();
    }

}
