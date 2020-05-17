package com.company.polumorphismexampleone;

public class Sum {

    public static void main(String[] args) {
        Addition s = new Addition();
        s.sum(10);
        s.sum(10,20);
        s.sum(10.4,10.5);
    }

}
