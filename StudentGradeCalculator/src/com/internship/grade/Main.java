package com.internship.grade;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        int choice;

        do {

            System.out.println("\n===== Student Grade Calculator =====");
            System.out.println("1. Add Student");
            System.out.println("2. Add Marks to Student");
            System.out.println("3. View All Students");
            System.out.println("4. Find Student by Roll Number");
            System.out.println("5. Show Topper");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            choice = scanner.nextInt();

            switch (choice) {

                case 1:

                    scanner.nextLine();

                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Roll Number: ");
                    int roll = scanner.nextInt();

                    Student student = new Student(name, roll);

                    if (manager.addStudent(student)) {
                        System.out.println("Student added successfully!");
                    } else {
                        System.out.println("Roll number already exists!");
                    }

                    break;

                case 2:

                    System.out.print("Enter Roll Number: ");
                    int rollNo = scanner.nextInt();

                    Student foundStudent =
                            manager.findByRollNumber(rollNo);

                    if (foundStudent == null) {

                        System.out.println("Student not found!");

                    } else {

                        System.out.print(
                                "How many marks do you want to add? ");

                        int count = scanner.nextInt();

                        for (int i = 1; i <= count; i++) {

    System.out.print(
            "Enter mark " + i + ": ");

    int mark = scanner.nextInt();

    try {

        foundStudent.addMark(mark);

    } catch (InvalidMarkException e) {

        System.out.println(
                "Error: " + e.getMessage());
    }
}

                        System.out.println(
                                "Average: "
                                        + String.format("%.2f",
                                        foundStudent.getAverage()));

                        System.out.println(
                                "Grade: "
                                        + foundStudent.getGrade());
                    }

                    break;

                case 3:

                    manager.printAllStudents();

                    break;

                case 4:

                    System.out.print(
                            "Enter Roll Number: ");

                    int searchRoll =
                            scanner.nextInt();

                    Student result =
                            manager.findByRollNumber(searchRoll);

                    if (result == null) {

                        System.out.println(
                                "Student not found!");

                    } else {

                        System.out.println(result);
                    }

                    break;

                case 5:

                    Student topper =
                            manager.getTopper();

                    if (topper == null) {

                        System.out.println(
                                "No students available.");

                    } else {

                        System.out.println(
                                "Topper: "
                                        + topper.getName()
                                        + " (Roll "
                                        + topper.getRollNumber()
                                        + ") - Average: "
                                        + String.format("%.2f",
                                        topper.getAverage()));
                    }

                    break;

                case 6:

                    System.out.println(
                            "Exiting Application...");

                    break;

                default:

                    System.out.println(
                            "Invalid Choice! Try Again.");
            }

        } while (choice != 6);

        scanner.close();
    }
}
    

