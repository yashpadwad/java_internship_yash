# java_internship_yash
---Week 1---
Student Grade Calculator
Project Overview

The Student Grade Calculator is a console-based Java application developed to manage student records, store marks, calculate averages, assign grades, and identify the top-performing student.

The application follows Object-Oriented Programming (OOP) principles and demonstrates the use of classes, objects, encapsulation, abstraction, collections, exception handling, constructors, and menu-driven programming.
Features
Add new students
Prevent duplicate roll numbers
Add marks for students
Validate marks (0–100 only)
Calculate average marks
Generate grades automatically
View all student records
Search student by roll number
Display topper based on highest average
Handle invalid input using custom exceptions
Menu-driven console interface

Project Structure
com.internship.grade
│
├── Gradeable.java
├── Student.java
├── StudentManager.java
├── InvalidMarkException.java
└── Main.java

Classes and Their Responsibilities
1. Gradeable Interface
public interface Gradeable {
    double getAverage();
    String getGrade();
}
Purpose

This interface defines grading-related behaviors.

Why It Was Used

The interface introduces the concept of abstraction. Any class implementing Gradeable must provide implementations for calculating average marks and grades.

Concept Demonstrated
Abstraction
Interface
2. Student Class
public class Student implements Gradeable
Purpose

Represents an individual student and stores all student-related information.

Fields
private String name;
private int rollNumber;
private List<Integer> marks;
Why Private Fields Were Used

Fields were declared private to achieve encapsulation and data hiding.

Direct access to student information is restricted, and controlled access is provided through methods.

Constructor
public Student(String name, int rollNumber)
Purpose

Initializes a student object with a name and roll number.

Methods
addMark()
addMark(int mark)

Validates marks before storing them.

getAverage()

Calculates the average of all marks stored in the ArrayList.

getGrade()

Assigns grades based on average marks.

Average	Grade
80            +	A
60–79	        B
40–59	        C
Below 40	    F
toString()

Returns a formatted summary of student information.

Concepts Demonstrated
Class and Objects
Encapsulation
Constructor
Method Design
Collections
Polymorphism through Interface Implementation
3. StudentManager Class
public class StudentManager
Purpose

Manages all student-related operations.

Why It Was Created

Instead of putting all logic inside Main, a separate manager class was created to separate business logic from user interface logic.

Methods
addStudent()

Adds a student and prevents duplicate roll numbers.

findByRollNumber()

Searches for a student using roll number.

getTopper()

Finds the student with the highest average.

getAllStudents()

Returns the complete list of students.

printAllStudents()

Displays all student information.

Concepts Demonstrated
Separation of Concerns
ArrayList Management
Searching Algorithms
Business Logic Layer
4. InvalidMarkException Class
public class InvalidMarkException extends Exception
Purpose

Custom exception used when marks outside the valid range are entered.

Why It Was Used

Instead of simply printing an error message, a custom exception provides a cleaner and more professional error-handling mechanism.

Example:

throw new InvalidMarkException(
    "Marks must be between 0 and 100");
Concepts Demonstrated
Exception Handling
Custom Exceptions
Error Management
5. Main Class
public class Main
Purpose

Acts as the entry point of the application.

Responsibilities
Display menu
Accept user input
Call StudentManager methods
Handle exceptions
Control program flow
Concepts Demonstrated
Scanner Class
Loops
Switch Statements
User Interaction
OOP Concepts Used
1. Class and Objects

Example:

Student student =
    new Student("Yash", 101);

Objects were created from the Student class to represent real-world students.

2. Encapsulation

Example:

private String name;
private int rollNumber;
private List<Integer> marks;

Data is hidden from external access and can only be modified through methods.

Benefits:

Security
Data Integrity
Better Design
3. Abstraction

Example:

public interface Gradeable

The interface hides implementation details and exposes only required behaviors.

Benefits:

Flexibility
Reusability
Cleaner Design
4. Exception Handling

Example:

try {
    student.addMark(mark);
}
catch(InvalidMarkException e) {
    System.out.println(e.getMessage());
}

Benefits:

Prevents program crashes
Improves reliability
Handles invalid user input
5. Collections Framework

Example:

ArrayList<Integer> marks

and

ArrayList<Student> students

Why ArrayList?

Dynamic Size
Easy Insertion
Convenient Iteration

What I Learned -->

Through this project, I learned:

Creating and managing Java classes
Working with objects and constructors
Implementing encapsulation using private fields
Designing interfaces for abstraction
Using ArrayList for dynamic data storage
Handling user input using Scanner
Writing custom exceptions
Implementing validation logic
Separating business logic from UI logic
Building menu-driven console applications
Applying clean coding practices
