package com.internship.grade;

import java.util.ArrayList;
import java.util.List;

public class Student implements Gradeable {

    private String name;
    private int rollNumber;
    private List<Integer> marks;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = new ArrayList<>();
    }

    public void addMark(int mark) {

        if(mark >= 0 && mark <= 100) {
            marks.add(mark);
        } else {
            System.out.println("Invalid mark! Marks must be between 0 and 100.");
        }
    }

    @Override
    public double getAverage() {

        if(marks.isEmpty()) {
            return 0;
        }

        int total = 0;

        for(int mark : marks) {
            total += mark;
        }

        return (double) total / marks.size();
    }

    @Override
    public String getGrade() {

        double average = getAverage();

        if(average >= 80) {
            return "A";
        } else if(average >= 60) {
            return "B";
        } else if(average >= 40) {
            return "C";
        } else {
            return "F";
        }
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    @Override
    public String toString() {

        return "Roll " + rollNumber +
               ": " + name +
               " - Avg: " +
               String.format("%.2f", getAverage()) +
               ", Grade: " +
               getGrade();
    }
}
