package com.internship.grade;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {

    private List<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    public boolean addStudent(Student student) {

        if(findByRollNumber(student.getRollNumber()) != null) {
            return false;
        }

        students.add(student);
        return true;
    }

    public Student findByRollNumber(int rollNumber) {

        for(Student student : students) {

            if(student.getRollNumber() == rollNumber) {
                return student;
            }
        }

        return null;
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public Student getTopper() {

        if(students.isEmpty()) {
            return null;
        }

        Student topper = students.get(0);

        for(Student student : students) {

            if(student.getAverage() >
               topper.getAverage()) {

                topper = student;
            }
        }

        return topper;
    }

    public void printAllStudents() {

        if(students.isEmpty()) {

            System.out.println(
                "No students found."
            );

            return;
        }

        System.out.println("\n--- All Students ---");

        for(Student student : students) {
            System.out.println(student);
        }
    }
}