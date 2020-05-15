package com.company.examplethirdinterface;

public class Child implements Father, Mother{
    @Override
    public void height() {
        float ht = (Father.HT + Mother.HT ) / 2;
        System.out.println("Child Height : " + ht);
    }
}
