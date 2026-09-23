package com.campus.model;

public class Student {
    //Encapsulation - data hiding
    //instance variables
    private int studentid;
    private String studentname;
    private int age;
    private String department;
    private int[] marks;

    //static variables
    static int studentCount=0;

    //Default constructor
    public Student() {
        studentCount++;
    }

    //parameterized constructor
    public Student(int studentid,String studentname,int age,String department,int[] marks){
        this.studentid = studentid;
        this.studentname = studentname;
        this.age = age;
        this.department = department;
        studentCount++;
    }
    //getters
    public int getstudentid() {
        return studentid;
    }
    public String getstudentname() {
        return studentname;
    }
    public int getage() {
        return age;
    }
    public String getdepartment() {
        return department;
    }
    public int[] getmarks() {
        return marks;
    }
    //setters
    public void setstudentid(int studentid) {
        this.studentid = studentid;
    }

    public void setstudentname(String studentname) {
        this.studentname = studentname;
    }

    public void setge(int age) {
        this.age = age;
    }

    public void setdepartment(String department) {
        this.department = department;
    }

    public void setmarks(int[] marks) {
        this.marks = marks;
    }
    //instance methods
    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentid);
        System.out.println("Student Name: " + studentname);
        System.out.println("Student Age: " + age);
        System.out.println("Department: " + department);
    }
    public void displayStudentInfo(boolean showMarks) {
        displayStudentInfo();

        if(showMarks){
            System.out.print("Marks: " + java.util.Arrays.toString(marks));
    }
}

//static method belongs yo class,not to object
public static void displayStudentCount() {
    System.out.println("Total Students: " + studentCount);
}
}