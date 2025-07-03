package oop.finalexam.t2;

import java.util.Arrays;
import java.util.List;

public class Student {

    // Default initialization for my name
    String name = "Lasha";
    String lastName = "Ghurtskaia";
    List<Course> courses = Arrays.asList(
            new Course("Calculus 2 (ENG)", "Calculus 1 (ENG)", "Antiderivatives. Definite integrals. Techniques and applications of integration. Improper integrals. Infinite series."),
            new Course("Mathematical Foundation of computing (ENG)", "CS50, Calculus 1 (ENG)", "Mathematical Logic; Elements of Discrete Mathematics; Elements of Sets Theory; Elements of Graph Theory; Elements of Combinatorics; Elements of Digital Systems; "),
            new Course("English Language Course C1-2 (ENG)", "English Language Course C1-1 (ENG)", "None specified in sylabus"),
            new Course("Computer Organization (ENG)", "CS50", "Representing and manipulating information; Machine-level representations of programs; Optimizing program performance. The memory hierarchy."),
            new Course("Object Oriented Programming (ENG)", "CS50", "Java syntax and data structures; Procedural programming; Classes; Encapsulation, polymorphism, inheritance; Packages; Working with the network; Work with files; Working with text data; Work with the terminal."),
    );

    public Student(String name, String lastName, List<Course> courses) {
        this.name = name;
        this.lastName = lastName;
        this.courses = courses;
    }

    String getName(){
        return this.name;
    }

    String getLastName(){
        return this.lastName;
    }

    List<Course> getCourses(){
        return this.courses;
    }

}
