package com.campus.service;

import com.campus.model.Student;

public class StudentService {
    //calculate Total Marks
    public int calculateTotalMarks(Student student) {
        if (student.getMarks() == null) {
            return 0;
        }
        int totalMarks = 0;
        int[] marks = student.getMarks();
        for (int mark : marks) {
            totalMarks += mark;
        }
        return totalMarks;
    }

//calculate Average Marks
    public double calculateAverageMarks(Student student) {
        if (student.getMarks() == null) {
            return 0.0;

        }
        int[] marks = student.getMarks();
        
        int totalMarks = calculateTotalMarks(student);
        return (double) totalMarks / marks.length;
    }

    //find maximum marks
    public int findMaximumMarks(Student student) {
        if (student.getMarks() == null || student.getMarks().length == 0) {
            return 0;
        }
        int[] marks1 = student.getMarks();
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
        if (student.getMarks() == null || student.getMarks().length == 0) {
            return 0;
        }
        int[] marks2 = student.getMarks();
        int minMarks = marks2[0];
        for (int mark : marks2) {
            if (mark < minMarks) {
                minMarks = mark;
            }
        }
        return minMarks;
    }


    //grade based on marks
    public char grade(Student student) {
        int[] marks = student.getMarks();
        if (marks == null || marks.length == 0) {
            return 'F';
        }
        int total = calculateTotalMarks(student);
        int average = (int) calculateAverageMarks(student);
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
    //pass or fail
    public String passOrFail(Student student) {
        int[] marks = student.getMarks();
        if (marks == null || marks.length == 0) {
            return "Fail";
        }
        int average = (int) calculateAverageMarks(student);
        if (average >= 40) {
            return "Pass";
        } else {
            return "Fail";
        }
    }
    //display report card
    public void displayReportCard(Student student) {
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Department: " + student.getDepartment());
        System.out.println("Total Marks: " + calculateTotalMarks(student));
        System.out.println("Average Marks: " + calculateAverageMarks(student));
        System.out.println("Maximum Marks: " + findMaximumMarks(student));
        System.out.println("Minimum Marks: " + findMinimumMarks(student));
        System.out.println("Grade: " + grade(student));
        System.out.println("Pass/Fail: " + passOrFail(student));
    }
}