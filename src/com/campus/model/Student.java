package com.campus.model;

import java.util.Arrays;

public abstract class Student {
    // Encapsulation data hiding
    // instance variables
    private int studentId;
    private String studentName;
    private int studentAge;
    private String department;
    private int[] marks;

    // static variable
    static int studentCount = 0;

    // default constructor
    public Student() {
        studentCount++;
    }

    // parameterized constructor
    public Student(int studentId, String studentName, int studentAge, String department, int[] marks) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.department = department;
        this.marks = marks;
        studentCount++;
    }

    // Abstract method: Every subclass MUST define this
    public abstract void studentType();

    // getters
    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public String getDepartment() {
        return department;
    }

    public int[] getMarks() {
        return marks;
    }

    // setters
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    // instance methods
    public void displayStudentDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Age: " + studentAge);
        System.out.println("Department: " + department);
    }

    public void displayStudentInfo() {
        displayStudentDetails();
    }

    public void displayStudentInfo(boolean showMarks) {
        displayStudentDetails();
        if (showMarks) {
            System.out.println("Marks: " + Arrays.toString(marks));
        }
    }

    public static void displayStudentCount() {
        System.out.println("Total Students: " + studentCount);
    }
}