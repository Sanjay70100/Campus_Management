package com.campus.service;

import com.campus.model.Student;

public class StudentService {
    //calculate Total Marks
    public int calculateTotal(Student student) {
        if (student.getmarks() == null) {
            return 0;
        }
        int total= 0;
        int[] marks = student.getmarks();
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }
    //Calculate average marks
    public double calculateAverage(Student student) {
        if (student.getmarks() == null){
            return 0.0;
        }
        int[] marks = student.getmarks();
        int total = calculateTotal(student);
        return (double) total / marks.length;
    }
    //find maximum marks
    public int findMaximumMarks(Student student) {
        if (student.getmarks() == null || student.getmarks().length == 0) {
            return 0;
        }
        int[] marks1 = student.getmarks();
        int maxMarks = marks1[0];
        for (int mark : marks1) {
            if (mark > maxMarks) {
                maxMarks = mark;
            }
        }
        return maxMarks;
    }
     //find minimum marks
    public int findMinimumMarks(Student student) {
        if (student.getmarks() == null || student.getmarks().length == 0) {
            return 0;
        }
        int[] marks2 = student.getmarks();
        int minMarks = marks2[0];
        for (int mark : marks2) {
            if (mark < minMarks) {
                minMarks = mark;
            }
        }
        return minMarks;
    }
    //grade based on marks
    public char grade(Student student){
        int[] marks = student.getmarks();
        if (marks == null || marks.length == 0) {
            return 'F';
        }
        int total = calculateTotal(student);
        int average = (int) calculateAverage(student);
        if (average >= 90) {
            return 'A';
        } else if (average >= 80) {
            return 'B';
        } else if (average >= 70) {
            return 'C';
        } else if (average >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
    public String passOrFail(Student student) {
        int[] marks = student.getmarks();
        if (marks == null || marks.length == 0) {
            return "Fail";
        }
        int average = (int) calculateAverage(student);
        if (average == 40){
            return "Pass";
        } else {
            return "Fail";
        }
    }
    //display report card
    public void displayReportCard(Student student) {
        System.out.println("Student Name: " + student.getstudentname());
        System.out.println("Student ID: " + student.getstudentid());
        System.out.println("Department: " + student.getdepartment());
        System.out.println("Total Marks: " + calculateTotal(student));
        System.out.println("Average Marks: " + calculateAverage(student));
        System.out.println("Maximum Marks: " + findMaximumMarks(student));
        System.out.println("Minimum Marks: " + findMinimumMarks(student));
        System.out.println("Grade: " + grade(student));
        System.out.println("Pass/Fail: " + passOrFail(student));
    }
}