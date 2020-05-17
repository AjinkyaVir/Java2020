package com.company.inheritanceexampleeight;

public class Use {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Ajinkya");
        student.setId(101);
        student.setAddress("Chinchwad");
        student.setMarks(950);

        System.out.println("Student ID: " + student.getId());
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Address: " + student.getAddress());
        System.out.println("Student Mark: " + student.getMarks());

    }

}
